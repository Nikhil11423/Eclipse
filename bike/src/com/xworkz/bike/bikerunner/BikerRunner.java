package com.xworkz.bike.bikerunner;

import com.xworkz.bike.functions.AbstractBike;
import com.xworkz.bike.functions.AbstractKtm;

public class BikerRunner {

	public static void main(String[] args) {

		AbstractBike abstractBike = new AbstractKtm(140,7);
		abstractBike.bikeModels("Duke", 167850);
		System.out.println(abstractBike.getName());
		System.out.println(abstractBike.getPrice());
		System.out.println(abstractBike.getGear());
		System.out.println(abstractBike.getSpeed());
		
		abstractBike.bikeRiding();
		abstractBike.bikeAccident();
		abstractBike.saveTime();
	
	
		System.out.println("***************************************");
		
		AbstractBike abstractBike1 = new AbstractKtm(180,5);
		abstractBike1.bikeModels("MT", 210000);
		abstractBike1.getName();
		abstractBike1.getPrice();
		abstractBike1.getGear();
		abstractBike1.getSpeed();
		
		System.out.println(abstractBike1.getName());
		System.out.println(abstractBike1.getPrice());
		System.out.println(abstractBike1.getGear());
		System.out.println(abstractBike1.getSpeed());
		
		abstractBike1.bikeRiding();
		abstractBike1.bikeAccident();
		abstractBike1.saveTime();
		
		System.out.println("****************************************");
         
		AbstractBike abstractBike2 = new AbstractKtm(210,6);
		abstractBike2.bikeModels("Bulet", 150000);
		System.out.println(abstractBike2.getName());
		System.out.println(abstractBike2.getPrice());
		System.out.println(abstractBike2.getGear());
		System.out.println(abstractBike2.getSpeed());
		
		abstractBike2.bikeRiding();
		abstractBike2.bikeAccident();
		abstractBike2.saveTime();
	}
}
