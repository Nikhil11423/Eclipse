package com.xworkz.racecourse;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
@NoArgsConstructor
public class RaceCourseDTO implements Serializable {

	
	private Integer id;
	private String name;
	private String place;
	private Double trackLength;
	private Integer totalSeats;
	private Double ticketPrice;
	private String state;
}
