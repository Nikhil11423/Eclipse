package com.xworkz.resort.dao;

import static com.xworkz.resort.constatns.JDBCProperties.SECRETS;
import static com.xworkz.resort.constatns.JDBCProperties.URL;
import static com.xworkz.resort.constatns.JDBCProperties.USERNAME;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.time.LocalTime;

import com.xworkz.resort.dto.ResortDTO;

public class ResortDAOImpl implements ResortDAO {

	@Override
	public boolean save(ResortDTO dto) {
		String sql ="insert into resort values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		
		try (Connection connection = DriverManager.getConnection(URL.getValue(), USERNAME.getValue(),
				SECRETS.getValue())) {
			PreparedStatement preparedStatement = extracted(dto, sql, connection);

			
			int rows =preparedStatement.executeUpdate();
			System.out.println(rows);
			
			return  rows == 1 ? true : false;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;

	}


	private PreparedStatement extracted(ResortDTO dto, String sql, Connection connection) throws SQLException {
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setInt(1,dto.getId());
		preparedStatement.setString(2,dto.getName());
		preparedStatement.setString(3,dto.getOwnerName());
		preparedStatement.setString(4,dto.getLocation());
		preparedStatement.setDouble(5,dto.getPrice());
		preparedStatement.setDouble(6,dto.getRating());
		preparedStatement.setDate(7,Date.valueOf(dto.getUpdateDate()));
		preparedStatement.setString(8,dto.getCountry());
		preparedStatement.setBoolean(9,dto.isPub());
		preparedStatement.setBoolean(10,dto.isKidsClub());
		preparedStatement.setTime(11,Time.valueOf(dto.getCheckInTime()));
		preparedStatement.setTime(12,Time.valueOf(dto.getCheckOutTime()));
		preparedStatement.setInt(13,dto.getNoOfCooks());
		preparedStatement.setString(14,dto.getReceptionistName());
		preparedStatement.setInt(15,dto.getCottages());
		preparedStatement.setDate(16,Date.valueOf(dto.getUpdateDate()));
		preparedStatement.setString(17,dto.getCreateBy());
		preparedStatement.setString(18,dto.getUpdatedBy());
		preparedStatement.setInt(19,dto.getSecurityGuards());
		preparedStatement.setBoolean(20,dto.isSwimmingPool());
		preparedStatement.setInt(21,dto.getCcTv());
		preparedStatement.setInt(22,dto.getNoOfDogs());
		preparedStatement.setString(23,dto.getCity());
		preparedStatement.setString(24,dto.getTaluk());
		preparedStatement.setString(25,dto.getDist());
		preparedStatement.setString(26,dto.getState());
		preparedStatement.setLong(27,dto.getContactNo());
		preparedStatement.setString(28,dto.getEmailId());
		preparedStatement.setString(29,dto.getOnlineBooking());
		preparedStatement.setBoolean(30,dto.isAyurvedaCentre());
		preparedStatement.setInt(31,dto.getNoRooms());
		preparedStatement.setInt(32,dto.getTotalStaff());
		preparedStatement.setBoolean(33,dto.isWifi());
		preparedStatement.setBoolean(34,dto.isSafePractices());
		preparedStatement.setString(35,dto.getManagerName());
		preparedStatement.setInt(36,dto.getNoOfTree());
		preparedStatement.setTime(37,Time.valueOf(dto.getBreakFast()));
		preparedStatement.setBoolean(38,dto.isLucnch());
		preparedStatement.setBoolean(39,dto.isDinner());
		preparedStatement.setBoolean(40,dto.isGym());
		preparedStatement.setBoolean(41,dto.isTrekking());
		preparedStatement.setDouble(42,dto.getOneBedRoomPrice());
		preparedStatement.setDouble(43,dto.getTwoBedRoomPrice());
		return preparedStatement;
	}
			

	@Override
	public void updatePriceByName(String name, double price) {

		String sql = "update resort set price=? where name=? ";

		try (Connection connection = DriverManager.getConnection(URL.getValue(), USERNAME.getValue(),
				SECRETS.getValue())) {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setDouble(1, price);
			preparedStatement.setString(2, name);

			int rowsUpdated = preparedStatement.executeUpdate();
			System.out.println(rowsUpdated);
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void updatePriceAndRatingByName(String name, int rating, double price) {
		String sql = "update resort set price=?,rating=? where name=? ";

		try (Connection connection = DriverManager.getConnection(URL.getValue(), USERNAME.getValue(),
				SECRETS.getValue())) {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setDouble(1, price);
			preparedStatement.setDouble(2, rating);
			preparedStatement.setString(3, name);

			int rowsUpdated = preparedStatement.executeUpdate();
			System.out.println(rowsUpdated);
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void updateReceptionistNameByid(String ReceptionistName, int id) {
		String sql = "update resort set ReceptionistName=? where id=? ";

		try (Connection connection = DriverManager.getConnection(URL.getValue(), USERNAME.getValue(),
				SECRETS.getValue())) {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, ReceptionistName);
			preparedStatement.setInt(2, id);

			int rowsUpdated = preparedStatement.executeUpdate();
			System.out.println(rowsUpdated);
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public ResortDTO getByid(int id) {

		String sql = "select * from resort where id=?";

		try (Connection connection = DriverManager.getConnection(URL.getValue(), USERNAME.getValue(),
				SECRETS.getValue())) {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
								
				return extracted(resultSet);
			
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;

	}

	@Override
	public ResortDTO getByName(String name) {
		String sql = "select * from resort where name=?";

		try (Connection connection = DriverManager.getConnection(URL.getValue(), USERNAME.getValue(),
				SECRETS.getValue())) {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, name);
			ResultSet resultSet = preparedStatement.executeQuery();
			// System.out.println( resultSet);
			while (resultSet.next()) {
				return extracted(resultSet);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public ResortDTO getByNameAndLocation(String name, String location) {
		String sql = "select * from resort where name=? and location=? ";

		try (Connection connection = DriverManager.getConnection(URL.getValue(), USERNAME.getValue(),
				SECRETS.getValue())) {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, name);
			preparedStatement.setString(2, location);

			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {

				return extracted(resultSet);

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	private ResortDTO extracted(ResultSet resultSet) throws SQLException {
		ResortDTO dto = new ResortDTO();

		dto.setId(resultSet.getInt(1));
		dto.setName(resultSet.getString(2));
		dto.setOwnerName(resultSet.getString(3));
		dto.setLocation(resultSet.getString(4));
		dto.setPrice(resultSet.getDouble(5));
		dto.setRating(resultSet.getDouble(6));
		Date UpdateDate = resultSet.getDate(7);
		dto.setUpdateDate(UpdateDate.toLocalDate());
		dto.setCountry(resultSet.getString(8));
		dto.setPub(resultSet.getBoolean(9));
		dto.setKidsClub(resultSet.getBoolean(10));

		Time checkInTime = resultSet.getTime(11);
		dto.setCheckInTime(checkInTime.toLocalTime());

		Time checkOutTime = resultSet.getTime(12);
		dto.setCheckOutTime(checkOutTime.toLocalTime());
		dto.setNoOfCooks(resultSet.getInt(13));
		dto.setReceptionistName(resultSet.getString(14));
		dto.setCottages(resultSet.getInt(15));
		Date CreateDate = resultSet.getDate(16);
		dto.setCreateDate(CreateDate.toLocalDate());
		dto.setCreateBy(resultSet.getString(17));
		dto.setUpdatedBy(resultSet.getString(18));
		dto.setSecurityGuards(resultSet.getInt(19));
		dto.setSwimmingPool(resultSet.getBoolean(20));
		dto.setCcTv(resultSet.getInt(21));
		dto.setNoOfDogs(resultSet.getInt(22));
		dto.setCity(resultSet.getString(23));
		dto.setTaluk(resultSet.getString(24));
		dto.setDist(resultSet.getString(25));
		dto.setState(resultSet.getString(26));
		dto.setContactNo(resultSet.getLong(27));
		dto.setEmailId(resultSet.getString(28));
		dto.setOnlineBooking(resultSet.getString(29));
		dto.setAyurvedaCentre(resultSet.getBoolean(30));
		dto.setNoRooms(resultSet.getInt(31));
		dto.setTotalStaff(resultSet.getInt(32));
		dto.setWifi(resultSet.getBoolean(33));
		dto.setSafePractices(resultSet.getBoolean(34));
		dto.setManagerName(resultSet.getString(35));
		dto.setNoOfTree(resultSet.getInt(36));
		Time time = resultSet.getTime(37);
		dto.setBreakFast(time.toLocalTime());
		dto.setLucnch(resultSet.getBoolean(38));
		dto.setDinner(resultSet.getBoolean(39));
		dto.setGym(resultSet.getBoolean(40));
		dto.setTrekking(resultSet.getBoolean(41));
		dto.setOneBedRoomPrice(resultSet.getDouble(42));
		//dto.setTwoBedRoomPrice(resultSet.getString(43));
		return dto;
	}

	@Override
	public ResortDTO getByNameAndLocationAndOwnerName(String name, String location, String ownerName) {
		String sql = "select * from resort where name=? and location=? and ownerName=? ";

		try (Connection connection = DriverManager.getConnection(URL.getValue(), USERNAME.getValue(),
				SECRETS.getValue())) {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, name);
			preparedStatement.setString(2, location);
			preparedStatement.setString(3, ownerName);

			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {

				return extracted(resultSet);			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public LocalTime getCheckInTimeByName(String name)
	{
		String sql= "Select checkInTime From resort where name=?";
		try (Connection connection = DriverManager.getConnection(URL.getValue(), USERNAME.getValue(),
				SECRETS.getValue())) {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, name);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {

				Time entrytime =resultSet.getTime(1);
				LocalTime time =entrytime.toLocalTime();
				
				return time;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		
		return null;
	}

	@Override
	public int getTotalRows() {
		String country = "select  count(*) from resort";

		try (Connection connection = DriverManager.getConnection(URL.getValue(), USERNAME.getValue(),
				SECRETS.getValue())) {

			PreparedStatement prepareStatement = connection.prepareStatement(country);

			ResultSet resultSet = prepareStatement.executeQuery();
			while (resultSet.next()) {
				int iss=resultSet.getInt(1);
				System.out.println(iss);
				}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	return 0;
	}

	@Override
	public ResortDTO getByMaxPrice() {
		String max = "select * from resort where price =(select max(price) from resort)";

		try (Connection connection = DriverManager.getConnection(URL.getValue(), USERNAME.getValue(),
				SECRETS.getValue())) {

			PreparedStatement prepareStatement = connection.prepareStatement(max);

			ResultSet resultSet = prepareStatement.executeQuery();
			while (resultSet.next()) {
				return extracted(resultSet);
							}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public ResortDTO getByMinPrice() {
		String min = "select * from resort where price=(select min(price)from resort)";

		try (Connection connection = DriverManager.getConnection(URL.getValue(), USERNAME.getValue(),
				SECRETS.getValue())) {

			PreparedStatement prepareStatement = connection.prepareStatement(min);

			ResultSet resultSet = prepareStatement.executeQuery();
			while (resultSet.next()) {
			
				return extracted(resultSet);			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
		
	}
}
