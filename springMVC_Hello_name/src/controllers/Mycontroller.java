package controllers;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class Mycontroller implements Controller
{
	@Override
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse res) throws Exception
	{
		String name= req.getParameter("nam");
		Map m=new HashMap();
		m.put("messege","Hello mr. "+name);
		return new ModelAndView("success",m);
	}

}
