package com.xworkz.fw.bean;

public class VillageBean {
	
	private String name;
	private int noOfHouse;
	private int totalPeople;
	private String talukOfVillage;
	private String districOfVillage;

	public VillageBean() {
		System.out.println("calling " + getClass().getSimpleName());
	}

	public VillageBean(String name, int noOfHouse) {
		this.name = name;
		this.noOfHouse = noOfHouse;
	}

	public VillageBean(String name, int noOfHouse, int totalPeople) {
		this.name = name;
		this.noOfHouse = noOfHouse;
		this.totalPeople = totalPeople;
	}

	public VillageBean(String name, int noOfHouse, int totalPeople, String talukOfVillage) {
		this.name = name;
		this.noOfHouse = noOfHouse;
		this.totalPeople = totalPeople;
		this.talukOfVillage = talukOfVillage;
	}

	public VillageBean(String name, int noOfHouse, int totalPeople, String talukOfVillage, String districOfVillage) {
		this.name = name;
		this.noOfHouse = noOfHouse;
		this.totalPeople = totalPeople;
		this.talukOfVillage = talukOfVillage;
		this.districOfVillage = districOfVillage;
	}

	public String getName() {
		return name;
	}

	public int getNoOfHouse() {
		return noOfHouse;
	}

	public int getTotalPeople() {
		return totalPeople;
	}

	public String getTalukOfVillage() {
		return talukOfVillage;
	}

	public String getDistricOfVillage() {
		return districOfVillage;
	}
	

}