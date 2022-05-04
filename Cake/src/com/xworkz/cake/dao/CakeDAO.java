package com.xworkz.cake.dao;

import com.xworkz.cake.dto.CakeDTO;
import com.xworkz.cake.dto.Flavour;
import com.xworkz.cake.dto.Shape;
import com.xworkz.cake.dto.Type;

public class CakeDAO {

	private CakeDTO[] dtos = new CakeDTO[5];
	private int index;

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

		for (int index = 0; index < dtos.length; index++) {
			CakeDTO dto = dtos[index];
			System.out.println("Flavour is=" + flavour);
			if (dto.getFlavour().equals(flavour)) {
				dto.setPrice(priceToUpdate);
				System.out.println("Updated price=" + priceToUpdate);
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
		for (int index = 0; index < dtos.length; index++) {
			CakeDTO dto1 = dtos[index];
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
		for (int index = 0; index < dtos.length; index++) {
			CakeDTO dto2 = dtos[index];
			System.out.println("Flavour is:" + flavour);
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
		for (int index = 0; index < dtos.length; index++) {
			CakeDTO dto3 = dtos[index];
			System.out.println("Id and Flavour is=" + id);
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

	public void updatePriceAndShapeAndTypeById(Double price, Shape shape, Type type, Integer id) {
		boolean found4 = false;
		for (int index = 0; index < dtos.length; index++) {
			CakeDTO dto4 = dtos[index];
			System.out.println("id is=" + id);
			if (dto4.getId().equals(id)) {
				dto4.setPrice(price);
				dto4.setShape(shape);
				dto4.setType(type);
				System.out.println("updated =" + price);
				found4 = true;
				break;
			} else {
				System.out.println("cake is not updated");
				break;

			}
		}
	}

	public CakeDTO findById(Integer id) {
		for (int index = 0; index < dtos.length; index++) {
			CakeDTO dto5 = dtos[index];
			System.out.println("id is" + id);
			if (dto5 != null && dto5.getId().equals(id)) {
				System.out.println("The cake id is found " + id);
				break;
			} else {
				System.out.println("Con not find " + id + " in Cake");
			}
		}
		return null;
	}

	public CakeDTO findByIdAndFlavour(Integer id, Flavour flavour) {
		for (int index = 0; index < dtos.length; index++) {
			CakeDTO dto6 = dtos[index];
			System.out.println("id is" + id);
			System.out.println("flavour is" + flavour);
			if (dto6 != null && dto6.getId().equals(id) && (dto6.getFlavour().equals(flavour))) {
				System.out.println("The Cake is " + id + " and the Flavour is " + flavour);
				break;
			} else {
				System.out.println("Select the correct id and flavour");
			}
		}
		return null;
	}

	public Double findPriceById(Integer id) {
		for (int index = 0; index < dtos.length; index++) {
			CakeDTO dto7 = dtos[index];
			System.out.println("Id is " + id);
			if (dto7 != null && dto7.getId().equals(id)) {
				System.out.println("The Price for the given ID is " + dto7.getPrice());
				return dto7.getPrice();
			} else {
				System.out.println("Con not find id " + id);
			}
		}
		return null;
	}

	public Flavour findFlavourById(Integer id) {
		for (int index = 0; index < dtos.length; index++) {
			CakeDTO dto8 = dtos[index];
			if (dto8 != null && dto8.getId().equals(id)) {
				System.out.println(" id is " + id);
				return dto8.getFlavour();
			} else {
				System.out.println("con not find id" + id);
			}
		}
		return null;
	}

	public CakeDTO[] findAll() {
		for (int index = 0; index < dtos.length; index++) {
			CakeDTO dto9 = dtos[index];
			if (dto9 != null) {

				System.out.println("all condition are sattisfied");
				return dtos;
			} else {
				System.out.println("can find the cake");
			}
		}
		return null;
	}

	public Double findByMaxPrice() {
		double max = Double.MIN_VALUE;
		// CakeDTO tempCakeDTO = null;
		for (int index = 0; index < this.dtos.length; index++) {
			CakeDTO dto10 = dtos[index];
			if (dto10 != null) {
				double price = dto10.getPrice();
				System.out.println("Maximum price is=" + price);
				max = Math.max(max, price);
			}
		}
			return max;

		
	}

	public Double findByMinPrice() {
		double min = Double.MAX_VALUE;
		//CakeDTO tempCakeDTO1 = null;
		for (int index = 0; index < this.dtos.length; index++) {
			CakeDTO dto11 = dtos[index];
			if(dto11 != null ) {
			double price = dto11.getPrice();
			System.out.println("Minimum price is=" + price);
			min = Math.min(min, price);
		}
		}
		return min;
	}
	
}