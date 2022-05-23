package com.xworkz.api.dto;

import java.io.Serializable;

import com.xworkz.api.constants.BiryaniType;
import com.xworkz.api.constants.Quantity;

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
public class BiryaniDTO implements Serializable {

	private BiryaniType type;
	private Double price;
	private Quantity quantity;
	private String[] ingredients;
	private String color;
	private boolean kushka, veg;
}
