package pojo;

public class Mobile
{
	private String ph_name;
	  private int cost;
	  private Sim sim;
	  
	  public void setPh_name(String ph_name)
	   {
		this.ph_name = ph_name;
	   }
	  public void setCost(int cost)
	   {
		this.cost = cost;
	   }
	  public void setSim(Sim sim)
	   {
		this.sim = sim;
	   }
	  public void display()
	  {
		  System.out.println("the name of the phone is : "+ph_name);
		  System.out.println("the cost of the phone is : "+cost);
		  if(sim instanceof Vodafone)
		      System.out.println("currently active sim is : "+((Vodafone)sim).getSimname());
		  if(sim instanceof Airtel)
			  System.out.println("currently active sim is : "+((Airtel)sim).getSimname());
	  }
}
