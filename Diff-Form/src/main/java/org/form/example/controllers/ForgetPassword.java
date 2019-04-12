package org.form.example.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.apache.log4j.Logger;
import org.form.example.beans.ForgetPass;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ForgetPassword
{
	static Logger passlogger=Logger.getLogger(ForgetPassword.class.getName());
	
    @GetMapping(value="/disform")
    public String displayForm(Model mod)
    {
    	passlogger.info("dispplaying the password retriving form");
    	mod.addAttribute("forget",new ForgetPass());
    	return "passwordform";
    }
    
    
    @PostMapping(value="/findpassword")
    public String findPassword(@Valid @ModelAttribute("forget")ForgetPass forget,
    		BindingResult result,Model mod)
    {
    	if(result.hasErrors())
    	{
    		passlogger.error("some error occured");
    		passlogger.info("--------------------------------------------------------");
    		return "passwordform";
    	}
    	else
    	{
    		passlogger.info("retriving password successful, redirecting to "
    				+ "password resetting page");
    		return "pasretrived";
    	}
    }
    
    @GetMapping(value="/setpassword")
    public String setNewPassword(HttpServletRequest req,Model mod)
    {
    	System.out.println("method hited");
    	passlogger.info("resetting password requested");
    	String pa=req.getParameter("pass");
    	String cpa=req.getParameter("cpass");
    	System.out.println(pa);
    	System.out.println(cpa);
    	
    	if(pa.equals(cpa))
    	{
    		passlogger.info("ur new password : "+pa);
    		System.out.println("password matched");
    		mod.addAttribute("pas",pa);
    		passlogger.info("new password has been reset successfully");
    		passlogger.info("-----------------------------------------------------------");
    	    return "passuc";
    	}
    	else
    	{
    		String msg="passwords not matched";
    		mod.addAttribute("mesg",msg);
    		passlogger.error("passwords not matched,"
    				+ "returning to password retriving page");
    		passlogger.info("-----------------------------------------------------------");
    		return "pasretrived";
    	}
    }
}
