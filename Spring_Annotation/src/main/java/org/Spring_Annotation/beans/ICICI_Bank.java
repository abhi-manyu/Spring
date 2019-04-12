package org.Spring_Annotation.beans;

public class ICICI_Bank implements Bank
{
	   private int uniqueId;
	   private String bankName;
	   private String bankAddress;
	   private String accNumber;
	   
	   public ICICI_Bank() {
		// TODO Auto-generated constructor stub
	}

	public ICICI_Bank(int uniqueId, String bankName, String bankAddress, String accNumber) {
		super();
		this.uniqueId = uniqueId;
		this.bankName = bankName;
		this.bankAddress = bankAddress;
		this.accNumber = accNumber;
	}

	public int getUniqueId() {
		return uniqueId;
	}

	public void setUniqueId(int uniqueId) {
		this.uniqueId = uniqueId;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBankAddress() {
		return bankAddress;
	}

	public void setBankAddress(String bankAddress) {
		this.bankAddress = bankAddress;
	}

	public String getAccNumber() {
		return accNumber;
	}

	public void setAccNumber(String accNumber) {
		this.accNumber = accNumber;
	}
	   
	
}
