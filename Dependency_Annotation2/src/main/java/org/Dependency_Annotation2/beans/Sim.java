package org.Dependency_Annotation2.beans;

public class Sim
{
	private String simname;
	
    public Sim(String name) {
    	this.simname=name;
		System.out.println("sim object created");
	}
    
    
    public String getSimname() {
		return simname;
	}
    public void call(String number)
    {
    	System.out.println("call connected to : "+number+" by "+simname);
    }
    public void sendSms(String number)
    {
    	System.out.println("message has been sent to : "+number+" by "+simname);
    }
}
