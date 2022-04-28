package com.xwork.stringmethods;

public class Country {
	 
	public  static  void main(String[] args)
	{
		String countryName="India";
		
		//charAt Methods
		String countryname="India";
		char cs= countryName.charAt(2);
		System.out.println(cs);

		//concat Methods
		String cs1=countryName.concat(" is great");
	    System.out.println(cs1);
		 
	  //codePointAt Methods
	    int cs2=countryName.codePointAt(4);
		System.out.println(cs2);
				 		
		//codePointBefore Methods
		int cs3=countryName.codePointBefore(3);
		System.out.println(cs3);
		 
		//codePointCount Methods
	    int cs4=countryName.codePointCount(2,5);
	    System.out.println(cs4);
	    
	  //copyValueOfMethods
	    char[] newcs= {'R','C','B'};
	    String cs5= String.copyValueOf(newcs);
	    System.out.println(newcs);
	    
	  //compareTo Methods
	    String countryName1="Pakistan";
	    int cs6=countryName.compareTo(countryName1);
	    System.out.println(cs6);
	    
	  //compareToIgnoreCase Methods
	    String countryName2="USA";
	    int cs7=countryName.compareToIgnoreCase(countryName2);
	    System.out.println(cs7);
	    
	  //contains Methods
	   boolean countryName3=countryName.contains("ia");
	   System.out.println(countryName3);
	   
	 //contentEquals Methods
	   boolean countryName4= countryName.contentEquals("India");
	   System.out.println(countryName4); 	 
	
	}
}	
