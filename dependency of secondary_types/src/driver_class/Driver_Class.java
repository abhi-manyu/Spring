package driver_class;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pojo_class.Mobile;

public class Driver_Class
{
	public static void main(String[] args)
	{
       String[] xmls={"xmls/sim.spring.xml","xmls/phone.spring.xml"};
       ApplicationContext ap=new ClassPathXmlApplicationContext(xmls);
       Mobile mob1=(Mobile)ap.getBean("ph");
       mob1.layoutDisplay();
       mob1.mobileDetailsDisplay();
       Mobile mob2=(Mobile)ap.getBean("ph");
       mob2.mobileDetailsDisplay();
       System.out.println("two objects are same(true/false) : "+mob1.equals(mob2));
	}

}
