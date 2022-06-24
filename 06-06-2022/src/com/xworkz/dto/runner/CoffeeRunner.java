package com.xworkz.dto.runner;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.stream.Stream;

import com.xworkz.dto.CoffeeDTO;


public class CoffeeRunner {

	public static void main(String[] args) {

		Set<CoffeeDTO> dto = new HashSet<CoffeeDTO>();
		CoffeeDTO dto1 = new CoffeeDTO(1, "Nescafe", 360.0, 200f, 5.0);
		CoffeeDTO dto2 = new CoffeeDTO(2, "Espresso", 166.0, 500f, 4.2);
		CoffeeDTO dto3 = new CoffeeDTO(3, "Cappuccino", 126.0, 250f, 4.8);
		CoffeeDTO dto4 = new CoffeeDTO(4, "Flat white", 156.0, 350f, 4.0);
		CoffeeDTO dto5 = new CoffeeDTO(5, "Cortado", 200.0, 500f, 4.3);
		CoffeeDTO dto6 = new CoffeeDTO(3, "Cappuccino", 126.0, 250f, 4.8);
		
		
		Set<CoffeeDTO> sto=new HashSet<CoffeeDTO>();
		CoffeeDTO sto1=new CoffeeDTO(7,"kiran", 360.2, 200f, 5.0);
		CoffeeDTO sto2=new CoffeeDTO(8, "Appi", 900d, 29f,2.0);
		
		sto.add(sto1);
		sto.add(sto2);
		sto.forEach(System.out::println);
		
		dto.add(dto1);
		dto.add(dto2);
		dto.add(dto3);
		dto.add(dto4);
		dto.add(dto5);
		dto.add(dto6);
		dto.forEach(System.out::println);
	
	}

}
