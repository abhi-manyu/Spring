package org.transaction.example.driver;

import org.transaction.example.beans.User;

public class DriverClass
{
   public static void main(String[] args)
   {
	   //ApplicationContext ap=
	    		 //new ClassPathXmlApplicationContext("org/transaction/example/xmls/spring.xml");
	    //UserService us=(UserService) ap.getBean("us");
	    
	    User u1=new User(101,"Abhi","manyu");
	    //us.insertUser(u1);
	    System.out.println("data inserted successfully");
   }   
}
