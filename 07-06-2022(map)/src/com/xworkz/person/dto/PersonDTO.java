package com.xworkz.person.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PersonDTO implements Comparable<PersonDTO>{

	
	private Integer id;
	private String name;
	private String email;
	private Double mobileNo;
	@Override
	public int compareTo(PersonDTO o) {
	if(o!=null && o.getName()!=null) {
		return o.getName().compareTo(this.name);
	}
	else {
		throw new IllegalArgumentException();
	}
	
	}
}
