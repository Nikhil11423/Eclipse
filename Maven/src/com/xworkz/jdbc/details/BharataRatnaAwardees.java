package com.xworkz.jdbc.details;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import static com.xworkz.jdbc.details.constants.JDBC.*;

public class BharataRatnaAwardees {

	public static void main(String[] args) {

		try (Connection connection = DriverManager.getConnection(URL.getValue(), USERNAME.getValue(),
				SECRETS.getValue())) {

			System.out.println(connection);

			PreparedStatement prepare = connection.prepareStatement(
					"Insert Into BharataRatnaAwardees values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);");
			prepare.setInt(1, 10);
			prepare.setString(2, "Vallabhbhai Patel[");
			prepare.setString(3, "Government of India");
			prepare.setString(4, "Rastrapathi Bhavan");
			prepare.setString(5, "New Delhi");
			prepare.setString(6, "S Narayan");
			prepare.setString(7, "Rajendra Prasad");
			prepare.setString(8, "Science");
			prepare.setString(9, "Agni Missiles");
			prepare.setString(10, "Prime Minister");
			prepare.setString(11, "Alipur Mints");
			prepare.setInt(12, 40);
			prepare.setInt(13, 65);
			prepare.setString(14, "Male");
			prepare.setInt(15, 1930);
			prepare.setInt(16, 10);
			prepare.setInt(17, 25);
			prepare.setString(18, "married");
			prepare.setString(19, "N/A");
			prepare.setInt(20, 0);
			prepare.setString(21, "Indian");
			prepare.setString(22, "Gujarat");
			prepare.setString(23, "Rameshwaram");
			prepare.setString(24, "Dhanushkodi");
			prepare.setString(25, "Abdul");
			prepare.setString(26, "Ashiamma");
			prepare.setInt(27, 6);
			prepare.setString(28, "Rameshwaram");
			prepare.setInt(29, 1999);
			prepare.setInt(30, 8);
			prepare.setInt(31, 15);
			prepare.setString(32, "No");
			prepare.setString(33, "Padma Vibhusan");
			int rowAffected = prepare.executeUpdate();
			System.out.println(rowAffected);

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
