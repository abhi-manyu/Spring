package drivers;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pojo.MySql_Connection;

public class Driver
{
	public static void main(String[] args) throws Exception
	{
		//  Here it is a standalone class so all the dependent spring and 
		// Mysql jars are provided in lib folder.
		// so here the version of my sql jar is different(5.1) while our installed version 
		// is mysql 8.1. so it is not connecting
       ApplicationContext ap=new ClassPathXmlApplicationContext("xmls/connection.spring.xml");
       MySql_Connection mc=(MySql_Connection)ap.getBean("msc");
       System.out.println("this the connection object");
       mc.createConnection();
	}

}
