package com.xworkz.bike.functions;

public abstract class AbstractBike {

	private String name;
	private Integer price;
	private Integer speed;
	private Integer gear;

	public AbstractBike(Integer speed, Integer gear) {
		super();
		this.speed = speed;
		this.gear = gear;
	}

	public void bikeModels(String name, Integer price) {
		this.name = name;
		this.price = price;
	}
	
	public abstract void setSpeed();

	public abstract void setGear();

	public void bikeRiding() {
		System.out.println("running the bikeRiding");
	}

	public void bikeAccident() {
		System.out.println("runinng the bikeAccident");
	}

	public void saveTime() {
		System.out.println("running to the savetime");
	}

	public String getName() {
		return name;
	}

	public Integer getPrice() {
		return price;
	}

	public Integer getSpeed() {
		return speed;
	}

	public Integer getGear() {
		return gear;
	}

}
