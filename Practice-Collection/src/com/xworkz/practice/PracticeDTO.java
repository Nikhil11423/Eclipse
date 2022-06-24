package com.xworkz.practice;

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
public class PracticeDTO implements Serializable { //Comparable<PracticeDTO> {
	
	
	private String name;
	private Double price;
	private double rating;
	private String location;
	private int number;
	private String dist;
	private String state;
	
	/*@Override
	public int compareTo(PracticeDTO o) {
		if(o!=null && o.getName()!=null) {
	}
		return this.name.compareTo(o.getName());
	}*/
	
}
