package com.xworkz.person.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class AddressDTO implements Comparable<AddressDTO>{
	
	private Integer id;
	private String  street;
	private String doorNo;
	private String city;
	@Override
	public int compareTo(AddressDTO o) {
		if(o!=null && o.getId()!=null) {
			
		}
		return this.id.compareTo(o.getId() );
	}
	
		
	}
