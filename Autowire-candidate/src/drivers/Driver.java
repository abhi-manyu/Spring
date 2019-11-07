package drivers;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Car;
import beans.Engine;

public class Driver{

	public static void main(String[] args)
	{
		Engine en=null;
       try {
    	   System.out.println("1st");
	   ApplicationContext ap
       =new ClassPathXmlApplicationContext("configs/car.spring.xml");
	   System.out.println("2nd step");
       en=(Engine) ap.getBean("en1");
       en.callEngine();
       }
       
       catch (Exception e) {
		System.out.println(en);
	}
    
	}

}
