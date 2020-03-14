package driver;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pojo.Mobile;

public class Driver
{
	public static void main(String[] args)
	{
        ApplicationContext ap=new ClassPathXmlApplicationContext("xmls/phonesim.spring.xml");
        Mobile mob1=(Mobile)ap.getBean("mo");
        mob1.display();
	}

}
