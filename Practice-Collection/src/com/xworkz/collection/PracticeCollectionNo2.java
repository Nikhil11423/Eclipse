package com.xworkz.collection;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.ListIterator;



public class PracticeCollectionNo2 {

	public static void main(String[] args) {
		
		ArrayList<String> list=new ArrayList<String>();
		list.add("Java");
		list.add("Java Use");
		list.add("Java Features");
		list.add("JDK");
		list.add("JVM");
		list.add("JRE");
		list.add("Java Variables");
		list.add("Java Datatypes");
		list.add("abc");
		System.out.println("**************ListIterator*******************************");
	
		System.out.println("Next:");
		ListIterator<String> itr = list.listIterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("Previous:");
			ListIterator itr1=list.listIterator(); 
			while (((ListIterator) itr).hasPrevious()) {
				System.out.println(((ListIterator) itr).previous());
			}
			
			System.out.println("**************Comparator*******************************");
			Comparator<String > desc =(obj1 ,obj2) ->{
				return obj2.compareTo(obj1);
			};
			Collections.sort(list ,desc);
			System.out.println("list is Desc Order");
			
  }
	
	
}

