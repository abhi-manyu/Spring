package pojo;

import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Question2
{
	private int id;
	private String q_name;
	private Map<Date,Answer2> ans;
	
	public Question2(int id, String q_name, Map<Date, Answer2> ans) {
		super();
		this.id = id;
		this.q_name = q_name;
		this.ans = ans;
	}
	
	public void display()
	{
		System.out.println("question no : "+id);
		System.out.println("question : "+q_name);
		Set<Entry<Date,Answer2>> set=ans.entrySet();
		Iterator<Entry<Date,Answer2>> itr=set.iterator();
		while(itr.hasNext())
		{
			Entry<Date,Answer2> entry=itr.next();
			Date d=entry.getKey();
			Answer2 ans =entry.getValue();
			System.out.println(d +"---"+ans.getAns_name()+"--"+ans.getUsers());
		}
	}
}
