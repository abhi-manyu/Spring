package pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Car
{
	@Autowired
  @Qualifier(value="e1")
  private Engine eng;
  
  public void display()
  {
	  System.out.println("car model = "+eng.getModelyear());
  }
}
