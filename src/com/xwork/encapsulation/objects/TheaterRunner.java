package com.xwork.encapsulation.objects;

public class TheaterRunner {

	public static void main(String[] args)
	{
		
		Theater theater=new Theater();		
		System.out.println(theater.toString());
		System.out.println(theater.hashCode());
		
		theater.setName("Ionax");
		theater.setMovieName("KGF2");	
		theater.setLocation("BTM");
		theater.setTicketPrice(1200);
		
		Theater theater1=new Theater();
		
		theater1.setName("Fortune");
		theater1.setMovieName("Kashmir the file");	
		theater1. setLocation("Belagavi");
		theater1.setTicketPrice(300);
		
	
		
		boolean the=theater.equals(theater1);
		
		System.out.println(the);
		
	
		
	}
	
	





}
