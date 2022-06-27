package com.xworkz.gadget.dao;

import com.xworkz.gadget.dto.GadgetDTO;

public interface GadgetDAO {

	boolean save(GadgetDTO dto);

	GadgetDTO findById(int id);

}
