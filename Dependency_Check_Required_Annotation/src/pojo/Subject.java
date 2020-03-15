package pojo;

import org.springframework.beans.factory.annotation.Required;

public class Subject
{
  private String sub_name;
  private int full_marks;
  
  //@Required
  public void setSub_name(String sub_name)
    {
	  this.sub_name = sub_name;
    }
  public void setFull_marks(int full_marks)
    {
	  this.full_marks = full_marks;
    }
  public String getSub_name()
    {
	   return sub_name;
    }
}
