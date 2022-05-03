package com.xworkz.cake.dto;

import java.io.Serializable;

public class CakeDTO implements Serializable {

	private Integer id;
	private Integer quantity;
	private Double price;
	private Flavour flavour;
	private Shape Shape;
	private Type type;

	

	public CakeDTO() {

		System.out.println("cake is ready");

	}

	@Override
	public String toString() {
		return "Cake[id=" + id + ",quantity=" + quantity + ",flavour=" + flavour + ",shape=" + Shape + ",type="+ type  +"]";

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public  Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Flavour getFlavour() {
		return flavour;
	}

	public void setFlavour(Flavour flavour) {
		this.flavour = flavour;
	}

	public Shape getShape() {
		return Shape;
	}

	public void setShape(Shape shape) {
		Shape = shape;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	}
