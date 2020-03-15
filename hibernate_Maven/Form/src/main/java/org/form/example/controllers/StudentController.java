package org.form.example.controllers;

import javax.validation.Valid;

import org.form.example.beans.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentController
{
   @GetMapping(value="/showform")
   public String showForm(Model mod)
   {
	   System.out.println("method called");
	   mod.addAttribute("reg",new Student());
	   return "regform";
   }
   
   @PostMapping(value="/register")
   public String register(@Valid @ModelAttribute("reg")Student reg,BindingResult result)
   {
	   if(result.hasErrors())
		   return "regform";
	   else
		   return "succ";
   }
}
