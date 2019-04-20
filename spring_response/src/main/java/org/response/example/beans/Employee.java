package org.response.example.beans;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"address","name","id"})
@JsonIgnoreProperties({"emp_address","emp_id"})//for not showing these properties
public class Employee
{
	@JsonProperty("emp_id")
   private int id;
   private String name;
   @JsonProperty("emp_address")
   private String address;
   public Employee() {
	// TODO Auto-generated constructor stub
     }
public Employee(int id, String name, String address) {
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
     @Override
     public String toString()
     {
    	 return id+"--"+name+"--"+address+"\n";
     }
}
