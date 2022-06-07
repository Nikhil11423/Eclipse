package com.xworkz.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode 
public class StarDTO implements Comparable<StarDTO>{
	
	private Integer id;
	private String name; 
	private Character typeOfSpecter;	
	private String color;
	private Double radius;
	
	
	@Override
	public int compareTo(StarDTO o) {
		if(o !=null) {
		return 1;
	}
		throw new  IllegalArgumentException();
	}
}
