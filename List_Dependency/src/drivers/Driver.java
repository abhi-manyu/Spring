package drivers;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pojos.Qustions;

public class Driver
{
	public static void main(String[] args)
	{
       ApplicationContext ap=new ClassPathXmlApplicationContext("xmls/answers.spring.xml");
       System.out.println("xml loaded and object created");
       Qustions q1=(Qustions)ap.getBean("q");
       q1.display();
	}

}
