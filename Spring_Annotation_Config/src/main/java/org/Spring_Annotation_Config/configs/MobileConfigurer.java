package org.Spring_Annotation_Config.configs;

import org.Spring_Annotation_Config.beans.Mobile;
import org.Spring_Annotation_Config.beans.Processor;
import org.Spring_Annotation_Config.beans.Sim;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MobileConfigurer
{
   @Bean
   public Mobile getMobileObject()
   {
	   Mobile mb=new Mobile("redmi not 5 pro",getSimObject());
	   mb.setProc(getProcessorObject());
	   return mb;
   }
   @Bean
   public Sim getSimObject()
   {
	   //Sim sm=new Sim("airtel");
	   Sim sm=new Sim();
	   sm.setName("vodafone");
	   return sm;
   }
   @Bean
   public Processor getProcessorObject()
   {
	   Processor pr=new Processor("Snapdragon 855","2.4 GHz");
	   /*pr.setName("Snapdragon 855");
	   pr.setSpeed("2.4 GHz");*/
	   return pr;
   }
}
