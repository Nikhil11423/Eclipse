package com.xworkz.product.order;

import java.util.Comparator;

import com.xworkz.order.dto.ProductDTO;

public class ProductAscQuantity implements Comparator<ProductDTO> {

	@Override
	public int compare(ProductDTO o1, ProductDTO o2) {
		
		Float obj1=o1.getQuality();
		Float obj2=o2.getQuality();
		return obj1.compareTo(obj2);
	}
	}


