package org.exception.example.controllers;

import org.exception.example.beans.UserSignup;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserSignUpController
{
    @GetMapping(value="/showform/{exc}")
    public String showForm(Model mod, @PathVariable("exc")String exc)
    {
    	mod.addAttribute("signup",new UserSignup());
    	
    	if(exc.equals("null"))
    		throw new NullPointerException();
    	else if((exc.equals("are")))
    			throw new ArithmeticException();
    	
    	return "signupform";
    }
    
    
    @ExceptionHandler(value=NullPointerException.class)
    public String HandelException1(Model mod)
    {
    	mod.addAttribute("nul","null pointer exception occured");
    	return "null";
    }
    
    @ExceptionHandler(value=ArithmeticException.class)
    public String HandelException2(Model mod)
    {
    	mod.addAttribute("are","Arothmatic exception occured");
    	return "arth";
    }
    
    @PostMapping(value="/dosignup")
    public String signUp(@ModelAttribute("signup")UserSignup signup)
    {
    	return "signsuc";
    }
}
