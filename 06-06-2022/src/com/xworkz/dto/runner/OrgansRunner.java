package com.xworkz.dto.runner;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.xworkz.dto.OrgansDTO;

public class OrgansRunner {

	public static void main(String[] args) {
		OrgansDTO organsDTO = new OrgansDTO(1, "Brain", "To thiking", 1000000.0, 350f);
		OrgansDTO organsDTO1 = new OrgansDTO(2, "Heart", "pumps blood ", 150000.0, 290f);
		OrgansDTO organsDTO2 = new OrgansDTO(3, "eyes", " visualizing objects", 40000.0, 7.5f);
		OrgansDTO organsDTO3 = new OrgansDTO(4, "kidney", "balance the body's fluids", 5000000.0, 319f);
		OrgansDTO organsDTO4 = new OrgansDTO(5, "liver", "Bile production and excretion", 1000000.0, 1500f);
		OrgansDTO organsDTO5 = new OrgansDTO(3, "eyes", " visualizing objects", 40000.0, 7.5f);

		Set<OrgansDTO> org = new HashSet<OrgansDTO>();
		org.add(organsDTO);
		org.add(organsDTO1);
		org.add(organsDTO2);
		org.add(organsDTO3);
		org.add(organsDTO4);
		org.add(organsDTO5);
		org.forEach(System.out::println);

	
	}

}
