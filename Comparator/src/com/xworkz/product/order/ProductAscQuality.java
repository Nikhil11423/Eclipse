package com.xworkz.product.order;

import java.util.Comparator;

import com.xworkz.order.dto.ProductDTO;

public class ProductAscQuality implements Comparator<ProductDTO> {

	@Override
	public int compare(ProductDTO o1, ProductDTO o2) {
		Double obj1=o1.getQuantity();
		Double obj2=o2.getQuantity();
		return obj1.compareTo(obj2);
	}

}
