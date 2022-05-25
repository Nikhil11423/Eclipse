package com.xworkz.product.order;

import java.util.Comparator;

import com.xworkz.order.dto.ProductDTO;


public class ProductAscCompany implements Comparator<ProductDTO> {

	@Override
	public int compare(ProductDTO o1, ProductDTO o2) {
		String obj1=o1.getCompany();
		String obj2=o2.getCompany();
		
		return obj1.compareTo(obj2);
	}

	

	

}
