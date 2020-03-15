package pojo;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Qustion
{
  private int id;
  private String q_name;
  private Map<Answer,User> ans;
  
  public Qustion(int id, String q_name, Map<Answer, User> ans)
   {
	 super();
	 this.id = id;
	 this.q_name = q_name;
	 this.ans = ans;
   }
  
  public void display()
  {
	  System.out.println("qustion no : "+id);
	  System.out.println("Question : "+q_name);
	  Set<Entry<Answer,User>> set=ans.entrySet();
	  Iterator<Entry<Answer,User>> itr=set.iterator();
	  while(itr.hasNext())
	  {
		  Entry<Answer,User> entry=itr.next();
		  Answer ans=entry.getKey();
		User user=entry.getValue();
		  System.out.println(ans.toString()+"----"+user.toString());
	  }
	  
  }
}
