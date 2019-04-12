package org.form.example.beans;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

public class Login
{
	@NotEmpty(message="can not be empty")
	@NotNull(message="can not be null")
   private String username;
	
	@NotEmpty(message="can not be empty")
	@NotNull(message="can not be null")
	@Size(min=5,max=10)
   private String password;
   public Login() {
	// TODO Auto-generated constructor stub
}
public Login(String username, String password) {
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
   
}
