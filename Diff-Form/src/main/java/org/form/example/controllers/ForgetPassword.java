package org.form.example.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.apache.log4j.Logger;
import org.form.example.beans.ForgetPass;
import org.form.example.beans.Student;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ForgetPassword
{
	Configuration cfg=new AnnotationConfiguration();
	SessionFactory sf;
	Session s;
	static Logger passlogger=Logger.getLogger(ForgetPassword.class.getName());
	
    @GetMapping(value="/disform")
    public String displayForm(Model mod)
    {
    	cfg.configure("org/form/example/configs/diff.cfg.xml");
    	passlogger.info("dispplaying the password retriving form");
    	mod.addAttribute("forget",new ForgetPass());
    	return "passwordform";
    }
    
    
    @PostMapping(value="/findpassword")
    public String findPassword(@Valid @ModelAttribute("forget")ForgetPass forget,
    		BindingResult result,Model mod,HttpSession session)
    {
    	
    	sf=cfg.buildSessionFactory();
    	s=sf.openSession();
    	Criteria cr=s.createCriteria(Student.class);
    	Criterion c=Restrictions.eq("name",forget.getUsername());
    	cr.add(c);
    	Student st=(Student)cr.uniqueResult();
    	
    	//s.get(Student.class,)
    	
    	if(result.hasErrors() || st==null)
    	{
    		passlogger.error("some error occured");
    		passlogger.info("--------------------------------------------------------");
    		String msg="some error occured or ur username not found, plz check again";
    		mod.addAttribute("error",msg);
    		s.close();
    		sf.close();
    		return "passwordform";
    	}
    	else
    	{
    		passlogger.info("retriving password successful, redirecting to "
    				+ "password resetting page");
    		session.setAttribute("hib",s);
    		session.setAttribute("student",st);
    		return "pasretrived";
    	}
    }
    
    @GetMapping(value="/setpassword")
    public String setNewPassword(HttpServletRequest req,Model mod,HttpSession session)
    {
    	System.out.println("method hited");
    	passlogger.info("resetting password requested");
    	String pa=req.getParameter("pass");
    	String cpa=req.getParameter("cpass");
    	System.out.println(pa);
    	System.out.println(cpa);
    	
    	session=req.getSession();
    	s=(Session)session.getAttribute("hib");
    	Student st=(Student) session.getAttribute("student");
    	
    	if(pa.equals(cpa))
    	{
    		passlogger.info("ur new password : "+pa);
    		System.out.println("password matched");
    		mod.addAttribute("pas",pa);
    		passlogger.info("new password has been reset successfully");
    		passlogger.info("-----------------------------------------------------------");
    		
    		Transaction t=s.beginTransaction();
    		st.setPassword(cpa);
    		s.update(st);
    		t.commit();
    		
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
