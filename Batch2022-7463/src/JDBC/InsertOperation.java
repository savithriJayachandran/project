package JDBC;
import java.sql.*;
import java.util.Scanner;
public class InsertOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
try {
	System.out.println("Enter user_id :");
	int user_id=sc.nextInt();
	System.out.println("Enter fullname :");
	String fullname=sc.next();
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connect = DriverManager.getConnection(
			"jdbc:mysql://localhost:3306/customer","root","Maha@123");

PreparedStatement pst= connect.prepareStatement("insert into user(user_id,fullname)values(?,?)");
pst.setInt(1, user_id);
pst.setString(2, fullname);
int i=pst.executeUpdate();if(i!=0) {
	System.out.println("record successfully added");
	
}
else {
	System.out.println("record failed to add");

}
}
catch(Exception e) {
	System.out.println(e);

}
	}

}


