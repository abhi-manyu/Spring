package org.annotations.example.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@EnableWebMvc
@ComponentScan("org.annotations.example")
@Configuration
public class MyConfig extends WebMvcConfigurerAdapter
{
	
	@Bean
	public InternalResourceViewResolver getView()
	{
		InternalResourceViewResolver vr=new InternalResourceViewResolver();
		
		vr.setPrefix("/WEB-INF/");
		vr.setSuffix(".jsp");
		
		return vr;
	}
}
