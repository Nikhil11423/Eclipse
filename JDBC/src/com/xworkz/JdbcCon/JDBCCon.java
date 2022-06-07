package com.xworkz.JdbcCon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCCon {

	public static void main(String[] args) {
		String url="";
		String user="";
		String pass="";
		try {
			Connection con	=DriverManager.getConnection(url, user, pass);
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("");
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	
	}

}
