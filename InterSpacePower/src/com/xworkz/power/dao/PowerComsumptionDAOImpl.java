package com.xworkz.power.dao;

import java.util.Optional;

import com.xworkz.power.dto.PowerConsumptionDTO;

public class PowerComsumptionDAOImpl implements PowerConsumptionDAO {

	private PowerConsumptionDTO[] dto = new PowerConsumptionDTO[5];
	private int index;

	@Override
	public boolean save(PowerConsumptionDTO dto) {
		System.out.println("Storing " + dto);
		if (this.index < this.dto.length) {
			this.dto[index] = dto;
			this.index++;
			System.out.println("Details is added");
			return true;
		} else {
			System.out.println("Details is not consumed");
		}

		return false;
	}

	@Override
	public void printDetails() {
		for (int index = 0; index < this.dto.length; index++) {

		}

	}

	@Override
	public Optional<PowerConsumptionDTO> findByName(String name) {
		for (int index = 0; index < this.dto.length; index++) {
			PowerConsumptionDTO consumptionDTO = dto[index];
			if (name.equals(consumptionDTO.getCustomerName())) {
				System.out.println("dto is not found" + name);
				return Optional.empty();
			}

		}
		System.out.println("dto is not found for" + name);
		return Optional.empty();

	}

}
