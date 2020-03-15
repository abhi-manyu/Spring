package pojo;

import java.sql.Connection;
import java.sql.DriverManager;

import org.springframework.beans.factory.annotation.Required;

public class MySql_Connection
{
   private String driver_class;
   private String url;
   private String username;
   private String password;
   
   @Required
   public void setDriver_class(String driver_class)
   {
	 this.driver_class = driver_class;
   }
  public void setUrl(String url)
   {
	 this.url = url;
   }
  public void setUsername(String username)
   {
	 this.username = username;
   }
  public void setPassword(String password)
   {
	 this.password = password;
   }
  
  public void createConnection() throws Exception
  {
	  Class.forName(driver_class);
	  Connection con= DriverManager.getConnection(url,username, password);
	  System.out.println(con.getClass().getSimpleName());
  }
  
}
