package org.Spring_MethodReplacer.beans;

public class OldCar {

	private String carName;
	private String milage;
	
	public OldCar() {
		// TODO Auto-generated constructor stub
	}
	
    public OldCar(String carName, String milage) {
		super();
		this.carName = carName;
		this.milage = milage;
	}
     
    
	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public String getMilage() {
		return milage;
	}

	public void setMilage(String milage) {
		this.milage = milage;
	}

	public void displayCarDetails()
    {
    	System.out.println("this is the old car details \n"
    			+ "--------------------------------------------------");
    	System.out.println("old car name is : "+carName);
    	System.out.println("old car milage is "+milage);
    }
   
}
