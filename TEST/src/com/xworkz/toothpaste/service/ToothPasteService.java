package com.xworkz.toothpaste.service;

import com.xworkz.toothpaste.dao.ToothPasteDAO;
import com.xworkz.toothpaste.dto.ToothPasteDTO;
import com.xworkz.toothpaste.exceptions.MemoryIsFullException;

public class ToothPasteService {

	private ToothPasteDAO toothPaste = new ToothPasteDAO();

	public boolean validateAndSave(ToothPasteDTO dto) throws MemoryIsFullException{
		if (dto != null) {
			System.out.println("ToothPaste is valid and save");
			boolean saved = toothPaste.save(dto);
			System.out.println(saved);
			return true;
		} else {
			System.err.println("toothpaste is not valid");
			MemoryIsFullException paste =new MemoryIsFullException("please extend the space");
			throw paste;
			
		}
		
	}

}
