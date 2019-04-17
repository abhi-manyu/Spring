package org.formvalidation.example.controllers;

import javax.validation.Valid;

import org.apache.log4j.Logger;
import org.formvalidation.example.beans.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController
{
	static Logger logger=Logger.getLogger(LoginController.class.getName());
	
   @RequestMapping(value="/displayForm", method=RequestMethod.GET)
   public String displayForm(Model mod)
   {
	   logger.info("requesting for displaying Login form to LoginController");
	   mod.addAttribute("log",new User());
	   logger.info("redirecting to login form");
	   return "login";
   }
   
   @RequestMapping(value="/login",method=RequestMethod.POST)
   public String doLoginValidation(@Valid @ModelAttribute("log") User user,
		   BindingResult result,Model mod)
   {
	   logger.info("requesting for actual log in");
	   if(result.hasErrors())
	   {
		   logger.error("some error occured , returning to login page again");
		   logger.info("-----------------------------------------------------");
		   return "login";
	   }
		   mod.addAttribute("username", user.getUsername());
	   mod.addAttribute("pass",user.getPassword());
	   logger.info("log in successful , redirecting to the success page");
	   logger.info("-----------------------------------------------------");
	   return "success";
   }
}
