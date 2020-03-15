package pojo;

import java.util.Iterator;
import java.util.Set;

public class Answer2
{
	 private String ans_name;
	 public Set<Users2> users;
	 
	public Answer2(String ans_name, Set<Users2> users)
	{
		super();
		this.ans_name = ans_name;
		this.users = users;
	 }
	 public Set<Users2> getUsers()
	 {
		return users;
	  }
	 public String getAns_name() {
		return ans_name;
	}
	 
}
