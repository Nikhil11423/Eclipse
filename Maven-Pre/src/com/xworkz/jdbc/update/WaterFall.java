package com.xworkz.jdbc.update;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Time;

import com.xworkz.jdbc.update.constants.JdbcProperties;

public class WaterFall {

	public static void main(String[] args) {

		try (Connection connection = DriverManager.getConnection(JdbcProperties.URL.getValue(),
				JdbcProperties.USERNAME.getValue(), JdbcProperties.SECRETS.getValue())) {

			System.out.println(connection);

			String fall = "Insert Into waterfall values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

			PreparedStatement prepared = connection
					.prepareStatement("Insert Into waterfall values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");

			prepared.setInt(1, 10);
			prepared.setString(2, "Belagavi fall");
			prepared.setString(3, "janawad");
			prepared.setString(4, "janawad");
			prepared.setString(5, "Nipani");
			prepared.setString(6, "Belagavi");
			prepared.setString(7, "Karnataka");
			prepared.setInt(8, 561256);
			prepared.setString(9, "India");
			prepared.setString(10, "Dudganga river");
			prepared.setTime(11, new Time(10));
			prepared.setTime(12, new Time(05));
			prepared.setInt(13, 25);
			prepared.setInt(14, 300);
			prepared.setInt(15, 120);
			prepared.setInt(16, 20);
			prepared.setInt(17, 50);
			int rowAffected = prepared.executeUpdate();
			System.out.println(rowAffected);

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
