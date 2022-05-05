package com.xworkz.watertank;

import com.xworkz.watertank.dao.WaterTankDAO;
import com.xworkz.watertank.dto.WaterTankDTO;
public class WaterTankRunner {
	
	public static void main(String[] args) {
		
		WaterTankDTO  waterTank=new WaterTankDTO();
		
		waterTank.setBrand("SYNTAX");
		waterTank.setColor("WHITE");
		waterTank.setCapacity(1500);
		waterTank.setPrice(7000d);
		waterTank.setWarrantyPeriod(15);
		
		System.out.println(waterTank.hashCode());
		
		WaterTankDAO waterTankDAO = new WaterTankDAO();
		System.out.println("hashCode of DTO from main method=" +waterTankDAO.hashCode());
		boolean saved=waterTankDAO.save(waterTank);
		System.out.println(saved);
		System.out.println("----------------------------------------------------------------------");
		
		WaterTankDTO waterTank2 = new WaterTankDTO();
		waterTank2.setBrand("SURYA");
		waterTank2.setColor("YELLOW");
		waterTank2.setCapacity(500);
		waterTank2.setPrice(4000d);
		waterTank2.setWarrantyPeriod(10);
		System.out.println(waterTank2);
		
		System.out.println(waterTank2.hashCode());
    
		boolean saved1=waterTankDAO.save(waterTank2);
		System.out.println(saved1);
		System.out.println("----------------------------------------------------------------------");
		
		WaterTankDTO waterTank3 = new WaterTankDTO();
		waterTank3.setBrand("STOREWEL");
		waterTank3.setColor("GREEN");
		waterTank3.setCapacity(1000);
		waterTank3.setPrice(4000d);
		waterTank3.setWarrantyPeriod(30);
		System.out.println(waterTank3);
		
		System.out.println(waterTank3.hashCode());
    
		boolean saved2=waterTankDAO.save(waterTank3);
		System.out.println(saved2);
		System.out.println("------------ ----------------------------------------------------------");
		
		WaterTankDTO waterTank4 = new WaterTankDTO();
		waterTank4.setBrand("MTR");
		waterTank4.setColor("BLUE");
		waterTank4.setCapacity(1500);
		waterTank4.setPrice(9000d);
		waterTank4.setWarrantyPeriod(15);
		System.out.println(waterTank4);
		
		System.out.println(waterTank4.hashCode());
    
		boolean saved3=waterTankDAO.save(waterTank4);
		System.out.println(saved3);
		System.out.println("----------------------------------------------------------------------");
		
		WaterTankDTO waterTank5 = new WaterTankDTO();
		waterTank5.setBrand("LUCKY");
		waterTank5.setColor("BLACK");
		waterTank5.setCapacity(2000);
		waterTank5.setPrice(10000d);
		waterTank5.setWarrantyPeriod(10);
		System.out.println(waterTank5);
		
		System.out.println(waterTank5.hashCode());
    
		boolean saved4=waterTankDAO.save(waterTank5);
		System.out.println(saved4);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
	}

