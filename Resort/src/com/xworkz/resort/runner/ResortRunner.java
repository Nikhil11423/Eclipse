package com.xworkz.resort.runner;

import java.sql.Connection;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.resort.dao.ResortDAO;
import com.xworkz.resort.dao.ResortDAOImpl;
import com.xworkz.resort.dto.ResortDTO;

public class ResortRunner {

	public static void main(String[] args) {

		ResortDTO dto1 = new ResortDTO(0, "SSS Resort","Rakesh","Bangalore", 6000, 2,LocalDate.of(2022, 9, 10),"India", false, false,LocalTime.of(12, 10),LocalTime.of(9, 10), 7,"Satya", 9,LocalDate.of(2020, 2, 10), "suraj","Sunil", 1, false, 1, 10,"Borgaon","Nipani","Belagavi","Karnatka", 755676898,"king@gmail.com", "no", false, 1, 20, false, false,"rahul", 1, LocalTime.of(8, 00), false, false, false, false, 20,8);
		ResortDTO dto2 = new ResortDTO(0, "KMF Resort","amol","Nipani", 7050, 4,LocalDate.of(2022, 10, 11),"India", false, false,LocalTime.of(2, 11),LocalTime.of(7, 8), 7,"Appu", 10,LocalDate.of(2019, 7, 12), "bharamma","Sun", 1, false, 1, 10,"belagavi","Nipani","Belagavi","Karnatka", 755676898,"king@gmail.com", "no", false, 1, 20, false, false,"rahul", 1, LocalTime.of(8, 00), false, false, false, false, 25,8);
		ResortDTO dto3 = new ResortDTO(0, "mkl Resort","akshata","Bhoj", 2100, 5,LocalDate.of(2022, 11, 12),"India", false, false,LocalTime.of(1, 20),LocalTime.of(5, 16), 7,"Irfan", 12,LocalDate.of(2021, 9, 15), "kiriti","Suman", 1, false, 1, 10,"bnbf","Nipani","Belagavi","Karnatka", 755676898,"king@gmail.com", "no", false, 1, 20, false, false,"rahul", 1, LocalTime.of(8, 00), false, false, false, false, 2,8);

		
		ResortDAO dao = new ResortDAOImpl();
		//dao.save(dto1);
		//dao.save(dto2);
		
		Collection<ResortDTO> dto = new ArrayList<>();
	    dto.add(dto1);
	    dto.add(dto2);
	    dto.add(dto3);
        dao.save(dto);
       // dao.save();
				
	   // System.out.println(dto);

		/*dao.updatePriceByName("Belagavi resort", 5400);

		System.err.println("**************updatePriceByName**********************");

		dao.updateReceptionistNameByid("raghu", 4);

		System.err.println("***************updateReceptionistNameByid*********************");

		dao.updatePriceAndRatingByName("Belagavi resort", 4, 420);

		System.err.println("***************getByid*********************");
		
		ResortDTO res=dao.getByid(6);
		System.out.println(res);
		
		System.err.println("***************getByName*********************");

		ResortDTO res1=dao.getByName("KGF resort");
		System.out.println(res1);
		
		System.err.println("***************getByNameAndLocation*********************");

		ResortDTO res2=dao.getByNameAndLocation("Belagavi resort", "ChoralaGhat");
		System.out.println(res2);
		
		System.err.println("***************countrows*********************");
		
		int res3=dao.getTotalRows();
		System.out.println(res3);

		System.err.println("*************getByNameAndLocationAndOwnerName***********************");

		ResortDTO res4=dao.getByNameAndLocationAndOwnerName("Belagavi resort", "ChoralaGhat","kiran");
		System.out.println(res4);
		
		System.err.println("*************getCheckInTimeByName***********************");

		LocalTime res5=dao.getCheckInTimeByName("Suraj resort");
		System.out.println(res5);
		
		System.err.println("*************getByMaxPrice***********************");

	     ResortDTO res6=dao.getByMaxPrice();
	     System.out.println(res6);
			
	   System.err.println("*************getByMinPrice***********************");

	   ResortDTO res7=dao.getByMinPrice();
	     System.out.println(res7);*/
	}

}
