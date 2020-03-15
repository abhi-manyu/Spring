package drivers;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pojo.Car;

public class Driver
{
	public static void main(String[] args)
	{
       ApplicationContext ap=new ClassPathXmlApplicationContext("xmls/trafic.spring.xml");
       System.out.println("xml loaded");
       Car c1=(Car) ap.getBean("c");
       System.out.println(c1.getClass().getSimpleName());
       c1.drive();
       c1.applybrakes();
       c1.obeyTraficrules();
	}

}
