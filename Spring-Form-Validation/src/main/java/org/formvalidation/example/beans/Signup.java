package org.formvalidation.example.beans;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.CollectionOfElements;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="signuptable")
public class Signup
{
   @NotNull
   @Min(5)
   @Id
   private int id;
   
   private String name;
   private double marks;
   private String address;
   
   @NotEmpty
   @Size(min=5, max=10)
   private String password;
   private String conPassword;
   
   @NotEmpty(message="plz select ur city")
   private String city;
   
   @CollectionOfElements
   private Set<String> courses;
   
   public Signup()
     {
     
     }

public Signup(String name, String address, String password, String conPassword,
		          String city,Set<String> courses)
{
	super();
	this.name = name;
	this.address = address;
	this.password=password;
	this.conPassword=conPassword;
	this.city=city;
	this.courses=courses;
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

public double getMarks() {
	return marks;
}

public void setMarks(double marks) {
	this.marks = marks;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}
public void setPassword(String password) {
	this.password = password;
}
public String getPassword() {
	return password;
}
public void setConPassword(String conPassword) {
	this.conPassword = conPassword;
}
public String getConPassword() {
	return conPassword;
}

public void setCity(String city) {
	this.city = city;
}
public String getCity() {
	return city;
}
   public void setCourses(Set<String> courses) {
	this.courses = courses;
}
   public Set<String> getCourses() {
	return courses;
}
}
