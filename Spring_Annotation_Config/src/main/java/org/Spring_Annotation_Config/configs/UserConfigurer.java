package org.Spring_Annotation_Config.configs;

import org.Spring_Annotation_Config.beans.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.Spring_Annotation_Config.configs.MobileConfigurer;

@Configuration
@Import(MobileConfigurer.class)
public class UserConfigurer
{
   @Bean
   public User getUserObject()
   {
	   User u1=new User();
	   u1.setName("stack");
	   return u1;
   }
}
