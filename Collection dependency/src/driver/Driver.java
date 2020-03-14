package driver;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pojo.Student;

public class Driver
{
	public static void main(String[] args)
	{
       ApplicationContext ap=
    		   new ClassPathXmlApplicationContext("xmls/stucol.spring.xml");
      Student sts1= (Student) ap.getBean("stu");
      sts1.displayStudentDetails();
	}

}
