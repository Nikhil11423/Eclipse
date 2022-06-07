package com.xworkz.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrgansDTO implements Comparable<OrgansDTO> {

	private Integer id;
	private String name;
	private String function;
	private Double price;
	private float weight;

	@Override
	public int compareTo(OrgansDTO o) {
		if (o != null) {
			return -1;
		}
		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("calling equlas method");
		if (obj != null) {
			OrgansDTO other = (OrgansDTO) obj;
			if (this.name.equals(other.name)) {
				return true;
			}

		}
		return false;
	}

	@Override
	public int hashCode() {
		System.out.println("calling hash code");
		int hash = super.hashCode();
		System.out.println("hash code " + hash);
		System.out.println("hash code 100");
		return 100;
	}

}
