package beans;

public class Engine
{
   private String modelyear;
   private String milage;
   
   public Engine(String modelyear,String milage)
   {
       this.modelyear=modelyear;
       this.milage=milage;
   }
   
   
   public String getModelyear() {
	return modelyear;
}
   public String getMilage() {
	return milage;
}
}
