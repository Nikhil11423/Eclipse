package com.xworkz.bike.bikerunner;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

import com.xworkz.bike.BikeDTO;
import com.xworkz.bike.constants.Type;

public class BikeRunner {
	
	public static void main(String [] args) {
	//name,color,modelNo,price,type
	BikeDTO dto1 =new BikeDTO("KTM", "Black", 250d, 250000d, Type.RACE_BIKE);
	BikeDTO dto2 =new BikeDTO("Hounda", "Red", 120d , 88000d, Type.NORMAL_BIKE);
	BikeDTO dto3 =new BikeDTO("Bullet","Chrome Red" , 350d, 139000d, Type.RACE_BIKE);
	BikeDTO dto4 =new BikeDTO("Yamaha MT-15", "Mat Light Gray", 155d, 182419d, Type.RACE_BIKE);
	BikeDTO dto5 =new BikeDTO("TVS","Silver", 100d, 58000d, Type.NORMAL_BIKE);
	
	List<BikeDTO> bike =Arrays.asList(dto1,dto2,dto3,dto4,dto5);
	bike.stream().sorted().forEach(b ->System.out.println(b));


	/*System.out.println("********Forword Direction**************");
	ListIterator<BikeDTO> itr = bike.listIterator();
	while (itr.hasNext()) {
		System.out.println(itr.next());
	}

	System.out.println("*********Backword Direction****************");
	ListIterator<BikeDTO> litr = bike.listIterator(2);
	while (litr.hasPrevious()) {
		System.out.println(litr.previous());
	}*/
	}
	
	}


