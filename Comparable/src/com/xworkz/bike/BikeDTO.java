package com.xworkz.bike;

import com.xworkz.bike.constants.Type;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BikeDTO implements Comparable<BikeDTO>{
	
	private String name;
	private String color;
	private Double modelNo;
	private Double price;
	private Type type;
	
	@Override
	public int compareTo(BikeDTO o) {
		if(o!=null && o.getName()!=null) {
		}
		return this.name.compareTo(o.getName());
	

	}
	

	

}
