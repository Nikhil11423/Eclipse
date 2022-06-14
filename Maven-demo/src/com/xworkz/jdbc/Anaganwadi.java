package com.xworkz.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class Anaganwadi {
	public static void main(String[] args) {
		
	String url = "jdbc:mysql://localhost:3306/xworkz_btm_march";
	String username = "root";
	String password = "root";

	try (Connection connection = DriverManager.getConnection(url, username, password))
			{
	    System.out.println("Driver class added");
	    String sql="insert into anganwadi values(4,'Borgaon',56,0,'Bharati')";
	    String sql1="insert into anganwadi values(5,'BTM',30,0,'Ganga')";
	    String sql2="insert into anganwadi values(6,'Bangalore',100,1,'Priyanka')";

	    
	    Statement stmt = connection.createStatement();
	    int rows = stmt.executeUpdate(sql);
	    int rows1 = stmt.executeUpdate(sql1);
	    int rows2 = stmt.executeUpdate(sql2);
	    System.out.println(sql);
	    System.out.println(sql1);
	    System.out.println(sql2);

	}
	 catch (SQLException e) {
		e.printStackTrace();
	} 

}


}
