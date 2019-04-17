package org.exception.example.beans;

import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.NotEmpty;

public class UserSignup
{
   private int id;
	@NotEmpty(message="can not be empty")
   private String name;
   private String address;
   public UserSignup() {
	// TODO Auto-generated constructor stub
    }
public UserSignup(int id, String name, String address) {
	super();
	this.id = id;
	this.name = name;
	this.address = address;
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
   
}
