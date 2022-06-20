package com.xworkz.jdbc.details;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import static com.xworkz.jdbc.details.constants.JDBC.*;
public class IplTeam {

	public static void main(String[] args) {
		try (Connection connection = DriverManager.getConnection(URL.getValue(), USERNAME.getValue(),
				SECRETS.getValue())) {

			System.out.println(connection);

			String sql = "insert into ipl values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			String sql1 = "insert into ipl values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			String sql2 = "insert into ipl values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			String sql3 = "insert into ipl values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			String sql4 = "insert into ipl values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			String sql5 = "insert into ipl values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			String sql6 = "insert into ipl values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			String sql7 = "insert into ipl values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			String sql8 = "insert into ipl values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			String sql9 = "insert into ipl values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			PreparedStatement preparedStatement2 = connection.prepareStatement(sql1);
			PreparedStatement preparedStatement3 = connection.prepareStatement(sql2);
			PreparedStatement preparedStatement4 = connection.prepareStatement(sql3);
			PreparedStatement preparedStatement5 = connection.prepareStatement(sql4);
			PreparedStatement preparedStatement6 = connection.prepareStatement(sql5);
			PreparedStatement preparedStatement7 = connection.prepareStatement(sql6);
			PreparedStatement preparedStatement8 = connection.prepareStatement(sql7);
			PreparedStatement preparedStatement9 = connection.prepareStatement(sql8);
			PreparedStatement preparedStatement10 = connection.prepareStatement(sql9);

			preparedStatement.setInt(1, 1);
			preparedStatement.setString(2, "RCB");
			preparedStatement.setString(3, "Virat kohli");
			preparedStatement.setString(4, "ABD");
			preparedStatement.setString(5, "kohli");
			preparedStatement.setString(6, "patidar");
			preparedStatement.setString(7, "Faf duplesis");
			preparedStatement.setString(8, "Maxwell");
			preparedStatement.setString(9, "chahal");
			preparedStatement.setString(10, "chahal");
			preparedStatement.setString(11, "Siraj");
			preparedStatement.setString(12, "sanjay bangar");
			preparedStatement.setString(13, "adam griffith");
			preparedStatement.setInt(14, 6);
			preparedStatement.setInt(15, 5);
			preparedStatement.setInt(16, 2);
			preparedStatement.setInt(17, 266);
			preparedStatement.setInt(18, 49);
			preparedStatement.setInt(19, 15);
			preparedStatement.setInt(20, 00);
			preparedStatement.setInt(21, 29);
			preparedStatement.setInt(22, 235);
			preparedStatement.setInt(23, 60);
			preparedStatement.setInt(24, 55);
			preparedStatement.setString(25, "vijay malya");
			preparedStatement.setString(26, "kohli");
			preparedStatement.setString(27, "dk");
			preparedStatement.setString(28, "Karnataka");
			preparedStatement.setString(29, "Kannada");
			preparedStatement.setString(30, "red n black");
			preparedStatement.setString(31, "maxwell");
			preparedStatement.setString(32, "harshad");
			preparedStatement.setString(33, "kohli");

		

			int rowsAffected = preparedStatement.executeUpdate();
			System.out.println(rowsAffected);

			preparedStatement2.setInt(1, 2);
			preparedStatement2.setString(2, "Mi");
			preparedStatement2.setString(3, "Rohit S");
			preparedStatement2.setString(4, "Ishan K");
			preparedStatement2.setString(5, "Pollard");
			preparedStatement2.setString(6, "SuryaKumar Jadav");
			preparedStatement2.setString(7, "Aryan Juyal");
			preparedStatement2.setString(8, "Ramandeep");
			preparedStatement2.setString(9, "Tim David");
			preparedStatement2.setString(10, "Dewald Brevis");
			preparedStatement2.setString(11, "Fabian Allen");
			preparedStatement2.setString(12, "Akash Madiwal");
			preparedStatement2.setString(13, "Anmolpreet");
			preparedStatement2.setInt(14, 8);
			preparedStatement2.setInt(15, 10);
			preparedStatement2.setInt(16, 2);
			preparedStatement2.setInt(17, 456);
			preparedStatement2.setInt(18, 60);
			preparedStatement2.setInt(19, 10);
			preparedStatement2.setInt(20, 05);
			preparedStatement2.setInt(21, 20);
			preparedStatement2.setInt(22, 435);
			preparedStatement2.setInt(23, 60);
			preparedStatement2.setInt(24, 55);
			preparedStatement2.setString(25, "ambani");
			preparedStatement2.setString(26, "Rohit S");
			preparedStatement2.setString(27, "Ishan K");
			preparedStatement2.setString(28, "Maharshtra");
			preparedStatement2.setString(29, "Marathi");
			preparedStatement2.setString(30, "Blue n golden");
			preparedStatement2.setString(31, "Pollard");
			preparedStatement2.setString(32, "Fabian Allen");
			preparedStatement2.setString(33, "Rohit S");
			

			int rowsAffected1 = preparedStatement2.executeUpdate();
			System.out.println(rowsAffected1);

			preparedStatement3.setInt(1, 3);
			preparedStatement3.setString(2, "KKR");
			preparedStatement3.setString(3, "Abhijiet Tomar");
			preparedStatement3.setString(4, "Alex Hales");
			preparedStatement3.setString(5, "Nitish Rana");
			preparedStatement3.setString(6, "Rinku Singh");
			preparedStatement3.setString(7, "Shreyas I");
			preparedStatement3.setString(8, "Aman khan");
			preparedStatement3.setString(9, "Andre Russell");
			preparedStatement3.setString(10, "Ashok Sharma");
			preparedStatement3.setString(11, "Tim Southee");
			preparedStatement3.setString(12, "Umesh Jadav");
			preparedStatement3.setString(13, "Sunil Narine");
			preparedStatement3.setInt(14, 6);
			preparedStatement3.setInt(15, 5);
			preparedStatement3.setInt(16, 2);
			preparedStatement3.setInt(17, 266);
			preparedStatement3.setInt(18, 49);
			preparedStatement3.setInt(19, 15);
			preparedStatement3.setInt(20, 00);
			preparedStatement3.setInt(21, 29);
			preparedStatement3.setInt(22, 235);
			preparedStatement3.setInt(23, 60);
			preparedStatement3.setInt(24, 55);
			preparedStatement3.setString(25, "Sharu khan");
			preparedStatement3.setString(26, "Shreyas I");
			preparedStatement3.setString(27, "Nitish Rana");
			preparedStatement3.setString(28, "Kolkatha");
			preparedStatement3.setString(29, "Bengali");
			preparedStatement3.setString(30, "golden and black");
			preparedStatement3.setString(31, "Andre Russel");
			preparedStatement3.setString(32, "Sunil Narine");
			preparedStatement3.setString(33, "Shreyas I");
			
			int rowsAffected2 = preparedStatement3.executeUpdate();
			System.out.println(rowsAffected2);

			preparedStatement4.setInt(1, 4);
			preparedStatement4.setString(2, "CSK");
			preparedStatement4.setString(3, "M S Dhoni");
			preparedStatement4.setString(4, "Robin Uthappa");
			preparedStatement4.setString(5, "R Jadeja");
			preparedStatement4.setString(6, "Moeen Ali");
			preparedStatement4.setString(7, "Shivam Dube");
			preparedStatement4.setString(8, "Ruturaj G");
			preparedStatement4.setString(9, "S Senapati");
			preparedStatement4.setString(10, "Bravo");
			preparedStatement4.setString(11, "M Theekshana");
			preparedStatement4.setString(12, "Chris Jordan");
			preparedStatement4.setString(13, "B Varma");
			preparedStatement4.setInt(14, 6);
			preparedStatement4.setInt(15, 5);
			preparedStatement4.setInt(16, 2);
			preparedStatement4.setInt(17, 266);
			preparedStatement4.setInt(18, 49);
			preparedStatement4.setInt(19, 15);
			preparedStatement4.setInt(20, 00);
			preparedStatement4.setInt(21, 29);
			preparedStatement4.setInt(22, 235);
			preparedStatement4.setInt(23, 60);
			preparedStatement4.setInt(24, 55);
			preparedStatement4.setString(25, "India Cements");
			preparedStatement4.setString(26, "M S Dhoni");
			preparedStatement4.setString(27, "M S Dhoni");
			preparedStatement4.setString(28, "Chennai");
			preparedStatement4.setString(29, "Tamil");
			preparedStatement4.setString(30, "yellow");
			preparedStatement4.setString(31, "M S Dhoni");
			preparedStatement4.setString(32, "Jadeja");
			preparedStatement4.setString(33, "M S Dhoni");
			

			int rowsAffected3 = preparedStatement5.executeUpdate();
			System.out.println(rowsAffected3);

			preparedStatement5.setInt(1, 5);
			preparedStatement5.setString(2, "DC");
			preparedStatement5.setString(3, "AShwin Hebbar");
			preparedStatement5.setString(4, "Davis Warner");
			preparedStatement5.setString(5, "Manddep singh");
			preparedStatement5.setString(6, "Prutavi Shaw");
			preparedStatement5.setString(7, "Kas Bharat");
			preparedStatement5.setString(8, "Tin Seifert");
			preparedStatement5.setString(9, "Axar Patel");
			preparedStatement5.setString(10, "Lalit Yadav");
			preparedStatement5.setString(11, "Shardul Thakur");
			preparedStatement5.setString(12, "Mustafizur Rahman");
			preparedStatement5.setString(13, "Kuldeep Yadav");
			preparedStatement5.setInt(14, 1);
			preparedStatement5.setInt(15, 2);
			preparedStatement5.setInt(16, 3);
			preparedStatement5.setInt(17, 666);
			preparedStatement5.setInt(18, 59);
			preparedStatement5.setInt(19, 55);
			preparedStatement5.setInt(20, 02);
			preparedStatement5.setInt(21, 49);
			preparedStatement5.setInt(22, 335);
			preparedStatement5.setInt(23, 50);
			preparedStatement5.setInt(24, 45);
			preparedStatement5.setString(25, "	Kiran Kumar Grandhi, Parth Jinda");
			preparedStatement5.setString(26, "Rishabh pant");
			preparedStatement5.setString(27, "Rishabh pant");
			preparedStatement5.setString(28, "Delhi");
			preparedStatement5.setString(29, "Hindi");
			preparedStatement5.setString(30, "Sky blue");
			preparedStatement5.setString(31, "Davis Warner");
			preparedStatement5.setString(32, "Mustafizur Rahman");
			preparedStatement5.setString(33, "Rishabh pant");
			

			int rowsAffected4 = preparedStatement5.executeUpdate();
			System.out.println(rowsAffected4);

			preparedStatement6.setInt(1, 6);
			preparedStatement6.setString(2, "RR");
			preparedStatement6.setString(3, "D Padikal");
			preparedStatement6.setString(4, "Karun nair");
			preparedStatement6.setString(5, "Jos Buttler");
			preparedStatement6.setString(6, "R Ashwin");
			preparedStatement6.setString(7, "Riyan Parag");
			preparedStatement6.setString(8, "Yashasvi Jaiswal");
			preparedStatement6.setString(9, "chahal");
			preparedStatement6.setString(10, "Tejas Barokar");
			preparedStatement6.setString(11, "Treant Boult");
			preparedStatement6.setString(12, "Navdeep Saini");
			preparedStatement6.setString(13, "adam griffith");
			preparedStatement6.setInt(14, 3);
			preparedStatement6.setInt(15, 6);
			preparedStatement6.setInt(16, 2);
			preparedStatement6.setInt(17, 166);
			preparedStatement6.setInt(18, 49);
			preparedStatement6.setInt(19, 15);
			preparedStatement6.setInt(20, 00);
			preparedStatement6.setInt(21, 29);
			preparedStatement6.setInt(22, 235);
			preparedStatement6.setInt(23, 40);
			preparedStatement6.setInt(24, 75);
			preparedStatement6.setString(25,
					"Manoj Badale (65%), RedBird Capital Partners (15%), Lachlan Murdoch (13%)");
			preparedStatement6.setString(26, "Sanju Samson");
			preparedStatement6.setString(27, "Sanju Samson");
			preparedStatement6.setString(28, "rajsthan");
			preparedStatement6.setString(29, "Rajshatni");
			preparedStatement6.setString(30, "Pink ");
			preparedStatement6.setString(31, "Jos Buttler");
			preparedStatement6.setString(32, "chahal");
			preparedStatement6.setString(33, "Jos Buttler");
			

			int rowsAffected5 = preparedStatement6.executeUpdate();
			System.out.println(rowsAffected5);

			preparedStatement7.setInt(1, 7);
			preparedStatement7.setString(2, "SRH");
			preparedStatement7.setString(3, "Aiden Markram");
			preparedStatement7.setString(4, "Priyam garg");
			preparedStatement7.setString(5, "Kane Williamson");
			preparedStatement7.setString(6, "Vishu Vinod");
			preparedStatement7.setString(7, "W Sudar");
			preparedStatement7.setString(8, "Rahul Tipathi");
			preparedStatement7.setString(9, "Abdul Samad");
			preparedStatement7.setString(10, "T Natarajan");
			preparedStatement7.setString(11, "Shreayas Gopal");
			preparedStatement7.setString(12, "Umran malik");
			preparedStatement7.setString(13, "Kartik Tyagi");
			preparedStatement7.setInt(14, 6);
			preparedStatement7.setInt(15, 5);
			preparedStatement7.setInt(16, 2);
			preparedStatement7.setInt(17, 566);
			preparedStatement7.setInt(18, 79);
			preparedStatement7.setInt(19, 25);
			preparedStatement7.setInt(20, 06);
			preparedStatement7.setInt(21, 23);
			preparedStatement7.setInt(22, 335);
			preparedStatement7.setInt(23, 50);
			preparedStatement7.setInt(24, 35);
			preparedStatement7.setString(25, " Kaviya Maran");
			preparedStatement7.setString(26, "Kane Williamson");
			preparedStatement7.setString(27, "Rahul Tipathi");
			preparedStatement7.setString(28, "Hydarabad");
			preparedStatement7.setString(29, "Telugu Urdu");
			preparedStatement7.setString(30, "pink n black");
			preparedStatement7.setString(31, "Rahul Tipathi");
			preparedStatement7.setString(32, "Umran malik");
			preparedStatement7.setString(33, "Rahul Tipathi");

			int rowsAffected6 = preparedStatement7.executeUpdate();
			System.out.println(rowsAffected6);

			preparedStatement8.setInt(1, 8);
			preparedStatement8.setString(2, "LSG");
			preparedStatement8.setString(3, "K L Rahul");
			preparedStatement8.setString(4, "Evin Lewis");
			preparedStatement8.setString(5, "Manan Vohar");
			preparedStatement8.setString(6, "Quinton De Kock");
			preparedStatement8.setString(7, "Karan Sharma");
			preparedStatement8.setString(8, "Kyle Mayers");
			preparedStatement8.setString(9, "Deepak Hooda");
			preparedStatement8.setString(10, "Ayush Badoni");
			preparedStatement8.setString(11, "Ravi Bishnoi");
			preparedStatement8.setString(12, "Ankit Rajpoot");
			preparedStatement8.setString(13, "Mark wood");
			preparedStatement8.setInt(14, 8);
			preparedStatement8.setInt(15, 9);
			preparedStatement8.setInt(16, 12);
			preparedStatement8.setInt(17, 246);
			preparedStatement8.setInt(18, 49);
			preparedStatement8.setInt(19, 35);
			preparedStatement8.setInt(20, 03);
			preparedStatement8.setInt(21, 19);
			preparedStatement8.setInt(22, 435);
			preparedStatement8.setInt(23, 20);
			preparedStatement8.setInt(24, 25);
			preparedStatement8.setString(25, "Raghu Iye");
			preparedStatement8.setString(26, "K L Rahul");
			preparedStatement8.setString(27, "Quinton De Kock");
			preparedStatement8.setString(28, "Lucknow");
			preparedStatement8.setString(29, "Hindi");
			preparedStatement8.setString(30, "new sky black");
			preparedStatement8.setString(31, "Deepak Hooda");
			preparedStatement8.setString(32, "Ravi Bishnoi");
			preparedStatement8.setString(33, "K L Rahul");

			int rowsAffected7 = preparedStatement8.executeUpdate();
			System.out.println(rowsAffected7);

			preparedStatement9.setInt(1, 9);
			preparedStatement9.setString(2, "PBKS");
			preparedStatement9.setString(3, "Jounny  Sharma");
			preparedStatement9.setString(4, "Shikar Dhawan");
			preparedStatement9.setString(5, "Manyak Agarwal");
			preparedStatement9.setString(6, "Anuh Patel");
			preparedStatement9.setString(7, "Rishi Dhawan");
			preparedStatement9.setString(8, "Rahul Chahar");
			preparedStatement9.setString(9, "Arshdeep Singh");
			preparedStatement9.setString(10, "Sandeep Sharma");
			preparedStatement9.setString(11, "Nathan Ellis");
			preparedStatement9.setString(12, "Odean Smith");
			preparedStatement9.setString(13, "Harpreet Brar");
			preparedStatement9.setInt(14, 6);
			preparedStatement9.setInt(15, 5);
			preparedStatement9.setInt(16, 2);
			preparedStatement9.setInt(17, 566);
			preparedStatement9.setInt(18, 49);
			preparedStatement9.setInt(19, 15);
			preparedStatement9.setInt(20, 00);
			preparedStatement9.setInt(21, 27);
			preparedStatement9.setInt(22, 235);
			preparedStatement9.setInt(23, 60);
			preparedStatement9.setInt(24, 20);
			preparedStatement9.setString(25, "vijay malya");
			preparedStatement9.setString(26, "Manyak Agarwal");
			preparedStatement9.setString(27, "Rishi Dhawan");
			preparedStatement9.setString(28, "Panjab");
			preparedStatement9.setString(29, "punjabi");
			preparedStatement9.setString(30, "pink n black");
			preparedStatement9.setString(31, "Shikar Dhawan");
			preparedStatement9.setString(32, "Sandeep Sharma");
			preparedStatement9.setString(33, "Manyak Agarwal");
			System.out.println(preparedStatement9.toString());

			int rowsAffected8 = preparedStatement9.executeUpdate();
			System.out.println(rowsAffected8);

			preparedStatement10.setInt(1, 10);
			preparedStatement10.setString(2, "GT");
			preparedStatement10.setString(3, "Abhinav Manohar");
			preparedStatement10.setString(4, "David Miler");
			preparedStatement10.setString(5, "Jason Roy");
			preparedStatement10.setString(6, "Shubham Gill");
			preparedStatement10.setString(7, "Hardik Pandya");
			preparedStatement10.setString(8, "Jayant Yadav");
			preparedStatement10.setString(9, "Rashid Khan");
			preparedStatement10.setString(10, "Lockie Ferguson");
			preparedStatement10.setString(11, "Noor Ahmed");
			preparedStatement10.setString(12, "Varun Aron");
			preparedStatement10.setString(13, "Mohammed Shami");
			preparedStatement10.setInt(14, 1);
			preparedStatement10.setInt(15, 1);
			preparedStatement10.setInt(16, 1);
			preparedStatement10.setInt(17, 300);
			preparedStatement10.setInt(18, 39);
			preparedStatement10.setInt(19, 15);
			preparedStatement10.setInt(20, 01);
			preparedStatement10.setInt(21, 16);
			preparedStatement10.setInt(22, 535);
			preparedStatement10.setInt(23, 50);
			preparedStatement10.setInt(24, 45);
			preparedStatement10.setString(25, "CVC Capital Partners");
			preparedStatement10.setString(26, "Hardik Pandya");
			preparedStatement10.setString(27, "Jason Roy");
			preparedStatement10.setString(28, "Gujrat");
			preparedStatement10.setString(29, "gujrathi");
			preparedStatement10.setString(30, "Mohammed Shami");
			preparedStatement10.setString(31, "Rashid Khan");
			preparedStatement10.setString(32, "Lockie Ferguson");
			preparedStatement10.setString(33, "Hardik Pandya");
			System.out.println(preparedStatement10.toString());

			int rowsAffected9 = preparedStatement10.executeUpdate();
			System.out.println(rowsAffected9);

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
