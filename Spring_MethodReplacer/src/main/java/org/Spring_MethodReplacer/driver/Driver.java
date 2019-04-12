package org.Spring_MethodReplacer.driver;

import org.Spring_MethodReplacer.beans.OldCar;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {
       ApplicationContext ap
       =new ClassPathXmlApplicationContext("org/Spring_MethodReplacer/configs/car.spring.xml");
       OldCar oc=(OldCar)ap.getBean("old");
       oc.displayCarDetails();
	}

}
