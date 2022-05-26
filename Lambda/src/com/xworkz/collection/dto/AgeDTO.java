package com.xworkz.collection.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class AgeDTO implements Serializable {
 
	private String name;
	private Integer age;
	public int compareTo(AgeDTO a1) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
