package com.xworkz.jdbc.details;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import static com.xworkz.jdbc.details.constants.JDBC.*;

public class Actor {

	public static void main(String[] args) {

		try (Connection connection = DriverManager.getConnection(URL.getValue(), USERNAME.getValue(),
				SECRETS.getValue())) {
			System.out.println(connection);

			String ac = "insert into Actor values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			String ac1 = "insert into Actor values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			String ac2 = "insert into Actor values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			String ac3 = "insert into Actor values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

			PreparedStatement pre = connection.prepareStatement(ac);
			PreparedStatement pre1 = connection.prepareStatement(ac1);
			PreparedStatement pre2 = connection.prepareStatement(ac2);
			PreparedStatement pre3 = connection.prepareStatement(ac3);

			pre.setInt(1, 10);
			pre.setString(2, "Nikhil");
			pre.setString(3, "Kumar swami");
			pre.setString(4, "Goudru");
			pre.setDate(5, new Date(1994 - 8 - 2));
			pre.setInt(6, 70);
			pre.setString(7, "parvtamma");
			pre.setInt(8, 1954);
			pre.setInt(9, 70);
			pre.setString(10, "bangalore");
			pre.setString(11, "bangalore");
			pre.setString(12, "Karnataka");
			pre.setString(13, "avr appa");
			pre.setInt(14, 210);
			pre.setInt(15, 50);
			pre.setString(16, "yes");
			pre.setInt(17, 10);
			pre.setInt(18, 1);
			pre.setDouble(19, 5.5);
			pre.setString(20, "Nata Sarvabhouma");
			pre.setInt(21, 50000000);
			pre.setInt(22, 26);
			pre.setString(23, "yes");
			pre.setString(24, "minakshi");
			pre.setString(25, "6");
			pre.setString(26, "Kannada");
			pre.setString(27, "Gandhada Gudi");
			pre.setString(28, "no");
			pre.setString(29, "Rajkumara");
			pre.setString(30, "Gandhada Gudi");
			pre.setLong(31, 7056575652l);
			pre.setString(32, "Gajnuru");
			pre.setString(33, "Rajani kanth");

			int rowschanged = pre.executeUpdate();
			System.out.println(rowschanged);

			pre1.setInt(1, 3);
			pre1.setString(2, "Vishnuvardhan");
			pre1.setString(3, "H.L. Narayana Rao");
			pre1.setString(4, "Kamakshamma");
			pre1.setDate(5, new Date(1950 - 9 - 18));
			pre1.setInt(6, 70);
			pre1.setString(7, "Lakshmamma");
			pre1.setInt(8, 1954);
			pre1.setInt(9, 70);
			pre1.setString(10, "bangalore");
			pre1.setString(11, "bangalore");
			pre1.setString(12, "Karnataka");
			pre1.setString(13, "avr appa");
			pre1.setInt(14, 220);
			pre1.setInt(15, 50);
			pre1.setString(16, "yes");
			pre1.setInt(17, 10);
			pre1.setInt(18, 1);
			pre1.setDouble(19, 5.8);
			pre1.setString(20, "Sahasa Simha ");
			pre1.setInt(21, 50000000);
			pre1.setInt(22, 26);
			pre1.setString(23, "yes");
			pre1.setString(24, "Bharathi");
			pre1.setString(25, "2");
			pre1.setString(26, "Kannada");
			pre1.setString(27, "Muthina Haara");
			pre1.setString(28, "no");
			pre1.setString(29, "Rajkumara");
			pre1.setString(30, "Muthina Haara");
			pre1.setLong(31, 7056575652l);
			pre1.setString(32, "Mysore");
			pre1.setString(33, "Rajani kanth");

			int rows1 = pre1.executeUpdate();
			System.out.println(rows1);

			pre2.setInt(1, 4);
			pre2.setString(2, "Darshan");
			pre2.setString(3, "Srinivas");
			pre2.setString(4, "Tugudippa");
			pre2.setDate(5, new Date(1977 - 2 - 16));
			pre2.setInt(6, 45);
			pre2.setString(7, "Meena");
			pre2.setInt(8, 1954);
			pre2.setInt(9, 70);
			pre2.setString(10, "bangalore");
			pre2.setString(11, "bangalore");
			pre2.setString(12, "Karnataka");
			pre2.setString(13, "Dr.Rajkumar");
			pre2.setInt(14, 220);
			pre2.setInt(15, 50);
			pre2.setString(16, "yes");
			pre2.setInt(17, 10);
			pre2.setInt(18, 1);
			pre2.setDouble(19, 5.8);
			pre2.setString(20, "Challenging star");
			pre2.setInt(21, 50000000);
			pre2.setInt(22, 26);
			pre2.setString(23, "yes");
			pre2.setString(24, "Viyaya");
			pre2.setString(25, "2");
			pre2.setString(26, "Kannada");
			pre2.setString(27, "Bulbul");
			pre2.setString(28, "no");
			pre2.setString(29, "Kurukshetra");
			pre2.setString(30, "Navagraha");
			pre2.setLong(31, 7056575652l);
			pre2.setString(32, "ponnampet");
			pre2.setString(33, "Dr.rajkumar");

			int rowschanged2 = pre2.executeUpdate();
			System.out.println(rowschanged2);

			pre3.setInt(1, 6);
			pre3.setString(2, "Yash");
			pre3.setString(3, "Arunkumar");
			pre3.setString(4, "Gowda");
			pre3.setDate(5, new Date(1986 - 01 - 8));
			pre3.setInt(6, 45);
			pre3.setString(7, "Pushpa");
			pre3.setInt(8, 1954);
			pre3.setInt(9, 70);
			pre3.setString(10, "bangalore");
			pre3.setString(11, "bangalore");
			pre3.setString(12, "Karnataka");
			pre3.setString(13, "Dr.Rajkumar");
			pre3.setInt(14, 220);
			pre3.setInt(15, 50);
			pre3.setString(16, "yes");
			pre3.setInt(17, 10);
			pre3.setInt(18, 1);
			pre3.setDouble(19, 5.8);
			pre3.setString(20, "Challenging star");
			pre3.setInt(21, 50000000);
			pre3.setInt(22, 26);
			pre3.setString(23, "yes");
			pre3.setString(24, "radika");
			pre3.setString(25, "2");
			pre3.setString(26, "Kannada");
			pre3.setString(27, "Bulbul");
			pre3.setString(28, "no");
			pre3.setString(29, "Kurukshetra");
			pre3.setString(30, "Navagraha");
			pre3.setLong(31, 7056575652l);
			pre3.setString(32, "Boovanahalli, Hassan");
			pre3.setString(33, "Dr.rajkumar");

			int rowschanged3 = pre3.executeUpdate();
			System.out.println(rowschanged3);

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
