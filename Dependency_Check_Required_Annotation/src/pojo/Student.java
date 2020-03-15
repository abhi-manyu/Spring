package pojo;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.beans.factory.annotation.Required;

import java.util.Set;

public class Student
{
   private int roll_no;
   private String student_name;
   private String student_address;
   private String student_phone_no;
   private Map<Subject, Mark> mark;
   
   public void setRoll_no(int roll_no)
   {
	this.roll_no = roll_no;
   }
   public void setStudent_name(String student_name)
   {
	this.student_name = student_name;
   }
   public void setStudent_address(String student_address)
   {
	this.student_address = student_address;
   }
   public void setStudent_phone_no(String student_phone_no)
   {
	this.student_phone_no = student_phone_no;
   }
   
   //@Required
   public void setMark(Map<Subject, Mark> mark)
   {
	this.mark = mark;
   }
   public void display()
   {
	   System.out.println
	   ("student personal \n---------------------------------------------");
	   System.out.println("roll_no : "+roll_no);
	   System.out.println("name : "+student_name);
	   System.out.println("Address : "+student_address);
	   System.out.println("contact details : "+student_phone_no);
	   System.out.println
	   ("-------------------------------------------\nmarksheet of the student");
	   System.out.println("----------------------------------------");
	   Set<Entry<Subject,Mark>> set=mark.entrySet();
	   Iterator<Entry<Subject,Mark>> itr=set.iterator();
	   while(itr.hasNext())
	   {
		   Entry<Subject,Mark> entry=itr.next();
		   System.out.println
		   ("subject : "+entry.getKey().getSub_name()+"\t\t obtained mark : "+entry.getValue().getMark_scored());
	   }
	   
   }
}
