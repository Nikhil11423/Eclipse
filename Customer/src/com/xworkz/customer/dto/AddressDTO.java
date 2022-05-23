package com.xworkz.customer.dto;

import java.io.Serializable;

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
@RequiredArgsConstructor
public class AddressDTO implements Serializable {
	@NonNull
	Integer id1;
	@NonNull
	private String street;
	@NonNull
	private String city;
	@NonNull
	private String state;
	@NonNull
	private Integer no;
	@NonNull
	private String landmark;
}
