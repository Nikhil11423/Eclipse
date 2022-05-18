package com.xworkz.power.dao;

import java.util.Optional;


import com.xworkz.power.dto.PowerConsumptionDTO;

public interface PowerConsumptionDAO {

	int TOTAL_SIZE = 25;

	boolean save(PowerConsumptionDTO dto);

	void saveMultiple(PowerConsumptionDTO[] dto1);

	void printDetails();

	Optional<PowerConsumptionDTO> findByName(String name);

	void deleteByCustomerName(String name);

	void deleteByDivision(String division);

	Double updateMinChargeByDivision(String division, double min);

	Double updateratePerUnitByDivision(String division, double newrate);

	Optional<PowerConsumptionDTO[]> findByDivision(String division);

	Optional<PowerConsumptionDTO> findByCustomerNameAndDivision(String name, String division);

	Optional<Double> findRatePerUnitByDivision(String division);

	Optional<Double> findDueAmountByCusomerName(String customerName);

}
