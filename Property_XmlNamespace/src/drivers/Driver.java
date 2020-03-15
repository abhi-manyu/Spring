package drivers;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pojo.Student;

public class Driver
{
	public static void main(String[] args)
	{
      ApplicationContext ap=new ClassPathXmlApplicationContext("xmls/student.spring.xml");
      Student st1=(Student)ap.getBean("s");
      st1.display();
	}

}
