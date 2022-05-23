package com.xworkz.customer.service;

import java.time.LocalDate;

import com.xworkz.customer.dao.CustomerDAO;
import com.xworkz.customer.dto.AddressDTO;
import com.xworkz.customer.dto.CustomerDTO;
import com.xworkz.customer.exception.InvalidDataException;
import com.xwrokz.customer.constants.Gender;

import lombok.AllArgsConstructor;
@AllArgsConstructor
public class CustomerServiceImpl implements CustomerService {

	private CustomerDAO dao;


	public boolean ValidateAndSave(CustomerDTO dto, AddressDTO add) throws InvalidDataException {
		if (dto != null) {
			Integer id = dto.getId();
			String name = dto.getName();
			String email = dto.getEmail();
			LocalDate dob = dto.getDob();
			Gender gender = dto.getGender();
			String occupation = dto.getOccupation();
			AddressDTO addressDTO = dto.getAddressDTO();
			Integer id1 = add.getId1();
			String street = add.getStreet();
			String city = add.getCity();
			Integer no = add.getNo();
			String landmark = add.getLandmark();

			if (no != null && no > 0) {
			} else {
				System.err.println("no is valid");
				throw new InvalidDataException("no is id");
			
			}
			
			if (street != null && street.length() > 3 && street.length() < 30 && !street.isEmpty()
					&& !street.matches(".[0-9~@#$%^&*()-+{}<>?].*")) {
			} else {
				System.err.println("street is invalid");
				throw new InvalidDataException("street Invalid ");

			}
			if (city != null && city.length() >= 3 && city.length() <= 30 && !city.isEmpty()
					&& !city.matches(".[0-9~@#$%^&*()-+{}<>?].*")) {
			} else {
				System.err.println("city is invalid");
				throw new InvalidDataException("city is Inavalid");
			}

			if (name != null && name.length() >= 3 && name.length() <= 30 && !name.isEmpty() && !name.matches(".[0-9~@#$%^&*()-+{}<>?].*")) {
			} else {
				System.err.println("name is invalid ");
				throw new InvalidDataException("Name is Invalid");
			}
		
				if (email != null && email.length() >= 3 && name.length() <= 30 && !email.isEmpty() && !email.matches(".[0-9~@#$%^&*()-+{}<>?].*")) {
				} else {
					System.err.println("email is invalid");
					throw new InvalidDataException("Email is Invalid");
				}
				if (dob != null) {
		
			} else {
				System.err.println("dob is invalid");
				throw new InvalidDataException("DOB is Invalid");
			}
			if (gender != null) {
				
			} else {
				System.err.println("gender is invalid");
				throw new InvalidDataException("Gender is Invalid");

			}

			if (occupation != null && occupation.length() >= 3 && occupation.length() <= 30 && !occupation.isEmpty()
					&& !occupation.matches(".[0-9~@#$%^&*()-+{}<>?].*")) {
			} else {
				System.err.println("occupation is invalid");
				throw new InvalidDataException("Occupation Invalid");

			}

			if (addressDTO != null) {
			} else {
				System.err.println("addressdto is invalid");
				throw new InvalidDataException("Addressdto is Invalid");

			}
			if (id1 != null && id1 > 0) {
			} else {
				System.err.println("id1 is invalid");
				throw new InvalidDataException("id1 is Invalid ");

			}
		
			if (landmark != null && landmark.length() >= 3 && landmark.length() <= 30 && !landmark.isEmpty()
					&& !landmark.matches(".[0-9~@#$%^&*()-+{}<>?].*")) {
			} else {
				System.err.println("landmark is invalid");
				throw new InvalidDataException("Invalid id");
		}
		boolean saved=dao.Save(dto);
	    System.out.println(saved);
	    return true;
		}else {
			System.out.println("");
			throw new InvalidDataException("Inavalid data dto not svaed");
		}

	}

}
