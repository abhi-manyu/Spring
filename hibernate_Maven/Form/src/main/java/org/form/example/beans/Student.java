package org.form.example.beans;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

public class Student
{
	@Min(5)
	@Max(10)
   private int id;
	
	@NotNull
	@NotEmpty
   private String name;
   public Student() {
	// TODO Auto-generated constructor stub
}
public Student(int id, String name) {
	super();
	this.id = id;
	this.name = name;
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
   
}
