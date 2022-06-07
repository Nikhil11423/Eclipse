package com.xworkz.dto.runner;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.xworkz.dto.OrgansDTO;
import com.xworkz.dto.SkyWalkDTO;


public class SkyWalkRunner {

	public static void main(String[] args) {
		SkyWalkDTO skyWalkDTO = new SkyWalkDTO(1,"Adugodi skywalk","Christ University Campus, Hosur Rd",3.2);
		SkyWalkDTO skyWalkDTO1 = new SkyWalkDTO(2,"Jayanagar skywalk ","Unnamed Road, Jaya Nagar 1st Block, Jayanagar 3rd Block",5.0);
		SkyWalkDTO skyWalkDTO2 = new SkyWalkDTO(3,"Ecospace Skywalk","Dr Puneeth Rajkumar Rd",4.5);
		SkyWalkDTO skyWalkDTO3 = new SkyWalkDTO(4,"Marathahalli Skywalk" ,"Marathahalli Footbridge",4.0);
		SkyWalkDTO skyWalkDTO4 = new SkyWalkDTO(5,"Madiwala Skywalk" ,"Hosur Rd, Madiwala, Sector 6, HSR",4.2);
		SkyWalkDTO skyWalkDTO5 = new SkyWalkDTO(6,"Ecospace Skywalk","Dr Puneeth Rajkumar Rd",4.5);
		
		Set<SkyWalkDTO> sky=new HashSet<SkyWalkDTO>();
		sky.add(skyWalkDTO);
		sky.add(skyWalkDTO1);
		sky.add(skyWalkDTO2);
		sky.add(skyWalkDTO3);
		sky.add(skyWalkDTO4);
		sky.add(skyWalkDTO5);		
		sky.forEach(System.out::println);
		
		System.out.println(sky.size());
		
		
	}

}
