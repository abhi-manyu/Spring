package drivers;

import java.sql.SQLException;
import java.util.Scanner;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pojo.LifecycleAnnotation;

public class Driver
{
	public static void main(String[] args) throws SQLException
	{
		ConfigurableApplicationContext ap=
	    		  new ClassPathXmlApplicationContext("xmls/lifecycle.spring.xml");
		LifecycleAnnotation lc1=(LifecycleAnnotation) ap.getBean("lca");
	     Scanner scn=new Scanner(System.in);
	      while(true)
	      {
	    	  System.out.println("enter 1: to insert data \t 2:close the connection");
	    	  int choice=scn.nextInt();
	    	  switch(choice)
	    	  {
	    	  case 1:
	    		  System.out.println("enter the requied id");
	    	      int id=scn.nextInt();
	    	      scn.nextLine();
	    	      System.out.println("enter the name");
	    	      String name=scn.nextLine();
	    	      System.out.println("enter the mail");
	    	      String mail=scn.next();
	    	      System.out.println("enter the salary");
	    	      int sal=scn.nextInt();
	    	      lc1.save(id, name, mail, sal);
	    	      break ;
	    	  default:
	    		 lc1.mydestroy();
	    	  }
	    	  
	      }
	}

}
