package form_handeling.controllers;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import form_handeling.beans.Employee;

@Controller
public class ForgetPasswordController
{
   
	static Logger pas_reset_logger = Logger.getLogger(ForgetPasswordController.class.getName());
	
	@RequestMapping("/forgetpassword")
	public ModelAndView retrivePassword(HttpServletRequest request,Model mod)
	 {
		pas_reset_logger.info("requesting for password reset to ForgotPasswordController");
		try
		{
		  int empID=Integer.parseInt(request.getParameter("empid"));
		  String unam=request.getParameter("usern");
		 pas_reset_logger.info("fetched parameters are empId : "+empID+" user name : "+unam);
		  AnnotationConfiguration cfg=new AnnotationConfiguration();
		  cfg.configure("form_handeling/configs/employee.cfg.xml");
		  SessionFactory sf=cfg.buildSessionFactory();
		  pas_reset_logger.info("session factory object created");
		  Session s=sf.openSession();
		  pas_reset_logger.info("session created and connected to database and trying to serch for ur id : "+empID);
			Employee emp=(Employee)s.get(Employee.class, empID);
			if(empID==emp.getEmpID() && unam.equals(emp.getEmployeeName()))
			{
				pas_reset_logger.info("got the exact record, fetching the details");
				String credentials="ur <mark>username</mark> : "+emp.getEmployeeName()+"<br>"
						+ "ur <mark>password</mark> : "+emp.getPassword();
				pas_reset_logger.info("details fetched , redirecting to browser page");
				pas_reset_logger.info("----------------------------------------------------------------------------");
				return new ModelAndView("getpasssuccess","getpassword",credentials);
			}
			else
			{
				pas_reset_logger.error("not found any record with id : "+empID);
				String falure="credentials not matched u need to sign up first";
				pas_reset_logger.error("not found , redirecting to failed page");
				pas_reset_logger.info("----------------------------------------------------------------------------");
				return new ModelAndView("forgetpassword","failed",falure);
			}
		}
		catch(Exception e)
		{
		String msg="data not found u have to signup first";
		pas_reset_logger.error("there is no record associated with this id , returning to forgetpassworsd page",e);
		pas_reset_logger.info("----------------------------------------------------------------------------");
		return new ModelAndView("forgetpassword","forgetpass",msg);
		}
	 }
}
