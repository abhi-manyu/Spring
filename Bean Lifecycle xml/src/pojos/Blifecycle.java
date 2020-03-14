package pojos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Blifecycle
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
   private Connection con;
   
   public void myinit() throws ClassNotFoundException, SQLException
   {
	   Class.forName(driverclass);
	   con=DriverManager.getConnection(url, username, password);
	   System.out.println("conected");
   }
   public void save(int id, String name, String mail, int sal) throws SQLException
   {
	   PreparedStatement pstmt=con.prepareStatement("insert into Employee values(?,?,?,?)");
	   pstmt.setInt(1,id);
	   pstmt.setString(2,name);
	   pstmt.setString(3,mail);
	   pstmt.setInt(4,sal);
	   pstmt.executeUpdate();
	   System.out.println("successful");
   }
   public void mydestroy() throws SQLException
   {
	  System.out.println("disconnected");
	  con.close();
   }
}
