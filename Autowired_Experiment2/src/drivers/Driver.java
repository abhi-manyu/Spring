package drivers;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pojos.Car;

public class Driver {
 
	public static void main(String[] args) {
		ApplicationContext ap=new 
				 ClassPathXmlApplicationContext("xmls/autowire.spring.xml");
		Car c1=(Car)ap.getBean("car1");
		c1.display();
	}
}
