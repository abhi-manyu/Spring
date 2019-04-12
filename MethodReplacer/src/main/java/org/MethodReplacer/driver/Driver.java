package org.MethodReplacer.driver;

import org.MethodReplacer.beans.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver
{
  public static void main(String[] args)
    {
	  ApplicationContext ap=
	    		new ClassPathXmlApplicationContext("org/MethodReplacer/configs/bank.spring.xml");
	    User u=(User)ap.getBean("u1");
	    u.displayUserDetails();
    }    
}
