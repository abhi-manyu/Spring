package org.form.example.beans;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

public class ForgetPass
{
	@NotEmpty(message="can not be empty")
	@NotNull(message="can not be null")
   private String username;
   public ForgetPass() {
	// TODO Auto-generated constructor stub
}
public ForgetPass(String username) {
	super();
	this.username = username;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
   
}
