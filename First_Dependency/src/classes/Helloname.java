package classes;

public class Helloname
{
   private String gender;
   private String name;
   
   public Helloname()
   {
	   System.out.println("constructor called and object created");
   }
   
public void setGender(String gender)
    {
	   this.gender = gender;
     }
public void setName(String name)
  {
	 this.name = name;
  }


public void sayhello()
   {
	   System.out.println("hello "+gender+" "+name);
   }
   
}
