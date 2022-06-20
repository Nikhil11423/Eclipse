package com.xworkz.jdbc.update;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import static com.xworkz.jdbc.details.constants.JDBC.*;

public class SelectPerticularColumns {

	public static void main(String[] args) {
		String mysql = "Select Movie_Name,Hero_Name,Heroine_Name,Language,Director from movie";

		try (Connection connection = DriverManager.getConnection(URL.getValue(), USERNAME.getValue(),
				SECRETS.getValue())) {

			System.err.println("***********Movie Details***************");

			PreparedStatement prepareStatement = connection.prepareStatement(mysql);

			ResultSet res = prepareStatement.executeQuery();

			while (res.next()) {
				String Name = res.getString(1);
				String Hero = res.getString(2);
				String Heroine = res.getString(3);
				String lang = res.getString(4);
				String dir = res.getString(5);

				System.out.println(Name + " : " + Hero + " : " + Heroine + " : " + lang + " : " + dir);

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		System.err.println("**************Ipl Team Display only 5 columns*********************");

		String ipl = "Select id,Captain,viceCaptain,alrounder,coach from ipl";

		try (Connection connection = DriverManager.getConnection(URL.getValue(), USERNAME.getValue(),
				SECRETS.getValue())) {

			PreparedStatement prepareStatement = connection.prepareStatement(ipl);

			ResultSet res = prepareStatement.executeQuery();
			while (res.next()) {
				int id = res.getInt(1);
				String Team = res.getString(2);
				String Player1 = res.getString(3);
				String player = res.getString(4);
				String win = res.getString(5);

				System.out.println(id + " : " + Team + " : " + Player1 + " : " + player + " : " + win);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		System.err.println("******************Actors Details********************");

		String actors = "select id,FirstName,FatherName,LastName,Title from actor";

		try (Connection connection = DriverManager.getConnection(URL.getValue(), USERNAME.getValue(),
				SECRETS.getValue())) {

			PreparedStatement prepareStatement = connection.prepareStatement(actors);

			ResultSet res = prepareStatement.executeQuery();
			while (res.next()) {
				int id = res.getInt(1);
				String FN = res.getString(2);
				String SN = res.getString(3);
				String LN = res.getString(4);
				String total = res.getString(5);

				System.out.println(id + " : " + FN + " : " + SN + " : " + LN + " : " + total);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		System.err.println("******************Country Details********************");

		String country = "select id,CountryName,CapitalCity,Country_PM_Name,Country_Sports from Country";

		try (Connection connection = DriverManager.getConnection(URL.getValue(), USERNAME.getValue(),
				SECRETS.getValue())) {

			PreparedStatement prepareStatement = connection.prepareStatement(country);

			ResultSet resultSet = prepareStatement.executeQuery();
			while (resultSet.next()) {
				int id = resultSet.getInt(1);
				String FN = resultSet.getString(2);
				String LN = resultSet.getString(3);
				String FM = resultSet.getString(4);
				String game = resultSet.getString(5);

				System.out.println(id + " : " + FN + " : " + LN + " : " + FM + " : " + game);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		System.err.println("***********BharataRatnaAwardees winners Details*************");

		String bharat = "select id,Name,awardedBy,awardedAt,place from BharataRatnaAwardees";

		try (Connection connection = DriverManager.getConnection(URL.getValue(), USERNAME.getValue(),
				SECRETS.getValue())) {

			PreparedStatement prepareStatement = connection.prepareStatement(bharat);

			ResultSet res = prepareStatement.executeQuery();
			while (res.next()) {
				int id = res.getInt(1);
				String Name = res.getString(2);
				String AwardedBy = res.getString(3);
				String AwardedAt = res.getString(4);
				String Place = res.getString(5);

				System.out.println(id + " : " + Name + " : " + AwardedBy + " : " + AwardedAt + " : " + Place);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
