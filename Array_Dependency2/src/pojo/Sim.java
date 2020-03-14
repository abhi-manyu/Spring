package pojo;

public class Sim
{
   private int sim_id;
   private String sim_name;
   private String sim_woner;
   
   public void setSim_id(int sim_id)
    {
	this.sim_id = sim_id;
    }
   public void setSim_name(String sim_name)
   {
	this.sim_name = sim_name;
   }
   public void setSim_woner(String sim_woner)
   {
	this.sim_woner = sim_woner;
   }
   public String getSim_name()
    {
	return sim_name;
    }
   public String getSim_woner()
   {
	return sim_woner;
   }
}
