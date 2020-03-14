package pojo;

import java.util.Date;

public class University
{
   private String university_name;
   private Date est_date;
   
   public void setUniversity_name(String university_name)
    {
	  this.university_name = university_name;
    }
   public void setEst_date(Date est_date)
   {
	 this.est_date = est_date;
   }
   
   public String getUniversity_name()
   {
	  return university_name;
   }
   public Date getEst_date()
   {
	  return est_date;
   }
}
