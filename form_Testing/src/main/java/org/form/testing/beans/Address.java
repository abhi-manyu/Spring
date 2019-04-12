package org.form.testing.beans;

public class Address
{
   private int flatNo;
   private String pgName;
   private String layout;
   private String pin;
   
   public Address() {
	// TODO Auto-generated constructor stub
   }

public Address(int flatNo, String pgName, String layout, String pin) {
	super();
	this.flatNo = flatNo;
	this.pgName = pgName;
	this.layout = layout;
	this.pin = pin;
}

public int getFlatNo() {
	return flatNo;
}

public void setFlatNo(int flatNo) {
	this.flatNo = flatNo;
}

public String getPgName() {
	return pgName;
}

public void setPgName(String pgName) {
	this.pgName = pgName;
}

public String getLayout() {
	return layout;
}

public void setLayout(String layout) {
	this.layout = layout;
}

public String getPin() {
	return pin;
}

public void setPin(String pin) {
	this.pin = pin;
}
   
}
