package com.xwork.encapsulation.objects;

public class Theater {


	
	private String name;
	private String movieName;
	private String location;
	private int ticketPrice;
	
    @Override
	public String toString()
	{
		System.out.println("running toString ");
		return super.toString();
	}
	
	@Override
	public int hashCode()
	{
		System.out.println("running hashCode");
		return super.hashCode();
	}
	
	public  boolean equals(Object obj){
		System.out.println("runnning equals");
	
	if(obj !=null) {
	  System.out.println("running Ticket is not null");	
	  
	if(obj instanceof Theater){
	System.out.println("running Theater is instance");
		
	Theater other=(Theater)obj;
	
	if (this.name.equals(other.name) && this.location.equals(other.location));

	return true;
	}
	else
	{
		System.out.println("running Theater is close");
	}
	}
		return false;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public void setTicketPrice(int ticketPrice) {
		this.ticketPrice = ticketPrice;
	}




}
