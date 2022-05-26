package com.xworkz.collection;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PrimeMinisterNames {

	public static void main(String[] args) {

		List<String> pmNames = new LinkedList<String>();
		pmNames.add("Jawahar Lal Nehru");
		pmNames.add("Gulzarilal Nanda");
		pmNames.add("Lal Bahadur Shastri");
		pmNames.add("Morarji Desai");
		pmNames.add("Charan Singh");
		pmNames.add("Indira Gandhi");
		pmNames.add("Rajiv Gandhi");
		pmNames.add("V. P. Singh");
		pmNames.add("Chandra Shekhar");
		pmNames.add("V. Narasimha Rao");
		pmNames.add("Atal Bihari Vajpayee");
		pmNames.add("H. D. Deve Gowda");
		pmNames.add("Inder Kumar Gujral");
		pmNames.add("Manmohan Singh");
		pmNames.add("Narendra Modi");

		Comparator<String> desc = (obj1, obj2) -> {
			return obj2.compareTo(obj1);
		};

		Collections.sort(pmNames, desc);
		System.err.println("PM Names in India");

		Predicate<String> predicate = (string) -> {
			return string.startsWith("N");
		};

		List<String> temp = pmNames.stream().filter(predicate).collect(Collectors.toList());
		for (String string : temp) {
			System.out.println(string);

		}
	}
}
