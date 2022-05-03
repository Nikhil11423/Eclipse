package com.xworkz.cake;

import com.xworkz.cake.dao.CakeDAO;
import com.xworkz.cake.dto.CakeDTO;
import com.xworkz.cake.dto.Flavour;
import com.xworkz.cake.dto.Shape;
import com.xworkz.cake.dto.Type;

public class CakeRunner {

	public static void main(String[] args) {
		CakeDTO cakeDTO = new CakeDTO();

		cakeDTO.setId(01);
		cakeDTO.setQuantity(1);
		cakeDTO.setPrice(790d);
		cakeDTO.setFlavour(Flavour.BLACKFOREST);
		cakeDTO.setShape(Shape.GUITAR);
		cakeDTO.setType(Type.REGUALAR);

		System.out.println(cakeDTO);

		CakeDAO cakeDAO = new CakeDAO();
		System.out.println("hashCode of DTO from main method=" + cakeDAO.hashCode());
		boolean saved = cakeDAO.save(cakeDTO);
		System.out.println(saved);
		System.out.println("********************************************************");

		CakeDTO cakeDTO1 = new CakeDTO();
		cakeDTO1.setId(02);
		cakeDTO1.setQuantity(2);
		cakeDTO1.setPrice(900d);
		cakeDTO1.setFlavour(Flavour.PINEAPPLE);
		cakeDTO1.setShape(Shape.RECTANGLE);
		cakeDTO1.setType(Type.PASTRY);

		System.out.println(cakeDTO1);

		CakeDAO cakeDAO1 = new CakeDAO();
		System.out.println("hashCode of DTO from main method=" + cakeDAO1.hashCode());
		boolean saved1 = cakeDAO1.save(cakeDTO1);
		System.out.println(saved1);
		System.out.println("********************************************************");

		CakeDTO cakeDTO2 = new CakeDTO();
		cakeDTO2.setId(03);
		cakeDTO2.setQuantity(5);
		cakeDTO2.setPrice(1800d);
		cakeDTO2.setFlavour(Flavour.CHOCOLATE);
		cakeDTO2.setShape(Shape.HEART);
		cakeDTO2.setType(Type.EGGLESS);

		CakeDAO cakeDAO2 = new CakeDAO();
		System.out.println("hashCode of DTO from main method=" + cakeDAO2.hashCode());
		boolean saved2 = cakeDAO2.save(cakeDTO2);
		System.out.println(saved2);
		System.out.println("********************************************************");

		CakeDTO cakeDTO3 = new CakeDTO();
		cakeDTO3.setId(04);
		cakeDTO3.setQuantity(5);
		cakeDTO3.setPrice(2500d);
		cakeDTO3.setFlavour(Flavour.PINEAPPLE);
		cakeDTO3.setShape(Shape.SQUARE);
		cakeDTO3.setType(Type.REGUALAR);

		CakeDAO cakeDAO3 = new CakeDAO();
		System.out.println("hashCode of DTO from main method=" + cakeDAO3.hashCode());
		boolean saved3 = cakeDAO3.save(cakeDTO3);
		System.out.println(saved3);
		System.out.println("********************************************************");

		CakeDTO cakeDTO4 = new CakeDTO();
		cakeDTO4.setId(05);
		cakeDTO4.setQuantity(37);
		cakeDTO4.setPrice(3200d);
		cakeDTO4.setFlavour(Flavour.BUTTERSCOTCH);
		cakeDTO4.setShape(Shape.HEART);
		cakeDTO4.setType(Type.PASTRY);

		CakeDAO cakeDAO4 = new CakeDAO();
		System.out.println("hashCode of DTO from main method=" + cakeDAO4.hashCode());
		boolean saved4 = cakeDAO4.save(cakeDTO4);
		System.out.println(saved4);
		System.out.println("********************************************************");

		cakeDAO.updatePriceByFlavour(900d, Flavour.PINEAPPLE);
		System.out.println("****************************************");

		cakeDAO.updatePriceAndQuantityByFlavour(1500d, 2000, Flavour.BUTTERSCOTCH);
		System.out.println("******************************************");

		cakeDAO.updateTypeByIdAndFlavour(Type.PASTRY, 06, Flavour.PINEAPPLE);
		System.out.println("******************************************");

		cakeDAO.updatePriceAndShapeAndTypeById(1200d, Shape.SQUARE, Type.EGGLESS, 07);
		System.out.println("******************************************");

		cakeDAO.findById(05);
		System.out.println("******************************************");

		cakeDAO.findByIdAndFlavour(3, Flavour.BUTTERSCOTCH);
		System.out.println("******************************************");

		cakeDAO.findPriceById(1200);
		System.out.println("******************************************");

		cakeDAO.findFlavourById(03);
		System.out.println("******************************************");

		cakeDAO.findAll();
		System.out.println("******************************************");

		cakeDAO.findByMaxPrice();
		System.out.println("******************************************");

		cakeDAO.findByMinPrice();
		System.out.println("******************************************");

	}
}
