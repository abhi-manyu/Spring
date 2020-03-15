package pojo;

public class Phone
{
   private String phone_name;
   private Sim sim;
   private String tonummber;
   private String sendingsms;
   
   public void setTonummber(String tonummber)
    {
	  this.tonummber = tonummber;
    }
   public void setSendingsms(String sendingsms)
   {
	this.sendingsms = sendingsms;
   }
   public void setPhone_name(String phone_name)
   {
	 this.phone_name = phone_name;
   }
   public void setSim(Sim sim)
   {
	 this.sim = sim;
   }
   public void simDetection()
   {
	   if(sim instanceof Airtel)
	    {
		 Airtel air=(Airtel)sim; 
	     System.out.println("sim detected as : "+air.getSim_name());
	    }
   }
   public void switchOn()
   {
	   System.out.println("welcome to ur : "+phone_name+" mobile");
   }
   public void call()
       {
	     sim.call(tonummber);
	   }
   public void sendSms()
   {
	   sim.sendSms(tonummber,sendingsms);
   }
}
