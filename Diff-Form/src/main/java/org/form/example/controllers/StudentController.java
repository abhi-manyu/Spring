package org.form.example.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.apache.log4j.Logger;
import org.form.example.beans.Student;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.classic.Session;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentController
{
	static Logger logger=Logger.getLogger(StudentController.class.getName());
   @GetMapping(value="/dashboard")
   public String displayForm()
   {
	   logger.info("returning to the home page");
	 return "home";
   }
   
   @GetMapping(value="/registerForm")
   public String displayRegisterForm(Model mod)
   {
	   mod.addAttribute("stu",new Student());
	   logger.info("displaying registeration form");
	   return "form";
   }
   
   @PostMapping(value="/save")
   public String save(@Valid @ModelAttribute("stu")Student stu,
		   BindingResult resullt, Model mod)
   {
	   logger.info("Sign up attempted");
	   if(resullt.hasErrors())
	   {
		   logger.error("error occured , redirecting to the registration form");
		   logger.info("-----------------------------------------------------------");
		   return "form";
	   }
	   else
	   {
		   logger.info("got all valid informations");
		  AnnotationConfiguration cfg=new AnnotationConfiguration();
		  cfg.configure("org/form/example/configs/diff.cfg.xml");
		  SessionFactory sf=cfg.buildSessionFactory();
		  Session s=sf.openSession();
		  Transaction t=s.beginTransaction();
		  logger.info("session created , connected to database, transaction begin");
		  try
		  {
			  s.save(stu);
			  t.commit();
			  s.close();
			  sf.close();
			  System.out.println("sucessfully saved, returning to the welcome page");
			  logger.info("data inserted successfully into database, returning to the welcome page");
			  logger.info("-----------------------------------------------------------------------");
			  return "regsuc";
		  }
		  catch (Exception e)
		  {
			  logger.error("following exception occured , redirecting to the sign up page. ",e);
			  System.out.println("error occured , redirecting to the sign up page again");
			  logger.info("-----------------------------------------------------------------------");
			  return "form";
		  }
	   }
   }
}
