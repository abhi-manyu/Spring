package pojo_class;

public class Mobile
{
  private String phone_name;
  private int phone_cost;
  private Sim sim;
  
  /*public Mobile()
  {
	System.out.println("yes mobile object is created by default constructor");
  }*/
  
  public void setPhone_name(String phone_name)
   {
	this.phone_name = phone_name;
   }
  public void setPhone_cost(int phone_cost)
   {
	this.phone_cost = phone_cost;
   }
  public void setSim(Sim sim)
   {
	this.sim = sim;
   }
  public void layoutDisplay()
  {
	  System.out.println("----------------------------------------------------------------");
	  System.out.println
	   ("device name \t\t device cost \t used sim \t main balance\n----------------------------"
	   		+ "---------------------------------------");
  }
  public void mobileDetailsDisplay()
  {
	  System.out.println
	  (phone_name+"\t"+phone_cost+"\t\t"+sim.getSim_name()+"\t\t"+sim.getMain_bal());
  }
  
}
