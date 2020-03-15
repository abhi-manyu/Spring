package pojo;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class College
{
   private String collge_name;
   private int no_of_student;
   private Map<String,String> hod;
   
public String getCollge_name() {
	return collge_name;
}
public void setCollge_name(String collge_name) {
	this.collge_name = collge_name;
}
public int getNo_of_student() {
	return no_of_student;
}

public Map<String, String> getHod() {
	return hod;
}
public void setHod(Map<String, String> hod) {
	this.hod = hod;
}
public void setNo_of_student(int no_of_student) {
	this.no_of_student = no_of_student;
}

   public void display()
   {
	   System.out.println("no of student of this college : "+no_of_student);
	  Set<Entry<String, String>> set=hod.entrySet();
	   Iterator<Entry<String, String>> itr=set.iterator();
	   while(itr.hasNext())
	   {
		   Entry<String, String> entry=itr.next();
		   System.out.println(entry.getKey()+"\t\t"+entry.getValue());
	   }
   }
   public void layout()
   {
	   System.out.println("branch name \t\t H.O.D \n--------------------------------------------");
   }
}
