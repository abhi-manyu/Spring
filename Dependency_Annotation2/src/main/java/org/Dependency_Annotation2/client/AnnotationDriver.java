package org.Dependency_Annotation2.client;

import org.Dependency_Annotation2.beans.Mobile;
import org.Dependency_Annotation2.configs.MobileConfigurer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationDriver
{
   public static void main(String[] args) {
	ApplicationContext ap=
			new AnnotationConfigApplicationContext(MobileConfigurer.class);
	Mobile mob=ap.getBean(Mobile.class);
	mob.Calling();
	mob.sendSms();
}
}
