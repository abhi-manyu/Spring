package main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import classes.Helloworld;

public class Container_Driver
{
	public static void main(String[] args)
	{
       Resource r=new ClassPathResource("resources/hello.xml");
       BeanFactory factory=new XmlBeanFactory(r);
      Helloworld hw= (Helloworld)factory.getBean("h");
      hw.getUP();
      hw.doWork();
      hw.goOffice();
      
      Helloworld hw2= (Helloworld)factory.getBean("h");
      hw2.getUP();
      hw2.doWork();
      hw2.goOffice();
      System.out.println(hw==hw2);
	}

}
