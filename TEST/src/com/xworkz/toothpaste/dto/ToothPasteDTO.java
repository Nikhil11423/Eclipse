package com.xworkz.toothpaste.dto;

import java.io.Serializable;
import java.time.LocalDate;

import com.xworkz.toothpaste.constants.Color;
import com.xworkz.toothpaste.constants.QuantityInGms;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

public class ToothPasteDTO implements Serializable {

	private Integer id;
	private String brand;
	private Color color;
	private String mainIngradient;
	private LocalDate mfgDate;
	private LocalDate expiryDate;
	private Double price;
	private QuantityInGms quantityInGms;

	public ToothPasteDTO() 
	{
		System.out.println("Use ToothPaste");
	}

	@Override
	public int hashCode() 
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((quantityInGms == null) ? 0 : quantityInGms.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ToothPasteDTO other = (ToothPasteDTO) obj;
		if (brand == null) {
			if (other.brand != null)
				return false;
		} else if (!brand.equals(other.brand))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (quantityInGms != other.quantityInGms)
			return false;
		return true;
	}

}
