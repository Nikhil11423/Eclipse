package com.xworkz.dog.dao;

import static com.xworkz.dog.constants.JDBCProperties.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.dog.dto.DogDTO;


public class DogDAOImpl implements DogDAO {
	
   private DogDTO dtos=new DogDTO();
	
   @Override
	public boolean Save(DogDTO dogDTO) {
	   
	   
		try (Connection connection = DriverManager.getConnection(URL.getValue(), USERNAME.getValue(),SECRETS.getValue())) {
			String jdbc = "INSERT INTO dog VALUES(?,?,?,?,?,?,?,?,?)";
			PreparedStatement preparedStatement = connection.prepareStatement(jdbc);
			preparedStatement.setInt(1, dogDTO.getId());
			preparedStatement.setString(2, dogDTO.getBreed());
			preparedStatement.setString(3, dogDTO.getColor());	
			preparedStatement.setString(5, dogDTO.getName());
			preparedStatement.setDouble(4, dogDTO.getPrice());
			preparedStatement.setDouble(6, dogDTO.getHeight());
			preparedStatement.setDouble(7, dogDTO.getWeight());
			preparedStatement.setString(8, dogDTO.getGender().toString());
			preparedStatement.setDouble(9, dogDTO.getBirthDate().toEpochDay());

			int row = preparedStatement.executeUpdate();
			System.out.println(row);
			return row == 1 ? true : false;

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return false;
	}

}

			