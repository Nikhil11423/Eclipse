package com.xworkz.resort.dto;

import java.time.LocalDate;
import java.time.LocalTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResortDTO {
		
	private int id;
	private String name;
	private String ownerName;
	private String  location;
	private double price;
	private double rating;
	private LocalDate updateDate;
	private String country;
	private boolean pub;
	private boolean kidsClub;
	private LocalTime checkInTime;
	private LocalTime checkOutTime;
	private int noOfCooks;
	private String receptionistName;
	private int cottages;
	private LocalDate createDate;
	private String createBy;
	private String updatedBy;
	private int securityGuards;
	private boolean swimmingPool;
	private int ccTv;
	private int noOfDogs;
	private String city;
	private String taluk;
	private String dist;
	private String state;
	private long contactNo;
	private String emailId;
	private String onlineBooking;
	private boolean ayurvedaCentre;
	private int noRooms;
	private int totalStaff;
	private boolean Wifi;
	private boolean safePractices;
	private String managerName;
	private int noOfTree;
	private LocalTime breakFast;
	private boolean lucnch;
	private boolean dinner;
	private boolean gym;
	private boolean trekking;
	private double oneBedRoomPrice;
	private double twoBedRoomPrice;

}
