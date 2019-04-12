package org.Spring_MethodReplacer.beans;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class NewCarReplacer implements MethodReplacer
{
	private String carName;
	private String milage;
	
	public NewCarReplacer()
	{
		// TODO Auto-generated constructor stub
	}
	
	
    public NewCarReplacer(String carName, String milage, OldCar oldc)
    {
    	super();
		this.carName = carName;
		this.milage = milage;
		this.oldc = oldc;
	}

     public String getCarName() {
		return carName;
	}
     public void setCarName(String carName) {
		this.carName = carName;
	}
     public void setMilage(String milage) {
		this.milage = milage;
	}
     public String getMilage() {
		return milage;
	}
	OldCar oldc;
	public Object reimplement(Object obj, Method arg1, Object[] arg2) throws Throwable
	{
		System.out.println("this is the new car details \n "
				+ "---------------------------------------------------------");
		System.out.println("the new car name is : "+carName);
		System.out.println("the new Car milage is "+milage);
	    return obj;
	
	}
    
}
