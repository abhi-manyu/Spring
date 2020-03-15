package controllers;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class Register_Controller implements Controller
{
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		String roll_no=request.getParameter("rln");
	    String name=request.getParameter("fn");
	    double marks=Double.parseDouble(request.getParameter("marks"));
	    String ph_no=request.getParameter("phn");
	    String address=request.getParameter("add");
	    Map<String,String> m=new HashMap();
	    m.put("message","registration for name : "+name+" is successful by simple url handler mapping");
	    ModelAndView mav=new ModelAndView("register_success",m);
	    
	    
	    
	    
	    return mav;
	    
	    
	}

}
