package pojo;

public class Vodafone implements Sim
{
	private String simname;
	  private String simwoner;
	  
	  public Vodafone()
	   {
		  
	   }

	public Vodafone(String simname, String simwoner)
	  {
		super();
		this.simname = simname;
		this.simwoner = simwoner;
	   }
	   public String getSimname()
	   {
		return simname;
	   }

}
