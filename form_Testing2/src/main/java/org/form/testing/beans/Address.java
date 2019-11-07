package org.form.testing.beans;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

public class Address
{
	
   private int flatNo;
	
	@NotEmpty
	@NotBlank
   private String pgName;
	
	@NotEmpty
	@NotBlank
   private String layout;
   
   public Address() {
	// TODO Auto-generated constructor stub
   }

public Address(int flatNo, String pgName, String layout) {
	super();
	this.flatNo = flatNo;
	this.pgName = pgName;
	this.layout = layout;
}

public int getFlatNo() {
	return flatNo;
}

public void setFlatNo(int flatNo) {
	this.flatNo = flatNo;
}

public String getPgName() {
	return pgName;
}

public void setPgName(String pgName) {
	this.pgName = pgName;
}

public String getLayout() {
	return layout;
}

public void setLayout(String layout) {
	this.layout = layout;
}
public String toString()
{
	return "flat no : "+flatNo+
			" pg name : "+pgName+
			"layout : "+layout;
}
   
}
