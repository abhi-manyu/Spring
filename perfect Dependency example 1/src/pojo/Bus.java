package pojo;

public class Bus implements Veichle
{
  private int no_of_seat;
  private String company;
  private int speed;
  private String route_from;
  private String route_to;
  
  public void setNo_of_seat(int no_of_seat)
  {
	this.no_of_seat = no_of_seat;
  }
  public void setCompany(String company) {
	this.company = company;
}
  public void setSpeed(int speed)
  {
	this.speed = speed;
  }
  public void setRoute_from(String route_from)
  {
	this.route_from = route_from;
  }
  public void setRoute_to(String route_to)
  {
	this.route_to = route_to;
  }
  public String getCompany() {
	return company;
  }
  public int getNo_of_seat() {
	return no_of_seat;
  }
  public String getRoute_from() {
	return route_from;
  }
  public String getRoute_to() {
	return route_to;
  }
  public int getSpeed() {
	return speed;
}
@Override
public void start() {
	System.out.println("journey started by "+company+" bus");
	
}
}
