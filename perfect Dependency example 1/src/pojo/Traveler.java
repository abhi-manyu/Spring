package pojo;

public class Traveler implements Journey
{
   private int taveler_age;
   private String traveler_name;
   private Veichle vei;
   
   public void setTaveler_age(int taveler_age)
   {
	this.taveler_age = taveler_age;
   }
   public void setTraveler_name(String traveler_name)
   {
	this.traveler_name = traveler_name;
   }
   public void setVei(Veichle vei)
   {
	this.vei = vei;
   }
   
@Override
public void beginJourney()
   {
	System.out.println("TRAVELLER DETAILS \n-----------------------------------");
	  System.out.println("traveller name---"+traveler_name+"\ntraveler age---"+taveler_age);
	  System.out.println("VEICHLE DETAILS \n-----------------------------------");
	  veichleDetails(vei);
   }
 public void veichleDetails(Veichle veichle)
 {
	 if(veichle instanceof Car)
	 {
		 Car ca=(Car)veichle;
		 System.out.println("veichle type---"+ca.getClass().getName());
		 System.out.println("no of seat--- "+ca.getNo_of_seat());
		 System.out.println("car company--- "+ca.getCompany());
		 System.out.println("moving speed---"+ca.getSpeed());
	 }
	 else if(veichle instanceof Bus)
	 {
		 Bus bu=(Bus)veichle;
		 System.out.println("veichle type---"+bu.getClass().getSimpleName());
		 System.out.println("no of seat--- "+bu.getNo_of_seat());
		 System.out.println("bus company--- "+bu.getCompany());
		 System.out.println("moving speed---"+bu.getSpeed()+"km/h");
		 System.out.println("from place---"+bu.getRoute_from());
		 System.out.println("to place---"+bu.getRoute_to());
	 }
	 else
		 System.out.println("he might b travelling by foot");
 }
}
