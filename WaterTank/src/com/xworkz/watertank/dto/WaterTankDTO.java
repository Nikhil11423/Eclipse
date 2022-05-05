package com.xworkz.watertank.dto;

import java.io.Serializable;

public class WaterTankDTO implements Serializable {

	private String brand;
	private String color;
	private Double price;
	private Integer capacity;
	private Integer warrantyPeriod;

	public WaterTankDTO() {

		System.out.println("running a water tank DTO no argument const");

	}
    @Override
	public String toString() {
		return this.brand;
	}

	public String getBrand() {
		return this.brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getCapacity() {
		return capacity;
	}

	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
	}

	public Integer getWarrantyPeriod() {
		return warrantyPeriod;
	}

	public void setWarrantyPeriod(Integer warrantyPeriod) {
		this.warrantyPeriod = warrantyPeriod;
	}

}
