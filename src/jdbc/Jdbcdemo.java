package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbcdemo {

	public static void main(String[] args)  throws ClassNotFoundException,SQLException{
		Class.forName("con.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","");
		Statement stmt=con.createStatement();
		ResultSet resultSet=stmt.executeQuery("Select*from student");
		while(resultSet.next()) {
			System.out.println(resultSet.getInt(1)+"+resultSet.getString(2)+" "+resultSet.getString"(3)));
		}
		

	}

}
