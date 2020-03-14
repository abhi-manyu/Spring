package pojo;

public class Student
{
   private int[] ids;
   public void setIds(int[] ids)
    {
	this.ids = ids;
    }
   public void layout()
   {
	   System.out.println("id(s) \n-------------------------------");
   }
   public void display()
   {
	   for(int id:ids)
	   {
		   System.out.print(id+"\n");
	   }
   }
}
