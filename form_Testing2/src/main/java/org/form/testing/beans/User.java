package org.form.testing.beans;

public class User
{
	private String name;
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
