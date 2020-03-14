package beans;

public class Bus
{
   private Engine eng;
   
   public Bus(Engine eng) {
      System.out.println("bus object created");
      this.eng=eng;
   }
   
   public void display()
   {
	   System.out.println("bus has been created and engine model is : "+eng.getModelyear());
   }
}
