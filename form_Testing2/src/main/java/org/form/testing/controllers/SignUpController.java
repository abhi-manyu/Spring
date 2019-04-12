package org.form.testing.controllers;

import javax.validation.Valid;

import org.form.testing.beans.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SignUpController
{
    @GetMapping(value="/displayRegister")
    public String displaySignUpForm(Model mod)
    {
    	mod.addAttribute("reg",new User());
    	return "regForm";
    }
    
    @PostMapping(value="/register")
    public String register(@Valid @ModelAttribute("reg") User reg,BindingResult result)
    {
    	if(result.hasErrors())
    	{
    		return "regForm";
    	}
    	else
    	{
    		System.out.println(reg.getAdd().getFlatNo());
    		System.out.println(reg.getAdd().getPgName());
    		System.out.println(reg.getAdd().getLayout());
    		return "regsuccess";
    	}
    }
}
