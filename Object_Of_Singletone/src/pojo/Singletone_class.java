package pojo;

public class Singletone_class
{
   private static  Singletone_class object;
   private Singletone_class()
    {
	   
    }
   public void display()
   {
	  System.out.println("this is method of singletone class");
   }
   public static Singletone_class getObject()
   {
	   if(object==null)
	   {
		   object=new Singletone_class();
		   return object;
	   }
	   else
		   return object;
   }
}
