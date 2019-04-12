package org.Spring_Annotation_Config.beans;

public class User
{
   private String name;
   private Mobile mob;
   
   public User() {
	System.out.println("user created by default constructor");
    }
   
   public User(Mobile mob) {
	super();
	this.mob = mob;
}

public void setName(String name) {
	this.name = name;
}
   public String getName() {
	return name;
}
   
   public void setMob(Mobile mob) {
	this.mob = mob;
}
   public Mobile getMob() {
	return mob;
}
   public void userDisplay()
   {
	   System.out.println(name);
	   mob.displayMobileDemo();
   }
}
