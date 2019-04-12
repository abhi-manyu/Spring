package org.MethodReplacer.beans;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class User {
     private int id;
     private String name;
     private String Address;
     
     @Autowired
     @Qualifier("icici")
     private Bank bank;
     public User() {
    	 
	}

	public User(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		Address = address;
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
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	
	public void displayUserDetails()
	{
		System.out.println("user name : "+name);
		System.out.println("Address : "+Address);
		if(bank instanceof SBI_Bank)
		{
		    SBI_Bank sb=(SBI_Bank)bank;
		    System.out.println("used Bank : "+sb.getName());
		    doBanking(sb);
		    bank.afterBanking();
		}
		else {
			ICICI_Bank ic=(ICICI_Bank)bank;
			System.out.println("used Bank : "+ic.getName());
			doBanking(ic);
			bank.afterBanking();
		}
	}
		public void doBanking(Bank b)
		{
			Scanner scn=new Scanner(System.in);
			int choice;
			do {
				System.out.println
				  ("\n\n press 1 : Account opening \n press 2 : View Balance \n press 3 : diposite \n "
						+ "press 4 : money withdrawal \n 5 : calculate loan amount");
				  int input=scn.nextInt();
				  
				  if(input==1)
				  {
					  b.openAccount();;
				  }
				  else if(input==3)
				  {
					  System.out.println("enter the amount u want to diposite");
						int dipositeMoney=scn.nextInt();
						b.diposite(dipositeMoney);
				  }
				  else if(input==4)
				{
					System.out.println("enter the amount u want to withdraw");
					int withDrawMoney=scn.nextInt();
					b.withdraw(withDrawMoney);
				}
				  else if(input==5)
				  {
					  System.out.println("enter the loan amount");
					  int loanAmount=scn.nextInt();
					  System.out.println("enter the whole duration in months");
					  double time=scn.nextDouble();
					  b.calculateInterest(loanAmount, time);
				  }
				  else if(input==2)
				  {
					  b.viewBalance();
				  }
				  else {
					  {
						  System.out.println("invalid input");
					  }
				}
				  System.out.println("enter 1 : continue \t 2 : exit ");
				  choice=scn.nextInt();
				  if(choice==2)
				  {
					  String exitstatus;
					  System.out.println("WARNING : u r about to exit the app \n type exit to confirm ");
					  exitstatus=scn.next();
					  if(exitstatus.equals("exit"))
					  {
						  System.out.println("system closed successfully");
						  break;
					  }
				  }
			}while(choice!=2);
		}
		public void afterBanking()
		{
			System.out.println("thank u for using our services---------------------------------powered by ICICI");
		}
		
}
