package drivers;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pojo.Car;

public class Driver
{
	public static void main(String[] args)
	{
      ApplicationContext ap=
    		  new ClassPathXmlApplicationContext("xmls/xmlns.spring.xml");
      Car c1=(Car)ap.getBean("c");
      c1.display();
	}

}
