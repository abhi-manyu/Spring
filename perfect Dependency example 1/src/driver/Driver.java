package driver;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pojo.Traveler;


public class Driver
{
	public static void main(String[] args)
	{
		ApplicationContext ap=new ClassPathXmlApplicationContext("xmls/travel.spring.xml");
		Traveler tr= (Traveler) ap.getBean("t");
		tr.beginJourney();
	}

}
