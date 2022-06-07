package com.xworkz.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SkyWalkDTO implements Comparable<SkyWalkDTO> {

	private Integer id;
	private String name;
	private String location;
	private Double reviews;

	@Override
	public int compareTo(SkyWalkDTO o) {
		if (o != null && o.getName() != null) {
		}
		return this.name.compareTo(o.getName());
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("calling equlas method");
		if (obj != null) {
			SkyWalkDTO other = (SkyWalkDTO) obj;
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
		System.out.println("hash code 54");
		return 54;
	}

}

