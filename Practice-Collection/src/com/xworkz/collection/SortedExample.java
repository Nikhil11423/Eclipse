package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class SortedExample {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();// Creating arraylist
		// LinkedList<String> list1 =new LinkedList<String>();//Creating linkedlist
		list.add("Senoir Developer Mr.Srinath");// Adding object in arraylist
		list.add("Junior Developer Mr.Suraj");// Adding object in linkedlist
		list.add("Developer Mr.Nikhil");

		// Traversing list through Iterator
		// Iterator itr=list.iterator();
		// while(itr.hasNext()){
		// System.out.println(itr.next());

		// Sorting the list
		Collections.sort(list);
		System.out.println("Sorting the names :" + list);

		System.out.println("Returning element: " + list.get(1));// it will return the 2nd element, because index starts // from 0
			
		
		//adding the new data using the set method	and which position 												
		list.set(1, "Senoir Developer Mr.Raj");

		// Traversing list through for-each loop
		for (String names : list)
			System.out.println("Software Engineers : " + names);
	}
}
