package org.form.example.controllers;

import java.util.List;

import javax.validation.Valid;

import org.apache.log4j.Logger;
import org.form.example.beans.Login;
import org.form.example.beans.Student;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.classic.Session;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController
{
	static Logger lginlogger=Logger.getLogger(LoginController.class.getName());
	
  @GetMapping(value="/loginform")
  public String displayLogInForm(Model mod)
  {
	  lginlogger.info("displaying log in form");
	  mod.addAttribute("login",new Login());
	  return "login";
  }
  
  @PostMapping(value="/login")
  public String logIn(@Valid @ModelAttribute("login")Login login, 
		  BindingResult result, Model mod)
  {
	  System.out.println("method hited");
	  lginlogger.info("logging in attempted");
	  if(result.hasErrors())
	  {
		  lginlogger.error("logging in failed due to ur password is not matching the rules");
		  System.out.println("error occured");
		  lginlogger.info("-----------------------------------------------------------");
		  return "login";
	  }
	  else
	  {
		  AnnotationConfiguration cfg=new AnnotationConfiguration();
		  cfg.configure("org/form/example/configs/diff.cfg.xml");
		  SessionFactory sf=cfg.buildSessionFactory();
		  Session s=sf.openSession();
		  lginlogger.info("all credentials are well formed and validated");
		  List<Student> lists=s.createQuery("from Student").list();
		  System.out.println("the whole list size is : "+lists.size());
		  if(lists.size()!=0)
		  {
			  lginlogger.info("datas fetched from databased , now checking if ur record is there or not");
			  for(Student stu:lists)
			  {
				  if(stu.getName().equalsIgnoreCase(login.getUsername()) &&
						  stu.getPassword().equalsIgnoreCase(login.getPassword()) )
				  {
					  lginlogger.info("yes ur record found , log in successful , redirecting to the success page");
					  lginlogger.info("--------------------------------------------------------------------------------");
					  return "loginsuc";
				  }
			  }
			  System.out.println("login failed");
			  lginlogger.error("data is present but due to password mispatch log in failed, redirecting to login page");
			  lginlogger.info("-------------------------------------------------------------------------------------");
			  String msg="ur user name not found , u may need to register first";
			  mod.addAttribute("error",msg);
			  return "login";
		  }
		  System.out.println("database is empty, u need to register first");
		  lginlogger.info("register some student first, then u can log in");
		  lginlogger.info("---------------------------------------------------------------------------------------------");
		  return "login";
	  }
  }
}
