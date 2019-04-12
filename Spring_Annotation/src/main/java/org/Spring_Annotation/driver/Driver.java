package org.Spring_Annotation.driver;

import org.Spring_Annotation.beans.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver
{

	public static void main(String[] args)
	{
        ApplicationContext ap=
        		new ClassPathXmlApplicationContext("org/Spring_Annotation/configs/bank.spring.xml");
        User u1=(User)ap.getBean("us1");
        u1.diplayUserDetails();
	}

}
