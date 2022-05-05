package com.xwork.stringmethods;

public class Country1 {
	
	public static void main(String[] args)
	{
		String country="Bharat";
		
		//endsWith Methods
		boolean rc=country.endsWith("a");
		System.out.println(rc);
		
		//equals Methods
		boolean rc1=country.equals("Bharat");
		System.out.println(rc1);
		
		//equalsIgnoreCase Methods
		boolean rc2=country.equalsIgnoreCase("Bharat");
		System.out.println(rc2);
		
		//isBlank Methods
		boolean rc3=country.isBlank();
		System.out.println(rc3);
		
		//isEmpty Methods
		boolean rc4=country.isEmpty();
		System.out.println(rc4);
		
		//getBytes Methods
		byte[] rc5=country.getBytes();
		System.out.println(rc5);
		
		//hashCose Methods
		int rc6=country.hashCode();
		System.out.println(rc6);
		
		//indexOf Methods
		int rc7=country.indexOf('a');
		System.out.println(rc7);
		
		//indexOf Methods
		int rc8=country.indexOf('r',3);
		System.out.println(rc8);
		
		//subString Methods
        String rc9=country.substring(2);
        System.out.println(rc9);
            
     
		
		
		
	}

}
