package pojo;

public class Car
{
   private String car_name;
   private Engine eng;
   
   public void setCar_name(String car_name) {
	this.car_name = car_name;
}
   public void setEng(Engine eng) {
	this.eng = eng;
}  
   
  public void display()
  {
	  System.out.println("the name of tye car is : "+car_name);
	  System.out.println("engine model year : "+eng.getModelyear());
  }
   
}
