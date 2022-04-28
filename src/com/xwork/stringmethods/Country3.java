package com.xwork.stringmethods;

public class Country3 {
	
	public static void main(String[] args)
	{
	
	String state="Karnataka";
	
	//toString methods
	String ka=state.toString();
	System.out.println(ka);
	
	//toString methods
	String ka1=state.valueOf(4);
	System.out.println(ka1);
	
	//toString methods
	String ka2=state.substring(1,7);
    System.out.println(ka2);	 

	//toString methods
    String ka3=state.replaceFirst("K","S");
    System.out.println(ka3);
    
	//toString methods
    String ka4=state.replaceAll("Karnataka","Belagavi");
    System.out.println(ka4);
    
	//toString methods
    boolean ka5=state.matches("ka");
    System.out.println(ka5);
    
	//split methods
    String[] ka6=state.split("Kar",3);
    System.out.println(ka6);
    
	//toCharArray methods
    char[] ka7=state.toCharArray();
    System.out.println(ka7);
    
	//intern methods
    String ka8=state.intern();
    System.out.println(ka8);
    
	//getBytes methods
    byte[] ka9=state.getBytes();
    System.out.println(ka9);
    for(int index=0;index<state.length();index++) {
    	 System.out.println(ka9[index]);
    }
 }
	
}
