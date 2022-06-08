package com.xworkz.dto.runner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import com.xworkz.dto.OrgansDTO;
import com.xworkz.dto.StarDTO;

public class SatrRunner {

	public static void main(String[] args) {
		
		StarDTO star1 = new StarDTO(1, "10 Lacertae", 'O', "Blue", 10.0);
		StarDTO star2 = new StarDTO(2, "Siris", 'A', "Blue", 1.7);
		StarDTO star3 = new StarDTO(3, "procyon", 'F', "Blue/White", 1.3);
		StarDTO star4 = new StarDTO(4, "Sun", 'G', "White/Yellow", 1.0);
		StarDTO star5 = new StarDTO(5, "Arctarus", 'K', "Red/Orange", 0.8);
		StarDTO star6 = new StarDTO(4, "Sun", 'G', "White/Yellow", 1.0);
		
		Set<StarDTO> str = new HashSet<StarDTO>();
         str.add(star1);
         str.add(star2);
         str.add(star3);
         str.add(star4);
         str.add(star5);
         str.add(star6);
         str.forEach(System.out::println);
         
        
        
		
	}

}
