package org.exception.example.controllers;


import javax.validation.Valid;

import org.exception.example.beans.UserSignup;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SignUpController
{
   @GetMapping(value="/signup/{exc}")
   public String displayForm(Model mod,@PathVariable("exc")String exp)
   {
	   //String exp="are";
	   mod.addAttribute("usersign",new UserSignup());
	   if(exp.equalsIgnoreCase("null"))
	   {
		   System.out.println("serching for null pointer exception");
		   throw new NullPointerException();
	   }
	   if(exp.equalsIgnoreCase("are"))
	   {
		   System.out.println("serching for arethmatic exception");
		   throw new ArithmeticException();
	   }
	   return "signupform";
   }
   
   
   @ExceptionHandler(value=NullPointerException.class)
   public String throughNullPException(Model mod)
   {
	   String sms="NullPointer Exception occured, contact to the admin";
	   mod.addAttribute("nullsms",sms);
	   return "null";
   }
   
   @ExceptionHandler(value=ArithmeticException.class)
   public String throughArethMException(Model mod)
   {
	   String sms="Arethematic Exception occured, check ur inputs";
	   mod.addAttribute("arth",sms);
	   return "arth";
   }
   
   
   
   @PostMapping(value="/dosignup")
   public String doSignUp(@Valid @ModelAttribute("usersign")UserSignup usersign, BindingResult result)
   {
	   if(result.hasErrors())
		   return "signupform";
	   return "signsuc";
   }
}
