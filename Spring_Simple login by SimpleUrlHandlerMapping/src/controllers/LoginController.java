package controllers;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class LoginController implements Controller
{
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse reaponse) throws Exception
	{
		String username=request.getParameter("unm");
		String password=request.getParameter("pass");
		if(username.equals("abhi") && password.equals("manyu"))
		{
			Map<String, String> m=new HashMap<String, String>();
			m.put("username","username = "+username+" & password = "+password);
			ModelAndView mav=new ModelAndView("loginsuc",m);
			return mav;
		}
		else
		{
			Map m2=new HashMap<String,String>();
			m2.put("failed","lagin attempt failed please try again");
			return new ModelAndView("falure",m2);
		}
	}

}
