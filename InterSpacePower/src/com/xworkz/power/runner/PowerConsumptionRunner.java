package com.xworkz.power.runner;

import java.time.LocalDate;
import java.util.Optional;

import com.xworkz.power.dao.PowerComsumptionDAOImpl;
import com.xworkz.power.dto.PowerConsumptionDTO;

public class PowerConsumptionRunner {

	public static void main(String[] args) {

		PowerConsumptionDTO power1 = new PowerConsumptionDTO(1, 120D, 8d, LocalDate.of(2022, 05, 25), 80D, "Mr.Rakesh",
				"HESCOM");
		PowerConsumptionDTO power2 = new PowerConsumptionDTO(2, 120D, 8d, LocalDate.of(2022, 05, 25), 80D, "Mr.Amol",
				"BESCOM");
		PowerConsumptionDTO power3 = new PowerConsumptionDTO(3, 120D, 8d, LocalDate.of(2022, 05, 25), 80D, "Mr.Akshay",
				"CESCOM");
		PowerConsumptionDTO power4 = new PowerConsumptionDTO(4, 120D, 8d, LocalDate.of(2022, 05, 25), 80D, "Mr.Rahul",
				"MESCOM");
		PowerConsumptionDTO power5 = new PowerConsumptionDTO(5, 120D, 8d, LocalDate.of(2022, 05, 25), 80D, "Mr.Kiran",
				"GESCOM");

		PowerComsumptionDAOImpl saved = new PowerComsumptionDAOImpl();
		saved.save(power1);
		saved.save(power2);
		saved.save(power3);
		saved.save(power4);
		saved.save(power5);

		Optional<PowerConsumptionDTO> optional = saved.findByName("Mr.Amol");
		if (optional.isPresent()) {
			PowerConsumptionDTO dto = optional.get();
			System.out.println(dto);

		}

	}

}
