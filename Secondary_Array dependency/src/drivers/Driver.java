package drivers;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pojos.University;

public class Driver {

	public static void main(String[] args)
	{
     ApplicationContext ap=new ClassPathXmlApplicationContext("xmls/unicol.spring.xml");
     System.out.println("universities created");
     University un11=(University)ap.getBean("un1");
     University un22=(University)ap.getBean("un2");
     University un33=(University)ap.getBean("un3");
     un11.layout();
     un11.display();
     un22.display();
     un33.display();
	}

}
