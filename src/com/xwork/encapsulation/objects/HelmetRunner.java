package com.xwork.encapsulation.objects;

public class HelmetRunner {
	
	public static void main(String[] args)
	{
		Helmet helmet=new Helmet();
		System.out.println(helmet.toString());
		//System.out.println(helmet.hashCode());
		
		
		helmet.setCompany("VEGA");
		helmet.setIsiCertified(true);
		helmet.setPrice(1200);
		helmet.setType(Type.FULL_HELMET);
		helmet.setRating(4.9f);
		
		Helmet helmet1=new Helmet();
		helmet1.setCompany("VEGA");
		helmet1.setIsiCertified(true);
		helmet1.setPrice(1200);
		helmet1.setType(Type.FULL_HELMET);
		helmet1.setRating(4.9f);
		
		boolean the=helmet.equals(helmet1);
		
	   System.out.println(the);			
		
	}


}


