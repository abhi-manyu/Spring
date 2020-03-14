package pojo;

public class Airtel implements Sim
{
  private String simname;
  private String simwoner;
  
  public Airtel()
   {
	  
   }

public Airtel(String simname, String simwoner)
  {
	this.simname = simname;
	this.simwoner = simwoner;
   }
   public String getSimname()
   {
	return simname;
   }

}
