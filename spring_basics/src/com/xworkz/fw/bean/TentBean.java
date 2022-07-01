package com.xworkz.fw.bean;

public class TentBean {
	
	private String name;
	private Double price;
	private String color;
	
	
	public TentBean(String name) {
		this.name=name;
	}
	
	public TentBean(Double price) {
		this.price=price;		
	}
	
	
	public TentBean(String name,Double price) {
		this.name=name;
		this.price=price;
		
	}
	public TentBean(String name,String color) {
		this.name=name;
		this.color=color;
		
	}
	public TentBean(Double price,String color) {
		this.price=price;
		this.color=color;
		
	}
	public TentBean(String name,Double price,String color) {
		this.name=name;
		this.price=price;
		this.color=color;
		
	}
	public TentBean(String color,String name,Double price) {
		this.color=color;
		this.name=name;
		this.price=price;
	
		
	}
	public TentBean(Double price,String color,String name) {
		this.price=price;
		this.color=color;
		this.name=name;
		
	}

	public String getName() {
		return name;
	}

	public Double getPrice() {
		return price;
	}

	public String getColor() {
		return color;
	}
	     
	

}
