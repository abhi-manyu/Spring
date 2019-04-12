package com.proj1.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LogInController
{
    @RequestMapping("/check")
    public ModelAndView sayHello(HttpServletRequest request,HttpServletResponse response)
    {
    	String uname=request.getParameter("unm");
    	String password=request.getParameter("pas");
    	String msg;
    	if(!uname.equals("") && uname!=null && uname.equals("abhi") &&
    			!password.equals("") && password!=null && password.equals("abhi"))
    	{
    		msg="welcome "+uname+" u r logged In";
    		return new ModelAndView("succ","info", msg);
    	}
    	else {
			msg=uname+",, ur log in attempt failed";
			return new ModelAndView("fail","info",msg);
		}
    }
}
