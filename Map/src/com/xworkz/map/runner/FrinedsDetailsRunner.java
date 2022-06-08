package com.xworkz.map.runner;

import java.util.HashMap;
import java.util.Map;

import com.xwrokz.map.FriendsDetails;

public class FrinedsDetailsRunner {

	public static void main(String[] args) {
		
		
		//map= FriendsDetails()
		
		Map<String, String> map = new HashMap<>();
		map.put("Nikhil", "nikhilbasannavar@gmail.com");
		map.put("Srinath", "srinathsp12@gmail.com");
		map.put("Rajshekar", "raj1456@gmail.com");
		map.put("suraj", "surajspa1@gmail.com");
		map.put("satya", "patilsatya@gmail.com");
		
		System.out.println(map.size());
		System.out.println(map.isEmpty());
		System.out.println(map.containsKey("satya"));
		System.out.println(map.get("suraj"));
		System.out.println(map.containsValue("raj1456@gmail.com"));
		System.out.println(map.replace("Nikhil","nikl1@gmail.com"));
        System.out.println(map.values());
        System.out.println(map.replace("Srinath","srinathsp12@gmail.com" , "sriiin@gmail.com"));
        System.out.println(map.keySet());
        System.out.println(map.remove("Srinath").valueOf(map));
        System.out.println(map.entrySet());
        
        
		
	}

}
