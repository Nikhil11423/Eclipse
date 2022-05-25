package com.xworkz.product.order;

import java.util.Comparator;

import com.xworkz.order.dto.ProductDTO;

public class ProductAscId implements Comparator<ProductDTO> {

	@Override
	public int compare(ProductDTO o1, ProductDTO o2) {
		Integer o1id=o1.getId();
		Integer o2id=o2.getId();
				
		return o1id.compareTo(o2id);
	}

}
