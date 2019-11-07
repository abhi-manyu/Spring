package org.transaction.example.beans;

public class User
{
	//@GeneratedValue()
   private int id;
   private String username;
   private String password;
   public User() {
	// TODO Auto-generated constructor stub
    }
public User(int id, String username, String password) {
	super();
	this.id = id;
	this.username = username;
	this.password = password;
}
   public void setId(int id) {
	this.id = id;
}
   public int getId() {
	return id;
}
   public void setUsername(String username) {
	this.username = username;
}
   public String getUsername() {
	return username;
}
   public void setPassword(String password) {
	this.password = password;
}
   public String getPassword() {
	return password;
}
   @Override
	public String toString() {
		return "id : "+id+" userName : "+username+" password : "+password;
	}
}
