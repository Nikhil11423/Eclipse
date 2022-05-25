package com.xworkz.product.order;

import java.util.Comparator;

import com.xworkz.order.dto.ProductDTO;

public class ProductAscName implements Comparator<ProductDTO> {

	@Override
	public int compare(ProductDTO o1, ProductDTO o2) {
	 String obj1=o1.getName();
	 String obj2=o2.getName();
		return obj1.compareTo(obj2);
	}

}
