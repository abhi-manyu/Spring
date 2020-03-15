package drivers;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pojo.DatabaseConnection;

public class Driver
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
       ApplicationContext ap=new ClassPathXmlApplicationContext("xmls/propertiesreading.spring.xml");
       DatabaseConnection dbc=(DatabaseConnection) ap.getBean("dc");
       dbc.createConnection();
	}
}
