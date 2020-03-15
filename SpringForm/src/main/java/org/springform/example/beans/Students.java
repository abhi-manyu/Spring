package org.springform.example.beans;


public class Students
{
   private int id;
   private String name;
   private String address;
   private String phoneno;
   public Students() {
	// TODO Auto-generated constructor stub
}
public Students(int id, String name, String address, String phoneno) {
	super();
	this.id = id;
	this.name = name;
	this.address = address;
	this.phoneno = phoneno;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getPhoneno() {
	return phoneno;
}
public void setPhoneno(String phoneno) {
	this.phoneno = phoneno;
}
   
}
