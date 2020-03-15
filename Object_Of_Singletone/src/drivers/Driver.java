package drivers;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pojo.Singletone_class;

public class Driver
{
	public static void main(String[] args)
	{
       ApplicationContext ap=new ClassPathXmlApplicationContext("xmls/single.spring.xml");
       Singletone_class sinto1=(Singletone_class) ap.getBean("st1");
       sinto1.display();
	}

}
