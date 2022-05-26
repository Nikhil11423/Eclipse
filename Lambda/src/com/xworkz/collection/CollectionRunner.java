package com.xworkz.collection;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.xworkz.collection.dto.AgeDTO;

public class CollectionRunner {

	public static void main(String[] args) {

		List<String> countryName = new LinkedList<String>();
		countryName.add("Albania");
		countryName.add("Algeria");
		countryName.add("Angola");
		countryName.add("Antigua and Barbuda");
		countryName.add("Argentina");
		countryName.add("Armenia");
		countryName.add("Australia");
		countryName.add("Austria");
		countryName.add("Azerbaijan");
		countryName.add("Bahamas");
		countryName.add("Bahrain");
		countryName.add("Bangladesh");
		countryName.add("Barbados");
		countryName.add("Belarus");
		countryName.add("Belgium");
		countryName.add("Belize");
		countryName.add("Benin	");
		countryName.add("Bhutan");
		countryName.add("Bolivia");
		countryName.add("Bosnia and Herzegovina");
		countryName.add("Botswana");
		countryName.add("Brazil");
		countryName.add("Brunei");
		countryName.add("Bulgaria");
		countryName.add("Burkina Faso");
		countryName.add("Burundi");
		countryName.add("Côte d'Ivoire");
		countryName.add("Cabo Verde");
		countryName.add("Cambodia");
		countryName.add("Cameroon");
		countryName.add("Canada");
		countryName.add("Central");
		countryName.add("Chad");
		countryName.add("Chile");
		countryName.add("China");
		countryName.add("Colombia");
		countryName.add("Comoros");
		countryName.add("Congo");
		countryName.add("Costa Rica");
		countryName.add("Croatia");
		countryName.add("Cuba");
		countryName.add("Cyprus");
		countryName.add("Czechia");
		countryName.add("Democratic Republic of the Congo");
		countryName.add("Denmark");
		countryName.add("Djibouti");
		countryName.add("Dominica");
		countryName.add("Dominican Republic");
		countryName.add("Ecuador");
		countryName.add("Egypt");
		countryName.add("El Salvador");
		countryName.add("Equatorial Guinea");
		countryName.add("Eritrea");
		countryName.add("Estonia");
		countryName.add("Eswatini");
		countryName.add("Ethiopia");
		countryName.add("Fiji");
		countryName.add("Finland");
		countryName.add("France");
		countryName.add("Gabon");
		countryName.add("Gambia");
		countryName.add("Georgia");
		countryName.add("Germany");
		countryName.add("Ghana");
		countryName.add("Greece");
		countryName.add("Grenada");
		countryName.add("Guatemala");
		countryName.add("Guinea");
		countryName.add("Guinea-Bissau");
		countryName.add("Guyana");
		countryName.add("Haiti");
		countryName.add("Holy See");
		countryName.add("Honduras");
		countryName.add("Hungary");
		countryName.add("Iceland");
		countryName.add("India");
		countryName.add("Indonesia");
		countryName.add("Iran");
		countryName.add("Iraq");
		countryName.add("Ireland");
		countryName.add("Israel");
		countryName.add("Italy");
		countryName.add("Jamaica");
		countryName.add("Japan");
		countryName.add("Jordan");
		countryName.add("Kazakhstan");
		countryName.add("Kenya	");
		countryName.add("Kiribati");
		countryName.add("Kuwait");
		countryName.add("Kyrgyzstan");
		countryName.add("Laos");
		countryName.add("Latvia");
		countryName.add("Lebanon");
		countryName.add("Lesotho");
		countryName.add("Liberia");
		countryName.add("Libya");
		countryName.add("Liechtenstein");
		countryName.add("Lithuania");
		countryName.add("Luxembourg");
		countryName.add("Madagascar");
		countryName.add("Malawi");
		countryName.add("Malaysia");
		countryName.add("Maldives");
		countryName.add("Mali");
		countryName.add("Malta");
		countryName.add("Marshall Islands");
		countryName.add("Mauritania");
		countryName.add("Mauritius");
		countryName.add("Mexico");
		countryName.add("Micronesia");
		countryName.add("Moldova");
		countryName.add("Monaco");
		countryName.add("Mongolia");
		countryName.add("Montenegro");
		countryName.add("Morocco");
		countryName.add("Mozambique");
		countryName.add("Myanmar");
		countryName.add("Namibia");
		countryName.add("Nauru");
		countryName.add("Nepal");
		countryName.add("Netherlands");
		countryName.add("New Zealand");
		countryName.add("Nicaragua");
		countryName.add("Niger");
		countryName.add("Nigeria");
		countryName.add("North Korea");
		countryName.add("North Macedonia");
		countryName.add("Norway");
		countryName.add("Oman");
		countryName.add("Pakistan");
		countryName.add("Palau");
		countryName.add("Palestine State");
		countryName.add("Panama");
		countryName.add("Papua New Guinea");
		countryName.add("Paraguay");
		countryName.add("Peru");
		countryName.add("Philippines");
		countryName.add("Poland");
		countryName.add("Portugal");
		countryName.add("Qatar");
		countryName.add("Romania");
		countryName.add("Russia");
		countryName.add("Rwanda");
		countryName.add("Saint Kitts and Nevis");
		countryName.add("Saint Lucia");
		countryName.add("Saint Vincent and the Grenadines");
		countryName.add("Samoa");
		countryName.add("San Marino");
		countryName.add("Sao Tome and Principe");
		countryName.add("Saudi Arabia");
		countryName.add("Senegal");
		countryName.add("Serbia");
		countryName.add("Seychelles");
		countryName.add("Sierra Leone");
		countryName.add("Singapore");
		countryName.add("Slovakia");
		countryName.add("Slovenia");
		countryName.add("Solomon Islands");
		countryName.add("Somalia");
		countryName.add("South Africa");
		countryName.add("South Korea");
		countryName.add("South Sudan");
		countryName.add("Spain");
		countryName.add("Sri Lanka");
		countryName.add("Sudan");
		countryName.add("Suriname");
		countryName.add("Sweden");
		countryName.add("Switzerland");
		countryName.add("Syria");
		countryName.add("Tajikistan");
		countryName.add("Tanzania");
		countryName.add("Thailand");
		countryName.add("Timor-Leste");
		countryName.add("Togo");
		countryName.add("Tonga");
		countryName.add("Trinidad and Tobago");
		countryName.add("Tunisia");
		countryName.add("Turkey");
		countryName.add("Turkmenistan");
		countryName.add("Tuvalu");
		countryName.add("Uganda");
		countryName.add("Ukraine");
		countryName.add("United Arab Emirates");
		countryName.add("United Kingdom");
		countryName.add("United States of America");
		countryName.add("Uruguay");
		countryName.add("Uzbekistan");
		countryName.add("Vanuatu");
		countryName.add("Venezuela");
		countryName.add("Vietnam");
		countryName.add("Yemen");
		countryName.add("Zambia");
		countryName.add("Zimbabwe");

		
		Comparator<String> desc = (obj1,obj2)-> {
			return obj2.compareTo(obj1);
		};
		Collections.sort(countryName, desc);
		System.err.println("Country Name in Desc order");


		Predicate<String> predicate=(string) ->{
			return string.endsWith("a");
		};
		List<String> temp=countryName.stream().filter(predicate).collect(Collectors.toList());
		for(String string: temp) {
		System.out.println(string);
		};
		System.out.println("***************************************");
		
		
		List<String> pmNames= new LinkedList<String>();
		pmNames.add("Jawahar Lal Nehru");
		pmNames.add("Gulzarilal Nanda");
		pmNames.add("Lal Bahadur Shastri");
		pmNames.add("Morarji Desai");
		pmNames.add("Charan Singh");
		pmNames.add("Indira Gandhi");
		pmNames.add("Rajiv Gandhi");
		pmNames.add("V. P. Singh");
		pmNames.add("Chandra Shekhar");
		pmNames.add("V. Narasimha Rao");
		pmNames.add("Atal Bihari Vajpayee");
		pmNames.add("H. D. Deve Gowda");
		pmNames.add("Inder Kumar Gujral");
		pmNames.add("Manmohan Singh");
		pmNames.add("Narendra Modi");
		
		Comparator<String> desc1 = (obj1, obj2) -> {
			return obj2.compareTo(obj1);
		};

		Collections.sort(pmNames, desc1);
		System.err.println("PM Names in India");

		Predicate<String> predicate1 = (string) -> {
			return string.startsWith("N");
		};

		List<String> temp1 = pmNames.stream().filter(predicate1).collect(Collectors.toList());
		for (String string1 : temp1) {
			System.out.println(string1);

		}
       
       
		List<String> padmashri = new LinkedList<String>();
		padmashri.add("Gulfam Ahmed");
		padmashri.add("P. Anitha ");
		padmashri.add("Rama Swamy Annavarapu");
		padmashri.add("Dr. Yogi Aeron");
		padmashri.add("Shri Jai Prakash Agarwal");
		padmashri.add("Guru Shashadhar Acharya");
		padmashri.add("Kazi Masum Akhtar");
		padmashri.add("Ms. Gloria Arieira");
		padmashri.add("Khan Zaheerkhan Bakhtiyarkhan");
		padmashri.add("Dr. Padmavathy Bandopadhyay");
		padmashri.add("Dr. Sushovan Banerjee");
		padmashri.add("Dr. Digambar Behera");
		padmashri.add("Dr. Damayanti Beshra");
		padmashri.add("Shri Pawar Popatrao Bhaguji");
		padmashri.add("Shri Himmata Ram Bhambhu");
		padmashri.add("Shri Sanjeev Bikhchandani");
		padmashri.add("Shri Gafurbhai M. Bilakhia");
		padmashri.add("Shri Bob Blackman");
		padmashri.add("Ms. Indira P. P. Bora");
		padmashri.add("Shri Madan Singh Chauhan");
		padmashri.add("Ms. Usha Chaumar");
		padmashri.add("Shri Lil Bahadur Chettri");
		padmashri.add("Ms. Lalitha & Ms. Saroja");
		padmashri.add("Dr. Vajira Chitrasena");
		padmashri.add("Dr. Purushottam Dadheech");
		padmashri.add("Shri Utsav Charan Das");
		padmashri.add("Prof. Indra Dassanayake");
		padmashri.add("Shri H. M. Desai");
		padmashri.add("Shri Manohar Devadoss");
		padmashri.add("Ms. Oinam Bembem Devi");
		padmashri.add("Ms. Lia Diskin");
		padmashri.add("Shri M. P. Ganesh");
		padmashri.add("Dr. Bangalore Gangadhar");
		padmashri.add("Dr. Raman Gangakhedkar");
		padmashri.add("Shri Barry Gardiner");
		padmashri.add("Shri Chewang Motup Goba");
		padmashri.add("Shri Bharat Goenka");
		padmashri.add("Shri Yadla Gopalarao");
		padmashri.add("Shri Mitrabhanu Gountia");
		padmashri.add("Ms. Tulasi Gowda");
		padmashri.add("Shri Sujoy K. Guha");
		padmashri.add("Shri Harekala Hajabba");
		padmashri.add("Shri Enamul Haque");
		padmashri.add("Shri Madhu Mansuri Hasmukh");
		padmashri.add("Abdul Jabbar");
		padmashri.add("Bimal Kumar Jain");
		padmashri.add("Ms. Meenakshi Jain");
		padmashri.add("Nemnath Jain");
		padmashri.add("Ms. Shanti Jain");
		padmashri.add("Karan Johar");
		padmashri.add("Dr. Leela Joshi");
		padmashri.add("Ms. Sarita Joshi");
		padmashri.add("C. Kamlova");
		padmashri.add("Dr. Ravi Kannan R.");
		padmashri.add("Ms. Ekta Kapoor");
		padmashri.add("V. K. Munusamy");
		padmashri.add("Shri M. K. Kunjol");
		padmashri.add("Dr. Narindar Nath Khanna");
		padmashri.add("Naveen Khanna");
		padmashri.add("M. K. Kunjol");
		padmashri.add("Manmohan Maapatra");
		padmashri.add("Ustad Anwar Khan Mangniyar");
		padmashri.add("Kattungal Subramaniam");
		padmashri.add("Munna Master");
		padmashri.add("Prof. Abhiraj Rajendra Mishra");
		padmashri.add("Binapani Mohanty");
		padmashri.add("Dr. Arunoday Mondal");
		padmashri.add("Dr. Prithwindra Mukherjee");
		padmashri.add("Sathyanarayan Mundayoo");
		padmashri.add("Manilal Nag.");
		padmashri.add("N. Chandrasekharan Nair");
		padmashri.add("Dr. Tetsu Nakamura");
		padmashri.add("Shiv Datt Nirmohi");
		padmashri.add("Pu Lalbiakthanga Pachuau");
		padmashri.add("Moozhikkal Pankajakshi");
		padmashri.add("Prasanta Kumar Pattanaik");
		padmashri.add("Jogendra Nath Phukan");
		padmashri.add("Rahibai Soma Popere");
		padmashri.add("Yogesh Praveen");
		padmashri.add("Jitu Rai");
		padmashri.add("Tarundeep Rai");
		padmashri.add("S.Ramakrishnan");
		padmashri.add("Rani Rampal");
		padmashri.add("Kangana Ranaut");
		padmashri.add("Dalavai Chalapathi Rao");
		padmashri.add("Shahbuddin Rathod");
		padmashri.add("Kalyan Singh Rawat");
		padmashri.add("Chintala Venkat Reddy");
		padmashri.add("Smt. (Dr.) Shanti Roy");
		padmashri.add("Radhammohan");
		padmashri.add("Batakrushna Sahoo");
		padmashri.add("Trinity Saioo");
		padmashri.add("Adnan Sami");
		padmashri.add("Vijay Sankeshwar");
		padmashri.add("Dr. Kushal Konwar Sarma");
		padmashri.add("Sayed Mehboob Shah Qadri");
		padmashri.add("Mohammed Sharif");
		padmashri.add("Shyam Sunder Sharma");
		padmashri.add("Dr. Gurdip Singh");
		padmashri.add("Ramjee Singh");
		padmashri.add("Gulfam Ahmed");
		padmashri.add("P. Anitha ");
		padmashri.add("Rama Swamy Annavarapu");
		padmashri.add("Dr. Yogi Aeron");
		padmashri.add("Shri Jai Prakash Agarwal");
		padmashri.add("Guru Shashadhar Acharya");
		padmashri.add("Kazi Masum Akhtar");
		padmashri.add("Ms. Gloria Arieira");
		padmashri.add("Khan Zaheerkhan Bakhtiyarkhan");
		padmashri.add("Dr. Padmavathy Bandopadhyay");
		padmashri.add("Dr. Sushovan Banerjee");
		padmashri.add("Dr. Digambar Behera");
		padmashri.add("Dr. Damayanti Beshra");
		padmashri.add("Shri Pawar Popatrao Bhaguji");
		padmashri.add("Shri Himmata Ram Bhambhu");
		padmashri.add("Shri Sanjeev Bikhchandani");
		padmashri.add("Shri Gafurbhai M. Bilakhia");
		padmashri.add("Shri Bob Blackman");
		padmashri.add("Ms. Indira P. P. Bora");
		padmashri.add("Shri Madan Singh Chauhan");
		padmashri.add("Ms. Usha Chaumar");
		padmashri.add("Shri Lil Bahadur Chettri");
		padmashri.add("Ms. Lalitha & Ms. Saroja");
		padmashri.add("Dr. Vajira Chitrasena");
		padmashri.add("Dr. Purushottam Dadheech");
		padmashri.add("Shri Utsav Charan Das");
		padmashri.add("Prof. Indra Dassanayake");
		padmashri.add("Shri H. M. Desai");
		padmashri.add("Shri Manohar Devadoss");
		padmashri.add("Ms. Oinam Bembem Devi");
		padmashri.add("Ms. Lia Diskin");
		padmashri.add("Shri M. P. Ganesh");
		padmashri.add("Dr. Bangalore Gangadhar");
		padmashri.add("Dr. Raman Gangakhedkar");
		padmashri.add("Shri Barry Gardiner");
		padmashri.add("Shri Chewang Motup Goba");
		padmashri.add("Shri Bharat Goenka");
		padmashri.add("Shri Yadla Gopalarao");
		padmashri.add("Shri Mitrabhanu Gountia");
		padmashri.add("Ms. Tulasi Gowda");
		padmashri.add("Shri Sujoy K. Guha");
		padmashri.add("Shri Harekala Hajabba");
		padmashri.add("Shri Enamul Haque");
		padmashri.add("Shri Madhu Mansuri Hasmukh");
		padmashri.add("Abdul Jabbar");
		padmashri.add("Bimal Kumar Jain");
		padmashri.add("Ms. Meenakshi Jain");
		padmashri.add("Nemnath Jain");
		padmashri.add("Ms. Shanti Jain");
		padmashri.add("Karan Johar");
		padmashri.add("Dr. Leela Joshi");
		padmashri.add("Ms. Sarita Joshi");
		padmashri.add("C. Kamlova");
		padmashri.add("Dr. Ravi Kannan R.");
		padmashri.add("Ms. Ekta Kapoor");
		padmashri.add("V. K. Munusamy");
		padmashri.add("Shri M. K. Kunjol");
		padmashri.add("Dr. Narindar Nath Khanna");
		padmashri.add("Naveen Khanna");
		padmashri.add("M. K. Kunjol");
		padmashri.add("Manmohan Maapatra");
		padmashri.add("Ustad Anwar Khan Mangniyar");
		padmashri.add("Kattungal Subramaniam");
		padmashri.add("Munna Master");
		padmashri.add("Prof. Abhiraj Rajendra Mishra");
		padmashri.add("Binapani Mohanty");
		padmashri.add("Dr. Arunoday Mondal");
		padmashri.add("Dr. Prithwindra Mukherjee");
		padmashri.add("Sathyanarayan Mundayoo");
		padmashri.add("Manilal Nag.");
		padmashri.add("N. Chandrasekharan Nair");
		padmashri.add("Dr. Tetsu Nakamura");
		padmashri.add("Shiv Datt Nirmohi");
		padmashri.add("Pu Lalbiakthanga Pachuau");
		padmashri.add("Moozhikkal Pankajakshi");
		padmashri.add("Prasanta Kumar Pattanaik");
		padmashri.add("Jogendra Nath Phukan");
		padmashri.add("Rahibai Soma Popere");
		padmashri.add("Yogesh Praveen");
		padmashri.add("Jitu Rai");
		padmashri.add("Tarundeep Rai");
		padmashri.add("S.Ramakrishnan");
		padmashri.add("Rani Rampal");
		padmashri.add("Kangana Ranaut");
		padmashri.add("Dalavai Chalapathi Rao");
		padmashri.add("Shahbuddin Rathod");
		padmashri.add("Kalyan Singh Rawat");
		padmashri.add("Chintala Venkat Reddy");
		padmashri.add("Smt. (Dr.) Shanti Roy");
		padmashri.add("Radhammohan");
		padmashri.add("Batakrushna Sahoo");
		padmashri.add("Trinity Saioo");
		padmashri.add("Adnan Sami");
		padmashri.add("Vijay Sankeshwar");
		padmashri.add("Dr. Kushal Konwar Sarma");
		padmashri.add("Sayed Mehboob Shah Qadri");
		padmashri.add("Mohammed Sharif");
		padmashri.add("Shyam Sunder Sharma");
		padmashri.add("Dr. Gurdip Singh");
		padmashri.add("Ramjee Singh");
		padmashri.add("Vashishtha Narayan Singh");
		padmashri.add("Daya Prakash Sinha");
		padmashri.add("Dr. Sandra Desa Souza");
		padmashri.add("Vijayasarathi Sribhashyam");
		padmashri.add("Javed Ahmad Tak");
		padmashri.add("Pradeep Thalappil");
		padmashri.add("Yeshe Dorjee Thongchi");
		padmashri.add("Robert Thurman");
		padmashri.add("Agus Indra Udayana");
		padmashri.add(" Harish Chandra Verma");
		padmashri.add("Sundaram Verma");
		padmashri.add("Dr. Romesh Tekchand");
		padmashri.add("Prem Watsa");
		padmashri.add(" Suresh ");
		padmashri.add("Vashishtha Narayan Singh");
		padmashri.add("Daya Prakash Sinha");
		padmashri.add("Dr. Sandra Desa Souza");
		padmashri.add("Vijayasarathi Sribhashyam");
		padmashri.add("Javed Ahmad Tak");
		padmashri.add("Pradeep Thalappil");
		padmashri.add("Yeshe Dorjee Thongchi");
		padmashri.add("Robert Thurman");
		padmashri.add("Agus Indra Udayana");
		padmashri.add(" Harish Chandra Verma");
		padmashri.add("Sundaram Verma");
		padmashri.add("Dr. Romesh Tekchand");
		padmashri.add("Prem Watsa");
		padmashri.add(" Suresh ");
		
		Comparator<String> desc2 = (P1,P2) -> {
			return P2.compareTo(P1);
		};

		Collections.sort(padmashri, desc2);
		System.err.println("PadmashriAwardees Name in Desc order");

		for(String str : padmashri) {
			System.out.println(str);
		};	
		
		List<String> actorsName = new LinkedList<String>();
		actorsName.add("Rajkumar");
		actorsName.add("Vishnuvardhan");
		actorsName.add("Ambarish");
		actorsName.add("B.S. Dwarakish");
		actorsName.add("V. Ravichandran");
		actorsName.add("Anant Nag");
		actorsName.add("Shankar Nag");
		actorsName.add("Jai Jagdeesh");
		actorsName.add("Prakash Raj");
		actorsName.add("Ramesh Aravind");
		actorsName.add("Shashikumar");
		actorsName.add("Jaggesh");
		actorsName.add("Sudeep");
		actorsName.add("Sai Kumar");
		actorsName.add("Upendra");
		actorsName.add("Sharan");
		actorsName.add("Diganth");
		actorsName.add("Sathish Neenasam");
		actorsName.add("Ajay Rao");
		actorsName.add(" Chiranjeevi Sarja");
		actorsName.add("Vijay Raghavendra");
		actorsName.add("Rakshit Shetty");
		actorsName.add("Harish Raj");
		actorsName.add("Naveen Krishna");
		actorsName.add(" Kishore Kumar G");
		actorsName.add(" Srinath");
		actorsName.add("Lokesh");
		actorsName.add("Ganesh");
		actorsName.add("Darshan Thoogudeep");
		actorsName.add("Punith Rajkumar");
		actorsName.add("Shiva Rajkumar");
		actorsName.add("Yash");
		actorsName.add("Vijay");
		actorsName.add("Aditya");
		actorsName.add("Prajwal Devaraj");
		actorsName.add("Sriimurali");
		actorsName.add("Srinagar Kitty");
		actorsName.add("Kajal Agarwal");
		actorsName.add("Amulya");
		actorsName.add(" Deepa Sannidhi");
		actorsName.add("Samyukhta Hegde");
		actorsName.add("Hari Priya");
		actorsName.add("Shanvi Shrivastava");
		actorsName.add("Rashmika Mandanna");
		actorsName.add("Shruthi Hariharan");
		actorsName.add(" Radhika Pandit");
		actorsName.add("Rachitha Ram");
		actorsName.add("Shraddha Srinath");
		actorsName.add("Amy Jackson");
		actorsName.add("Neha Malik");
		
		Comparator<String> desc3 = (obj1, obj2) -> {
			return obj2.compareTo(obj1);
		};
		Collections.sort(actorsName, desc3);
		System.err.println("Actors Name in Desc order");

		Predicate<String> predicate4 = (string) -> {
			return string.contains("ma");
		};

		List<String> temp4 = actorsName.stream().filter(predicate).collect(Collectors.toList());
		for (String string3 : temp4) {
			System.out.println(string3);
		}

		System.err.println("***********Naguvin Odeya Punith Rajkumar******************");

		Predicate<String> predicate5 = (string) -> {
			return !string.contains("Ra");
		};
		List<String> temp5 = actorsName.stream().filter(predicate1).collect(Collectors.toList());
		for (String string1 : temp5) {
			System.out.println(string1);
		}
	    
		
		
		List<String> rcbPlayersName = new LinkedList<String>();
		rcbPlayersName.add("Rahul Dravid");
		rcbPlayersName.add("Bharath Chipli");
		rcbPlayersName.add("Wasim Jaffer");
		rcbPlayersName.add("Shivnarine Chanderpaul");
		rcbPlayersName.add("Shreevats Goswami");
		rcbPlayersName.add("Sunil Joshi");
		rcbPlayersName.add("Anil Kumble");
		rcbPlayersName.add("Misbah-ul-Haq");
		rcbPlayersName.add("Chris Gayle");
		rcbPlayersName.add("Mitchell Starc");
		rcbPlayersName.add("Yuvraj Singh");
		rcbPlayersName.add("Parthiv Patel");
		rcbPlayersName.add("Ravi Rampaul");
		rcbPlayersName.add("Virat Kohli");
		rcbPlayersName.add("Glenn Maxwell");
		rcbPlayersName.add("Mohammad Siraj");
		rcbPlayersName.add("Faf Du Plessis");
		rcbPlayersName.add("Harshal Patel");
		rcbPlayersName.add("Anuj Rawat");
		rcbPlayersName.add("Akash Deep");
		rcbPlayersName.add("Wanindu Hasaranga");
		rcbPlayersName.add("Dinesh Karthik");
		rcbPlayersName.add("Shahbaz Ahmed");
		rcbPlayersName.add("Josh Hazlewood");
		rcbPlayersName.add("AB de Villiers");
		rcbPlayersName.add("Yuzvendra Chahal ");
		rcbPlayersName.add("Devdutt Padikkal ");
		rcbPlayersName.add("Navdeep Saini");
		rcbPlayersName.add("Pavan Deshpande");
		rcbPlayersName.add("Sachin Baby ");
		rcbPlayersName.add("Rajat Patidar");
		rcbPlayersName.add("Mohammed Azharuddeen");
		rcbPlayersName.add("Kyle Jamieson");
		rcbPlayersName.add("Dan Christian");
		rcbPlayersName.add("Suyesh Prabhudessai");
		rcbPlayersName.add("KS Bharat");
		rcbPlayersName.add("Tim David ");
		rcbPlayersName.add("Dushmantha Chameera");
		rcbPlayersName.add("Wanindu Hasarangal ");
		rcbPlayersName.add("Akash Deep ");
		rcbPlayersName.add("George Garton");
		
		Comparator<String> desc5 = (rcb1, rcb2) -> {
			return rcb2.compareTo(rcb1);
		};
		Collections.sort(rcbPlayersName, desc5);
		System.err.println("RCB Players Name in Desc order");

		Predicate<String> predicate6 = (string) -> {
			return !string.contains("S");
		};
		List<String> temp6 = rcbPlayersName.stream().filter(predicate6).collect(Collectors.toList());
		for (String string : temp6) {
			System.out.println(string);
		}
		System.err.println("*********RCB E SALA CUP NAMADE**********************");
		Predicate<String> Predicate6 = (string) -> {
			return !string.contains("D");
		};
		List<String> temp7 = rcbPlayersName.stream().filter(Predicate6).collect(Collectors.toList());
		for (String string1 : temp7) {
			System.out.println(string1);
		}

		AgeDTO age1 = new AgeDTO("Rajshekar", 29);
		AgeDTO age2 = new AgeDTO("Suraj", 25);
		AgeDTO age3 = new AgeDTO("Srinath", 26);
		AgeDTO age4 = new AgeDTO("Nikhil", 26);
		AgeDTO age5 = new AgeDTO("Suhas", 25);
		AgeDTO age6 = new AgeDTO("Pratheek", 24);
		AgeDTO age7 = new AgeDTO("Shankar", 22);
		AgeDTO age8 = new AgeDTO("Yashwanth", 25);
		AgeDTO age9 = new AgeDTO("Ramesh", 26);
		AgeDTO age10 = new AgeDTO("Sanjay", 25);
		AgeDTO age11 = new AgeDTO("Prabhakar", 25);
		AgeDTO age12 = new AgeDTO("Sathya", 25);
		AgeDTO age13 = new AgeDTO("Raghu", 24);
		AgeDTO age14 = new AgeDTO("Rohini", 24);
		AgeDTO age15 = new AgeDTO("Arpitha", 23);
		AgeDTO age16 = new AgeDTO("Shwetha", 23);
		AgeDTO age17 = new AgeDTO("Lakshmi", 23);
		AgeDTO age18 = new AgeDTO("Sowmya", 21);
		AgeDTO age19 = new AgeDTO("Saraswathi", 22);
		AgeDTO age20 = new AgeDTO("Rajini", 21);
		AgeDTO age21 = new AgeDTO("Rachitha", 22);
		AgeDTO age22 = new AgeDTO("Ranjitha", 22);
		AgeDTO age23 = new AgeDTO("Chandana", 22);

		List<AgeDTO> age = new LinkedList<AgeDTO>();
		age.add(age1);
		age.add(age2);
		age.add(age3);
		age.add(age4);
		age.add(age5);
		age.add(age6);
		age.add(age7);
		age.add(age8);
		age.add(age9);
		age.add(age10);
		age.add(age11);
		age.add(age12);
		age.add(age13);
		age.add(age14);
		age.add(age15);
		age.add(age16);
		age.add(age17);
		age.add(age18);
		age.add(age19);
		age.add(age20);
		age.add(age21);
		age.add(age22);
		age.add(age23);

		Comparator<AgeDTO> descAge = (c1, c2) -> {
			Integer c1age = c1.getAge();
			Integer c2age = c2.getAge();
			return c2age.compareTo(c1age);
		};
		Collections.sort(age, descAge);
		System.err.println("The age in descending order");
		for (AgeDTO ageDTO : age) {
			System.out.println(ageDTO);
		}

		System.err.println(" ");
		Predicate<Integer> predicate8 = p -> {
			if (p > 25)
				return true;
			return false;
		};
		System.out.println(predicate8.test(29));
		for (AgeDTO ageDTO : age) {
			System.out.println(ageDTO);

		}
	}
	}

