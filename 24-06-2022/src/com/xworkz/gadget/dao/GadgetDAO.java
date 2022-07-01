package com.xworkz.gadget.dao;

import java.util.List;

import com.xworkz.gadget.dto.GadgetDTO;

public interface GadgetDAO {

	boolean save(GadgetDTO dto);

	GadgetDTO findById(int id);
	
	List <GadgetDTO> findAllByPriceGreaterThan(double price);
	
	List <GadgetDTO> findAllByPriceGreaterThanAndManufacturer(double price,String Manufacturer);

}
