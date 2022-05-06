package com.xworkz.furniture.dao;

import com.xworkz.furniture.dto.FurnitureDTO;
import com.xworkz.furniture.exceptions.MemoryIsFullException;

public class FurnitureDAO {

	private FurnitureDTO[] furnituredto = new FurnitureDTO[5];
	private int index;

	public boolean save(FurnitureDTO dto) {
		if (this.index < this.furnituredto.length) {
			this.furnituredto[index] = dto;
			System.out.println("furniture is added");
			this.index++;
			return true;
		} else {
			System.out.println("furniture is not added");
			MemoryIsFullException memoryIsFullException = new MemoryIsFullException(
					"Memory Space available is only " + this.furnituredto.length);
			throw memoryIsFullException;
		}

	}
}
