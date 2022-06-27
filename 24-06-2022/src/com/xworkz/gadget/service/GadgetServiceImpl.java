package com.xworkz.gadget.service;

import java.time.LocalDate;

import com.xworkz.gadget.dao.GadgetDAO;
import com.xworkz.gadget.dto.GadgetDTO;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class GadgetServiceImpl implements GadgetService {
	private GadgetDAO dao;

	@Override
	public boolean validateAndSave(GadgetDTO dto) {

		if (dto != null) {
			int id = dto.getId();
			String name = dto.getName();
			String type = dto.getType();
			double price = dto.getPrice();
			String manufacturer = dto.getManufacturer();
			LocalDate manufactureDate = dto.getManufactureDate();
			int warrantyPeriod = dto.getWarrantyPeriod();
			double rating = dto.getRating();
			boolean isi = dto.isIsi();
			double serialNo = dto.getSerialNo();
			String createdBy = dto.getCreatedBy();
			LocalDate createdDate = dto.getCreatedDate();
			String updatedBy = dto.getUpdatedBy();
			LocalDate updatedDate = dto.getUpdatedDate();

			if (id > 0) {
				System.out.println("id is valid");
			} else {
				System.out.println("id is Invalid");

			}
			if (name != null && !name.matches(".*[0-9,!@#$%^&*()_+{}><.;,<>].*") && name.length() >= 2
					&& name.length() < 30) {
				System.out.println("name is valid");
			} else {
				System.out.println("name is invalid");

			}
			if (type != null && !type.matches(".*[0-9,!@#$%^&*()_+{}><.;,<>].*") && type.length() >= 2
					&& type.length() < 30) {
				System.out.println("type is valid");
			} else {
				System.out.println("name is invalid");

			}
			if (price > 0) {
				System.out.println("price is valid");
			} else {
				System.out.println("name is invalid");

			}
			if (manufacturer != null && !manufacturer.matches(".*[0-9,!@#$%^&*()_+{}><.;,<>].*")
					&& manufacturer.length() > 3 && manufacturer.length() < 30) {
				System.out.println("manufacturer is valid");
			} else {
				System.out.println("name is invalid");
			}
			if (manufactureDate != null) {
				System.out.println("manufactureDate is valid");
			} else {
				System.out.println("name is invalid");
			}
			if (warrantyPeriod > 0) {
				System.out.println("warrantyPeriod is valid");
			} else {
				System.out.println("name is invalid");
			}
			if (rating > 0 && rating < 6) {
				System.out.println("rating is valid");
			} else {
				System.out.println("name is invalid");
			}
			if (serialNo > 0) {
				System.out.println("serialNo is valid ");
			} else {
				System.out.println("name is invalid");
			}
			if (createdBy != null && !createdBy.matches(".*[0-9,!@#$%^&*()_+{}><.;,<>].*") && createdBy.length() > 3
					&& createdBy.length() < 30) {
				System.out.println("createdBy is valid");
			} else {
				System.out.println("name is invalid");
			}
			if (createdDate != null) {
				System.out.println("createdDate is valid");
			} else {
				System.out.println("name is invalid");
			}
			if (updatedBy != null && !updatedBy.matches(".*[0-9,!@#$%^&*()_+{}><.;,<>].*") && updatedBy.length() > 3
					&& updatedBy.length() < 30) {
				System.out.println("updatedBy is valid");
			} else {
				System.out.println("name is invalid");
			}
			if (updatedDate != null) {
				System.out.println("updatedDate is valid");
			} else {
				System.out.println("name is invalid");
			}

		}

		return dao.save(dto);
	}

	@Override
	public GadgetDTO findById(int id) {
		if (id > 0) {
			System.out.println("id is valid");
		} else {
			System.out.println("id is invalid");
		}

		return this.dao.findById(id);
	}
}
