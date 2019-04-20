package org.annotations.example.controllers;

import org.annotations.example.beans.Input;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController
{
    @GetMapping(value="/addition")
    public ModelAndView showForm(Model mod)
    {
    	System.out.println("method called");
    	ModelAndView mav=new ModelAndView("cal");
    	return mav;
    }
    
    @PostMapping(value="/calculate")
    public String calculate(@ModelAttribute("math") Input math,Model mod)
    {
    	int Sum=math.getNom1()+math.getNom2();
    	String msg="calculated successfully as : "+Sum;
    	mod.addAttribute("result",msg);
    	return "result";
    }
}
