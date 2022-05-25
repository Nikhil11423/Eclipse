package com.xworkz.product.order;

import java.util.Comparator;

import com.xworkz.order.dto.ProductDTO;

public class ProductDescCompany implements Comparator<ProductDTO>{

	@Override
	public int compare(ProductDTO o1, ProductDTO o2) {
		String obj2=o2.getCompany();
		String obj1=o1.getCompany();
		return obj2.compareTo(obj1);
	}

}
