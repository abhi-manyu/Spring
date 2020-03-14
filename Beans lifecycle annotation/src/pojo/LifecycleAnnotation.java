package pojo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class LifecycleAnnotation
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
  @PostConstruct
  public void myinit() throws ClassNotFoundException, SQLException
  {
	  Class.forName(driverclass);
	  con=DriverManager.getConnection(url, username, password);
	  System.out.println("connected");
  }
  public void save(int id,String name, String mail, int salary) throws SQLException
  {
	  PreparedStatement pstmt=con.prepareStatement("insert into Employee values(?,?,?,?)");
	  pstmt.setInt(1,id);
	  pstmt.setString(2,name);
	  pstmt.setString(3,mail);
	  pstmt.setInt(4,salary);
	  pstmt.executeUpdate();
	  System.out.println("sucsessful");
  }
  @PreDestroy
  public void mydestroy() throws SQLException
  {
	  System.out.println("closed");
	  con.close();
  }
}
