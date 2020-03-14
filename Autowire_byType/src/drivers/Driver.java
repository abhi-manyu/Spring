package drivers;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pojo.Mobile;

public class Driver
{
	public static void main(String[] args)
	{
       ApplicationContext ap=
    	new ClassPathXmlApplicationContext("xmls/phoneautowire.spring.xml");
       Mobile mob=(Mobile)ap.getBean("m");
       mob.display();
	}

}
