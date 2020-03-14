package pojos;

import java.util.Map;
import java.util.Set;

public class Students
{
  private int roll_no;
  private String name;
  private String address;
  private Set<String> phon_no;
  private Map submark;
  
  public void setRoll_no(int roll_no) {
	this.roll_no = roll_no;
}
  public void setName(String name) {
	this.name = name;
}
  public void setAddress(String address) {
	this.address = address;
}
  public void setPhon_no(Set<String> phon_no) {
	this.phon_no = phon_no;
}
  public void setSubmark(Map submark) {
	this.submark = submark;
}
  public int getRoll_no() {
	return roll_no;
}
  public String getName() {
	return name;
}
  public String getAddress() {
	return address;
}
  public Set<String> getPhon_no() {
	return phon_no;
}
  public Map getSubmark() {
	return submark;
}
}
