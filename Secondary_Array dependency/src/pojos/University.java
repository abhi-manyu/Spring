package pojos;

public class University {
  private int uni_id;
  private String uni_name;
  private int no_of_clg;
  private College[] clglist;
  public void setUni_id(int uni_id) {
	this.uni_id = uni_id;
}
  public void setUni_name(String uni_name) {
	this.uni_name = uni_name;
}
  public void setNo_of_clg(int no_of_clg) {
	this.no_of_clg = no_of_clg;
}
  public void setClglist(College[] clglist) {
	this.clglist = clglist;
}
  
  public void layout()
  {
	  System.out.println("univ. id \t univ. name \t\t Colleges");
	  System.out.println("---------------------------------------------------");
  }
  public void display()
  {
	  System.out.print(uni_id+"\t"+" "+uni_name+"\t\t");
	  for(College col:clglist)
	  {
		  System.out.print(col.getCol_name()+",");
	  }
	  System.out.println();
  }
}
