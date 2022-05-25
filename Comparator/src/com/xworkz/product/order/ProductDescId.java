package com.xworkz.product.order;

import java.util.Comparator;

import com.xworkz.order.dto.ProductDTO;

public class ProductDescId implements Comparator<ProductDTO>{

	@Override
	public int compare(ProductDTO o1, ProductDTO o2) {
		Integer o2id=o2.getId();
		Integer o1id=o1.getId();
		return o2id.compareTo(o1id);
	}
	

} 
