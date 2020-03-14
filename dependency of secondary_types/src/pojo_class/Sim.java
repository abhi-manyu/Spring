package pojo_class;

public class Sim
{
   private String sim_name;
   private double main_bal;
   
   /*public Sim()
    {
	   System.out.println("yes sim object is created by default constructor of sim");
    }*/
   
   public void setSim_name(String sim_name)
   {
	this.sim_name = sim_name;
   }
   public void setMain_bal(double main_bal) {
	this.main_bal = main_bal;
}
   public String getSim_name() {
	return sim_name;
}
   public double getMain_bal() {
	return main_bal;
}
}
