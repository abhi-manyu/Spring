package org.form.testing.beans;

import java.util.List;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

public class User
{
	@Min(2)
	@Max(7)
   private int id;
   
   @NotNull(message="user's name can not be null")
   @Size(min=5,max=8,message="btw 5-8 characters")
   private String name;
   
   @NotEmpty(message="u have not choosen nything, at least have to choose one item")
   private List<String> courses;
   
   private Address add;
   
   public User() {
	// TODO Auto-generated constructor stub
}
public User(int id, String name, List<String> courses, Address add) {
	super();
	this.id = id;
	this.name = name;
	this.courses = courses;
	this.add=add;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
   public void setName(String name) {
	this.name = name;
}
   public String getName() {
	return name;
}
   public void setCourses(List<String> courses) {
	this.courses = courses;
}
   public List<String> getCourses() {
	return courses;
}
  public void setAdd(Address add) {
	this.add = add;
}
  public Address getAdd() {
	return add;
}
}
