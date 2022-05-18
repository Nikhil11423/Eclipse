package com.xworkz.power.dao;

import java.util.Optional;

import com.xworkz.power.dto.PowerConsumptionDTO;
import com.xworkz.powerconsumption.exception.IndexIsFullException;

public class PowerConsumptionDAOImpl  implements PowerConsumptionDAO {

		private PowerConsumptionDTO[] dtos = new PowerConsumptionDTO[TOTAL_SIZE];
		private int index;

		
		public boolean save(PowerConsumptionDTO dto) {
			if (this.index < this.dtos.length) {
				System.out.println("Storing dto=" +dto);
				this.dtos[index] = dto;
				this.index++;
				System.out.println("powerconsumption  is saved");
				return true;
			} 
				System.out.println("powerconsumption  is not saved");
				IndexIsFullException full=new IndexIsFullException("can not add more as the index is full");
				throw full;
			}
		
		
		public void saveMultiple(PowerConsumptionDTO[] dto1) {
				System.out.println("Storing multiple dtos=" +dto1);
				for (int index = 0; index < dtos.length; index++) {
				PowerConsumptionDTO power =dto1[index];
				this.save(power);
			}
			
		}

		
		public void printDetails() {
			for (int index = 0; index < dtos.length; index++) {
				System.out.println(dtos[index]);
			}

		}

		
		public Optional<PowerConsumptionDTO> findByName(String name) {
			for (int index = 0; index < dtos.length; index++) {
				PowerConsumptionDTO powerConsumptionDTO = dtos[index];
				if (name.equals(powerConsumptionDTO.getCustomerName())) {
					System.out.println("dto is found" + name);
					return Optional.of(powerConsumptionDTO);
				}
			}
			System.out.println("dto is not found" + name);
			return Optional.empty();
		}

	    @Override
		public void deleteByCustomerName(String name) {
			for (int index = 0; index < dtos.length; index++) {
				PowerConsumptionDTO power1 = dtos[index];
				if (name.equals(power1.getCustomerName())) {
					power1.setCustomerName(null);
				}

			}

		}

	    @Override
		public void deleteByDivision(String division) {
			for (int index = 0; index < dtos.length; index++) {
				PowerConsumptionDTO power1 = dtos[index];
				if (division.equals(power1.getDivision())) {
					power1.setDivision(null);
				}

			}

		}

	    @Override
		public Double updateMinChargeByDivision(String division, double min) {
			for (int index = 0; index < dtos.length; index++) {
				PowerConsumptionDTO power3 = dtos[index];
				if (division.equals(power3.getDivision())) {
					power3.setMinCharge(min);
					System.out.println("The new rate is "+power3.getMinCharge());
					return min;
				}

			}
			return null;

		}

	    @Override
		public Double updateratePerUnitByDivision(String division, double newrate) {
			for (int index = 0; index < dtos.length; index++) {
				PowerConsumptionDTO power4 = dtos[index];
				if (division.equals(power4.getDivision())) {
					power4.setRatePerUnit(newrate);
					System.out.println("The new rate per unit is "+power4.getRatePerUnit());
					
				}
			}
			return null;
		}

	    @Override
		public Optional<PowerConsumptionDTO[]> findByDivision(String division) {
			for (int index = 0; index < dtos.length; index++) {
				PowerConsumptionDTO power5 = dtos[index];
				if (division.equals(power5.getDivision())) {
					return Optional.of(dtos);
				}
			}
			return null;
		}

		  @Override
		public Optional<PowerConsumptionDTO> findByCustomerNameAndDivision(String name, String division) {
			for (int index = 0; index < dtos.length; index++) {
				PowerConsumptionDTO power6 = dtos[index];
				if (name.equals(power6.getCustomerName()) && division.equals(power6.getDivision())) {
					return Optional.of(power6);
				}
			}
			return null;
		}

		@Override
		public Optional<Double> findRatePerUnitByDivision(String division) {
			for (int index = 0; index < dtos.length; index++) {
				PowerConsumptionDTO power7 = dtos[index];
				if (division.equals(power7.getDivision())) {
					return Optional.of(power7.getRatePerUnit());
				}
			}

			return null;
		}

		@Override
		public Optional<Double> findDueAmountByCusomerName(String name) {
			for (int index = 0; index < dtos.length; index++) {
				PowerConsumptionDTO power8 = dtos[index];
				if (name.equals(power8.getCustomerName())) {
					return Optional.of(power8.getDueAmount());

				}
			}
			return null;
		}
}
