package com.xworkz.customer.dto;

import java.io.Serializable;
import java.time.LocalDate;

import com.xwrokz.customer.constants.Gender;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NonNull
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDTO implements Serializable {

	private Integer id;
	private String name;
	private String email;
	private LocalDate dob;
	private Gender gender;
	private String occupation;
	private AddressDTO addressDTO;

}
