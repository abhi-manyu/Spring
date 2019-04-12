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
public class LoginController
{
	static Logger logger=Logger.getLogger(LoginController.class.getName());
	
   @RequestMapping("/login")
   public String Display(HttpServletRequest request,Model mod)
   {
	   logger.info("log in request recieved for log in controller");
	   System.out.println("logger configured");
	   AnnotationConfiguration cfg=new AnnotationConfiguration();
	   cfg.configure("form_handeling/configs/employee.cfg.xml");
	   logger.info("employee configuration file loaded");
	   SessionFactory sf=cfg.buildSessionFactory();
	   logger.info("session factory created");
	   Session s=sf.openSession();
	   logger.info("session created");
	   String username="";
	   
	   try {
	         int empID=Integer.parseInt(request.getParameter("empid"));
	         username=request.getParameter("uname");
	         String password=request.getParameter("pass");
	         logger.info("recieved parameter as empiId:"+empID+" and username : "
	         +username+" password : "+password);
	        try
	        {
		       Employee emp=(Employee)s.get(Employee.class, empID);
		       if((username.equals(emp.getEmployeeName() ))&& (password.equals(emp.getPassword())))
		        {
			       String msg="hello "+username;
			       mod.addAttribute("message",msg);
			       logger.info("sign succeed, returning to success page");
			       logger.info("----------------------------------------------------------");
			       return "successpage";
		        }
		       else
		        {
		    	   logger.fatal("credentials not matching");
			      String cuz="credential not matched";
			      mod.addAttribute("fails",cuz);
			      logger.error("log in denied , returning to failure page");
			      logger.info("----------------------------------------------------------");
			      return "failurepage";
		        }
	        }
	        catch (Exception e)
	        {
	        	logger.info("ur id not found",e);
	        	logger.warn("ur id not found or u need to register first");
				String info="data not found, plz register first";
				mod.addAttribute("notfound", info);
				logger.info("ur id not found , returning to failure page");
				logger.info("----------------------------------------------------------");
				return "failurepage";
			}
	     }
	     catch(Exception e)
	      {
	    	 logger.error("no fields can be left blank");
		     String msg="sorry fields can not be blank ";
		     mod.addAttribute("message",msg);
		     logger.info("fields are blank, so returning to failure page");
		     logger.info("----------------------------------------------------------");
		     return "failurepage";
	      }
   }
}
