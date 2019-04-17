package org.formvalidation.example.controllers;

import javax.validation.Valid;

import org.apache.log4j.Logger;
import org.formvalidation.example.beans.Signup;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SignUpController
{
	static Logger sgnup_logger=Logger.getLogger(SignUpController.class.getName());
	
   @GetMapping("/displaySignUp")
   public String displayForm(Model mod)
   {
	   sgnup_logger.info("displaying signup form");
	   System.out.println("calling sign up operation");
	   mod.addAttribute("signup",new Signup());
	   return "signup";
   }
   
   @PostMapping("/doSignUp")
   public String doSignUpHere(@Valid @ModelAttribute("signup") Signup signup,
		      BindingResult result, Model mod)
   {
	   if(result.hasErrors() || !signup.getPassword().equals(signup.getConPassword()))
	   {
		   mod.addAttribute("error","plz make sure all infos are correct");
		   sgnup_logger.error("some error occured , returning to sign up page ");
		   sgnup_logger.info("-----------------------------------------------------");
		   return "signup";
	   }
	   else
	   {
		      sgnup_logger.info("no error , creating the the connection with the database");
			   AnnotationConfiguration cfg=new AnnotationConfiguration();
			   cfg.configure("org/formvalidation/example/configs/signup.cfg.xml");
			   SessionFactory sf=cfg.buildSessionFactory();
			   Session s=sf.openSession();
			   Transaction t=s.beginTransaction();
			   sgnup_logger.info("transaction created and started");
			   
			   
			   s.save(signup);
			   t.commit();
			   sgnup_logger.info("data inserted successfully");
		       //mod.addAttribute("sp", sp);
			   sgnup_logger.info("-----------------------------------------------------");
			   return "signupsuc";
	   }
   }
}
