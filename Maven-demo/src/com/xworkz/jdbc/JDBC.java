package com.xworkz.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBC {

	public static void main(String[] args) {

		String driverClassName = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306";
		String username = "root";
		String password = "root";

		try(Connection connection = DriverManager.getConnection(url, username, password))
				{
		
			System.out.println("driver class is loaded");


		}
		 catch (SQLException e) {
			e.printStackTrace();
		} 

	}
}
