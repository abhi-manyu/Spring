package org.exception.example.controllers;


import java.io.IOException;

import javax.validation.Valid;

import org.exception.example.beans.UserSignup;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.util.pattern.PathPattern;

@Controller
public class SignUpController
{
   @GetMapping(value="/signup")
   public String displayForm(Model mod,@RequestParam("exc")String exp)
   {
	   mod.addAttribute("usersign",new UserSignup());
	   if(exp.equalsIgnoreCase("null"))
		   throw new NullPointerException();
	   if(exp.equalsIgnoreCase("are"))
		   throw new ArithmeticException();
	   return "signupform";
   }
   
   
   @ExceptionHandler(value=NullPointerException.class)
   public String throughException(Model mod)
   {
	   String sms="NullPointer Exception occured, contact to the admin";
	   mod.addAttribute("nullsms",sms);
	   return "null";
   }
   
   
   @PostMapping(value="/dosignup")
   public String doSignUp(@Valid @ModelAttribute("usersign")UserSignup usersign, BindingResult result)
   {
	   if(result.hasErrors())
		   return "signupform";
	   return "signsuc";
   }
}
