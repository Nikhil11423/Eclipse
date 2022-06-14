package com.xworkz.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Waterfall {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/xworkz_btm_march";
		String username = "root";
		String password = "root";
		try (Connection connection = DriverManager.getConnection(url, username, password)) {
			System.out.println("Driver class added");
			String fall ="insert into Waterfall values(2,'Gokak fall','Gokak falls','gokak','Gokak','Belagavi','Karnataka',591216,'India','Ghataprabha river',9-00-00,05-00-00,52,177,464,00,30)";
			String fall1 ="insert into Waterfall values(3,'Dudhsagar','western Ghat','Sonaulim','mollem','Goa','Goa',403410,'India','mandovi river',07-00-00,05-00-00,320,200,464,50,30)";
			String fall2 ="insert into Waterfall values(4,'Hogenakkal fall','Dharmapuri','Dharmapuri','Harur','Dharmapuri','Tamil nadu',591216,'India','kaveri river',08-00-00,05-00-00,253,153,464,00,50)";
			String fall3 ="insert into Waterfall values(5,'chekale falls','chorala ghat','chekale','Belagavi','Belagavi','Karnataka',590001,'India','sharavati river',10-00-00,05-00-00,253,153,464,50,30)";

			Statement stmt = connection.createStatement();
			int water = stmt.executeUpdate(fall3);
			int water1 = stmt.executeUpdate(fall2);
			int water2 = stmt.executeUpdate(fall1);
			int water3 = stmt.executeUpdate(fall);
			
			System.out.println(water);
			System.out.println(water1);
			System.out.println(water2);
			System.out.println(water3);

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
