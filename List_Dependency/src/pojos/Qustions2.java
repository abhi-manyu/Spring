package pojos;

import java.util.Iterator;
import java.util.List;

public class Qustions2
{
  private int q_id;
  private String q_name;
  private List<Answers2> ans;
  
public int getQ_id() {
	return q_id;
}
public void setQ_id(int q_id) {
	this.q_id = q_id;
}
public String getQ_name() {
	return q_name;
}
public void setQ_name(String q_name) {
	this.q_name = q_name;
}
public List<Answers2> getAns() {
	return ans;
}
public void setAns(List<Answers2> ans) {
	this.ans = ans;
}
  
public void display()
  {
	System.out.println("the qustion no is : "+q_id);
	System.out.println("the qustion is: "+q_name);
	System.out.println("the answers are :");
	Iterator<Answers2> itr=ans.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next().toString());
		}
	
  }
  
}
