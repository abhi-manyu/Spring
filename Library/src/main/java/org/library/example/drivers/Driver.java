package org.library.example.drivers;

import org.library.example.beans.CollegeImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver
{
	public static void main(String[] args)
	{
        ApplicationContext ap=
        		new ClassPathXmlApplicationContext("org/library/example/xmls/college.spring.xml");
        CollegeImpl coli=(CollegeImpl) ap.getBean("col1");
        coli.displayCollegeDetails();
	}

}
