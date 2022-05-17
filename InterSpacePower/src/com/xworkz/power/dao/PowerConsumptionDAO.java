package com.xworkz.power.dao;

import java.util.Optional;

import com.xworkz.power.dto.PowerConsumptionDTO;

public interface PowerConsumptionDAO {

	int TOTAL_SIZE = 5;

	boolean save(PowerConsumptionDTO dto);

	void printDetails();

	Optional<PowerConsumptionDTO> findByName(String name);
}
