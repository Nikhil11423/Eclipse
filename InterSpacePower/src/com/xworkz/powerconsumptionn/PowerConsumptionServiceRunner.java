package com.xworkz.powerconsumptionn;

import java.time.LocalDate;

import com.xworkz.power.dao.PowerConsumptionDAO;
import com.xworkz.power.dao.PowerConsumptionDAOImpl;
import com.xworkz.power.dto.PowerConsumptionDTO;
import com.xworkz.powerconsumption.exception.InvalidDataException;
import com.xworkz.powerconsumption.service.PowerConsumptionService;
import com.xworkz.powerconsumption.service.PowerConsumptionServiceImpl;

public class PowerConsumptionServiceRunner {

	public static void main(String[] args) {

		PowerConsumptionDTO dto = new PowerConsumptionDTO();

		PowerConsumptionDAO dao = new PowerConsumptionDAOImpl();

		PowerConsumptionService customer = new PowerConsumptionServiceImpl(dao);

		try {
			customer.validateAndSave(
					new PowerConsumptionDTO(1, 75D, 4.5D, LocalDate.of(2022, 05, 24), 150D, "Omkar", "MESCOM"));
			System.out.println("*****************************************************");
			customer.validateAndSave(
					new PowerConsumptionDTO(2, 76D, 4.6D, LocalDate.of(2022, 05, 24), 155D, "Appu", "BESCOM"));
			System.out.println("*****************************************************");

			customer.validateAndSave(
					new PowerConsumptionDTO(3, 77D, 4.7D, LocalDate.of(2022, 05, 24), 150D, "Sanjay", "HESCOM"));
			System.out.println("*****************************************************");

			customer.validateAndSave(
					new PowerConsumptionDTO(4, 78D, 4.8D, LocalDate.of(2022, 05, 24), 155D, "Raju", "GESCOM"));
			System.out.println("*****************************************************");

			customer.validateAndSave(
					new PowerConsumptionDTO(5, 79D, 4.9D, LocalDate.of(2022, 05, 24), 150D, "Prabhu", "MESCOM"));
			System.out.println("*****************************************************");

			customer.validateAndSave(
					new PowerConsumptionDTO(6, 80.1D, 5D, LocalDate.of(2022, 05, 24), 155D, "Ravi", "BESCOM"));

			System.out.println("*****************************************************");
			customer.validateAndSave(
					new PowerConsumptionDTO(7, 80.5D, 5.1D, LocalDate.of(2022, 05, 24), 150D, "Sandeep", "GESCOM"));

			System.out.println("*****************************************************");
			customer.validateAndSave(
					new PowerConsumptionDTO(8, 80.7D, 5.2D, LocalDate.of(2022, 05, 24), 155D, "Suhas", "HESCOM"));

			System.out.println("*****************************************************");
			customer.validateAndSave(
					new PowerConsumptionDTO(9, 81.2D, 5.3D, LocalDate.of(2022, 05, 24), 156D, "Laxmi", "BESCOM"));
			System.out.println("*****************************************************");

			customer.validateAndSave(
					new PowerConsumptionDTO(10, 81.4D, 5.4D, LocalDate.of(2022, 05, 24), 157D, "Rakesh", "MESCOM"));
			System.out.println("*****************************************************");

			customer.validateAndSave(
					new PowerConsumptionDTO(11, 81.7D, 5.5D, LocalDate.of(2022, 05, 24), 155D, "Akhil", "GESCOM"));
			System.out.println("*****************************************************");

			customer.validateAndSave(
					new PowerConsumptionDTO(12, 82D, 5.6D, LocalDate.of(2022, 05, 24), 157D, "Nikhil", "HESCOM"));

			customer.validateAndSave(
					new PowerConsumptionDTO(13, 82.1D, 5.7D, LocalDate.of(2022, 05, 24), 151D, "Rajshekar", "MESCOM"));

			System.out.println("*****************************************************");
			customer.validateAndSave(
					new PowerConsumptionDTO(14, 82.4D, 5.8D, LocalDate.of(2022, 05, 24), 155D, "Lucky", "GESCOM"));

			PowerConsumptionDTO dto15 = new PowerConsumptionDTO(15, 82.5D, 5.9D, LocalDate.of(2022, 05, 24), 153D,
					"Basavaraj", "BESCOM");

			PowerConsumptionDTO dto16 = new PowerConsumptionDTO(16, 82.8D, 6D, LocalDate.of(2022, 05, 24), 152D, "Basu",
					"HESCOM");

			PowerConsumptionDTO dto17 = new PowerConsumptionDTO(17, 82.1D, 6.1D, LocalDate.of(2022, 05, 24), 150D,
					"Sunil", "BESCOM");

			PowerConsumptionDTO dto18 = new PowerConsumptionDTO(18, 80D, 6.2D, LocalDate.of(2022, 05, 24), 150D,
					"Sammed", "GESCOM");

			PowerConsumptionDTO dto19 = new PowerConsumptionDTO(19, 76.5D, 6.3D, LocalDate.of(2022, 05, 24), 150D,
					"Karan", "HESCOM");
			PowerConsumptionDTO dto20 = new PowerConsumptionDTO(20, 75.4D, 6.4D, LocalDate.of(2022, 05, 24), 150D,
					"Amit", "MESCOM");

			PowerConsumptionDTO dto21 = new PowerConsumptionDTO(21, 74.1D, 6.5D, LocalDate.of(2022, 05, 24), 150D,
					"Jyoti", "BESCOM");
			PowerConsumptionDTO dto22 = new PowerConsumptionDTO(22, 76.8D, 6.6D, LocalDate.of(2022, 05, 24), 150D,
					"Amruta", "BESCOM");

			PowerConsumptionDTO dto23 = new PowerConsumptionDTO(23, 77.3D, 6.7D, LocalDate.of(2022, 05, 24), 150D,
					"Sanket", "BESCOM");

			PowerConsumptionDTO dto24 = new PowerConsumptionDTO(24, 74.1D, 6.8D, LocalDate.of(2022, 05, 24), 150D,
					"Manoja", "BESCOM");
			System.out.println("*****************************************************");

			PowerConsumptionDTO dto25 = new PowerConsumptionDTO(25, 73.1D, 6.9D, LocalDate.of(2022, 05, 24), 150D,
					"Sattish", "BESCOM");
			System.out.println("*****************************************************");

			PowerConsumptionDTO[] name = { dto15, dto16, dto17, dto18, dto19, dto20, dto21, dto22, dto23, dto24,
					dto25 };

			
			customer.validateAndSaveMultiple(name);

			customer.findByName("Sanket");
			
			customer.printDetails();
			
			customer.updateMinChargeByDivision("BESCOM", 6.8D);
			
			customer.updateRatePerUnitByDivision("BESCOM", 151D );
			
			customer.findDueAmountByCusomerName("Nikhil");
			
			customer.findByCustomerNameAndDivision("Manoja", "BESCOM");
			
			
			
			
			
			
			
			
			
		

		} catch (InvalidDataException e) {
			System.out.println("Message" + e.getMessage());
		}
	}

}
