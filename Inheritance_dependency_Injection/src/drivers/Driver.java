package drivers;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pojo.Phone;

public class Driver
{
	public static void main(String[] args)
	{
        ApplicationContext ap=new ClassPathXmlApplicationContext("xmls/phone.spring.xml");
        Phone phone1=(Phone)ap.getBean("p1");
        phone1.simDetection();
        phone1.switchOn();
        phone1.call();
        phone1.sendSms();
	}

}
