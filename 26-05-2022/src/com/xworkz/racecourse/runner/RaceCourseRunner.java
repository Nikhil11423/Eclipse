package com.xworkz.racecourse.runner;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.xworkz.racecourse.RaceCourseDTO;

public class RaceCourseRunner {

	public static void main(String[] args) {

		RaceCourseDTO kudure1 = new RaceCourseDTO(1, "Bangalore Turf Club", "Bangalore", 149D, 280, 249D, "Karnataka");
		RaceCourseDTO kudure2 = new RaceCourseDTO(2, "Mysore Race Club", "Mysore", 200D, 250, 150D, "Karnataka");
		RaceCourseDTO kudure3 = new RaceCourseDTO(3, "Hyderabad Race Club", "Hyderabad", 200D, 290, 250D, "Telengana");
		RaceCourseDTO kudure4 = new RaceCourseDTO(4, "Royal Culcutta Turf Club", "Kolkata", 280D, 350, 450D, "Kolkata");
		RaceCourseDTO kudure5 = new RaceCourseDTO(5, "Royal Western India Truf Club", "Mumbai", 100D, 260, 270D,
				"Maharashtra");
		RaceCourseDTO kudure6 = new RaceCourseDTO(6, "Madras Race Club", "Madras", 400D, 650, 650D, "Channai");
		RaceCourseDTO kudure7 = new RaceCourseDTO(7, "Delhi Truf Club", "Delhi", 600D, 250, 650D,
				"Haryan-UttarPradesh");
		RaceCourseDTO kudure8 = new RaceCourseDTO(8, "Pune Race Course", "Pune", 200D, 250, 150D, "Maharastra");
		RaceCourseDTO kudure9 = new RaceCourseDTO(9, "Ooty Race Course", "Ooty", 400D, 850, 850D, "Tamilnadu");
		RaceCourseDTO kudure10 = new RaceCourseDTO(10, "Guindy Race Course", "Madras", 400D, 650, 250D, "Tamilnadu");
		RaceCourseDTO kudure11 = new RaceCourseDTO(11, "Mahalaxmi Race Course", "Mumbai", 260D, 4000, 1050D,
				"Maharashtra");
		RaceCourseDTO kudure12 = new RaceCourseDTO(12, "Racing Track Of Univercity", "Jaipur", 8800D, 6450, 650D,
				"Rajastan");
		RaceCourseDTO kudure13 = new RaceCourseDTO(13, "Race track uniara", "Uniara", 1100D, 1150, 1150D, "Rajastan");
		RaceCourseDTO kudure14 = new RaceCourseDTO(14, "Race Track", "Jokhawas", 600D, 650, 650D, "Rajastan");
		RaceCourseDTO kudure15 = new RaceCourseDTO(15, "New Race Course", "Rajkot", 1200D, 120, 1450D, "Gujarat");
		RaceCourseDTO kudure16 = new RaceCourseDTO(16, "Triathlon Race Course", "Goa", 200D, 250, 150D, "Goa");

		List<RaceCourseDTO> raceDTOs = new LinkedList<RaceCourseDTO>();
		raceDTOs.add(kudure1);
		raceDTOs.add(kudure2);
		raceDTOs.add(kudure3);
		raceDTOs.add(kudure4);
		raceDTOs.add(kudure5);
		raceDTOs.add(kudure6);
		raceDTOs.add(kudure7);
		raceDTOs.add(kudure8);
		raceDTOs.add(kudure9);
		raceDTOs.add(kudure10);
		raceDTOs.add(kudure11);
		raceDTOs.add(kudure12);
		raceDTOs.add(kudure13);
		raceDTOs.add(kudure14);
		raceDTOs.add(kudure15);
		raceDTOs.add(kudure16);

		// raceDTOs.forEach((r) ->{
		// System.out.println(r);
		System.err.println("****************Get Trackes***********************");
		raceDTOs.stream().filter(r -> r.getTrackLength() == 149).forEach(r -> System.out.println(r));

		System.err.println("**************Get States*************************");

		raceDTOs.stream().filter(r -> r.getState().contains(("Karnataka")))
				.forEach(r -> System.out.println("ALL STATE NAMES " + r));

		System.err.println("***************Get Total Seats************************");

		raceDTOs.stream().filter(r -> r.getTotalSeats() > 280d).forEach(r -> System.out.println("total seats" + r));

		System.err.println("***************Get Tickets Price************************");

		raceDTOs.stream().filter(s -> s.getTicketPrice() > 250).forEach(s -> System.out.println("Ticket Price" + s));

		System.err.println("****************Get Name***********************");

		raceDTOs.stream().filter(s -> s.getName().contains("Karnataka"))
				.forEach(s -> System.out.println("PLACE NAME " + s));

		System.err.println("****************Get Id***********************");
		raceDTOs.stream().filter(p -> p.getId() > 0).forEach(s -> System.out.println(s));

		System.err.println("****************Get Max Values***********************");
		RaceCourseDTO max = raceDTOs.stream().max(Comparator.comparing(RaceCourseDTO::getTicketPrice))
				.orElseThrow(NoSuchElementException::new);
		System.out.println(max);

		System.err.println("****************Get Min Values***********************");

		RaceCourseDTO min = raceDTOs.stream().min(Comparator.comparing(RaceCourseDTO::getTicketPrice))
				.orElseThrow(NoSuchElementException::new);
		System.out.println(min);

		System.err.println("****************find Name By Place***********************");

		List<RaceCourseDTO> race = raceDTOs.stream().filter(
				e ->raceDTOs.stream().anyMatch(f ->f.getPlace().equals("Bangalore") &&e.getName().equals(f.getName())))
				.collect(Collectors.toList());
		System.out.println(race);

		System.err.println("****************find Id By Place***********************");
		List<RaceCourseDTO> horses = raceDTOs.stream().filter(
				e ->raceDTOs.stream().anyMatch(f ->f.getId().equals(4) &&e.getPlace().equals(f.getPlace())))
				.collect(Collectors.toList());
		System.out.println(horses);
		
		System.err.println("****************find totalSeats By Place***********************");
		List<RaceCourseDTO> kudure = raceDTOs.stream().filter(
				e ->raceDTOs.stream().anyMatch(f ->f.getTotalSeats().equals(250) &&e.getPlace().equals(f.getPlace())))
				.collect(Collectors.toList());
		System.out.println(kudure);
		
	}
}
