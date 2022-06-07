package com.xworkz.dto;

import com.xworkz.newspaper.constants.Lang;
import com.xworkz.newspaper.constants.Type;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class NewsPaperDTO implements Comparable<NewsPaperDTO> {
	private Integer id;
	private String name;
	private Double price;
	private Lang lang;
	private Type type;

	@Override
	public int compareTo(NewsPaperDTO o) {
		if (o != null && o.getName() != null) {
		}
		return this.name.compareTo(o.getName());
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
			NewsPaperDTO other = (NewsPaperDTO) obj;
			if (this.name.equals(other.name)) {
				return true;
			}

		}
		return false;
	}

}
