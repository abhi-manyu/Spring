package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import classes.MotherEarth;

public class J2ee_Container
{
	public static void main(String[] args)
	{
       ApplicationContext ac=new ClassPathXmlApplicationContext("res/spring.xml");
       MotherEarth m1=(MotherEarth) ac.getBean("mot");
       m1.display();
       System.out.println(m1.getClass().getSimpleName());
       MotherEarth m2=(MotherEarth) ac.getBean("mot");
       m2.display();
       MotherEarth m3=(MotherEarth) ac.getBean("mot");
       m3.display();
       System.out.println(m1.equals(m3));
	}

}
