package driver_class;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import pojo_class.Student;

public class Driver_Class
{
	public static void main(String[] args)
	{
       ApplicationContext ap=new ClassPathXmlApplicationContext("xmls/student.spring.xml");
      Student st1= (Student)ap.getBean("stu");
      st1.studentDataDisplay();
	}

}
