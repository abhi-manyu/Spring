package pojo;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


//@Component
public class Car
{
	//using java annotation
	@Resource
	@Qualifier(value="be")
	
	//using spring annotation
	/*@Autowired
	@Qualifier*/
  private Engine eng;
  
  public void display()
  {
	  if(eng instanceof AudiEngine)
	  System.out.println("Audi--------->"+((AudiEngine)eng).getModelyear());
	  else
		  System.out.println("BMW--------->"+((BMWEngine)eng).getModelyear());
  }
}
