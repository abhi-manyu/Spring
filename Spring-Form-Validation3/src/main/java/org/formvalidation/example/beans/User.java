package org.formvalidation.example.beans;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

public class User
{
	@Email
	@NotEmpty(message="username shouldn't be empty")
    private String username;
	
	@NotEmpty(message="plz enter ur password")
	@Size(min=5, max=7, message="ur password should between 5-7 characters")
    private String password;
	
	public User() {
		// TODO Auto-generated constructor stub
	}
	public User(String username, String password) {
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
