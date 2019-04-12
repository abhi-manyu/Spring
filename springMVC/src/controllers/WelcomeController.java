package controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController 
{
   @RequestMapping("/Welcome")
   public ModelAndView helloWorld(HttpServletRequest reqst)
   {
	   String name=reqst.getParameter("nm");
	   String msg="welcome to helloworld "+name;
	   return new ModelAndView("welcomePage","the_key",msg);
   }
   
}
