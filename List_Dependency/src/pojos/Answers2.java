package pojos;

public class Answers2
{
  private int ans_id;
  private String ans_name;
public Answers2(int ans_id, String ans_name)
  {
	super();
	this.ans_id = ans_id;
	this.ans_name = ans_name;
  }
  
  public String toString()
  {
	return ans_id+"--"+ans_name;
	  
  }
  
}
