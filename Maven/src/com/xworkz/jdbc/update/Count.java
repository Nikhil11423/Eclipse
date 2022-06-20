package com.xworkz.jdbc.update;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static com.xworkz.jdbc.details.constants.JDBC.*;

public class Count {

	public static void main(String[] args) {

		String sql = "Select count(*) From Movie";

		try (Connection connection = DriverManager.getConnection(URL.getValue(), USERNAME.getValue(),
				SECRETS.getValue())) {

			System.err.println("***********Movie  total Counts***************");

			PreparedStatement prepareStatement = connection.prepareStatement(sql);

			ResultSet res = prepareStatement.executeQuery();

			while (res.next()) {
				String film = res.getString(1);
				System.out.println(film);

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		System.err.println("******************Ipl Team total Counts********************");

		String ipl = "Select  count(*) from ipl";

		try (Connection connection = DriverManager.getConnection(URL.getValue(), USERNAME.getValue(),
				SECRETS.getValue())) {

			PreparedStatement prepareStatement = connection.prepareStatement(ipl);

			ResultSet res = prepareStatement.executeQuery();
			while (res.next()) {
				int id = res.getInt(1);

				System.out.println(id);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		System.err.println("******************Actors  total Counts********************");

		String actors = "select  count(*) from actor";

		try (Connection connection = DriverManager.getConnection(URL.getValue(), USERNAME.getValue(),
				SECRETS.getValue())) {

			PreparedStatement prepareStatement = connection.prepareStatement(actors);

			ResultSet res = prepareStatement.executeQuery();
			while (res.next()) {
				int id = res.getInt(1);

				System.out.println(id);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		System.err.println("******************Country  total Counts********************");

		String country = "select  count(*) from Country";

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

		System.err.println("***********BharataRatnaAwardees  total Counts*************");

		String bharat = "select count(*) from BharataRatnaAwardees";

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
