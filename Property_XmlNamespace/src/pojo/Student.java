package pojo;

public class Student
{
   private int id;
   private String name;
   private double marks;
   
   public void setId(int id) {
	this.id = id;
}
   public void setMarks(double marks) {
	this.marks = marks;
}
   public void setName(String name) {
	this.name = name;
}
   
   public void display()
   {
	   System.out.println("the id is: "+id);
	   System.out.println("the name is : "+name);
	   System.out.println("secured marks is : "+marks);
   }
}
