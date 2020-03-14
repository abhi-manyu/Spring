package pojo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class BeanlifeCycle
{
	private String driverclass;
	private String url;
	private String username;
	private String password;
	private Connection con;
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
	
   public void myinit() throws SQLException, ClassNotFoundException
   {
	   Class.forName(driverclass);
	   con=DriverManager.getConnection(url, username, password);
	   System.out.println("connection established");
   }
   
   public void save(int id, String name,String mail,int salary) throws SQLException
   {
	    PreparedStatement pstmt=con.prepareStatement("insert into employee value(?,?,?,?)");
	    pstmt.setInt(1,id);
	    pstmt.setString(2,name);
	    pstmt.setString(3,mail);
	    pstmt.setInt(4,salary);
	    pstmt.executeUpdate();
	    System.out.println("data inserted successfully");
   }
   public void mydestroy()throws SQLException
   {
	   System.out.println("connection closed");
	   con.close();
   }
}
