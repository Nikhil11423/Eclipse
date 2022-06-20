package com.xworkz.jdbc.update;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;

import com.xworkz.jdbc.update.constants.JdbcProperties;

public class Customer {

	public static void main(String[] args) {


		try (Connection connection = DriverManager.getConnection(JdbcProperties.URL.getValue(),
				JdbcProperties.USERNAME.getValue(), JdbcProperties.SECRETS.getValue())) {

			System.out.println(connection);
			String cus = "INSERT INTO Customer values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

			PreparedStatement prepared = connection.prepareStatement(cus);

			prepared.setInt(1, 20);
			prepared.setString(2, "Raghu");
			prepared.setString(3, "Patil");
			prepared.setInt(4, 720479057);
			prepared.setString(5, "Basav Nagar");
			prepared.setString(6, "S T O");
			prepared.setString(7, "Belagavi");
			prepared.setString(8, "Karnataka");
			prepared.setInt(9, 561216);
			prepared.setString(10, "India");
			prepared.setString(11, "raghu420@gmail.com");
			prepared.setInt(12, 15000);
			prepared.setString(13, "Credit");
			prepared.setString(14, "Adidas");
			prepared.setDate(15, new Date(2022 - 06 - 12));
			prepared.setString(16, "good");
			prepared.setInt(17, 5);
			prepared.setInt(18, 8);
			int rowAffected = prepared.executeUpdate();
			System.out.println(rowAffected);


		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
