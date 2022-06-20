package com.xworkz.jdbc.details;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Time;

import static com.xworkz.jdbc.details.constants.JDBC.*;

public class Movie {

	public static void main(String[] args) {

		try (Connection connection = DriverManager.getConnection(URL.getValue(),USERNAME.getValue(),
				SECRETS.getValue())) {
			System.out.println(connection);
			String movie = "insert into Movie values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

			// CREATE TABLE Movie (1Movie_Name varchar(20),2Hero_Name
			// VARCHAR(20),H3eroine_Name VARCHAR(20),4Villan_Name VARCHAR(30),5Budget
			// bigint,
			// 6Language VARCHAR(30),7Studio_location VARCHAR(30),8Script_Writer
			// VARCHAR(30),9Digalouge_Writer VARCHAR(30),10stunt_Master
			// VARCHAR(30),11Cinematographer varchar(30),
			// 12State varchar(30),13Crew_Members int,14Poduction_house
			// varchar(20),15Certificate varchar(10),16Item_song tinyint,17Total_Songs
			// int,18Total_Time time,
			// 19Poroducer_Name varchar(20),20Director varchar(20),21Music_Director
			// varchar(20),22Screnplay varchar(20),23Action tinyint,24Comdey tinyint,
			// 25Family_entertainer tinyint,26Drama tinyint,27Register_id int,28Distributor
			// varchar(20),29OTT tinyint,30Realse_Date date,31Total_Members_Film int,
			// 32Editor varchar(20),PRIMARY KEY (Movie_Name));

			PreparedStatement preparestmt = connection.prepareStatement(movie);
			preparestmt.setString(1, "Yuvarathnaa");
			preparestmt.setString(2, "Punit Rajkumar");
			preparestmt.setString(3, "Sayyeshaa Dhananjay");
			preparestmt.setString(4, "Diganth ");
			preparestmt.setInt(5, 324100000);
			preparestmt.setString(6, "Kannada");
			preparestmt.setString(7, "Bagalore");
			preparestmt.setString(8, "Santhosh Ananddram");
			preparestmt.setString(9, "Raj B. Shetty");
			preparestmt.setString(10, "gottila");
			preparestmt.setString(11, "Venkatesh Anguraj");
			preparestmt.setString(12, "Karnataka");
			preparestmt.setInt(13, 50);
			preparestmt.setString(14, "Paramvah Studios ");
			preparestmt.setString(15, "U/A");
			preparestmt.setBoolean(16, true);
			preparestmt.setInt(17, 8);
			preparestmt.setTime(18, new Time(10 - 9 - 03));
			preparestmt.setString(19, "Vijay Kiragandur");
			preparestmt.setString(20, "Santhosh Ananddram ");
			preparestmt.setString(21, "	V. Harikrishna");
			preparestmt.setString(22, "Jayanna Films");
			preparestmt.setBoolean(23, true);
			preparestmt.setBoolean(24, true);
			preparestmt.setBoolean(25, true);
			preparestmt.setBoolean(26, true);
			preparestmt.setInt(27, 89671237);
			preparestmt.setString(28, "action drama film ");
			preparestmt.setBoolean(29, true);
			preparestmt.setDate(30, new Date(2021 - 04 - 01));
			preparestmt.setInt(31, 1000);
			preparestmt.setString(32, "K. M. Prakash");

			int rowschanged = preparestmt.executeUpdate();
			System.out.println(rowschanged);

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
