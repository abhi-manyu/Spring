package pojo;

public class Car
{
   private static  String carname;
   
   public static void setCarname(String carname)
   {
	 Car.carname = carname;
   }
   public static void display()
   {
	   System.out.println("car name = "+carname);
   }
}
