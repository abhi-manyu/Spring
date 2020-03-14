package pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Car
{
   @Autowired
   @Qualifier(value="e2")
   private Engine eng;
   
   public void display()
   {
	   if(eng instanceof CarEngine)
		   System.out.println
		   ("this is a car enngine & its model year : "+((CarEngine)eng).getModelyr());
	   else
		   System.out.println
		   ("this is a bus engine & its model year : "+((BusEngine)eng).getModelyr());
    }
}
