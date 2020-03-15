package drivers;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pojos.Car;

public class Driver {

	public static void main(String[] args) {
        ApplicationContext ap=new ClassPathXmlApplicationContext("xmls/exp.spring.xml");
        Car ca1=(Car)ap.getBean("c1");
        ca1.display();
	}

}
