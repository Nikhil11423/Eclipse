package com.xworkz.createtable;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {

	public static void main(String[] args) {
		
		String url="jdbc:mysql://localhost:3306/xworkz_btm_march";
		String username="root";
		String password="root";
		String query = "select id,age from REGISTRATION";
		String cou= "select count(*) from REGISTRATION";
		String all ="Select sum(REGISTRATION) from REGISTRATION";
		try(Connection conn =DriverManager.getConnection(url,username,password);
			
				Statement stmt = conn.createStatement()) {
			System.out.println(conn);
			          String sql = " Create Table REGISTRATION " +
			                   "(id INTEGER not NULL, " +
			                   " first VARCHAR(255), " + 
			                   " last VARCHAR(255), " + 
			                   " age INTEGER, " + 
			                   " PRIMARY KEY ( id ))"; 
                 
			//ResultSet res = stmt.executeQuery(query);
			
			PreparedStatement pre =conn.prepareStatement(cou);
			ResultSet que= pre.executeQuery(all);
			         // String sql1="Insert into REGISTRATION values(1,'Nikhil','Basannavar',27)";
			          //String sql2="Insert into REGISTRATION values(2,'Kiran','Doddannvar',26)";
			          //String sql3="Insert into REGISTRATION values(3,'Appu','Badigher',25)";
			          //String sql4="Insert into REGISTRATION values(4,'Lucky','Patil',26)";
			          //String sql5="Insert into REGISTRATION values(5,'Rahul','Basannavar',29)";
			         // stmt.executeUpdate(sql);
                     //stmt.executeUpdate(sql1);
                    // stmt.executeUpdate(sql2);
                    // stmt.executeUpdate(sql3);
                     //stmt.executeUpdate(sql4);
                     //
			//
			
			
			
			
			
			//stmt.executeUpdate(sql5);
                while(que.next()) {
                	
                	int id=que.getInt(1);
                	//int age=res.getInt(2);
                	System.out.println(id);
                }
			
			        // System.out.println("Created table in given database...");
			         System.out.println("Count the tables");
			         
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
