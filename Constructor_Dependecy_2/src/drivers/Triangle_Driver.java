package drivers;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pojos.Triangle;

public class Triangle_Driver
{
	public static void main(String[] args)
	{
       ApplicationContext ap=new ClassPathXmlApplicationContext("xmls/triangle.spring.xml");
       Triangle tr1=(Triangle)ap.getBean("t1");
       tr1.draw();
	}

}
