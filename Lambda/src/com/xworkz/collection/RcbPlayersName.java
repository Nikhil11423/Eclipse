package com.xworkz.collection;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class RcbPlayersName {

	public static void main(String[] args) {

		List<String> rcbPlayersName = new LinkedList<String>();
		rcbPlayersName.add("Rahul Dravid");
		rcbPlayersName.add("Bharath Chipli");
		rcbPlayersName.add("Wasim Jaffer");
		rcbPlayersName.add("Shivnarine Chanderpaul");
		rcbPlayersName.add("Shreevats Goswami");
		rcbPlayersName.add("Sunil Joshi");
		rcbPlayersName.add("Anil Kumble");
		rcbPlayersName.add("Misbah-ul-Haq");
		rcbPlayersName.add("Chris Gayle");
		rcbPlayersName.add("Mitchell Starc");
		rcbPlayersName.add("Yuvraj Singh");
		rcbPlayersName.add("Parthiv Patel");
		rcbPlayersName.add("Ravi Rampaul");
		rcbPlayersName.add("Virat Kohli");
		rcbPlayersName.add("Glenn Maxwell");
		rcbPlayersName.add("Mohammad Siraj");
		rcbPlayersName.add("Faf Du Plessis");
		rcbPlayersName.add("Harshal Patel");
		rcbPlayersName.add("Anuj Rawat");
		rcbPlayersName.add("Akash Deep");
		rcbPlayersName.add("Wanindu Hasaranga");
		rcbPlayersName.add("Dinesh Karthik");
		rcbPlayersName.add("Shahbaz Ahmed");
		rcbPlayersName.add("Josh Hazlewood");
		rcbPlayersName.add("AB de Villiers");
		rcbPlayersName.add("Yuzvendra Chahal ");
		rcbPlayersName.add("Devdutt Padikkal ");
		rcbPlayersName.add("Navdeep Saini");
		rcbPlayersName.add("Pavan Deshpande");
		rcbPlayersName.add("Sachin Baby ");
		rcbPlayersName.add("Rajat Patidar");
		rcbPlayersName.add("Mohammed Azharuddeen");
		rcbPlayersName.add("Kyle Jamieson");
		rcbPlayersName.add("Dan Christian");
		rcbPlayersName.add("Suyesh Prabhudessai");
		rcbPlayersName.add("KS Bharat");
		rcbPlayersName.add("Tim David ");
		rcbPlayersName.add("Dushmantha Chameera");
		rcbPlayersName.add("Wanindu Hasarangal ");
		rcbPlayersName.add("Akash Deep ");
		rcbPlayersName.add("George Garton");

		Comparator<String> desc = (rcb1, rcb2) -> {
			return rcb2.compareTo(rcb1);
		};
		Collections.sort(rcbPlayersName, desc);
		System.err.println("RCB Players Name in Desc order");

		Predicate<String> predicate = (string) -> {
			return !string.contains("S");
		};
		List<String> temp = rcbPlayersName.stream().filter(predicate).collect(Collectors.toList());
		for (String string : temp) {
			System.out.println(string);
		}
		System.err.println("*********RCB E SALA CUP NAMADE**********************");
		Predicate<String> Predicate1 = (string) -> {
			return !string.contains("D");
		};
		List<String> temp1 = rcbPlayersName.stream().filter(Predicate1).collect(Collectors.toList());
		for (String string1 : temp1) {
			System.out.println(string1);
		}
	}
}
