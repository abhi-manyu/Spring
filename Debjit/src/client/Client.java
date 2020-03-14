package client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Bus;

public class Client {

	public static void main(String[] args) {
       ApplicationContext ap=new ClassPathXmlApplicationContext("configs/bus.spring.xml");
       Bus b=(Bus)ap.getBean("b1");
       b.display();
	}

}
