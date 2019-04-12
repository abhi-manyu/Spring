package org.MethodReplacer.beans;

public class ICICI_Bank implements Bank
{
	 private int id;
	   private String name;
	   private String address;
	   private int netAmount;
	   
	   public ICICI_Bank() {
		// TODO Auto-generated constructor stub
	}

	public ICICI_Bank(int id, String name, String address, int netAmount) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.netAmount = netAmount;
	}
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getNetAmount() {
		return netAmount;
	}

	public void setNetAmount(int netAmount) {
		this.netAmount = netAmount;
	}

	public void diposite(int amount)
	{
        netAmount+=amount;
        System.out.println("ur account has been diposited of rs : "+amount+" so...");
        System.out.println("ur net amount balance is : "+netAmount);
	}

	public void withdraw(int amount)
	{
           netAmount-=amount;
           System.out.println("ur account has been withdrawn an amount of rs : "+amount);
           System.out.println("ur net amount is : "+netAmount);
	}

	public void calculateInterest(int loanAmount, double months)
	{
		   double total=loanAmount+(loanAmount*months*5.9)/100;
		   System.out.println("u need to pay total amount of rs : "+total);
	}

	public void viewBalance()
	{
		 System.out.println("ur net balance is : "+netAmount);
	}

	public void openAccount()
	{
		System.out.println("ur account opening status is being processed wait for some time");
		  try
		   {
			  Thread.sleep(2000);
		   } 
		  catch (InterruptedException e)
		  {
			e.printStackTrace();
		  }
		  System.out.println("account opened successfully u can now use e banking services");
	   
	}

	public void afterBanking()
	{
	 	 System.out.println("thank u for using our services-------------------------------poweredBy ICICI");
	}
	
	
	   
	
}
