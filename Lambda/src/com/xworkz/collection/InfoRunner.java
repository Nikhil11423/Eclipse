package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.xworkz.collection.dto.AgeDTO;

public class InfoRunner {

	public static void main(String[] args) {

		/*AgeDTO age1 = new AgeDTO("Rajshekar", 29);
		AgeDTO age2 = new AgeDTO("Suraj", 25);
		AgeDTO age3 = new AgeDTO("Srinath", 26);
		AgeDTO age4 = new AgeDTO("Nikhil", 26);
		AgeDTO age5 = new AgeDTO("Suhas", 25);
		AgeDTO age6 = new AgeDTO("Pratheek", 24);
		AgeDTO age7 = new AgeDTO("Shankar", 22);
		AgeDTO age8 = new AgeDTO("Yashwanth", 25);
		AgeDTO age9 = new AgeDTO("Ramesh", 26);
		AgeDTO age10 = new AgeDTO("Sanjay", 25);
		AgeDTO age11 = new AgeDTO("Prabhakar", 25);
		AgeDTO age12 = new AgeDTO("Sathya", 25);
		AgeDTO age13 = new AgeDTO("Raghu", 24);
		AgeDTO age14 = new AgeDTO("Rohini", 24);
		AgeDTO age15 = new AgeDTO("Arpitha", 23);
		AgeDTO age16 = new AgeDTO("Shwetha", 23);
		AgeDTO age17 = new AgeDTO("Lakshmi", 23);
		AgeDTO age18 = new AgeDTO("Sowmya", 21);
		AgeDTO age19 = new AgeDTO("Saraswathi", 22);
		AgeDTO age20 = new AgeDTO("Rajini", 21);
		AgeDTO age21 = new AgeDTO("Rachitha", 22);
		AgeDTO age22 = new AgeDTO("Ranjitha", 22);
		AgeDTO age23 = new AgeDTO("Chandana", 22);

		List<Integer> age = new LinkedList<Integer>();
		age.add(age1);
		age.add(age2);
		age.add(age3);
		age.add(age4);
		age.add(age5);
		age.add(age6);
		age.add(age7);
		age.add(age8);
		age.add(age9);
		age.add(age10);
		age.add(age11);
		age.add(age12);
		age.add(age13);
		age.add(age14);
		age.add(age15);
		age.add(age16);
		age.add(age17);
		age.add(age18);
		age.add(age19);
		age.add(age20);
		age.add(age21);
		age.add(age22);
		age.add(age23);

		System.out.println("================Age greater than 20==============");

		List<AgeDTO> ages = age.stream().filter(i -> i > 20).collect(Collectors.toList());
		Comparator<AgeDTO> comp = (a1,a2) -> {
			return a2.compareTo(a1);
		};
		Collections.sort(age, comp);
		for (AgeDTO integer :age) {
			System.out.println(integer);
		}

		System.out.println("================Age greater than 22 and less than 30==============");

		List<AgeDTO> ages1 = age.stream().filter(i -> i > 22 && i < 30).collect(Collectors.toList());
		Comparator<AgeDTO> comp1 = (a1, a2) -> {
			return a2.compareTo(a1);
		};
		Collections.sort(ages1, comp1);
		for (AgeDTO integer : ages1) {
			System.out.println(integer);
		}*/
		List<Integer> friendsAge = new ArrayList<Integer>();
		friendsAge.add(23);
		friendsAge.add(25);
		friendsAge.add(22);
		friendsAge.add(22);
		friendsAge.add(22);
		friendsAge.add(24);
		friendsAge.add(25);
		friendsAge.add(23);
		friendsAge.add(22);
		friendsAge.add(25);
		friendsAge.add(22);
		friendsAge.add(25);
		friendsAge.add(24);
		friendsAge.add(26);
		friendsAge.add(25);
		friendsAge.add(25);
		friendsAge.add(24);
		friendsAge.add(23);
		friendsAge.add(23);
		friendsAge.add(28);
		friendsAge.add(25);
		friendsAge.add(23);
		friendsAge.add(24);

		System.out.println("================Age greater than 20==============");

		List<Integer> temp6 = friendsAge.stream().filter(i -> i > 20).collect(Collectors.toList());
		Comparator<Integer> comp6 = (a1, a2) -> {
			return a2.compareTo(a1);
		};
		Collections.sort(temp6, comp6);
		for (Integer integer : temp6) {
			System.out.println(integer);
		}

		System.out.println("================Age greater than 22 and less than 30==============");

		List<Integer> temp7 = friendsAge.stream().filter(i -> i > 22 && i < 30).collect(Collectors.toList());
		Comparator<Integer> comp7 = (a1, a2) -> {
			return a2.compareTo(a1);
		};
		Collections.sort(temp7, comp7);
		for (Integer integer : temp7) {
			System.out.println(integer);
		}
	}
	}

	

