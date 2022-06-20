package com.xworkz.JdbcCon;

import java.net.Inet4Address;
import java.net.UnknownHostException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCCon {

	public static void main(String[] args) {
		
		String driverClassName= "com.mysql.cj.jdbc.Driver";
		
		try {
			System.out.println(Inet4Address.getLocalHost().getHostAddress());

		Class.forName(driverClassName);
		System.out.println("Driver Class In Running");
	    String url="jdbc:mysql://localhost:3306";	

		//String url="jdbc.mysql://localhost:3306";
		String username="root";
		String password="root";
		
		Connection connection=DriverManager.getConnection(url,username,password);
		System.out.println(connection);
		
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (SQLException e) {
			e.printStackTrace();
			
		}catch (UnknownHostException e) {
			e.printStackTrace();
			
		}
			
		}
		
		
		}
	
