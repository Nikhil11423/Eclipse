package com.xworkz.order.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class ProductDTO implements Serializable {

	private Integer id;
	private String name;
	private String company;
	private Double quantity;
	private Double price;
	private Float quality;

}
