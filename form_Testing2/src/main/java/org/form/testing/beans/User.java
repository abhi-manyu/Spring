package org.form.testing.beans;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

public class User
{
	@NotEmpty
	@NotBlank
	private String name;
	
	@NotNull
	private Address add;
	
	public User() {
		// TODO Auto-generated constructor stub
	}
	public User(String name, Address add) {
		super();
		this.name = name;
		this.add = add;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAdd() {
		return add;
	}
	public void setAdd(Address add) {
		this.add = add;
	}
	
}
