package com.xworkz.jdbc.update;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.jdbc.update.constants.JdbcProperties;

public class ApartmentDetails {

	public static void main(String[] args) {




				

				
				try(Connection connection = DriverManager.getConnection(JdbcProperties.URL.getValue(),JdbcProperties.USERNAME.getValue(),JdbcProperties.SECRETS.getValue())){
					
					System.out.println(connection);
					
					String Apartment1 = "INSERT INTO Apartment values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
					
					PreparedStatement prepared = connection.prepareStatement(Apartment1);
					
					prepared.setInt(1, 21);
					prepared.setString(2,"Sudarshan");
					prepared.setString(3, "Ingale");
					prepared.setString(4, "sush432@gmail.com");
					prepared.setInt(5, 1001);
					prepared.setInt(6, 990123456);
					prepared.setString(7, "dattawad");
					prepared.setInt(8, 561210);
					prepared.setString(9, "India");
					prepared.setString(10, "Maharshta");
					prepared.setInt(11, 25);
					prepared.setString(12, "Emlpoye");
					prepared.setString(13, "Female");
					prepared.setInt(14, 56786);
					prepared.setInt(15, 1679);
					prepared.setInt(16, 6);
					prepared.setInt(17, 9000);
					int rowAffected = prepared.executeUpdate();
					System.out.println(rowAffected);

					
			

					
				} catch (SQLException e) {
					
					e.printStackTrace();
				}

			}

	}


