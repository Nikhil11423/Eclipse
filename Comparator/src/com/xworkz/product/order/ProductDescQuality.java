package com.xworkz.product.order;

import java.util.Comparator;

import com.xworkz.order.dto.ProductDTO;

public class ProductDescQuality implements Comparator<ProductDTO> {

	@Override
	public int compare(ProductDTO o1, ProductDTO o2) {
		Float obj2=o2.getQuality();
		Float obj1=o1.getQuality();
		return obj2.compareTo(obj1);
	}

}
