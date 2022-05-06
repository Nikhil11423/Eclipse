package com.xworkz.furniture.dto;

import java.io.Serializable;

import com.xworkz.furniture.constants.Material;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

public class FurnitureDTO implements Serializable {

	private Integer id;
	private String name;
	private Integer price;
	private String barnd;
	private Double weight;
	private Material material;

}
