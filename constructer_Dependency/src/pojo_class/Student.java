package pojo_class;

public class Student
{
   private int id;
   private String name;
   private String mail;
   private int marks;
   //here we will create 3 over loaded constructor with one argument, 1 argument of 
   //different types , and 2 of same types
   
   public Student(int id, String name, String mail)
   {
		super();
		this.id = id;
		this.name = name;
		this.mail = mail;
	}
   public void display()
    {
	  System.out.println("id="+id+"\t\t name= "+name+"\t\t mail= "+mail);
    }

}
