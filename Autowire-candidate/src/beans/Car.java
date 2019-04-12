package beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Car {

	@Autowired
	private Engine eng;
	
	public void displayDetails()
	{
		System.out.println("engine : "+eng.getEngname());
	}
}
