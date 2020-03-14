package pojos;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class College
{
   private int clg_id;
   private String clg_name;
   private List<Students> stdents;

  public void setClg_id(int clg_id) {
	this.clg_id = clg_id;
}
  public void setClg_name(String clg_name) {
	this.clg_name = clg_name;
}
  public void setStdents(List<Students> stdents) {
	this.stdents = stdents;
}
  
  public void display()
  {
	  System.out.println("colege details \n---------------------------------");
	  System.out.print(clg_id +"\t\t"+clg_name+"\t\t");
	  Iterator<Students>itr=stdents.iterator();
	  while(itr.hasNext())
	  {
		  System.out.print(itr.next().getName()+" ");
	  }
	  System.out.println();
	  System.out.println("------------------------------------------------");
  }
  public void studentDetails()
  {
	  System.out.println
	  ("student details \n-----------------------------------------------");
	  Iterator<Students> itr2=stdents.iterator();
	  while(itr2.hasNext())
	  {
		 Students st=itr2.next();
		 System.out.print
		 (st.getRoll_no()+"\t"+st.getName()+"\t"+st.getAddress()+"\t");
		 Set<String> phono=st.getPhon_no();
		 Iterator<String> itr3=phono.iterator();
		 while(itr3.hasNext())
		 {
			 System.out.print(itr3.next()+",");
		 }
		 System.out.print("\t");
		 Map subject_mark=st.getSubmark();
		 /*Set s=subject_mark.keySet();
		 for(Object sub:s)
		 {
			 String subname=(String)sub;
			 System.out.println(subname+"-----"+subject_mark.get(subname));
		 }*/
		 Set<Entry<String,Integer>> s=subject_mark.entrySet();
		 Iterator<Entry<String,Integer>> itr4=s.iterator();
		 while(itr4.hasNext())
		 {
			 Entry<String,Integer> ent=itr4.next();
			 System.out.print(ent.getKey()+"--->"+ent.getValue()+",");
		 }
		 System.out.println();
	  }
  }
}
