package jars;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Car;

public class Driver
{

	public static void main(String[] args)
	{
      ApplicationContext ap=new ClassPathXmlApplicationContext("car.spring.xml");
     
      Car ca=(Car) ap.getBean("c1");
      ca.displayCardetails();
	}

}
