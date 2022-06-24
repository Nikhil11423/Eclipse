package com.xworkz.collection;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ActorsName {

	public static void main(String[] args) {

		List<String> actorsName = new LinkedList<String>();
		actorsName.add("Rajkumar");
		actorsName.add("Vishnuvardhan");
		actorsName.add("Ambarish");
		actorsName.add("B.S. Dwarakish");
		actorsName.add("V. Ravichandran");
		actorsName.add("Anant Nag");
		actorsName.add("Shankar Nag");
		actorsName.add("Jai Jagdeesh");
		actorsName.add("Prakash Raj");
		actorsName.add("Ramesh Aravind");
		actorsName.add("Shashikumar");
		actorsName.add("Jaggesh");
		actorsName.add("Sudeep");
		actorsName.add("Sai Kumar");
		actorsName.add("Upendra");
		actorsName.add("Sharan");
		actorsName.add("Diganth");
		actorsName.add("Sathish Neenasam");
		actorsName.add("Ajay Rao");
		actorsName.add("Chiranjeevi Sarja");
		actorsName.add("Vijay Raghavendra");
		actorsName.add("Rakshit Shetty");
		actorsName.add("Harish Raj");
		actorsName.add("Naveen Krishna");
		actorsName.add("Kishore Kumar G");
		actorsName.add("Srinath");
		actorsName.add("Lokesh");
		actorsName.add("Ganesh");
		actorsName.add("Darshan Thoogudeep");
		actorsName.add("Punith Rajkumar");
		actorsName.add("Shiva Rajkumar");
		actorsName.add("Yash");
		actorsName.add("Vijay");
		actorsName.add("Aditya");
		actorsName.add("Prajwal Devaraj");
		actorsName.add("Sriimurali");
		actorsName.add("Srinagar Kitty");
		actorsName.add("Kajal Agarwal");
		actorsName.add("Amulya");
		actorsName.add("Deepa Sannidhi");
		actorsName.add("Samyukhta Hegde");
		actorsName.add("Hari Priya");
		actorsName.add("Shanvi Shrivastava");
		actorsName.add("Rashmika Mandanna");
		actorsName.add("Shruthi Hariharan");
		actorsName.add(" Radhika Pandit");
		actorsName.add("Rachitha Ram");
		actorsName.add("Shraddha Srinath");
		actorsName.add("Amy Jackson");
		actorsName.add("Neha Malik");
		actorsName.add("Nikhil Kumar Swami");

		Comparator<String> desc = (obj1, obj2) -> {
			return obj2.compareTo(obj1);
		};
		Collections.sort(actorsName, desc);
		System.err.println("Actors Name in Desc order");
		
		System.err.println("***********Naguvin Odeya Punith Rajkumar 1******************");

		Predicate<String> predicate = (string) -> {
			return string.contains("ma");
		};

		List<String> temp = actorsName.stream().filter(predicate).collect(Collectors.toList());
		for (String string : temp) {
			System.out.println(string);
		}

		System.err.println("***********Naguvin Odeya Punith Rajkumar******************");

		/*Predicate<String> predicate1 = (string) -> {
			return !string.contains("Ra");
		};
		List<String> temp1 = actorsName.stream().filter(predicate1).collect(Collectors.toList());
		for (String string1 : temp1) {
			System.out.println(string1);
		}*/
	}
}
