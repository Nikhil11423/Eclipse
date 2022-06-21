package com.xworkz.dog1;

import java.time.LocalDate;

import com.xworkz.dog.constants.Gender;
import com.xworkz.dog.dao.DogDAO;
import com.xworkz.dog.dao.DogDAOImpl;

import com.xworkz.dog.dto.DogDTO;
import com.xworkz.dog.service.DogService;
import com.xworkz.dog.service.DogServiceImpl;

public class DogRunner {

	public static void main(String[] args) {


				DogDTO dto =new DogDTO(3, "laba","black","black", 15d, 5.5d, 60d,Gender.MALE, LocalDate.of(2022, 06, 14));
				
				DogDAO dao= new DogDAOImpl();
				
				DogService serv =new DogServiceImpl(dao);

			    serv.validateAndSave(dto);
				
				
			}
	}

