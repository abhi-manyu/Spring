package main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import classes.Helloname;

public class Client
{
	public static void main(String[] args)
	{
       Resource r=new ClassPathResource("resources/sayhello.xml");
       BeanFactory factory= new XmlBeanFactory(r);
       System.out.println("xml loaded");
       Helloname h1=(Helloname)factory.getBean("hn");
       h1.sayhello();
	}

}
