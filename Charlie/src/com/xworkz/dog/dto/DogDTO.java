package com.xworkz.dog.dto;


import java.io.Serializable;
import java.time.LocalDate;

import com.xworkz.dog.constants.Gender;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class DogDTO {


		
		private int id;
		private String name;
		private String breed;
		private String color;
		private double price;
		private double height; 
		private double weight;
        private Gender gender;
        private LocalDate BirthDate;
      
}
