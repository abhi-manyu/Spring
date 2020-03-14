package drivers;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pojo.College;

public class Driver1
{
	public static void main(String[] args)
	{
       ApplicationContext ap=new ClassPathXmlApplicationContext("xmls/collegedetails.spring.xml");
       College co1=(College)ap.getBean("co1");
       co1.displayCollegeDetails();
	}

}
