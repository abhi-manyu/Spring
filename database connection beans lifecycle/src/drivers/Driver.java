package drivers;

import java.sql.SQLException;
import java.util.Scanner;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pojo.BeanLifeCycle;

public class Driver {
    //My sql version not matching so error is comming, we can continue on that
	public static void main(String[] args) throws Exception
	{
      ConfigurableApplicationContext ap=
    		  new ClassPathXmlApplicationContext("xmls/databseconnection.spring.xml");
     BeanLifeCycle bc1=(BeanLifeCycle) ap.getBean("blc");
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
    	      bc1.save(id, name, mail, sal);
    	      break ;
    	  default:
    		  bc1.destroy();
    	  }
    	  
      }
	}

}
