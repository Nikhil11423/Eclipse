package com.xworkz.cake;

import com.xworkz.cake.dao.CakeDAO;
import com.xworkz.cake.dto.CakeDTO;
import com.xworkz.cake.dto.Flavour;
import com.xworkz.cake.dto.Shape;
import com.xworkz.cake.dto.Type;

public class CakeRunner {

	public static void main(String[] args) {

		CakeDTO cake = new CakeDTO();

		cake.setId(01);
		cake.setQuantity(1);
		cake.setPrice(1200d);
		cake.setFlavour(Flavour.BLACKFOREST);
		cake.setShape(Shape.GUITAR);
		cake.setType(Type.REGUALAR);

		System.out.println(cake);

		CakeDAO dao = new CakeDAO();
		boolean saved = dao.save(cake);
		System.out.println(saved);
		System.out.println("********************************************************");

		CakeDTO cake1 = new CakeDTO();
		cake1.setId(02);
		cake1.setQuantity(2);
		cake1.setPrice(900d);
		cake1.setFlavour(Flavour.PINEAPPLE);
		cake1.setShape(Shape.RECTANGLE);
		cake1.setType(Type.PASTRY);

		System.out.println(cake1);

		boolean saved1 = dao.save(cake1);
		System.out.println(saved1);
		System.out.println("********************************************************");

		CakeDTO cake2 = new CakeDTO();
		cake2.setId(03);
		cake2.setQuantity(5);
		cake2.setPrice(1800d);
		cake2.setFlavour(Flavour.CHOCOLATE);
		cake2.setShape(Shape.HEART);
		cake2.setType(Type.EGGLESS);

		boolean saved2 = dao.save(cake2);
		System.out.println(saved2);
		System.out.println("********************************************************");

		CakeDTO cake3 = new CakeDTO();
		cake3.setId(04);
		cake3.setQuantity(5);
		cake3.setPrice(2500d);
		cake3.setFlavour(Flavour.PINEAPPLE);
		cake3.setShape(Shape.SQUARE);
		cake3.setType(Type.REGUALAR);

		boolean saved3 = dao.save(cake3);
		System.out.println(saved3);
		System.out.println("********************************************************");

		CakeDTO cake4 = new CakeDTO();
		cake4.setId(05);
		cake4.setQuantity(37);
		cake4.setPrice(3200d);
		cake4.setFlavour(Flavour.BUTTERSCOTCH);
		cake4.setShape(Shape.HEART);
		cake4.setType(Type.PASTRY);

		boolean saved4 = dao.save(cake4);
		System.out.println(saved4);
		System.out.println("********************************************************");

		dao.updatePriceByFlavour(900d, Flavour.PINEAPPLE);
		System.out.println("****************************************");

		dao.updatePriceAndQuantityByFlavour(1500d, 2000, Flavour.BUTTERSCOTCH);
		System.out.println("******************************************");

		dao.updateTypeByIdAndFlavour(Type.PASTRY, 06, Flavour.PINEAPPLE);
		System.out.println("******************************************");

		dao.updatePriceAndShapeAndTypeById(1200d, Shape.SQUARE, Type.EGGLESS, 07);
		System.out.println("******************************************");

		dao.findById(05);
		System.out.println("******************************************");

		dao.findByIdAndFlavour(3, Flavour.BUTTERSCOTCH);
		System.out.println("******************************************");

		dao.findPriceById(1200);
		System.out.println("******************************************");

		dao.findFlavourById(03);
		System.out.println("******************************************");

		dao.findAll();
		System.out.println("******************************************");

		Double find1 = dao.findByMaxPrice();
		System.out.println(find1);
		System.out.println("******************************************");

		Double find2 = dao.findByMinPrice();
		System.out.println(find2);
		System.out.println("******************************************");

	}
}
