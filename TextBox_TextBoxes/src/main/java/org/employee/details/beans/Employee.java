package org.employee.details.beans;


public class Employee
{ 
    private boolean rcv_ofrs;
    private String[] courses;
    public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(boolean rcv_ofrs, String[] courses) {
		super();
		this.rcv_ofrs = rcv_ofrs;
		this.courses = courses;
	}
    
	public void setRcv_ofrs(boolean rcv_ofrs) {
		this.rcv_ofrs = rcv_ofrs;
	}
	public void setCourses(String[] courses) {
		this.courses = courses;
	}
	public String[] getCourses() {
		return courses;
	}
	public boolean isRcv_ofrs() {
		return rcv_ofrs;
	}
   
}
