package com.xworkz.practice.runner;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

import com.xworkz.practice.PracticeDTO;

public class PracticeRUNNER {

	public static void main(String[] args) {

		Set<PracticeDTO> dto=new HashSet<PracticeDTO>();
		PracticeDTO dto1 = new PracticeDTO("Nikhil", 8500d, 3.8, "Borgaon", 07, "Belagavi", "Karnatka");
		PracticeDTO dto2 = new PracticeDTO("Srinath", 9500d, 3.9, "Bangalore", 8, "Bangalore", "Karnatka");
		PracticeDTO dto3 = new PracticeDTO("Suraj", 10000d, 4.0, "Bangalore", 9, "Bangalore", "Karnatka");

		//Arrays.aslist  is using call the all given dto
		//we can also write another way
		//ptr.add(dto);
		//ptr.add(dto1);etc
	    //we use both methods
		//List<PracticeDTO> ptr = Arrays.asList(dto, dto1, dto2);
		
		//using the stream,sord and foreach 
		//ptr.stream().sorted().forEach(b -> System.out.println(b));
		
		System.err.println("***************01*********************");
		
		//Using Iterator also method but only forward direction
		//ListIterator is forward and backward direction
		
		//ListIterator<PracticeDTO> itr =ptr.listIterator();
	//	while(itr.hasNext()) {
	
		//	System.out.println(itr.next());
		
	    dto.add(dto3);
	    dto.add(dto2);
	    dto.add(dto1);
	    dto.forEach(System.out::println);
	}
		
		//System.err.println("*****************02*********************");

		//while(itr.hasPrevious()) {
		//System.out.println(itr.previous());
		//}
	    
	
	}
	


