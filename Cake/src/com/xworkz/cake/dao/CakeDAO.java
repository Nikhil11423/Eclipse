package com.xworkz.cake.dao;

import com.xworkz.cake.dto.CakeDTO;
import com.xworkz.cake.dto.Flavour;
import com.xworkz.cake.dto.Shape;
import com.xworkz.cake.dto.Type;

public class CakeDAO {

	private CakeDTO[] dtos = new CakeDTO[5];
	private int index;
	private Shape newspace;
	

	public boolean save(CakeDTO dto) {
		System.out.println("Cake is running dto=" + hashCode());
		if (index < this.dtos.length) {
			this.dtos[index] = dto;
			index++;
			System.out.println("Cake is fully ready =" + dto);
			return true;
		} else {
			System.out.println("Cake is not fully ready");
		}
		return false;
	}

	public void updatePriceByFlavour(Double priceToUpdate, Flavour flavour) {
		boolean found = false;

		for (int index1 = 0; index1 < dtos.length; index1++) {
			CakeDTO dto = dtos[index1];
			System.out.println("Flavour is=" +flavour);
			if (dto.getFlavour().equals(flavour)) {
				dto.setPrice(priceToUpdate);
				System.out.println("Updated price="+priceToUpdate);
				found = true;
				break;
			} else {
				System.out.println("price is not updated");
				break;
			}

		}

	}

	public void updateShapeById(Shape shape, Integer id) {
		boolean found1 = false;
		for (int index2 = 0; index2 < dtos.length; index2++) {
			CakeDTO dto1 = dtos[index2];
			System.out.println("Shape is" + shape);
			if (dto1.getId().equals(id)) {
				dto1.setShape(shape);
				System.out.println("Shape is updated=");
				found1 = true;
			
				break;
			} else {
				System.out.println("cake is not found shape");
				break;
			}
		}

	}

	public void updatePriceAndQuantityByFlavour(Double priceToUpdate, Integer quantityToUpdate, Flavour flavour) {
		boolean found2 = false;
		for (int index3 = 0; index3 < dtos.length; index3++) {
			CakeDTO dto2 = dtos[index3];
			System.out.println("Flavour is:" +flavour);
			if (dto2.getFlavour().equals(flavour)) {
					dto2.setPrice(priceToUpdate); 
					dto2.setQuantity(quantityToUpdate);
			
				System.out.println("Updated Price");
				found2 = true;
				break;
			} else {
				System.out.println("Price  Updated");
				break;
			}
		}
	}

	public void updateTypeByIdAndFlavour(Type newtype, Integer id, Flavour flavour) {
		boolean found3 = false;
		for (int index4 = 0; index4 < dtos.length; index4++) {
			CakeDTO dto3 = dtos[index4];
			System.out.println("Id and Flavour is="+id);
			if (dto3.getId().equals(id) && dto3.getFlavour().equals(flavour)) {
				dto3.setType(newtype);
				System.out.println("Type is updated");
				found3 = true;
				break;
			} else {
				System.out.println("cake type is not updated");
				break;
			}

			
		}

	}

	public void updatePriceAndShapeAndTypeById(Double price,Shape shape,Type type,Integer id) {
		boolean found4= false;
		for(int index5=0;index<dtos.length;index5++) {
			CakeDTO dto4= dtos[index5];
			System.out.println("id is=" +id);
			if(dto4.getId().equals(id)) {
				dto4.setPrice(price);
				dto4.setShape(shape);
				dto4.setType(type);
				System.out.println("updated ="+price);
				found4=true;
				break;
			}else{
				System.out.println("cake is not updated");
				break;
		
			}
		}
	}

	public CakeDTO findById(Integer id) {
		for(int findby=0 ;findby<dtos.length;findby++) {
			CakeDTO findCakedto=dtos[findby];
			if(findCakedto.getId().equals(id) ) {
				System.out.println("id is "+id);
				
				return findCakedto;
			}else
			{
				System.out.println("Select correct id");
			}
		}
		return null;
	}
   
	public CakeDTO findByIdAndFlavour(Integer id,Flavour flavour) {
		for(int findby1=0 ;findby1<dtos.length;findby1++) {
			CakeDTO findCakedto1=dtos[findby1];
			if(findCakedto1.getId().equals(id) && findCakedto1.getFlavour().equals(flavour)) {
				System.out.println("flavour is"+flavour);
				System.out.println("id is" +id);
				return findCakedto1;
			}else {
				System.out.println("Select the correct id and flavour");
			}
		}
		return null;
	}

public CakeDTO findPriceById(Integer id) {
	for(int findby2=0 ;findby2<dtos.length;findby2++) {
		CakeDTO findCakedto2=dtos[findby2];
		if(findCakedto2.getId().equals(id)) {
			System.out.println("id is" +id);
			return findCakedto2;
		}else {
			System.out.println("Select the correct id");
		}
	}
	return null;
}
public CakeDTO findFlavourById(Integer id) {
	for(int findby3=0 ;findby3<dtos.length;findby3++) {
		CakeDTO findCakedto3=dtos[findby3];
		if(findCakedto3.getId().equals(id)) {
			System.out.println("id is " +id);
			return findCakedto3;
		}else {
			System.out.println("Select the correct id");
		}
	}
	return null;
}
public CakeDTO findAll() {
	for(int findby4=0 ;findby4<dtos.length;findby4++) {
		CakeDTO findCakedto4=dtos[findby4];
		if(findCakedto4.getClass().equals(null)) {
			System.out.println();
			return findCakedto4;
		}else {
			System.out.println();
		}
	}
	return null;
}
}