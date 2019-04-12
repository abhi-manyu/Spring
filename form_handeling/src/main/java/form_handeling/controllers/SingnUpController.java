package form_handeling.controllers;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import form_handeling.beans.Employee;

@Controller
public class SingnUpController
{
    static Logger signuplogger=Logger.getLogger(SingnUpController.class.getName());
	
	@RequestMapping("/signup")
	public String signUp(HttpServletRequest request,Model mod)
	{
		signuplogger.info("request recieved at the sign up controller");
		try
		{
		int emp_ID=Integer.parseInt(request.getParameter("eid"));
		String emp_Name=request.getParameter("enm");
		double emp_Sal=Double.parseDouble(request.getParameter("esal"));
		String emp_Address=request.getParameter("eadd");
		String companyName=request.getParameter("compnm");
		String bloodGroup=request.getParameter("bldgrp");
		String password=request.getParameter("pass");
		String conPass=request.getParameter("cpass");
		
		signuplogger.info("recieved parameters are-id: "+emp_ID+"\n name :"+emp_Name+
				"\n salary : "+emp_Sal+"\n address : "+emp_Address+
				"\n working_company : "+companyName+"\n blood group : "+bloodGroup+
				"\n password : "+password);
		
		if(password!=null && password.equals(conPass))
		{
			  signuplogger.info("password checking successful");
			  AnnotationConfiguration cfg=new AnnotationConfiguration();
			  cfg.configure("form_handeling/configs/employee.cfg.xml");
			  SessionFactory sf=cfg.buildSessionFactory();
			  Session s=sf.openSession();
			  signuplogger.info("transaction started");
			  Transaction t=s.beginTransaction();
			  Employee emp=
					new Employee(emp_ID,emp_Name,emp_Sal,emp_Address,
							companyName,bloodGroup, password,conPass);
			  signuplogger.info("employee object created ");
		  try
		    {
			  s.save(emp);
			  signuplogger.info("employee object saved");
			  t.commit();
			  System.out.println("data inserted successfully");
			
			  String information="ur username : "+emp_Name+"<br>"
					+ " ur password : "+password+"<br>"
					+"blood goup : "+bloodGroup+"<br>"
					+"addess : "+emp_Address;
			  mod.addAttribute("signsuccess", information);
			  signuplogger.info("object saved to database, redirecting to the success page");
			  signuplogger.info("---------------------------------------------------------------------------------");
			  return "signupsuccess";
			}
			catch (Exception e)
		      {
				t.rollback();
				signuplogger.error("object couldn't saved , rollbacking transaction", e);;
				System.out.println("transaction failed : rollbacking the transaction");
				signuplogger.error("transaction failed , redirecting to failure page");
				signuplogger.info("---------------------------------------------------------------------------------");
				return "signupfailure";
			  }
		}
		else
		  {
		   	String warning="passwords not matched";
		   	mod.addAttribute("warn", warning);
		   	signuplogger.error("passwords not matched, redirecting to the failure page");
		   	signuplogger.info("---------------------------------------------------------------------------------");
		   	return "signupfailure";
		  }
	  }
		catch(Exception e)
		{
			String information="something went wrong !! plz fill ur details";
			mod.addAttribute("signfail", information);
			signuplogger.error("sign up failed due to the empty fields",e);
			signuplogger.info("---------------------------------------------------------------------------------");
			return "signupfailure";
		}
	}
}
