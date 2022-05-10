package com.xworkz.toothpaste.toothpasterunner;

import java.time.LocalDate;

import com.xworkz.toothpaste.constants.Color;
import com.xworkz.toothpaste.constants.QuantityInGms;
import com.xworkz.toothpaste.dao.ToothPasteDAO;
import com.xworkz.toothpaste.dto.ToothPasteDTO;
import com.xworkz.toothpaste.service.ToothPasteService;

public class ToothPasteRunner {

	public static void main(String[] args) {

		ToothPasteDTO paste = new ToothPasteDTO();
		paste.setId(1);
		paste.setBrand("Colgate");
		paste.setColor(Color.RED_GEL);
		paste.setMainIngradient("Salt");
		paste.setMfgDate(LocalDate.of(2022, 5, 9));
		paste.setExpiryDate(LocalDate.of(2023, 5, 1));
		paste.setPrice(20d);
		paste.setQuantityInGms(QuantityInGms.FIFTY_GMS);

		ToothPasteDAO dao = new ToothPasteDAO();
		boolean save = dao.save(paste);
		System.out.println(paste);
		System.out.println("**********************************************");

		ToothPasteDTO paste1 = new ToothPasteDTO();
		paste1.setId(2);
		paste1.setBrand("Dabur");
		paste1.setColor(Color.BLUE_GEL);
		paste1.setMainIngradient("Lavanga_oil");
		paste1.setMfgDate(LocalDate.of(2022, 5, 9));
		paste1.setExpiryDate(LocalDate.of(2024, 5, 5));
		paste1.setPrice(40d);
		paste1.setQuantityInGms(QuantityInGms.HUNDRED_GMS);

		save = dao.save(paste);
		System.out.println(paste1);
		System.out.println("**********************************************");

		ToothPasteDTO paste2 = new ToothPasteDTO();
		paste2.setId(3);
		paste2.setBrand("CloseUp");
		paste2.setColor(Color.RED_GEL);
		paste2.setMainIngradient("Sodium Fluride");
		paste2.setMfgDate(LocalDate.of(2021, 8, 16));
		paste2.setExpiryDate(LocalDate.of(2022, 7, 30));
		paste2.setPrice(55d);
		paste2.setQuantityInGms(QuantityInGms.TWOHUNDRED_GMS);

		save = dao.save(paste);
		System.out.println(paste2);
		System.out.println("**********************************************");

		ToothPasteDTO paste3 = new ToothPasteDTO();
		paste3.setId(4);
		paste3.setBrand("Pepsodent");
		paste3.setColor(Color.BLUE_GEL);
		paste3.setMainIngradient("cellulose gum");
		paste3.setMfgDate(LocalDate.of(2020, 5, 9));
		paste3.setExpiryDate(LocalDate.of(2022, 5, 1));
		paste3.setPrice(80d);
		paste3.setQuantityInGms(QuantityInGms.TWOFIFTY_GMS);

		save = dao.save(paste);
		System.out.println(paste3);
		System.out.println("**********************************************");

		ToothPasteDTO paste4 = new ToothPasteDTO();
		paste4.setId(5);
		paste4.setBrand("Sensodyne");
		paste4.setColor(Color.WHITE_GEL);
		paste4.setMainIngradient("hydrated silica");
		paste4.setMfgDate(LocalDate.of(2022, 2, 28));
		paste4.setExpiryDate(LocalDate.of(2023, 1, 30));
		paste4.setPrice(120d);
		paste4.setQuantityInGms(QuantityInGms.FIVEHUNDRED_GMS);

		save = dao.save(paste);
		System.out.println(paste4);
		System.out.println("**********************************************");

		ToothPasteDTO paste5 = new ToothPasteDTO();
		paste5.setId(6);
		paste5.setBrand("Oral_B");
		paste5.setColor(Color.RED_GEL);
		paste5.setMainIngradient("");
		paste5.setMfgDate(LocalDate.of(2022, 10, 22));
		paste5.setExpiryDate(LocalDate.of(2023, 9, 22));
		paste5.setPrice(130d);
		paste5.setQuantityInGms(QuantityInGms.FIVEHUNDRED_GMS);

		// save = dao.save(paste);
		// System.out.println(paste);
		System.out.println("**********************************************");

		ToothPasteService service = new ToothPasteService();
		service.validateAndSave(paste);
		service.validateAndSave(paste1);
		service.validateAndSave(paste2);
		service.validateAndSave(paste3);
		service.validateAndSave(paste4);
		service.validateAndSave(paste5);

	}

}
