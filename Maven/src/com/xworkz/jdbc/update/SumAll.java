package com.xworkz.jdbc.update;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static com.xworkz.jdbc.details.constants.JDBC.*;

public class SumAll {
	
	public static void main(String[] args) {
	
		String apart = "select sum(id) from Ipl";
		
		try (Connection connection = DriverManager.getConnection(URL.getValue(), USERNAME.getValue(),
				SECRETS.getValue())) {

			PreparedStatement prepareStatement = connection.prepareStatement(apart);

			ResultSet res = prepareStatement.executeQuery();
			while (res.next()) {
				int id = res.getInt(1);

				System.out.println(id);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		System.err.println("******************Actors sum all********************");

		String actor = "select sum(id) from Actor";

		try (Connection connection = DriverManager.getConnection(URL.getValue(), USERNAME.getValue(),
				SECRETS.getValue())) {

			PreparedStatement prepareStatement = connection.prepareStatement(actor);

			ResultSet res = prepareStatement.executeQuery();
			while (res.next()) {
				int id = res.getInt(1);

				System.out.println(id);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		System.err.println("******************Country sum all********************");

		String country = "select  sum(id) from Country";

		try (Connection connection = DriverManager.getConnection(URL.getValue(), USERNAME.getValue(),
				SECRETS.getValue())) {

			PreparedStatement prepareStatement = connection.prepareStatement(country);

			ResultSet resultSet = prepareStatement.executeQuery();
			while (resultSet.next()) {
				int id = resultSet.getInt(1);

				System.out.println(id);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		System.err.println("***********BharataRatnaAwardees  sum all*************");

		String bharat = "select sum(id) from BharataRatnaAwardees";

		try (Connection connection = DriverManager.getConnection(URL.getValue(), USERNAME.getValue(),
				SECRETS.getValue())) {

			PreparedStatement prepareStatement = connection.prepareStatement(bharat);

			ResultSet res = prepareStatement.executeQuery();
			while (res.next()) {
				int id = res.getInt(1);

				System.out.println(id);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
