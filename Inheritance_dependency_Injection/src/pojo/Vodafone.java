package pojo;

import java.util.Scanner;

public class Vodafone implements Sim
{
private String sim_name;
    
    public void setSim_name(String sim_name)
    {
		this.sim_name = sim_name;
	}
    public String getSim_name()
    {
		return sim_name;
	}
	@Override
	public void call(String number) 
	{
		if(number==null || number.length()<10)
		{
			System.out.println(number +" is not a valid phone number");
			System.out.println("plz enter a valid phone number");
		}
		else
			System.out.println("call connected to "+number+" number by Vodafone sim");
		
	}
	@Override
	public void sendSms(String num, String msg)
	{
	   if(num==null || num.length()<10)
		   System.out.println("plz enter a valid recipant number");
	      else if(msg==null)
	        {
		      System.out.println("u r about to send a blank sms");
		      String choice;
		      Scanner scn=new Scanner(System.in);
		      System.out.println("enter * : confirm \n\t # : cancel");
		      choice=scn.next();
		      scn.close();
		      switch (choice)
		      {
		       case "*" :
			      System.out.println("ur sms is delivered by vodafone network");
			      break;
		       case "#" :
			      System.out.println("msg sending cancelled");
			      break;
		       default:
			     System.out.println("invalid option");
		    }
	     }
	      else
	    	  System.out.println
	    	  ("ur sms: "+msg+"  has been delivered by vodafone to "+num);
	}
   
}
