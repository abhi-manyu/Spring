package pojos;

public class Student
{
   private int stud_id;
   private String stud_name;
   private int stud_marks;
   private String stud_mail;
   private String stud_address;
    public Student(int stud_id, String stud_name, String stud_mail)
      {
	    super();
	    this.stud_id = stud_id;
	    this.stud_name = stud_name;
	    this.stud_mail = stud_mail;
      }
   
   public void display()
   {
	   System.out.println("the roll no is : "+stud_id);
	   System.out.println("name of student is : "+stud_name);
	   System.out.println("student mark is : "+stud_marks);
	   System.out.println("student mail is : "+stud_mail);
	   System.out.println("address of student is : "+stud_address);
   }
   
   
}
