package com.xworkz.collection;

import java.util.HashMap;
import java.util.Map;

public class PracticeMap {
	
	  public static void main(String[] arfs) {
	 
		Map<String , String> map=new HashMap<>(); 	
	    map.put("Nikhil", "nikhilbasannavar@gmail.com");
		map.put("Srinath", "srinathsp12@gmail.com");
		map.put("Rajshekar", "raj1456@gmail.com");
		map.put("suraj", "surajspa1@gmail.com");
		map.put("satya", "patilsatya@gmail.com");
		
		System.out.println(map.size());
		
		System.out.println(map.containsKey(map));

		System.out.println(map.isEmpty());
		
		System.out.println(map.entrySet());
		
		System.out.println(map.keySet());
		
		System.out.println(map.replace("satya","satya12@gmail.com"));
	  }
	  
	  
}
