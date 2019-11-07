package org.MessengerApplication.example.beans;

public class User
{
   private int userID;
   private String username;
   private String password;
   public User() {
	// TODO Auto-generated constructor stub
    }
public User(int userID,String username, String password) {
	super();
	this.username = username;
	this.password = password;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
   public void setUserID(int userID) {
	this.userID = userID;
}
   public int getUserID() {
	return userID;
}
}
