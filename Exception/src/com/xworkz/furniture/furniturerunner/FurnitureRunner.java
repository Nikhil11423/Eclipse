package com.xworkz.furniture.furniturerunner;

import com.xworkz.furniture.constants.Material;
import com.xworkz.furniture.dao.FurnitureDAO;
import com.xworkz.furniture.dto.FurnitureDTO;

public class FurnitureRunner {

	public static void main(String[] args) {

		FurnitureDTO furnitureDTO = new FurnitureDTO();
		furnitureDTO.setId(1);
		furnitureDTO.setName("Bookshelf");
		furnitureDTO.setPrice(4600);
		furnitureDTO.setBarnd("Swastik");
		furnitureDTO.setWeight(5d);
		furnitureDTO.setMaterial(Material.WOOD);

		FurnitureDAO dao = new FurnitureDAO();
		boolean save = dao.save(furnitureDTO);
		System.out.println(furnitureDTO);
		System.out.println("_____________________________________________");

		FurnitureDTO furnitureDTO1 = new FurnitureDTO();
		furnitureDTO1.setId(2);
		furnitureDTO1.setName("Storage Rack");
		furnitureDTO1.setPrice(12000);
		furnitureDTO1.setBarnd("jsw");
		furnitureDTO1.setWeight(3.5);
		furnitureDTO1.setMaterial(Material.STEEL);

		save = dao.save(furnitureDTO);
		System.out.println(furnitureDTO1);
		System.out.println("_____________________________________________");

		FurnitureDTO furnitureDTO2 = new FurnitureDTO();
		furnitureDTO2.setId(3);
		furnitureDTO2.setName("Chair");
		furnitureDTO2.setPrice(2500);
		furnitureDTO2.setBarnd("Bohemiana");
		furnitureDTO2.setWeight(3.0);
		furnitureDTO2.setMaterial(Material.IRON);

		save = dao.save(furnitureDTO);
		System.out.println(furnitureDTO2);
		System.out.println("_____________________________________________");

		FurnitureDTO furnitureDTO3 = new FurnitureDTO();
		furnitureDTO3.setId(4);
		furnitureDTO3.setName("Coffe table");
		furnitureDTO3.setPrice(12523);
		furnitureDTO3.setBarnd("Claire");
		furnitureDTO3.setWeight(4.0);
		furnitureDTO3.setMaterial(Material.GLASS);

		save = dao.save(furnitureDTO);
		System.out.println(furnitureDTO3);
		System.out.println("_____________________________________________");

		FurnitureDTO furnitureDTO4 = new FurnitureDTO();
		furnitureDTO4.setId(5);
		furnitureDTO.setName("Bench");
		furnitureDTO4.setPrice(5000);
		furnitureDTO4.setBarnd("Chumbak");
		furnitureDTO4.setWeight(10.0);
		furnitureDTO4.setMaterial(Material.WOOD);

		save = dao.save(furnitureDTO);
		System.out.println(furnitureDTO4);
		System.out.println("_____________________________________________");

		save = dao.save(furnitureDTO);
		System.out.println(furnitureDTO);
		System.out.println("_____________________________________________");
	}

}
