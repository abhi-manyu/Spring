package org.springform.example.controllers;

import org.springform.example.beans.Students;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentController
{
	@GetMapping(value="/showform")
    public String showform(Model mod)
    {
		System.out.println("method hitted");
    	mod.addAttribute("reg",new Students());
    	return "regform";
    }
    
    @PostMapping(value="/register")
    public String register(@ModelAttribute("reg")Students st)
    {
    	return "success";
    }
}
