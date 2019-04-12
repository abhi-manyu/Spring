package org.Spring_Annotation_Config.beans;

public class Processor
{
   private String speed;
   private String name;
   public Processor() {
	System.out.println("processor created by default constructor");
   }
public Processor(String speed, String name) {
	super();
	this.speed = speed;
	this.name = name;
}
   public void setName(String name) {
	this.name = name;
}
   public String getName() {
	return name;
}
   public void setSpeed(String speed) {
	this.speed = speed;
}
   public String getSpeed() {
	return speed;
}
   @Override
	public String toString() {
		return name+"-----"+speed;
	}
}
