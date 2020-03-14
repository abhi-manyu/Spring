package pojos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

public class Car
{
   private String car_name;
   @Autowired
   private Engine eng;
   
   public void setCar_name(String car_name) {
	this.car_name = car_name;
}
   /*@Required
   public void setEng(Engine eng) {
	this.eng = eng;
}*/
   public void display()
   {
	   System.out.println
	   ("carname : "+car_name+"\nengine model year : "+eng.getModel_year()
	                 +"\n"+"engine  price : "+eng.getPrice());
   }
}
