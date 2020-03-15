package driver;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pojo.College;
import pojo.University;

public class Driver
{
	public static void main(String[] args)
	{
       ApplicationContext ap=new ClassPathXmlApplicationContext("xmls/college_un.spring.xml");
       University u1=(University)ap.getBean("un");
       u1.display();
	}

}
