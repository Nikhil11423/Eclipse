package com.xworkz.product.order;

import java.util.Comparator;

import com.xworkz.order.dto.ProductDTO;

public class ProductDescPrice implements Comparator<ProductDTO> {

	@Override
	public int compare(ProductDTO o1, ProductDTO o2) {
		Double obj2=o2.getPrice();
		Double obj1=o1.getPrice();
		return obj2.compareTo(obj1);
	}

}
