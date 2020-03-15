package org.Spring_Annotation_Config.client;

import org.Spring_Annotation_Config.beans.Mobile;
import org.Spring_Annotation_Config.beans.User;
import org.Spring_Annotation_Config.configs.MobileConfigurer;
import org.Spring_Annotation_Config.configs.UserConfigurer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver
{
	public static void main(String[] args)
	{
		
		/*ApplicationContext ap=
				new AnnotationConfigApplicationContext(MobileConfigurer.class);
		Mobile mb=ap.getBean(Mobile.class);
		mb.displayMobileDemo();*/
		  
	//	     (  or   )
		
       /*AnnotationConfigApplicationContext acp=
    		    new AnnotationConfigApplicationContext();
       acp.register(Mobile.class);
       acp.register(Sim.class);
       acp.refresh();*/
			
		ApplicationContext ap=
				new AnnotationConfigApplicationContext(UserConfigurer.class);
		User u1=ap.getBean(User.class);
		u1.userDisplay();
		System.out.println("hi");
		
	}
}
