package driver_class;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pojo_class.Mobile;

public class Driver_Class_2xml_in_1 
{
	public static void main(String[] args)
	{
       ApplicationContext ap=new ClassPathXmlApplicationContext("xmls/mobile_sim.spring.xml");
      Mobile mo1= (Mobile) ap.getBean("mob");
      mo1.layoutDisplay();
      mo1.mobileDetailsDisplay();
	}

}
