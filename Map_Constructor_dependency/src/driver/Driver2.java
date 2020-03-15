package driver;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pojo.Question2;

public class Driver2
{

	public static void main(String[] args) {
		ApplicationContext ap=new ClassPathXmlApplicationContext("xmls/queans.spring.xml");
        Question2 qn1=(Question2)ap.getBean("qs1");
        qn1.display();

	}

}
