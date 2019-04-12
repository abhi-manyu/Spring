package org.library.example.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class CollegeImpl implements Colleges
{
   private int colId;
   private String colName;
   private String colAddress;
   
   @Autowired
   @Qualifier("lib1")
   private Librery lib;
   
   private int no_Of_Students;
   
   @Autowired
   @Qualifier("stu2")
   private Students st;
   
   public CollegeImpl()
    {
	   
    }
public CollegeImpl(int colId, String colName, String colAddress, Librery lib, int no_Of_Students, Students st) {
	super();
	this.colId = colId;
	this.colName = colName;
	this.colAddress = colAddress;
	this.lib = lib;
	this.no_Of_Students = no_Of_Students;
	this.st = st;
}
public int getColId() {
	return colId;
}
public void setColId(int colId) {
	this.colId = colId;
}
public String getColName() {
	return colName;
}
public void setColName(String colName) {
	this.colName = colName;
}
public String getColAddress() {
	return colAddress;
}
public void setColAddress(String colAddress) {
	this.colAddress = colAddress;
}
public Librery getLib() {
	return lib;
}
public void setLib(Librery lib) {
	this.lib = lib;
}
public int getNo_Of_Students() {
	return no_Of_Students;
}
public void setNo_Of_Students(int no_Of_Students) {
	this.no_Of_Students = no_Of_Students;
}
public Students getSt() {
	return st;
}
public void setSt(Students st) {
	this.st = st;
}
   public void displayCollegeDetails()
   {
	   System.out.println("college id : "+colId);
	   System.out.println("college name : "+colName);
	   System.out.println("college address : "+colAddress);
	   LibreryImpl lb=(LibreryImpl)lib;
	   System.out.println("librery id : "+lb.getId());
	   System.out.println("library name : "+lb.getName());
	   System.out.println("librery capacity : "+lb.getCapacity());
	   System.out.println("librery no of books : "+lb.getNo_Of_Books());
	   StudentImpl sti=(StudentImpl)st;
	   System.out.println("student id : "+sti.getRollNo());
	   System.out.println("student name : "+sti.getName());
	   System.out.println("marks : "+sti.getMark());
   }
}
