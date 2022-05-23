package com.xworkz.customer.dao;

import com.xworkz.customer.dto.CustomerDTO;
import com.xworkz.customer.exception.InvalidDataException;


public class CustomerDAOImpl implements CustomerDAO {

	private CustomerDTO[] dtos = new CustomerDTO[TOTAL_SIZE];
	private int index;

	@Override
	public boolean Save(CustomerDTO dto) {
		if (this.index < this.dtos.length) {
			this.dtos[index] = dto;
			this.index++;
			System.out.println("dto save = " + dto);
			return true;
		} else {
			InvalidDataException full = new InvalidDataException("cannot add more as the the index full");
			throw full;
		}

	}
}
