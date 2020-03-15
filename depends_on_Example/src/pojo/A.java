package pojo;

public class A
{
	private B b1;
	
   public A()
   {
	System.out.println("object of  class A is created");
   }
   public void setA1(B b1)
   {
	this.b1 = b1;
   }
   public void display()
   {
	   System.out.println(b1);
   }
   
}
