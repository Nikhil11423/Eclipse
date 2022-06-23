package com.xworkz.dog.dao;

import static com.xworkz.dog.constants.JDBCProperties.*;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.dog.dto.DogDTO;


public class DogDAOImpl implements DogDAO {
	
   private DogDTO dtos=new DogDTO();
	
   @Override
	public boolean Save(DogDTO dogDTO) {
	   
	   String sql = "INSERT INTO dog VALUES(?,?,?,?,?,?,?,?,?)";
		try (Connection connection = DriverManager.getConnection(URL.getValue(), USERNAME.getValue(),SECRETS.getValue())) {

			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, dogDTO.getId());
			preparedStatement.setString(2, dogDTO.getName());
			preparedStatement.setString(3, dogDTO.getBreed());
			preparedStatement.setString(4, dogDTO.getColor());	
			preparedStatement.setDouble(5, dogDTO.getPrice());
			preparedStatement.setDouble(6, dogDTO.getHeight());
			preparedStatement.setDouble(7, dogDTO.getWeight());
			preparedStatement.setString(8, dogDTO.getGender().toString());
			preparedStatement.setDate(9, Date.valueOf(dogDTO.getBirthDate()));

			int row = preparedStatement.executeUpdate();
			System.out.println(row);
			return row == 1 ? true : false;

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;

	}

}

			