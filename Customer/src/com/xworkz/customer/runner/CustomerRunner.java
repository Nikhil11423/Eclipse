package com.xworkz.customer.runner;

import java.time.LocalDate;

import javax.sound.midi.InvalidMidiDataException;

import com.xworkz.customer.dao.CustomerDAO;
import com.xworkz.customer.dao.CustomerDAOImpl;
import com.xworkz.customer.dto.AddressDTO;
import com.xworkz.customer.dto.CustomerDTO;
import com.xworkz.customer.exception.InvalidDataException;
import com.xworkz.customer.service.CustomerService;
import com.xworkz.customer.service.CustomerServiceImpl;
import com.xwrokz.customer.constants.Gender;

public class CustomerRunner {

	public static void main(String[] args) {

		CustomerDAO dao = new CustomerDAOImpl();

		CustomerService service = new CustomerServiceImpl(dao);

		AddressDTO add = new AddressDTO(1, "water tank", "Bang", "BTM", 570023, "Karnataka");
		CustomerDTO dto1 = new CustomerDTO(1, "Nikhil", "nikhilb@gmail.com", LocalDate.of(1996, 10, 14), Gender.MALE,
				"Student", add);

		AddressDTO add1 = new AddressDTO(2, "Jayanagar 4th block", "Bang", "Jayanagar", 570026, "Karnataka");
		CustomerDTO dto2 = new CustomerDTO(2, "Akshay", "akshaya1295@gmail.com", LocalDate.of(1994, 9, 14), Gender.MALE,
				"Employe", add1);

		AddressDTO add2 = new AddressDTO(3, "Basannavar Galli", "Borgaon", "BRG", 591216, "Karnataka");
		CustomerDTO dto3 = new CustomerDTO(3, "Sushma", "sushma1244@gmail.com", LocalDate.of(1996, 8, 21),
				Gender.FEMALE, "TCS Employe", add2);

		AddressDTO add3 = new AddressDTO(4, "Kumbahar Galli", "Borgaon", "KTM", 591216, "Karnataka");
		CustomerDTO dto4 = new CustomerDTO(4, "Akshay G", "akshayaug@gmail.com", LocalDate.of(1996, 9, 27), Gender.MALE,
				"Lieutenant", add3);

		AddressDTO add4 = new AddressDTO(5, "Shivaji Peth", "Pune", "Pune", 421011, "Maharashtra");
		CustomerDTO dto5 = new CustomerDTO(5, "Rohit", "rohit12tt@gmail.com", LocalDate.of(1993, 4, 12), Gender.MALE,
				"Student", add4);
		try {
			boolean save = service.ValidateAndSave(dto1, add);
			System.out.println(dto1);
			save = service.ValidateAndSave(dto2, add1);
			System.out.println(dto2);
			save = service.ValidateAndSave(dto3, add2);
			System.out.println(dto3);
			save = service.ValidateAndSave(dto4, add3);
			System.out.println(dto4);
			save = service.ValidateAndSave(dto5, add4);
			System.out.println(dto5);
		} catch (InvalidDataException e) {
			e.printStackTrace();

		}
	}

}
