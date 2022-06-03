package com.xworkz.sports;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Sports {

	public static void main(String[] args) {

		List<String> sports = new LinkedList<String>();
		sports.add("Kabaddi");
		sports.add("Kho Kho");
		sports.add("Hockey");
		sports.add("Football");
		sports.add("Basketball");
		sports.add("Golf");
		sports.add("Tennis");
		sports.add("Volleyball");
		sports.add("Cricket");
		sports.add("Rugby");
		sports.add("Cycling");
		sports.add("Boxing");
		sports.add("Ice hockey");
		sports.add("Table tennis");
		sports.add("Basaball");
		sports.add("Handball");
		sports.add("Swimming");
		sports.add("Water polo");

		System.out.println(sports.size());
		sports.stream().sorted().forEach(s -> System.out.println(s));

		System.out.println("********startsWith****************");
		sports.stream().filter(s -> s.startsWith("B")).forEach(System.out::println);

		System.out.println("********toUpperCase****************");
		sports.stream().filter(s -> s.startsWith("B")).map(String::toUpperCase).forEach(System.out::println);

		System.out.println("**********anyMatch**************");
		boolean match = sports.stream().anyMatch(s -> s.startsWith("B"));
		System.out.println(match);

		System.out.println("**********allMatch**************");
		boolean matched = sports.stream().allMatch((s) -> s.startsWith("B"));
		System.out.println(matched);

		System.out.println("**********Nonematch**************");
		boolean matchedR = sports.stream().noneMatch((s) -> s.startsWith("A"));
		System.out.println(matchedR);

		System.out.println("**********reduce**************");
		Optional<String> reduced = sports.stream().reduce((s1, s2) -> s1 + "#" + s2);
		reduced.ifPresent(System.out::println);

		System.out.println("***************findFirst***********");
		String firstMatchedName = sports.stream().filter((s) -> s.startsWith("B")).findFirst().get();
		System.out.println(firstMatchedName);

	}

}
