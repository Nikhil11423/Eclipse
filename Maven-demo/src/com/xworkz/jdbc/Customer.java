package com.xworkz.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class Customer {

	public static void main(String[] args) {
	
		
	String url = "jdbc:mysql://localhost:3306/Customer";
	String username = "root";
	String password = "root";

	try(Connection connection = DriverManager.getConnection(url, username, password)){
	    System.out.println("Driver class added");
	    String cus="insert into Customer1 values(2,'Srinath','H',8553474899,'m d colony','pakkad rd','Bangalore','karnatak',590006,'india','srinath420@gmail.com',95000,'credit','puma','2022-06-14','good',4.5)";
	    String ap="insert into Customer1 values(3,'Suraj','Patil',7204750578,'hosur park','water tank','Hosur','tamil Nadu', 428760,'india','suraj7@gmail.com',50000,'upi','Mi mobile','2022-06-10','low',3.2)";
	    String rc= "insert into Customer1 values(4,'Pavan','H',9876543434,'pune','rv road','pune','Maharshtra',401213,'india','pavan7@gmail.com',35000,'card','abusy','2022-06-12','good',4)";
	    String rc1= "insert into Customer1 values(5,'Satya','patil',9876576543,'bihar','mp road','patna','bihar',501213,'india','satya123@gmail.com',75000,'upi','vega','2022-06-18','medium',3.8)";

	    Statement statement = connection.createStatement();
	    
	    int row2 = statement.executeUpdate(rc1);
	    int row1 = statement.executeUpdate(rc);
	    int row = statement.executeUpdate(ap);
	    int result = statement.executeUpdate(cus);
	    
	    System.out.println(cus);
	    System.out.println(ap);
	    System.out.println(rc);
	    System.out.println(rc1);

	    
	    
			} catch (SQLException e) {
				e.printStackTrace();
			}

	}

}
