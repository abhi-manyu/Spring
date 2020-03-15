package pojo;

public class CarFactory
{
   private static String carname;
   public static void setCarname(String carname)
   {
	 CarFactory.carname = carname;
   }
   public static Car getCar() throws InstantiationException, IllegalAccessException, ClassNotFoundException
   {
	   return (Car)(Class.forName(carname).newInstance());
   }
}
