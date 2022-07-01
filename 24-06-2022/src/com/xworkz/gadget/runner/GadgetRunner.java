package com.xworkz.gadget.runner;

import java.time.LocalDate;
import java.util.List;

import com.xworkz.gadget.dao.GadgetDAO;
import com.xworkz.gadget.dao.GadgetDAOImpl;
import com.xworkz.gadget.dto.GadgetDTO;
import com.xworkz.gadget.service.GadgetService;
import com.xworkz.gadget.service.GadgetServiceImpl;

public class GadgetRunner {

	public static void main(String[] args) {

		GadgetDTO dto = new GadgetDTO(0, "Loptop", "Dell", 60D, "Dell", LocalDate.of(2021, 7, 22), 4, 4.5D, true,
				2020121234D, "Dell", LocalDate.of(2020, 1, 25), "Nikhil", LocalDate.of(2022, 06, 22));
		GadgetDTO dto1 = new GadgetDTO(0, "Bike", "Duk", 100D, "Duk", LocalDate.of(2020, 7, 20), 5, 3.5D, true,
				2021200024D, "Ktm", LocalDate.of(2021, 1, 25), "Srinath", LocalDate.of(2022, 10, 02));
		GadgetDTO dto2 = new GadgetDTO(0, "Mobile", "Mi 8 Pro", 60D, "Mi 8 Pro", LocalDate.of(2019, 7, 22), 4, 4.5D, true,
				202012189894D, "Mi 8 Pro", LocalDate.of(2020, 1, 25), "Suraj", LocalDate.of(2020, 06, 22));

		
		
		GadgetDAO dao = new GadgetDAOImpl();

		GadgetService serv = new GadgetServiceImpl(dao);

		System.out.println("*****************Save*********************");
		
		dao.save(dto);
		dao.save(dto1);
		dao.save(dto2);
		
		System.out.println("****************findBy***********************");

		GadgetDTO id = serv.findById(1);
		System.out.println(id);
		
		System.out.println("****************find***********************");

		List <GadgetDTO> price= serv.findAllByPriceGreaterThan(70);
		System.out.println(price);

		
		System.out.println("****************find***********************");

		List <GadgetDTO> abc= serv.findAllByPriceGreaterThanAndManufacturer(60, "Dell");
		System.out.println(abc);

	}

}
