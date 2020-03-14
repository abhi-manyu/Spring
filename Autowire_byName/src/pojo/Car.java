package pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Car
{
   private String wonername;
   @Autowired
   @Qualifier(value="e1")
   private Engine eng;
   
   public void setWonername(String wonername) {
	this.wonername = wonername;
}
   
   public void display()
   {
	   System.out.println("car woner : "+wonername);
	   if(eng instanceof BmwEngine)
	   {
	     System.out.println("engine mmodel : "+((BmwEngine)eng).getSeriesname());
	     System.out.println("model year : "+((BmwEngine)eng).getModelyear());
	   }
	   else {
		   System.out.println("engine mmodel : "+((AudiEngine)eng).getSeriesname());
		     System.out.println("model year : "+((AudiEngine)eng).getModelyear());
		   }
   }
}
