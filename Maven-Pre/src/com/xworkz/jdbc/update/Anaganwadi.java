package com.xworkz.jdbc.update;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.jdbc.update.constants.JdbcProperties;

import static com.xworkz.jdbc.update.constants.JdbcProperties.*;



public class Anaganwadi {

	public static void main(String[] args) {

		
		try(Connection connection = DriverManager.getConnection(JdbcProperties.URL.getValue(),JdbcProperties.USERNAME.getValue(),JdbcProperties.SECRETS.getValue())){
			
			System.out.println(connection);
			
			String sql = "insert into anganwadi values(?,?,?,?,?)";

			PreparedStatement prepared = connection.prepareStatement(sql);
			
			prepared.setInt(1, 24);
			prepared.setString(2,"Bedk");
			prepared.setInt(3, 30);
			prepared.setBoolean(4, false);
			prepared.setString(5, "Laxmi");
			int rowAffected = prepared.executeUpdate();
			System.out.println(rowAffected);


			
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
