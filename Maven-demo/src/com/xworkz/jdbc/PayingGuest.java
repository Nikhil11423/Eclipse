package com.xworkz.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class PayingGuest {

	public static void main(String[] args) {
	

				String url = "jdbc:mysql://localhost:3306/xworkz_btm_march";
				String username = "root";
				String password = "root";
				try (Connection connection = DriverManager.getConnection(url, username, password)) {
					System.out.println("Driver class added");

					String PG1 = "INSERT INTO Paying_Guest values ('Bond','Shankar','S','Shankarxworkz@gmail.com',5645,966541760038,'Majestic',560056,'INDIA','karnataka',26,'Driver','M',3141242,10,50)";
					String PG2 = "INSERT INTO Paying_Guest values ('5star','Shekar','S','Shekarxworkz@gmail.com',1245,986760038,'K.P Nagar',560056,'INDIA','West Bengal',27,'Techanation','M',1536242,28,60)";
					String PG3 = "INSERT INTO Paying_Guest values ('Nima Maney','Madhu','M','Madhuxworkz@gmail.com',3345,966460038,'Jevan Bheeam Nagar',560056,'Goa','karnataka',28,'Traffic Police','M',254242,20,30)";
					String PG4 = "INSERT INTO Paying_Guest values ('Jevan','Kumar','K','Kumarxworkz@gmail.com',4445,932560038,'Sadhu Nagar',560056,'INDIA','Andhra',29,'Police','M',7454242,15,20)";
					String PG5 = "INSERT INTO Paying_Guest values ('Jeva','Ravi','R','Ravixworkz@gmail.com',08645,8645760038,'Kana Nagar',560056,'INDIA','Delhi',30,'Body Builder','M',7425622,35,45)";

					Statement statement = connection.createStatement();
					int reg1 = statement.executeUpdate(PG1);
					int reg2 = statement.executeUpdate(PG2);
					int reg3 = statement.executeUpdate(PG3);
					int reg4 = statement.executeUpdate(PG4);
					int reg5 = statement.executeUpdate(PG5);
					System.out.println(reg1);
					System.out.println(reg2);
					System.out.println(reg3);
					System.out.println(reg4);
					System.out.println(reg5);

				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		}

	
