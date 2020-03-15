package pojo;

public class University
{
 private int uni_id;
 private String uni_name;
 private College col;
 public void setUni_id(int uni_id)
   {
	this.uni_id = uni_id;
   }
 public void setUni_name(String uni_name)
   {
	this.uni_name = uni_name;
   }
 public void setCol(College col)
   {
	this.col = col;
   }
 public void display()
 {
	 System.out.println("university id = "+uni_id);
	 System.out.println("university name = "+uni_name);
	 System.out.println("affliated colleges : "+col.getCol_name());
 }
}
