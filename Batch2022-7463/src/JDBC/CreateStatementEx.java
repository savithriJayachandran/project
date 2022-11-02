package JDBC;
import java.sql.*;
public class CreateStatementEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con = DriverManager.getConnection(
			"jdbc:mysql://localhost:3306/customer","root","Maha@123");
	Statement statement=con.createStatement();
	String sql="select* from customers";
	
	ResultSet result=statement.executeQuery(sql);
	while(result.next()) {
		System.out.println("cid:"+result.getInt(1));
	}
}

catch(SQLException e) {
	System.out.println(e);
}
catch(ClassNotFoundException e) {
	e.printStackTrace();
}
	}

}
