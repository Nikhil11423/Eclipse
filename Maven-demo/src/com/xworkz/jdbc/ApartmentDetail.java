package com.xworkz.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ApartmentDetail {

	public static void main(String[] args) {
		
			String url = "jdbc:mysql://localhost:3306/xworkz_btm_march";
			String username = "root";
			String password = "root";
			try (Connection connection = DriverManager.getConnection(url, username, password)) {
				System.out.println("Driver class added");

				String Apartment1 = "INSERT INTO Apartment values (1,'Nikhil','R','nikhi123xworkz@gmail.com',1006,97386038,'Magadi Road',560056,'INDIA','karnataka',25,'Student','M',7565242,1864,5)";
				String Apartment2 = "INSERT INTO Apartment values (2,'Prathek','P','Prathekxworkz@gmail.com',1007,97760039,'Keshav Road',560046,'INDIA','A.P',25,'Developoer','M',6851242,2864,5)";
				String Apartment3 = "INSERT INTO Apartment values (3,'Akhil','M','akhilbxworkz@gmail.com',1008,97387040,'Jandey Road',560002,'INDIA','Tamil Nandu',25,'LoverBoy','M',57341242,364,5)";
				String Apartment4 = "INSERT INTO Apartment values (4,'Santu','P','santuxworkz@gmail.com',1009,978760041,'J.P Road',560045,'INDIA','Kerala',25,'Employe','M',315442,6264,5)";
				String Apartment5 = "INSERT INTO Apartment values (5,'Sourabh','S','souryaxworkz@gmail.com',1000,93760042,'Rajinagar',560023,'INDIA','U.p',25,'Coacher','M',3141242,6864,6)";

				Statement statement = connection.createStatement();
				int reg1 = statement.executeUpdate(Apartment1);
				int reg2 = statement.executeUpdate(Apartment2);
				int reg3 = statement.executeUpdate(Apartment3);
				int reg4 = statement.executeUpdate(Apartment4);
				int reg5 = statement.executeUpdate(Apartment5);
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

