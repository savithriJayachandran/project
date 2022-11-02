package JDBC;
 import java.sql.Connection;
 import java.sql.DriverManager;
 import java.sql.PreparedStatement;
 import java.sql.SQLException;
 import java.sql.*;
public class DemoConnectivity {

	private static final String create_table="create table user("+" user_id int(10) not null,"+" fullname varchar(50) not null)";
	
	public static void main(String[] args) throws ClassNotFoundException
	{
		String url="jdbc:mysql://localhost:3306/customer autoReconnect=true&useSSL=false";
		String username="root";
		String password="Maha@123";
		Connection connect=null;
		PreparedStatement statement=null;
		Class.forName("com.mysql.cj.jdbc.Driver");
		try
		{
			//class.forName("com.mysql.cj.jdbc.Driver");
			connect = DriverManager.getConnection(url,username,password);
			statement=connect.prepareStatement(create_table);
			statement.executeUpdate();
			System.out.println("table created");
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		finally
		{
			try
			{
				if(statement !=null) {
					statement.close();
			}
				if(connect!=null) {
					connect.close();
			}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
