package pojo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection
{
   private String driverclass;
   private String url;
   private String username;
   private String password;
   
   public void setDriverclass(String driverclass) {
	this.driverclass = driverclass;
}
   public void setUrl(String url) {
	this.url = url;
}
   public void setUsername(String username) {
	this.username = username;
}
   public void setPassword(String password) {
	this.password = password;
}
   public void createConnection() throws ClassNotFoundException, SQLException
   {
	     Class.forName(driverclass);
	     Connection con=DriverManager.getConnection(url, username, password);
	     System.out.println(con.toString());
	     System.out.println("connected to server");
   }
}
