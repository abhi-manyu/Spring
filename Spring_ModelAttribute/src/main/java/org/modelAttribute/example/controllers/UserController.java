package org.modelAttribute.example.controllers;

import org.modelAttribute.example.beans.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController
{
    @RequestMapping(value="/show", method=RequestMethod.GET)
    public ModelAndView showRegister()
    {
    	System.out.println("form method called");
    	ModelAndView mav=new ModelAndView("reg");
    	
    	return mav;
    }
    @RequestMapping(value="/register",method=RequestMethod.POST)
    /*public ModelAndView register(@RequestParam("rono")int roll,@RequestParam("nm")String name)
    {
    	ModelAndView mav=new ModelAndView("success");
    	String msg="ur name is : "+name+" and roll no is : "+roll;
    	mav.addObject("welcome",msg);
    	return mav;
    	 //     ( OR )
    	ModelAndView mav=new ModelAndView("success");
    	User u1=new User(roll, name);
    	mav.addObject("user",u1);
    	return mav;
    }*/
    
    public ModelAndView register(@ModelAttribute("user")User user,BindingResult result)
    {
    	if(result.hasErrors())
    	{
    		ModelAndView mav=new ModelAndView("reg");
    		return mav;
    	}
    	ModelAndView mav=new ModelAndView("success");
    	return mav;
    }
    
    @ModelAttribute
    public void addHeader(Model mod)
    {
    	mod.addAttribute("head","first register here");
    }
}
