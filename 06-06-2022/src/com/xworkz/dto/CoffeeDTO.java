package com.xworkz.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CoffeeDTO implements Comparable<CoffeeDTO>{
	  
	private Integer id;
	private String name;
	private Double price;
	private float qunatity;
	private Double quality;
	
	
	@Override
	public int compareTo(CoffeeDTO o) {
		if(o!=null && o.getName()!=null) {
			return this.name.compareTo(getName());
			
		}
		throw new IllegalArgumentException();
	} 

	@Override
	public int hashCode() {
		System.out.println("calling hash code");
		int hash = super.hashCode();
		System.out.println("hash code " + hash);
		System.out.println("hash code 100");
		return 100;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("calling equlas method");
		if (obj != null) {
			CoffeeDTO other = (CoffeeDTO) obj;
			if (this.name.equals(other.name)) {
				return true;
			}

		}
		return false;
	}

}
