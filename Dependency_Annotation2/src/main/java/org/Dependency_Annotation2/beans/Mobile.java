package org.Dependency_Annotation2.beans;

public class Mobile
{
   private String mobname;
   private Sim sim;
   private Processor pros;
   
   public Mobile(Sim sim)
   {
	  this.sim=sim;
   }
   
   public void setMobname(String mobname) {
	this.mobname = mobname;
}
   public String getMobname() {
	return mobname;
}
   public void setPros(Processor pros) {
	this.pros = pros;
}
   public Processor getPros() {
	return pros;
}
   
   public void Calling()
   {
	   sim.call(8);
   }
   public void sendSms()
   {
	   sim.sendSms(80);
   }
   public void showSpecs()
   {
	  System.out.println(pros.getProcName());
   }
}
