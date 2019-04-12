package org.Spring_Annotation.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class User
{
   private int uniqueNo;
   private String name;
   private String ph_no;
   private String address;
   
   @Autowired
   @Qualifier("")
   private Bank bank;
   
   public User() {
	// TODO Auto-generated constructor stub
   }
public User(int uniqueNo, String name, String ph_no, String address, Bank bank) {
	super();
	this.uniqueNo = uniqueNo;
	this.name = name;
	this.ph_no = ph_no;
	this.address = address;
	this.bank = bank;
}
public int getUniqueNo() {
	return uniqueNo;
}
public void setUniqueNo(int uniqueNo) {
	this.uniqueNo = uniqueNo;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPh_no() {
	return ph_no;
}
public void setPh_no(String ph_no) {
	this.ph_no = ph_no;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
   
   public void diplayUserDetails()
   {
	   System.out.println("unique no : "+uniqueNo);
	   System.out.println("name : "+name);
	   System.out.println("user Address : "+address);
	   System.out.println("user ph_no : "+ph_no);
	   if(bank instanceof SBI_Bank)
	     {
		   SBI_Bank sb=(SBI_Bank)bank;
		   System.out.println("account details : "+sb.getBankName()+
				   " / account number : "+sb.getAccNumber());
	     }
	   else if(bank instanceof ICICI_Bank)
	   {
		   ICICI_Bank ib=(ICICI_Bank)bank;
		   System.out.println("account details : "+ib.getBankName()+
				   " / account number : "+ib.getAccNumber());
	   }
		
   }
}
