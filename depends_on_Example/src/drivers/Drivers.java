package drivers;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pojo.A;

public class Drivers
{
   public static void main(String[] args)
    {
	   ApplicationContext ap=new ClassPathXmlApplicationContext("xmls/dependson.spring.xml");
	   A a1=(A)ap.getBean("a");
	   a1.display();  
    }
}
