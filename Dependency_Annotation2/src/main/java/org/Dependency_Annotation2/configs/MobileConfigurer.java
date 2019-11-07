package org.Dependency_Annotation2.configs;

import org.Dependency_Annotation2.beans.Mobile;
import org.Dependency_Annotation2.beans.Processor;
import org.Dependency_Annotation2.beans.Sim;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MobileConfigurer
{
    @Bean
    public Mobile getMobileObject()
    {
    	Mobile mob=new Mobile(getSimObject());
    	mob.setMobname("Redmi Note 5 pro");
    	mob.setPros(getProcessorObject());
    	return mob;
    }
    
    @Bean
    public Sim getSimObject()
    {
    	return new Sim("Jio");
    }
    
    @Bean
    public Processor getProcessorObject()
    {
    	Processor ps= new Processor();
    	ps.setProcName("SnapDragon 845");
    	return ps;
    }
}
