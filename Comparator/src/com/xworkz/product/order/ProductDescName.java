package com.xworkz.product.order;

import java.util.Comparator;

import com.xworkz.order.dto.ProductDTO;

public class ProductDescName implements Comparator<ProductDTO>{

	@Override
	public int compare(ProductDTO o1, ProductDTO o2) {
		String obj2=o2.getName();
		String obj1=o1.getName();
		return obj2.compareTo(obj1);
	}

}
