package org.modelAttribute.example.beans;

public class Address
{
   private int stNo;
   private String flatName;
   private String layout;
   private int pin;
   private long mob;
   public Address() {
	// TODO Auto-generated constructor stub
   }
public Address(int stNo, String flatName, String layout, int pin, long mob) {
	super();
	this.stNo = stNo;
	this.flatName = flatName;
	this.layout = layout;
	this.pin = pin;
	this.mob = mob;
}
public int getStNo() {
	return stNo;
}
public void setStNo(int stNo) {
	this.stNo = stNo;
}
public String getFlatName() {
	return flatName;
}
public void setFlatName(String flatName) {
	this.flatName = flatName;
}
public String getLayout() {
	return layout;
}
public void setLayout(String layout) {
	this.layout = layout;
}
public int getPin() {
	return pin;
}
public void setPin(int pin) {
	this.pin = pin;
}
public long getMob() {
	return mob;
}
public void setMob(long mob) {
	this.mob = mob;
}
   
}
