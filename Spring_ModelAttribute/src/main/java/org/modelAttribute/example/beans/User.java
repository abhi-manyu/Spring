package org.modelAttribute.example.beans;


public class User {
    private int rono;
    private String name;
    private Address add;
    
    public User() {
		// TODO Auto-generated constructor stub
	}
	public User(int rono, String name, Address add) {
		super();
		this.rono = rono;
		this.name = name;
		this.add=add;
	}
	public int getRono() {
		return rono;
	}
	public void setRono(int rono) {
		this.rono = rono;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAdd(Address add) {
		this.add = add;
	}
	public Address getAdd() {
		return add;
	}
    
}
