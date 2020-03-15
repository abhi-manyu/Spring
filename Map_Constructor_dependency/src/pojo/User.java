package pojo;

public class User
{
   private int userid;
   private String username;
   
public User(int userid, String username)
   {
	super();
	this.userid = userid;
	this.username = username;
   }
   
   public String toString()
   {
	   return username;
   }
}
