package com.xworkz.cake;

import com.xworkz.cake.dao.CakeDAO;
import com.xworkz.cake.dto.CakeDTO;
import com.xworkz.cake.dto.Flavour;
import com.xworkz.cake.dto.Shape;
import com.xworkz.cake.dto.Type;


public class CakeRunner {


	public static void main(String[] args) {
		CakeDTO cakeDTO =new CakeDTO();
		
		cakeDTO.setId(01);
		cakeDTO.setQuantity(1);
		cakeDTO.setPrice(790d);
		cakeDTO.setFlavour(Flavour.BLACKFOREST);
		cakeDTO.setShape(Shape.GUITAR);
		cakeDTO.setType(Type.REGUALAR);
    	
		System.out.println(cakeDTO);
		
		CakeDAO cakeDAO = new CakeDAO();
		System.out.println("hashCode of DTO from main method=" +cakeDAO.hashCode());
		boolean saved=cakeDAO.save(cakeDTO);
		System.out.println(saved);
		System.out.println("********************************************************");
		
		
		CakeDTO cakeDTO1=new CakeDTO();
		cakeDTO1.setId(02);
		cakeDTO1.setQuantity(2);
		cakeDTO1.setPrice(900d);
		cakeDTO1.setFlavour(Flavour. PINEAPPLE);
		cakeDTO1.setShape(Shape.RECTANGLE);
		cakeDTO1.setType(Type.PASTRY);
    	
		System.out.println(cakeDTO1);
		
		CakeDAO cakeDAO1 = new CakeDAO();
		System.out.println("hashCode of DTO from main method=" +cakeDAO1.hashCode());
		boolean saved1=cakeDAO1.save(cakeDTO1);
		System.out.println(saved1);
		System.out.println("********************************************************");
		
		CakeDTO cakeDTO2=new CakeDTO();
		cakeDTO2.setId(03);
		cakeDTO2.setQuantity(2);
		cakeDTO2.setPrice(1500d);
		cakeDTO2.setFlavour(Flavour.CHOCOLATE);
		cakeDTO2.setShape(Shape.HEART);
		cakeDTO2.setType(Type.EGGLESS);

		CakeDAO cakeDAO2 = new CakeDAO();
		System.out.println("hashCode of DTO from main method=" +cakeDAO2.hashCode());
		boolean saved2=cakeDAO2.save(cakeDTO2);
		System.out.println(saved2);
		System.out.println("********************************************************");
		
	   cakeDAO.updatePriceByFlavour(900d,Flavour.PINEAPPLE);
	   System.out.println("****************************************");
	   
	   
	   cakeDAO.updatePriceAndQuantityByFlavour(1500d,2000,Flavour.BUTTERSCOTCH);
	   System.out.println("******************************************");
	   
	   cakeDAO.updateTypeByIdAndFlavour(Type.PASTRY,06,Flavour.PINEAPPLE);
	   System.out.println("******************************************");
	   
	   cakeDAO.updatePriceAndShapeAndTypeById(1200d,Shape.SQUARE,Type.EGGLESS,07);
	   System.out.println("******************************************");
	   
	   cakeDAO.findById(39);
	   System.out.println("******************************************");
	   
	   cakeDAO.findByIdAndFlavour(3,Flavour.BUTTERSCOTCH);
	   System.out.println("******************************************");
	   
	   cakeDAO.findAll();
	   System.out.println("******************************************");
	}
}

