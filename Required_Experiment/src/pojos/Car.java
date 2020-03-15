package pojos;

import org.springframework.beans.factory.annotation.Required;

public class Car {
	private String name;
   private Engine eng;
   
   public void setName(String name) {
	this.name = name;
}
   @Required
   public void setEng(Engine eng) {
	this.eng = eng;
}
   public void display()
   {
	   System.out.println("car name : "+name+"\nEngine name : "+eng.getEng_name());
   }
}
