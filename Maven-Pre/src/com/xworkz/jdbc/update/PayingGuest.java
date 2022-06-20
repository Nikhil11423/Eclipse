package com.xworkz.jdbc.update;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.jdbc.update.constants.JdbcProperties;

public class PayingGuest {

	public static void main(String[] args) {


		try (Connection connection = DriverManager.getConnection(JdbcProperties.URL.getValue(),
				JdbcProperties.USERNAME.getValue(), JdbcProperties.SECRETS.getValue())) {

			System.out.println(connection);
			
			String pg = "Insert Into paying_guest  values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

			PreparedStatement prepared = connection.prepareStatement(pg);

			prepared.setString(1, "8Star");
			prepared.setString(2, "Kiran");
			prepared.setString(3, "Ingale");
			prepared.setString(4, "sush432@gmail.com");
			prepared.setInt(5, 121);
			prepared.setLong(6, 720475057);
			prepared.setString(7, "BTM Water Tank");
			prepared.setInt(8, 560056);
			prepared.setString(9, "India");
			prepared.setString(10, "Maharshta");
			prepared.setInt(11, 25);
			prepared.setString(12, "Emlpoye");
			prepared.setString(13, "Male");
			prepared.setInt(14, 56786);
			prepared.setInt(15, 1679);
			prepared.setInt(16, 60);
			prepared.setInt(17, 5000);
			int rowAffected = prepared.executeUpdate();
			System.out.println(rowAffected);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
