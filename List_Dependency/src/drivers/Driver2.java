package drivers;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pojos.Qustions2;

public class Driver2
{
	public static void main(String[] args)
	{
       ApplicationContext ap=new ClassPathXmlApplicationContext("xmls/anstypelist.spring.xml");
       System.out.println("xml loaded");
       Qustions2 qs1=(Qustions2)ap.getBean("q1");
       qs1.display();
	}

}
