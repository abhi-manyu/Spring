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
    public Mobile mobile()
    {
    	Mobile mob=new Mobile(sim());
    	mob.setMobname("Redmi Note 5 pro");
    	mob.setPros(processor());
    	return mob;
    }
    
    @Bean
    public Sim sim()
    {
    	return new Sim("Jio");
    }
    
    @Bean
    public Processor processor()
    {
    	Processor ps= new Processor();
    	ps.setProcName("SnapDragon 845");
    	return ps;
    }
}
