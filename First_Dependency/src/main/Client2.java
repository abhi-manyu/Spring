package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import classes.Helloname;

public class Client2 {

	public static void main(String[] args) {
     ApplicationContext ap=
    		 new ClassPathXmlApplicationContext("resources/sayhello.xml");
     System.out.println("pojo object created");
     Helloname hnm=(Helloname)ap.getBean("hn");
     hnm.sayhello();
	}

}
