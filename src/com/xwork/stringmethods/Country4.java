package com.xwork.stringmethods;

public class Country4 {
	
	public static void main(String[] args) {
		
		String disticName="Belagavi";
		
		//indexOf method
		int dis=disticName.indexOf(3,'r');
		System.out.println(dis);
		
		//startWith method
		boolean dis1=disticName.startsWith("elagavi");
		System.out.println(dis1);
		
		//subSequence method
		CharSequence dis2=disticName.subSequence(1,7);
		System.out.println(dis2);
		
		//replace method
		String dis3=disticName.replace("Belagavi", "Bangalore");
		System.out.println(dis3);
		
		//repeat method
		String dis4=disticName.repeat(3);
		System.out.println(dis4);
		
		//indent method
		String dis5=disticName.indent(5);
		System.out.println(dis5);
		
		//strip method
		String dis6=disticName.strip();
		System.out.println(dis6);
		
		CharSequence dis7=disticName.subSequence(2,8);
		System.out.println(dis7);
	}
		

}
