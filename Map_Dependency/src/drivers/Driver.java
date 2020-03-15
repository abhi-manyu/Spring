package drivers;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pojo.College;

public class Driver
{
	public static void main(String[] args)
	{
		ApplicationContext ap=new ClassPathXmlApplicationContext("xmls/college.spring.xml");
		College col1=(College)ap.getBean("c1");
		col1.layout();
		col1.display();
	}

}
