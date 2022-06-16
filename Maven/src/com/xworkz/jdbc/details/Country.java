package com.xworkz.jdbc.details;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.jdbc.details.constants.JDBC;

public class Country {

	public static void main(String[] args) {

		try (Connection connection = DriverManager.getConnection(JDBC.URL.getValue(), JDBC.USERNAME.getValue(),
				JDBC.SECRETS.getValue())) {

			String ac = "insert into Country values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			String ac1 = "insert into Country values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			String ac2 = "insert into Country values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			String ac3 = "insert into Country values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			String ac4 = "insert into Country values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			String ac5 = "insert into Country values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			String ac6 = "insert into Country values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			String ac7 = "insert into Country values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			String ac8 = "insert into Country values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

			

			PreparedStatement pre = connection.prepareStatement(ac);
			PreparedStatement pre1 = connection.prepareStatement(ac1);
			PreparedStatement pre2 = connection.prepareStatement(ac2);
			PreparedStatement pre3 = connection.prepareStatement(ac3);
			PreparedStatement pre4 = connection.prepareStatement(ac4);
			PreparedStatement pre5 = connection.prepareStatement(ac5);
			PreparedStatement pre6 = connection.prepareStatement(ac6);
			PreparedStatement pre7 = connection.prepareStatement(ac7);
			PreparedStatement pre8 = connection.prepareStatement(ac8);




			pre.setInt(1, 2);
			pre.setString(2, "Rassia");
			pre.setInt(3, 1441);
			pre.setInt(4, 7);
			pre.setString(5, "Russian  ruble");
			pre.setDate(6, new Date(1922 - 03 - 15));
			pre.setInt(7, 7);
			pre.setString(8, "Moscow");
			pre.setInt(9, 50);
			pre.setInt(10, 120);
			pre.setString(11, "Mikhali  Mishustin");
			pre.setString(12, "Vladimir Putin");
			pre.setString(13, "Football");
			pre.setString(14, "Russiaa");
			pre.setString(15, "Eurasian Brown Bear");
			pre.setString(16, "Eagle");
			pre.setString(17, "jand");
			pre.setString(18, "Chamomile");
			pre.setInt(19,20);
			pre.setDouble(20, 19);
			pre.setInt(21, 90);
			pre.setInt(22, 100);
			pre.setInt(23, 26);
			pre.setDouble(24, 3.2);
			pre.setInt(25, 129);
			pre.setInt(26, 18);
			pre.setInt(27, 3);
			pre.setInt(28, 200);
			pre.setInt(29, 1);
			pre.setInt(30, 2);
			pre.setInt(31, 1245);
			pre.setInt(32, 3);
			pre.setInt(33, 43);
			System.out.println(pre.toString());
			pre.executeUpdate();
			
			
			pre1.setInt(1, 3);
			pre1.setString(2, "Pakishtan");
			pre1.setInt(3, 12);
			pre1.setInt(4, 90);
			pre1.setString(5, "Rup");
			pre1.setDate(6, new Date(1947 -8 -15));
			pre1.setInt(7, 92);
			pre1.setString(8, "Islamabad");
			pre1.setInt(9, 13);
			pre1.setInt(10, 16);
			pre1.setString(11, "shehbaz Sharif");
			pre1.setString(12, "Arif islamic");
			pre1.setString(13, "Kabbadi");
			pre1.setString(14, "urdu");
			pre1.setString(15, "Markhor");
			pre1.setString(16, "Chukar");
			pre1.setString(17, "jasmine");
			pre1.setString(18, "Deodar");
			pre1.setInt(19,20);
			pre1.setDouble(20, 19);
			pre1.setInt(21, 90);
			pre1.setInt(22, 100);
			pre1.setInt(23, 26);
			pre1.setDouble(24, 3.2);
			pre1.setInt(25, 168);
			pre1.setInt(26, 18);
			pre1.setInt(27, 3);
			pre1.setInt(28, 200);
			pre1.setInt(29, 1);
			pre1.setInt(30, 2);
			pre1.setInt(31, 1245);
			pre1.setInt(32, 3);
			pre1.setInt(33, 43);
			System.out.println(pre1.toString());
			pre1.executeUpdate();
			
			pre2.setInt(1, 4);
			pre2.setString(2, "USA");
			pre2.setInt(3, 1000);
			pre2.setInt(4, 7);
			pre2.setString(5, "English");
			pre2.setDate(6, new Date(1788-06-21));
			pre2.setInt(7, 7);
			pre2.setString(8, "Washington D C");
			pre2.setInt(9, 50);
			pre2.setInt(10, 120);
			pre2.setString(11, "Kamala Harries");
			pre2.setString(12, "Joe Biden");
			pre2.setString(13, "Football");
			pre2.setString(14, "Baseball");
			pre2.setString(15, "bison");
			pre2.setString(16, "Eagle");
			pre2.setString(17, "rose");
			pre2.setString(18, "Oak");
			pre2.setInt(19,20);
			pre2.setDouble(20, 19);
			pre2.setInt(21, 90);
			pre2.setInt(22, 100);
			pre2.setInt(23, 26);
			pre2.setDouble(24, 3.796);
			pre2.setInt(25, 7);
			pre2.setInt(26, 18);
			pre2.setInt(27, 3);
			pre2.setInt(28, 200);
			pre2.setInt(29, 1);
			pre2.setInt(30, 2);
			pre2.setInt(31, 1245);
			pre2.setInt(32, 3);
			pre2.setInt(33, 43);
			System.out.println(pre2.toString());
			pre2.executeUpdate();
			
			
			pre3.setInt(1, 5);
			pre3.setString(2, "Bangaladesh");
			pre3.setInt(3, 14);
			pre3.setInt(4, 7);
			pre3.setString(5, "rupes");
			pre3.setDate(6, new Date(1971-12-26));
			pre3.setInt(7, 880);
			pre3.setString(8, "Dhaka");
			pre3.setInt(9, 50);
			pre3.setInt(10, 120);
			pre3.setString(11, "Sheikh Hasina");
			pre3.setString(12, "Abdul Hamid");
			pre3.setString(13, "Kabbadi");
			pre3.setString(14, "Bengali");
			pre3.setString(15, "Tiger");
			pre3.setString(16, "magpie robin");
			pre3.setString(17, "Mango");
			pre3.setString(18, "white water lily");
			pre3.setInt(19,20);
			pre3.setDouble(20, 19);
			pre3.setInt(21, 90);
			pre3.setInt(22, 100);
			pre3.setInt(23, 26);
			pre3.setDouble(24, 3.2);
			pre3.setInt(25, 129);
			pre3.setInt(26, 18);
			pre3.setInt(27, 3);
			pre3.setInt(28, 200);
			pre3.setInt(29, 1);
			pre3.setInt(30, 2);
			pre3.setInt(31, 1245);
			pre3.setInt(32, 3);
			pre3.setInt(33, 43);
			System.out.println(pre3.toString());
			pre3.executeUpdate();
			
			pre4.setInt(1, 6);
			pre4.setString(2, "Brazil");
			pre4.setInt(3, 141);
			pre4.setInt(4, 9);
			pre4.setString(5, "");
			pre4.setDate(6, new Date(1922 - 03 - 15));
			pre4.setInt(7, 7);
			pre4.setString(8, "Moscow");
			pre4.setInt(9, 50);
			pre4.setInt(10, 120);
			pre4.setString(11, "Jair Messaias");
			pre4.setString(12, "gleisi hoffmann");
			pre4.setString(13, "Football");
			pre4.setString(14, "Portuguese");
			pre4.setString(15, "bairds tapir");
			pre4.setString(16, "rufous");
			pre4.setString(17, "lpe-amarelo");
			pre4.setString(18, "pau brasil");
			pre4.setInt(19,20);
			pre4.setDouble(20, 29);
			pre4.setInt(21, 60);
			pre4.setInt(22, 150);
			pre4.setInt(23, 20);
			pre4.setDouble(24, 2.2);
			pre4.setInt(25, 159);
			pre4.setInt(26, 17);
			pre4.setInt(27, 4);
			pre4.setInt(28, 100);
			pre4.setInt(29, 89);
			pre4.setInt(30, 2);
			pre4.setInt(31, 1645);
			pre4.setInt(32, 3);
			pre4.setInt(33, 49);
			System.out.println(pre4.toString());
			pre4.executeUpdate();
			
			pre5.setInt(1, 7);
			pre5.setString(2, "Myanmar");
			pre5.setInt(3, 1441);
			pre5.setInt(4, 7);
			pre5.setString(5, "Myanmar kyat");
			pre5.setDate(6, new Date(1922 - 03 - 15));
			pre5.setInt(7, 7);
			pre5.setString(8, "Moscow");
			pre5.setInt(9, 50);
			pre5.setInt(10, 120);
			pre5.setString(11, "Min Aung Hlaing");
			pre5.setString(12, "Myint Swe");
			pre5.setString(13, "Chinlone");
			pre5.setString(14, "Burmese");
			pre5.setString(15, "Fauna");
			pre5.setString(16, "Peacick");
			pre5.setString(17, "green peafowl");
			pre5.setString(18, "Padauk");
			pre5.setInt(19,20);
			pre5.setDouble(20, 19);
			pre5.setInt(21, 90);
			pre5.setInt(22, 100);
			pre5.setInt(23, 26);
			pre5.setDouble(24, 3.2);
			pre5.setInt(25, 129);
			pre5.setInt(26, 18);
			pre5.setInt(27, 3);
			pre5.setInt(28, 200);
			pre5.setInt(29, 1);
			pre5.setInt(30, 2);
			pre5.setInt(31, 1245);
			pre5.setInt(32, 3);
			pre5.setInt(33, 43);
			System.out.println(pre5.toString());
			pre5.executeUpdate();
			
			pre6.setInt(1, 8);
			pre6.setString(2, "China");
			pre6.setInt(3, 141);
			pre6.setInt(4, 9);
			pre6.setString(5, "");
			pre6.setDate(6, new Date(1922 - 03 - 15));
			pre6.setInt(7, 7);
			pre6.setString(8, "Beijing");
			pre6.setInt(9, 50);
			pre6.setInt(10, 120);
			pre6.setString(11, "Xi Jinping");
			pre6.setString(12, "Xi Jinping");
			pre6.setString(13, "judo");
			pre6.setString(14, "Renminbi");
			pre6.setString(15, "The giant panda");
			pre6.setString(16, "Red-crowned Crane");
			pre6.setString(17, " plum blossom");
			pre6.setString(18, "Ginkgo");
			pre6.setInt(19,20);
			pre6.setDouble(20, 29);
			pre6.setInt(21, 60);
			pre6.setInt(22, 150);
			pre6.setInt(23, 20);
			pre6.setDouble(24, 2.2);
			pre6.setInt(25, 159);
			pre6.setInt(26, 17);
			pre6.setInt(27, 4);
			pre6.setInt(28, 100);
			pre6.setInt(29, 89);
			pre6.setInt(30, 2);
			pre6.setInt(31, 1645);
			pre6.setInt(32, 3);
			pre6.setInt(33, 49);
			System.out.println(pre6.toString());
			pre6.executeUpdate();
			
			pre7.setInt(1, 9);
			pre7.setString(2, "South Korea");
			pre7.setInt(3, 1441);
			pre7.setInt(4, 7);
			pre7.setString(5, "South Korean won");
			pre7.setDate(6, new Date(1922 - 03 - 15));
			pre7.setInt(7, 7);
			pre7.setString(8, "Moscow");
			pre7.setInt(9, 50);
			pre7.setInt(10, 120);
			pre7.setString(11, "Han Duck-soo");
			pre7.setString(12, "Yoon Suk-yeol");
			pre7.setString(13, "Football");
			pre7.setString(14, "Korean");
			pre7.setString(15, "Siberian tiger");
			pre7.setString(16, "magpies");
			pre7.setString(17, "mugunghwa");
			pre7.setString(18, "Korean red pine");
			pre7.setInt(19,20);
			pre7.setDouble(20, 19);
			pre7.setInt(21, 90);
			pre7.setInt(22, 100);
			pre7.setInt(23, 26);
			pre7.setDouble(24, 3.2);
			pre7.setInt(25, 129);
			pre7.setInt(26, 18);
			pre7.setInt(27, 3);
			pre7.setInt(28, 200);
			pre7.setInt(29, 1);
			pre7.setInt(30, 2);
			pre7.setInt(31, 1245);
			pre7.setInt(32, 3);
			pre7.setInt(33, 43);
			System.out.println(pre7.toString());
			pre7.executeUpdate();
			
			pre8.setInt(1, 10);
			pre8.setString(2, "Thailand");
			pre8.setInt(3, 1441);
			pre8.setInt(4, 7);
			pre8.setString(5, "Thai baht");
			pre8.setDate(6, new Date(1922 - 03 - 15));
			pre8.setInt(7, 7);
			pre8.setString(8, "Bangkok");
			pre8.setInt(9, 50);
			pre8.setInt(10, 120);
			pre8.setString(11, "Prayut Chan-o-cha");
			pre8.setString(12, "Prayuth Chan-ocha ");
			pre8.setString(13, "Basketball");
			pre8.setString(14, "Thai");
			pre8.setString(15, "Elephant");
			pre8.setString(16, "Siamese fireback");
			pre8.setString(17, "	Golden shower flower");
			pre8.setString(18, "Cassia fistula");
			pre8.setInt(19,20);
			pre8.setDouble(20, 19);
			pre8.setInt(21, 90);
			pre8.setInt(22, 100);
			pre8.setInt(23, 26);
			pre8.setDouble(24, 3.2);
			pre8.setInt(25, 129);
			pre8.setInt(26, 18);
			pre8.setInt(27, 3);
			pre8.setInt(28, 200);
			pre8.setInt(29, 1);
			pre8.setInt(30, 2);
			pre8.setInt(31, 1245);
			pre8.setInt(32, 3);
			pre8.setInt(33, 43);
			System.out.println(pre8.toString());
			pre8.executeUpdate();

			int rowschanged = pre.executeUpdate();
			System.out.println(rowschanged);

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
