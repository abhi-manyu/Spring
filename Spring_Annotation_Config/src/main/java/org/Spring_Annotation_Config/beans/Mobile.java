package org.Spring_Annotation_Config.beans;

public class Mobile
{
   private String mobile_name;
   private Sim sim;
   private Processor proc;
   
   public Mobile() {
	System.out.println("mobile created by default constructor");
    }

public Mobile(String mobile_name, Sim sim) {
	super();
	this.mobile_name = mobile_name;
	this.sim = sim;
}


public Processor getProc() {
	return proc;
}

public void setProc(Processor proc) {
	this.proc = proc;
}
   public void displayMobileDemo()
   {
	   System.out.println("mobile name : "+mobile_name+"\n sim :"+sim
			   +"processor : "+proc);
   }
}
