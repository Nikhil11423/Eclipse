package com.xworkz.gadget.service;

import java.util.List;

import com.xworkz.gadget.dto.GadgetDTO;

public interface GadgetService {

	boolean validateAndSave(GadgetDTO dto);

	GadgetDTO findById(int id);
	
   List <GadgetDTO> findAllByPriceGreaterThan(double price);
	
	List <GadgetDTO> findAllByPriceGreaterThanAndManufacturer(double price,String Manufacturer);


}
