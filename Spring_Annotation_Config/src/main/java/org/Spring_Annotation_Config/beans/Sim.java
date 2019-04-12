package org.Spring_Annotation_Config.beans;

public class Sim
{
   private String name;
   public Sim() {
	System.out.println("sim created by default constructor");
   }
public Sim(String name) {
	super();
	this.name = name;
}
    public void setName(String name) {
		this.name = name;
	}
    public String getName() {
		return name;
	}
    @Override
    	public String toString() {
    		return name;
    	}
}
