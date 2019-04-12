package beans;

public class Car
{
   private String carname;
   private Engine eng;
   
   public void setCarname(String carname) {
	this.carname = carname;
}
   public void setEng(Engine eng) {
	this.eng = eng;
}
   public String getCarname() {
	return carname;
}
   public Engine getEng() {
	return eng;
}
   public void displayCardetails()
   {
	   System.out.println("the car name : "+carname);
	   System.out.println("engine modelyear : "+eng.getModelyear()+" milage : "+eng.getMilage());
   }
}
