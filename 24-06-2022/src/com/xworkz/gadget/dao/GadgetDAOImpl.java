package com.xworkz.gadget.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static com.xworkz.gadget.constants.JDBC.*;
import com.xworkz.gadget.dto.GadgetDTO;

public class GadgetDAOImpl implements GadgetDAO {

	@Override
	public boolean save(GadgetDTO dto) {

		String sql = "INSERT INTO gadget VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

		try (Connection connection = DriverManager.getConnection(URL.getValue(), USERNAME.getValue(),
				SECRETS.getValue())) {

			PreparedStatement prepar = connection.prepareStatement(sql);
			prepar.setInt(1, dto.getId());
			prepar.setString(2, dto.getName());
			prepar.setString(3, dto.getType());
			prepar.setDouble(4, dto.getPrice());
			prepar.setString(5, dto.getManufacturer());
			prepar.setDate(6, Date.valueOf(dto.getManufactureDate()));
			prepar.setInt(7, dto.getWarrantyPeriod());
			prepar.setDouble(8, dto.getRating());
			prepar.setBoolean(9, dto.isIsi());
			prepar.setDouble(10, dto.getSerialNo());
			prepar.setString(11, dto.getCreatedBy());
			prepar.setDate(12, Date.valueOf(dto.getCreatedDate()));
			prepar.setString(13, dto.getUpdatedBy());
			prepar.setDate(14, Date.valueOf(dto.getUpdatedDate()));
			int row = prepar.executeUpdate();
			System.out.println(row);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return false;

	}

	@Override
	public GadgetDTO findById(int id) {

		String sql = "SELECT*FROM gadget WHERE ID=?";

		try (Connection connection = DriverManager.getConnection(URL.getValue(), USERNAME.getValue(),
				SECRETS.getValue())) {

			PreparedStatement prepar = connection.prepareStatement(sql);
			prepar.setInt(1, id);

			ResultSet result = prepar.executeQuery();
			while (result.next()) {
				GadgetDTO dto = new GadgetDTO();
				dto.setId(result.getInt(1));
				dto.setName(result.getString(2));
				dto.setType(result.getString(3));
				dto.setPrice(result.getDouble(4));
				dto.setManufacturer(result.getString(5));
				Date manDate = result.getDate(6);
				dto.setManufactureDate(manDate.toLocalDate());
				dto.setWarrantyPeriod(result.getInt(7));
				dto.setRating(result.getDouble(8));
				dto.setIsi(result.getBoolean(9));
				dto.setSerialNo(result.getDouble(10));
				dto.setCreatedBy(result.getString(11));
				Date createdDate = result.getDate(12);
				dto.setCreatedDate(createdDate.toLocalDate());
				dto.setUpdatedBy(result.getString(13));
				Date updatedDate = result.getDate(14);
				dto.setCreatedDate(updatedDate.toLocalDate());

				return dto;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;
	}
}
