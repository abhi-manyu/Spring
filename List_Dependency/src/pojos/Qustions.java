package pojos;

import java.util.Iterator;
import java.util.List;

public class Qustions
{
    private int id;
    private String name;
    private List<String> ans;
	public Qustions(int id, String name, List<String> ans) {
		super();
		this.id = id;
		this.name = name;
		this.ans = ans;
	}
    
    public void display()
    {
    	System.out.println("qustion number : "+id);
    	System.out.println("the qustion is :"+name);
    	System.out.println("the answers are : ");
    	Iterator<String> itr =ans.iterator();
    	while(itr.hasNext())
    	{
    		System.out.println(itr.next());
    	}
    }
    
}
