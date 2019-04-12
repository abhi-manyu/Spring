package drivers;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Car;

public class Driver{

	public static void main(String[] args)
	{
       @SuppressWarnings("resource")
	   ApplicationContext ap
       =new ClassPathXmlApplicationContext("configs/car.spring.xml");
       Car c=(Car)ap.getBean("c1");
       c.displayDetails();
    
	}

}
