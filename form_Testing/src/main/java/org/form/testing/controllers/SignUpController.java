package org.form.testing.controllers;

import javax.validation.Valid;

import org.form.testing.beans.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
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
    		AnnotationConfiguration cfg=new AnnotationConfiguration();
    		cfg.configure("org/form/testing/configs/reg.cfg.xml");
    		
    		SessionFactory sf=cfg.buildSessionFactory();
    		Session s=sf.openSession();
    		Transaction t=s.beginTransaction();
    		s.save(reg);
    		t.commit();
    		System.out.println("saved to database");
    		
    		return "regsuccess";
    	}
    }
}
