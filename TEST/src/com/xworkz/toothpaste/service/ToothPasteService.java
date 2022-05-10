package com.xworkz.toothpaste.service;

import com.xworkz.toothpaste.dao.ToothPasteDAO;
import com.xworkz.toothpaste.dto.ToothPasteDTO;

public class ToothPasteService {

	private ToothPasteDAO toothPaste = new ToothPasteDAO();

	public boolean validateAndSave(ToothPasteDTO dto) {
		if (dto != null) {
			System.out.println("ToothPaste is valid and save");
			boolean saved = toothPaste.save(dto);
			System.out.println(saved);
			return true;
		} else {
			System.out.println("toothpaste is not valid");
		}
		return false;
	}

}
