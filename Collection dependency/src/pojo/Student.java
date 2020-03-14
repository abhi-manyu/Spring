package pojo;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student
{
  private List student_names;
  private Set student_mails;
  private Map rollno_marks;
  
  public void setStudent_names(List student_names)
   {
	this.student_names = student_names;
   }
  public void setStudent_mails(Set student_mails)
   {
	this.student_mails = student_mails;
   }
  public void setRollno_marks(Map rollno_marks)
    {
	this.rollno_marks = rollno_marks;
    }
  
  
  public void  displayStudentDetails()
  {
	  System.out.println(" printing student names \n-------------------------------");
	  Iterator itr=student_names.iterator();
	  while(itr.hasNext())
	  {
		  System.out.println(itr.next().toString());
	  }
	  System.out.println(" printing student mails \n-------------------------------");
	  Iterator itr2=student_mails.iterator();
	  while(itr2.hasNext())
	  {
		  System.out.println(itr2.next());
	  }
	  System.out.println(" printing student roll no and marks \n-------------------------------");
	   Set roma=rollno_marks.keySet();
	   /*for(Object det:roma)
	   {
		   System.out.println("roll no ="+det+"\t mark = "+rollno_marks.get(det));
	   }*/
	   Iterator itr3=roma.iterator();
	   while(itr3.hasNext())
	   {
		   Object rol=itr3.next();
		   System.out.println("roll no ="+rol+"\t mark = "+rollno_marks.get(rol));
	   }
  }
}
