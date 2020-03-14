package pojo;

public class Mobile
{
   private int mobile_id;
   private String[] mobile_name;
   private double mobile_cost;
   private Sim[] sim;
   
   public void setMobile_cost(double mobile_cost)
   {
	this.mobile_cost = mobile_cost;
   }
   public void setMobile_id(int mobile_id)
    {
	this.mobile_id = mobile_id;
    }
   public void setMobile_name(String[] mobile_name)
    {
	this.mobile_name = mobile_name;
    }
   public void setSim(Sim[] sim)
    {
	this.sim = sim;
    }
   public void layout()
   {
	   
   }
   public void display()
   {
	 System.out.println(mobile_id);
	 for(String mob:mobile_name)
	 {
		 System.out.println("\t"+mob);
	 }
	 System.out.println("\t\t\t\t"+mobile_cost);
	 for(Sim sm:sim)
	 {
		 System.out.println("\t\t\t\t\t"+sm.getSim_name()+"----"+sm.getSim_woner());
	 }
   }
}
