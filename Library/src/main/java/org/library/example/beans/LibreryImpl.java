package org.library.example.beans;

public class LibreryImpl implements Librery
{
   private int id;
   private String name;
   private String type;
   private long capacity;
   private long no_Of_Books;
   public LibreryImpl()
     {
	   
     }
public LibreryImpl(int id, String name, String type, long capacity, long no_Of_Books) {
	super();
	this.id = id;
	this.name = name;
	this.type = type;
	this.capacity = capacity;
	this.no_Of_Books = no_Of_Books;
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
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public long getCapacity() {
	return capacity;
}
public void setCapacity(long capacity) {
	this.capacity = capacity;
}
public long getNo_Of_Books() {
	return no_Of_Books;
}
public void setNo_Of_Books(long no_Of_Books) {
	this.no_Of_Books = no_Of_Books;
}
   
}
