package org.form.example.beans;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.CollectionOfElements;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="Diff")
public class Student
{
	@Min(10)
	@Max(50)
	@Id
   private int rolno;
	
	@NotNull
	@NotEmpty
   private String name;
	
	@NotNull(message="can not be empty")
	@NotEmpty(message="can not be empty")
	@Size(min=5,max=10,message="ur password length should be with in 5 to 10 characters")
	private String password;
	
	@NotNull(message="u hav enot cheacked ny value")
	@NotEmpty(message="(at least select 1 skill)")
	@CollectionOfElements
    private List<String> course;
	
   @NotEmpty(message="(at least one should be selected)")
   private String country;
   
   public Student() {
	// TODO Auto-generated constructor stub
   }
public Student(int rolno, String name, List<String> course, String country,
		String password) {
	super();
	this.rolno = rolno;
	this.name = name;
	this.course = course;
	this.country = country;
	this.password=password;
}
public int getRolno() {
	return rolno;
}
public void setRolno(int rolno) {
	this.rolno = rolno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public List<String> getCourse() {
	return course;
}
public void setCourse(List<String> course) {
	this.course = course;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
   public void setPassword(String password) {
	this.password = password;
}
   public String getPassword() {
	return password;
}
}
