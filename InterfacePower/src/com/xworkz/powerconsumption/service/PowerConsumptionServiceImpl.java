package com.xworkz.powerconsumption.service;

import java.time.LocalDate;
import java.util.Optional;

import com.xworkz.power.dao.PowerConsumptionDAO;
import com.xworkz.power.dto.PowerConsumptionDTO;
import com.xworkz.powerconsumption.exception.InvalidDataException;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PowerConsumptionServiceImpl implements PowerConsumptionService {
	private PowerConsumptionDAO dao;

	
	@Override
	public boolean validateAndSave(PowerConsumptionDTO dto) //throws InvalidDataException
	{
		if (dto != null) {
			Integer id = dto.getId();
			Double unitConsumed = dto.getUnitConsumed();
			Double ratePerUnit = dto.getRatePerUnit();
			Double minCharge = dto.getMinCharge();
			LocalDate dueDate = dto.getDueDate();
			String customerName = dto.getCustomerName();
			String division = dto.getDivision();

			if (id != null && id > 0) {
				System.out.println("id is valid=" + id);
			} else {
				System.out.println("id is not valid");
		  // throw new InvalidDataException("add the correct valid data");
			}
			if (unitConsumed != null && unitConsumed > 0) {
				System.out.println("unit is valid=" + unitConsumed);
			} else {
				System.out.println("unit is not valid");
				// throw new InvalidDataException("add the correct valid data");
			}
			if (ratePerUnit != null && ratePerUnit >= 6 & ratePerUnit <=12) {
				System.out.println("valid ratePerUnit=" +ratePerUnit );
			} else {
				System.out.println("ratePerUnit not valid");
				// throw new InvalidDataException("add the correct valid data");
			}
			if (minCharge != null && minCharge >= 150) {
				System.out.println("minCharge is valid=" +minCharge);
			} else {
				System.out.println("minCharge is not valid");
			 //throw new InvalidDataException("add the correct valid data");
			}
			if (dueDate != null) {
				System.out.println("dueDate is valid=" + dueDate);
			} else {
				System.out.println("dueDate is not valid");
			//throw new InvalidDataException("add the correct valid data");
			}
			if (customerName != null) {
				System.out.println("customerName is valid=" +customerName);
			} else {
				System.out.println("customerName is not valid");
				// throw new InvalidDataException("add the correct valid data");
			}
			if (division != null) {
				System.out.println("division is valid=" +division);
			} else {
				System.out.println("division is not valid");
				// throw new InvalidDataException("add the correct valid data");
			}
			Double dueAmount = ratePerUnit * unitConsumed;
			dto.setDueAmount(dueAmount);
			
			boolean saved = dao.save(dto);
			 
		}
		return false;
	}


	@Override
	public void validateAndSaveMultiple(PowerConsumptionDTO[] dto1) throws InvalidDataException {
		for (int i = 0; i < dto1.length; i++) {
			PowerConsumptionDTO power = dto1[i];
			this.validateAndSave(power);
		}
	}


	@Override
	public void printDetails() {
		this.dao.printDetails();	
		
	}


	@Override
	public Optional<PowerConsumptionDTO> findByName(String name) {
		this.dao.findByName(name);
		return Optional.empty();
	}
	


	@Override
	public void saveMultiple(PowerConsumptionDTO[] dtos) {
        this.dao.saveMultiple(dtos);
		
	}


	@Override
	public void deleteByCustomerName(String name) {
		this.dao.deleteByCustomerName(name);
		
	}


	@Override
	public void deleteByDivision(String division) {
		this.dao.deleteByDivision(division);
		
	}


	@Override
	public Double updateMinChargeByDivision(String division, double min) {
	   this.dao.updateMinChargeByDivision(division, min);
		return min;
	}


	@Override
	public Double updateRatePerUnitByDivision(String division, double newRate) {
		 this.dao.updateratePerUnitByDivision(division, newRate);
			return newRate;
	}


	@Override
	public Optional<PowerConsumptionDTO[]> findByDivision(String division) {
		this.dao.findByDivision(division);
		return Optional.empty();
	}


	@Override
	public Optional<PowerConsumptionDTO> findByCustomerNameAndDivision(String name, String division) {
		this.dao.findByCustomerNameAndDivision(name, division);
		return Optional.empty();
	}


	@Override
	public Optional<Double> findRatePerUnitByDivision(String division) {
		this.dao.findByName(division);
		return Optional.empty();	}


	@Override
	public Optional<Double> findDueAmountByCusomerName(String customerName) {
		this.dao.findDueAmountByCusomerName(customerName);
		return Optional.empty();	}


}
