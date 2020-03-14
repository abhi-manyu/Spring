package pojo;

import org.springframework.beans.factory.annotation.Required;

public class College
{
   private int no_of_student;
   private String college_name;
   private University uni;
   
   @Required
   public void setNo_of_student(int no_of_student)
    {
	  this.no_of_student = no_of_student;
    }
   public void setCollege_name(String college_name)
    {
	  this.college_name = college_name;
    }
   public void setUni(University uni)
    {
	  this.uni = uni;
    }
   
   public void displayCollegeDetails()
   {
	   System.out.println("college name : "+college_name);
	   System.out.println("no of student : "+no_of_student);
	   System.out.println
	   ("affliated to : "+uni.getUniversity_name()+" established in: "+uni.getEst_date());
   }
}
