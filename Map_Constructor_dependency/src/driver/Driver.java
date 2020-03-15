package driver;

import java.util.Iterator;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.Qustion;

public class Driver
{
	public static void main(String[] args)
	{
        ApplicationContext ap=new ClassPathXmlApplicationContext("xmls/questionanswer.spring.xml");
        Qustion qn1=(Qustion)ap.getBean("q1");
        qn1.display();
	}

}
