package pojo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

//here we are implementing these 2 interfaces and so we need to oberride the bellow 
//2 methods in our pojo class afterproperset method as init method and 
//destory method to end the cycle.
public class BeanLifeCycle implements InitializingBean,DisposableBean
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
	@Override
	public void afterPropertiesSet() throws Exception {
		Class.forName(driverclass);
		System.out.println("driver loaded");
		con=DriverManager.getConnection(url, username, password);
		System.out.println("connection established");
	}
	//here in between these 2 methods our required methods will be there
	public void save(int id,String name,String mail,int salary) throws SQLException
	{
		PreparedStatement pstmt=
				con.prepareStatement("insert into Employee values(?,?,?,?)");
		pstmt.setInt(1,id);
		pstmt.setString(2,name);
		pstmt.setString(3,mail);
		pstmt.setInt(4,salary);
		int i=pstmt.executeUpdate();
		System.out.println(i+" nomber of records updated");
	}
	
	@Override
	public void destroy() throws Exception{
		System.out.println("connection closed");
		con.close();
		System.exit(0);
	}
  
}
