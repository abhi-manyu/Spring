package org.library.example.beans;

public class StudentImpl implements Students
{
   private int rollNo;
   private String name;
   private double mark;
   private String address;
   public StudentImpl()
    {
	   
    }
public StudentImpl(int rollNo, String name, double mark, String address) {
	super();
	this.rollNo = rollNo;
	this.name = name;
	this.mark = mark;
	this.address = address;
}
public int getRollNo() {
	return rollNo;
}
public void setRollNo(int rollNo) {
	this.rollNo = rollNo;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getMark() {
	return mark;
}
public void setMark(double mark) {
	this.mark = mark;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
   
}
