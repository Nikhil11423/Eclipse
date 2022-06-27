package com.xworkz.gadget.dto;

import java.io.Serializable;
import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GadgetDTO implements Serializable {

	private int id;
	private String name;
	private String type;
	private double price;
	private String manufacturer;
	private LocalDate manufactureDate;
	private int warrantyPeriod;
	private double rating;
	private boolean isi;
	private double serialNo;
	private String createdBy;
	private LocalDate createdDate;
	private String updatedBy;
	private LocalDate UpdatedDate;

}
