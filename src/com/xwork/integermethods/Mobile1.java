package com.xwork.integermethods;

public class Mobile1 {

	public static void main(String[] args) {
	  
	  Integer num1=365;
	  Integer num2=183;
	    
	    
	   int comp=num1.hashCode();
	   System.out.println("hashCode value is="+comp);
	   
	   long comp1=num1.longValue();
	   System.out.println("longvalue is="+comp1);
	   
	   int comp2=num1.max(410,250);
	   System.out.println("max value is="+comp2);
	   
	   int comp3=num1.min(250,410);
	   System.out.println("min value is="+comp3);
	   
	   int comp4=num2.shortValue();
	   System.out.println("short value is="+comp4);
	   
	   int comp5=Integer.numberOfLeadingZeros(30);
	   System.out.println("numberofleadingzeros value is="+comp5);
	   
	   
	   int comp6=Integer.numberOfTrailingZeros(60);
	   System.out.println("umberOfTrailingZero value is"+comp6);
	   
	   int comp7=Integer.sum(90,120);
	   System.out.println("sum value is="+comp7);
	   
	   int comp8=Integer.reverse(2010420);
	   System.out.println("reverse value is="+comp8);
	   
}
}