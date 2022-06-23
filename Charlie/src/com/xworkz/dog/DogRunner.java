package com.xworkz.dog;

import java.time.LocalDate;

import com.xworkz.dog.constants.Gender;
import com.xworkz.dog.dao.DogDAO;
import com.xworkz.dog.dao.DogDAOImpl;
import com.xworkz.dog.dto.DogDTO;
import com.xworkz.dog.service.DogService;
import com.xworkz.dog.service.DogServiceImpl;

public class DogRunner {

	public static void main(String[] args) {


				//DogDTO dto =new DogDTO(4, "laba","black","black", 1500, 5.5d, 60d,Gender.MALE, LocalDate.of(2022, 06, 14));
				DogDTO dto1=new DogDTO(5, "nikki","white", "brown", 2690, 4.9, 55,Gender.FEMALE,LocalDate.of(2022, 06, 9));
				
				DogDAO dao= new DogDAOImpl();
				
				DogService serv =new DogServiceImpl(dao);
		
					serv.validateAndSave(dto1);
					
			
				
			    
	}
				
			}


