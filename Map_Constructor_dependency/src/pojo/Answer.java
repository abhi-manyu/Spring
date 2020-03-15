package pojo;

import java.util.Set;

public class Answer
{
   private int ans_id;
   private String ans_name;
   
   public Answer(int ans_id, String ans_name)
   {
	super();
	this.ans_id = ans_id;
	this.ans_name = ans_name;
   }
   
	public String toString()
	{
		return ans_name;
	}
}
