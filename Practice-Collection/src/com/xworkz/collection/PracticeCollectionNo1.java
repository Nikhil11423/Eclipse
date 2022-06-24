package com.xworkz.collection;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PracticeCollectionNo1 {

	public static void main(String[] args) {
	
		List<String> abc = new LinkedList<String>();

		abc.add("abhi");
		abc.add("bhubali");
		abc.add("chetan");
		abc.add("deepak");
		abc.add("edurika");
		abc.add("faruk");
		abc.add("ganga");
		abc.add("harish");
		abc.add("irfan");
		abc.add("jakknna");
		abc.add("kiran");
		abc.add("lakkapa");
		abc.add("Nikhil");
		
		System.out.println(abc.size());
        
		System.err.println("************1*************");

		//Iterator<String> itr=abc.iterator();
		ListIterator<String> itr=abc.listIterator();

		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
          
		System.err.println("**********2***************");
	
		while(itr.hasPrevious()) {
			System.out.println(itr.previous());
		}
		
		System.err.println("*****************11******************");

		Comparator<String > desc =(obj1 ,obj2)->{
			return obj2.compareTo(obj1);
		};
		System.err.println("*****************3******************");
		Collections.sort(abc,desc);
		System.out.println("dsec is working");
		
		Predicate<String> predicate =(name)-> {
			return name.contains("b");
		};
	
	List<String> temp=abc.stream().filter(predicate).collect(Collectors.toList());
	for(String name :temp) {
		System.out.println(name);
	}
	Collections.sort(abc,(t1,t2)-> t2.compareTo(t1));
	
	System.err.println("*****************4******************");

	abc.forEach(y-> System.out.println(y.toUpperCase()));
	
	System.err.println("*****************5******************");

	abc.forEach(y-> System.out.println(y.contains("a")));
	
	System.err.println("*****************6******************");

	abc.forEach(b->System.out.println(b.endsWith("l")));
	
	System.err.println("*****************7******************");

	abc.forEach(b->System.out.println(b.length()));
	
	System.out.println("****************8*******************");
	
	abc.forEach(b->System.out.println(b.concat(b)));

	System.out.println("****************9*******************");

	abc.forEach(b->System.out.println(b.isEmpty()));
	
	System.out.println("****************9*******************");

	abc.stream().filter(s -> s.startsWith("N")).forEach(System.out::println);  

	System.out.println("****************10*******************");

	abc.stream().filter(s -> s.startsWith("N")).map(String::toUpperCase).forEach(System.out::println);  
	
	System.out.println("****************11*******************");
	
	boolean match=abc.stream().anyMatch(s -> s.startsWith("N")); 
	System.out.println(match);

	System.out.println("****************12*******************");
	
	boolean matchd=abc.stream().allMatch(s -> s.startsWith("N"));
	System.out.println(matchd);  

	System.out.println("****************13*******************");

	abc.stream().filter(s -> s.startsWith("N")).map(String::toUpperCase).forEach(System.out::println);  

	System.out.println("****************14*******************");
	
	String firstMatchName =abc.stream().filter((s)-> s.startsWith("N")).findFirst().get();
     System.out.println(firstMatchName);
	
     Optional<String> reduced =abc.stream().reduce((s1, s2) -> s1 + "#" +s2);
     reduced.ifPresent(System.out::println);
     
	
	}
	
}
