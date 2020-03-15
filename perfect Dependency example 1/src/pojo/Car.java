package pojo;

public class Car implements Veichle
{
  private int no_of_seat;
  private String company;
  private int speed;
  
  public void setNo_of_seat(int no_of_seat)
   {
	this.no_of_seat = no_of_seat;
   }
  public void setCompany(String company)
  {
	company = company;
  }
  public void setSpeed(int speed)
  {
	this.speed = speed;
  }
  public int getNo_of_seat()
  {
	return no_of_seat;
   }
  public String getCompany()
  {
	return company;
  }
  public int getSpeed()
  {
	return speed;
  }
@Override
public void start() {
	System.out.println("journey started by "+company+" car");
	
}
}
