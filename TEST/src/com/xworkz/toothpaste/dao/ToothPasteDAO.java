package com.xworkz.toothpaste.dao;

import com.xworkz.toothpaste.dto.ToothPasteDTO;
import com.xworkz.toothpaste.exceptions.MemoryIsFullException;

public class ToothPasteDAO {
	private ToothPasteDTO[] toothPasteDTO = new ToothPasteDTO[5];
	private int index;

	public boolean save(ToothPasteDTO dto) {
		if (this.index < this.toothPasteDTO.length) {
			this.toothPasteDTO[index] = dto;
			System.out.println("Toothpaste is added");
			this.index++;
			return true;
		} else {
			System.err.println("ToothPaste is not added");
			MemoryIsFullException memoryIsFullException = new MemoryIsFullException(
					"Memory Space available is only " + this.toothPasteDTO.length);
			throw memoryIsFullException;

		}

	}

}
