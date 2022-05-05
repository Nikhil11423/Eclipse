package com.xwork.stringmethods;

public class Country2 {
	
	public static void main(String[] args) {
	
	String country="Hindustan";
	
	//lastIndexOf Methods
	int cm=country.lastIndexOf('n');
	System.out.println(cm);
	
	//lastIndexOf Methods
	int cm1=country.lastIndexOf(3,6);
	System.out.println(cm1);
	
	//length Methods
	int cm2=country.length();
	System.out.println(cm2);
	
	//lastIndexOf Methods
	int cm3=country.lastIndexOf("u");
	System.out.println(cm3);
	
	//lastIndexOf Methods
	int cm4=country.lastIndexOf( "t",3);
	System.out.println(cm4);
	
	//replace Methods
	String cm5=country.replace('n','a');
	System.out.println(cm5);
	
	//join Methods
	String cm6=country.join("-", "Belagavi","is","cool");
	System.out.println(cm6);
	
	//toLowerCase Methods
	String cm7=country.toLowerCase();
	System.out.println(cm7);
	
	//toUppercase Methods
	String cm8=country.toUpperCase();
	System.out.println(cm8);
	
	//trim Methods
	String cm9=country.trim ();
	System.out.println(cm9);
	}

}
