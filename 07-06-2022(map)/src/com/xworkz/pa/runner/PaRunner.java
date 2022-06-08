package com.xworkz.pa.runner;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.Set;
import java.util.TreeMap;

import com.xworkz.person.dto.AddressDTO;
import com.xworkz.person.dto.PersonDTO;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PaRunner {

	public static void main(String[] args) {

		PersonDTO person1 = new PersonDTO(1, "Geeta", "geeta661@gmail.com", 8904567990d);
		PersonDTO person2 = new PersonDTO(2, "Raju", "rajub6961@gmail.com", 8904239912d);
		PersonDTO person3 = new PersonDTO(3, "Latika ", "basannavarlatiak12@gmail.com", 6362686772d);
		PersonDTO person4 = new PersonDTO(4, "Nikhil ", "nikhil3216@gmail.com", 7204750578d);
		PersonDTO person5 = new PersonDTO(5, "Sushama ", "sush123@gmail.com", 9901361433d);
		PersonDTO person6 = new PersonDTO(6, "xyz", "xyz1467@gmail.com", 9876543211d);
		PersonDTO person7 = new PersonDTO(7, "Manoj", "manojbasan@gmail.com", 8866543213d);
		PersonDTO person8 = new PersonDTO(8, "Tanuja ", "tanuja2877@gmail.com", 9844423691d);
		PersonDTO person9 = new PersonDTO(9, "Tanmay ", "tanmaykgf@gmail.com", 9877665544d);
		PersonDTO person10 = new PersonDTO(10, "Bhupal ", "bhupal1008@gmail.com", 9876543211d);

		AddressDTO address1 = new AddressDTO(1, "Basannavar Galli", "18/4f", "Borgaon");
		AddressDTO address2 = new AddressDTO(2, "Basannavar Galli", "18/4f", "Borgaon");
		AddressDTO address3 = new AddressDTO(3, "Basannavar Galli", "18/4f", "Borgaon");
		AddressDTO address4 = new AddressDTO(4, "Basannavar Galli", "18/4f", "Borgaon");
		AddressDTO address5 = new AddressDTO(5, "Basannavar Galli", "18/4f", "Borgaon");
		AddressDTO address6 = new AddressDTO(6, "Basannavar Galli", "18/4f", "Borgaon");
		AddressDTO address7 = new AddressDTO(7, "Basannavar Galli", "18/4f", "Borgaon");
		AddressDTO address8 = new AddressDTO(8, "Basannavar Galli", "18/4f", "Borgaon");
		AddressDTO address9 = new AddressDTO(9, "Basannavar Galli", "18/4f", "Borgaon");
		AddressDTO address10 = new AddressDTO(10, "Basannavar Galli", "18/4f", "Borgaon");

		PersonDTO person11 = new PersonDTO(11, "Dharani", "Dharani.xworkz@gamil.com", 9164078564D);
		PersonDTO person12 = new PersonDTO(12, "Rohini", "Rohini.xworkz@gamil.com", 9164088564D);
		PersonDTO person13 = new PersonDTO(13, "Sharu", "Sharu.xworkz@gamil.com", 9164098564D);
		PersonDTO person14 = new PersonDTO(14, "rohi", "rohi.xworkz@gamil.com", 9164048664D);
		PersonDTO person15 = new PersonDTO(15, "parmesh", "parmesh.xworkz@gamil.com", 9164048764D);
		PersonDTO person16 = new PersonDTO(16, "yogesh", "yogesh.xworkz@gamil.com", 9164048864D);
		PersonDTO person17 = new PersonDTO(17, "vinay", "vinay.xworkz@gamil.com", 9164048964D);
		PersonDTO person18 = new PersonDTO(18, "vimala", "vimala.xworkz@gamil.com", 9164048574D);
		PersonDTO person19 = new PersonDTO(19, "varun", "varun.xworkz@gamil.com", 9164048584D);
		PersonDTO person20 = new PersonDTO(20, "virupaksh", "virupaksh.xworkz@gamil.com", 9164048594D);

		AddressDTO address11 = new AddressDTO(11, "Temple road 2nd cross", "27/4", "Chikkamagalur");
		AddressDTO address12 = new AddressDTO(12, "Temple road 2nd cross", "27/4", "Chikkamagalur");
		AddressDTO address13 = new AddressDTO(13, "Temple road 2nd cross", "27/4", "Chikkamagalur");
		AddressDTO address14 = new AddressDTO(14, "Temple road 2nd cross", "27/4", "Chikkamagalur");
		AddressDTO address15 = new AddressDTO(15, "Temple road 2nd cross", "27/4", "Chikkamagalur");
		AddressDTO address16 = new AddressDTO(16, "Temple road 2nd cross", "27/4", "Chikkamagalur");
		AddressDTO address17 = new AddressDTO(17, "Temple road 2nd cross", "27/4", "Chikkamagalur");
		AddressDTO address18 = new AddressDTO(18, "Temple road 2nd cross", "27/4", "Chikkamagalur");
		AddressDTO address19 = new AddressDTO(19, "Temple road 2nd cross", "27/4", "Chikkamagalur");
		AddressDTO address20 = new AddressDTO(20, "Temple road 2nd cross", "27/4", "Chikkamagalur");

		PersonDTO person21 = new PersonDTO(21, "Bharamma", "bharamma.xworkz@gamil.com", 9164038563D);
		PersonDTO person22 = new PersonDTO(22, "Punarv", "Punarv.xworkz@gamil.com", 9164038564D);
		PersonDTO person23 = new PersonDTO(23, "Jeevan", "Jeevan.xworkz@gamil.com", 9164038565D);
		PersonDTO person24 = new PersonDTO(24, "Bhavya", "Bhavya.xworkz@gamil.com", 9164038566D);
		PersonDTO person25 = new PersonDTO(25, "Vasu", "Vasu.xworkz@gamil.com", 9164038567D);
		PersonDTO person26 = new PersonDTO(26, "Megha", "Megha.xworkz@gamil.com", 9164038568D);
		PersonDTO person27 = new PersonDTO(27, "Anu", "Anu.xworkz@gamil.com", 9164038569D);
		PersonDTO person28 = new PersonDTO(28, "Jamuna", "Jamuna.xworkz@gamil.com", 9164048564D);
		PersonDTO person29 = new PersonDTO(29, "Mahesh", "Mahesh.xworkz@gamil.com", 9164058564D);
		PersonDTO person30 = new PersonDTO(30, "Kiran", "Kiran.xworkz@gamil.com", 9164068564D);

		AddressDTO address21 = new AddressDTO(21, "Primary School road", "18/3", "Kadur");
		AddressDTO address22 = new AddressDTO(22, "Primary School road", "18/3", "Kadur");
		AddressDTO address23 = new AddressDTO(23, "Primary School road", "18/3", "Kadur");
		AddressDTO address24 = new AddressDTO(24, "Primary School road", "18/3", "Kadur");
		AddressDTO address25 = new AddressDTO(25, "Primary School road", "18/3", "Kadur");
		AddressDTO address26 = new AddressDTO(26, "Primary School road", "18/3", "Kadur");
		AddressDTO address27 = new AddressDTO(27, "Primary School road", "18/3", "Kadur");
		AddressDTO address28 = new AddressDTO(28, "Primary School road", "18/3", "Kadur");
		AddressDTO address29 = new AddressDTO(29, "Primary School road", "18/3", "Kadur");
		AddressDTO address30 = new AddressDTO(30, "Primary School road", "18/3", "Kadur");

		PersonDTO person31 = new PersonDTO(31, "Mallutai", "mallutaib234@gmail.com", 9901367824d);
		PersonDTO person32 = new PersonDTO(32, "Sudarshan ", "sudarshan1167@gmail.com", 9743564722d);
		PersonDTO person33 = new PersonDTO(33, "Titiksha ", "titik1009@gmail.com", 943343211d);
		PersonDTO person34 = new PersonDTO(34, "Shubham", "shubhaman12@gmail.com", 9276543221d);
		PersonDTO person35 = new PersonDTO(35, "Sandeep ", "sandeep1111@gmail.com", 8412162399d);
		PersonDTO person36 = new PersonDTO(36, "Pavitra ", "pavi1099@gmail.com", 9876453210d);
		PersonDTO person37 = new PersonDTO(37, "Santosh", "santub108@gmail.com", 9873458108d);
		PersonDTO person38 = new PersonDTO(38, "Pallavi ", "sultanavarpallu@gmail.com", 9768909192d);
		PersonDTO person39 = new PersonDTO(39, "Amol ", "amolppp@gmail.com", 9876543211d);
		PersonDTO person40 = new PersonDTO(40, "Akshay ", "akshaykumbhar10544@gmail.com", 7795965165d);

		AddressDTO address31 = new AddressDTO(31, "Basannavar Galli", "18/4f", "Borgaon");
		AddressDTO address32 = new AddressDTO(32, "Basthi Galli", "29", "Dattawad");
		AddressDTO address33 = new AddressDTO(33, "Basthi Galli", "29", "Dattawad");
		AddressDTO address34 = new AddressDTO(34, "Basthi Galli", "29", "Dattawad");
		AddressDTO address35 = new AddressDTO(35, "Basannavar Galli", "18/4f", "Borgaon");
		AddressDTO address36 = new AddressDTO(36, "Basannavar Galli", "18/4f", "Borgaon");
		AddressDTO address37 = new AddressDTO(37, "Ramtirth Nagar", "29/7", "Belagavi");
		AddressDTO address38 = new AddressDTO(38, "Ramtirth Nagar", "29/7", "Belagavi");
		AddressDTO address39 = new AddressDTO(39, "Patil Galli", "142", "Borgaon");
		AddressDTO address40 = new AddressDTO(40, "Kumbhar Maddi", "111", "Borgaon");

		PersonDTO person41 = new PersonDTO(41, "Akshay ", "akkik507@gmail.com", 7790952341d);
		PersonDTO person42 = new PersonDTO(42, "Akshay ", "akshayuemshg47@gmail.com", 9860327890d);
		PersonDTO person43 = new PersonDTO(43, "Lakkapa", "lakkappa122@gmail.com", 9023411101d);
		PersonDTO person44 = new PersonDTO(44, "Appayar", "appa777@gmail.com", 637686758d);
		PersonDTO person45 = new PersonDTO(45, "Suyog", "psuyog1995@gmail.com", 8050342612d);
		PersonDTO person46 = new PersonDTO(46, "Rahul", "rahula67@gmail.com", 7795903321d);
		PersonDTO person47 = new PersonDTO(47, "Sanket", "sanku333@gmail.com", 7780778283d);
		PersonDTO person48 = new PersonDTO(48, "Huvappa", "huppa17@gmail.com", 8840004244d);
		PersonDTO person49 = new PersonDTO(49, "Anup", "anupp07@gmail.com", 9843789908d);
		PersonDTO person50 = new PersonDTO(50, "Milind", "bmilid@gmail.com", 9839090909d);

		AddressDTO address41 = new AddressDTO(41, "Siddeshwar Colony", "3", "Borgaon");
		AddressDTO address42 = new AddressDTO(42, "Kumbhar Galli", "308", "Borgaon");
		AddressDTO address43 = new AddressDTO(43, "Kallasipalya", "26", "Sutghatti");
		AddressDTO address44 = new AddressDTO(44, "Badigher Galli", "112", "Mugulkod");
		AddressDTO address45 = new AddressDTO(45, "siddarud Colony", "108/4", "Nipani");
		AddressDTO address46 = new AddressDTO(46, "Main road 2 cross", "2029", "Athani");
		AddressDTO address47 = new AddressDTO(47, "Govt hospital near", "18/9", "Borgaon");
		AddressDTO address48 = new AddressDTO(48, "Madiwal Galli", "334", "Borgaon");
		AddressDTO address49 = new AddressDTO(49, "Kalkute Galli", "279", "Borgaon");
		AddressDTO address50 = new AddressDTO(50, "Firgannavar Galli", "7/12", "Borgaon");

		PersonDTO person51 = new PersonDTO(51, "Abhinandan", "abhuk348@gmail.com", 9839090909d);
		PersonDTO person52 = new PersonDTO(52, "Akash", "akash.xworkz@gmail.com", 8857645322d);
		PersonDTO person53 = new PersonDTO(53, "Amruta", "amruta.xworkz@gmail.com", 9876543299d);
		PersonDTO person54 = new PersonDTO(54, "priyanka", "priyanka.xworkz@gmail.com", 9756902143d);
		PersonDTO person55 = new PersonDTO(55, "suman", "suman11.xworkz@gmail.com", 90234567890d);
		PersonDTO person56 = new PersonDTO(56, "Akshata", "akshata.xworkz@gmail.com", 8809123377d);
		PersonDTO person57 = new PersonDTO(57, "Varsha", "varsha.xworkz@gmail.com", 9044129809d);
		PersonDTO person58 = new PersonDTO(58, "Pragai", "pragai.xworkz@gmail.com", 9999222333d);
		PersonDTO person59 = new PersonDTO(59, "Shruti", "shruti.xworkz@gmail.com", 8711991199d);
		PersonDTO person60 = new PersonDTO(60, "Maduri", "maduri.xworkz@gmail.com", 7205889982d);

		AddressDTO address51 = new AddressDTO(51, "Neharu Nagar", "100/8", "Belagavi");
		AddressDTO address52 = new AddressDTO(52, "Neharu Nagar", "100/8", "Belagavi");
		AddressDTO address53 = new AddressDTO(53, "Neharu Nagar", "100/8", "Belagavi");
		AddressDTO address54 = new AddressDTO(54, "Neharu Nagar", "100/8", "Belagavi");
		AddressDTO address55 = new AddressDTO(55, "Neharu Nagar", "100/8", "Belagavi");
		AddressDTO address56 = new AddressDTO(56, "Neharu Nagar", "100/8", "Belagavi");
		AddressDTO address57 = new AddressDTO(57, "Neharu Nagar", "100/8", "Belagavi");
		AddressDTO address58 = new AddressDTO(58, "Neharu Nagar", "100/8", "Belagavi");
		AddressDTO address59 = new AddressDTO(59, "Neharu Nagar", "100/8", "Belagavi");
		AddressDTO address60 = new AddressDTO(60, "Neharu Nagar", "100/8", "Belagavi");

		PersonDTO person61 = new PersonDTO(61, "Rashmi", "rashmi.xworkz@gmail.com", 7205889982d);
		PersonDTO person62 = new PersonDTO(62, "Suraj", "suraj.xworkz@gmail.com", 9822583599d);
		PersonDTO person63 = new PersonDTO(63, "Srinath", "srinath.xworkz@gmail.com", 9087654322d);
		PersonDTO person64 = new PersonDTO(64, "Uday", "uday.xworkz@gmail.com", 7203678797d);
		PersonDTO person65 = new PersonDTO(65, "Shri", "shri.xworkz@gmail.com", 9797971008d);
		PersonDTO person66 = new PersonDTO(66, "Dhnaraj", "dhanraj.xworkz@gmail.com", 9982700345d);
		PersonDTO person67 = new PersonDTO(67, "Sachin", "sachin.xworkz@gmail.com", 7205897079d);
		PersonDTO person68 = new PersonDTO(68, "Ankita", "ankita.xworkz@gmail.com", 8998287667d);
		PersonDTO person69 = new PersonDTO(69, "maddu", "maddu.xworkz@gmail.com", 7205889982d);
		PersonDTO person70 = new PersonDTO(70, "Duddaya", "dundu.xworkz@gmail.com", 7202750577d);
		PersonDTO person71 = new PersonDTO(71, "Sunil", "sunil.xworkz@gmail.com", 8856789012d);

		AddressDTO address61 = new AddressDTO(61, "Electronic city", "11/8", "Bangalore");
		AddressDTO address62 = new AddressDTO(62, "Electronic city", "11/8", "Bangalore");
		AddressDTO address63 = new AddressDTO(63, "Electronic city", "18/8", "Bangalore");
		AddressDTO address64 = new AddressDTO(64, "Electronic city", "10", "Bangalore");
		AddressDTO address65 = new AddressDTO(65, "Electronic city", "27/09", "Bangalore");
		AddressDTO address66 = new AddressDTO(66, "Jaynagar", "376/3", "Bangalore");
		AddressDTO address67 = new AddressDTO(67, "Jaynagar", "45/5", "Bangalore");
		AddressDTO address68 = new AddressDTO(68, "Jaynagar", "123/9", "Bangalore");
		AddressDTO address69 = new AddressDTO(69, "J P Nagar", "10/3", "Bangalore");
		AddressDTO address70 = new AddressDTO(70, "J P Nagar", "112/4", "Bangalore");

		PersonDTO person72 = new PersonDTO(72, "Rakesh", "rakesh.xworkz@gmail.com", 997341249d);
		PersonDTO person73 = new PersonDTO(73, "Deppali", "deppali.xworkz@gmail.com", 7368987654d);
		PersonDTO person74 = new PersonDTO(74, "Delip", "delip.xworkz@gmail.com", 9123458791d);
		PersonDTO person75 = new PersonDTO(75, "Dinesh", "dinesh.xworkz@gmail.com", 912356790d);
		PersonDTO person76 = new PersonDTO(76, "Popat", "popta.xworkz@gmail.com", 9012901234d);
		PersonDTO person77 = new PersonDTO(77, "Priti", "priti.xworkz@gmail.com", 8901201012d);
		PersonDTO person78 = new PersonDTO(78, "Nilesh", "nilesh.xworkz@gmail.com", 897463421d);
		PersonDTO person79 = new PersonDTO(79, "Avinash", "avinash.xworkz@gmail.com", 876459802d);
		PersonDTO person80 = new PersonDTO(80, "Yuvraj", "yuvraj.xworkz@gmail.com", 912546498d);

		AddressDTO address71 = new AddressDTO(71, "Ashok Nagar", "230/8", "Nipani");
		AddressDTO address72 = new AddressDTO(72, "Ashok Nagar", "230/8", "Nipani");
		AddressDTO address73 = new AddressDTO(73, "Ashok Nagar", "230/8", "Nipani");
		AddressDTO address74 = new AddressDTO(74, "Ashok Nagar", "230/8", "Nipani");
		AddressDTO address75 = new AddressDTO(75, "Ashok Nagar", "230/8", "Nipani");
		AddressDTO address76 = new AddressDTO(76, "Ashok Nagar", "230/8", "Nipani");
		AddressDTO address77 = new AddressDTO(77, "Ashok Nagar", "230/8", "Nipani");
		AddressDTO address78 = new AddressDTO(78, "Ashok Nagar", "230/8", "Nipani");
		AddressDTO address79 = new AddressDTO(79, "Ashok Nagar", "230/8", "Nipani");
		AddressDTO address80 = new AddressDTO(80, "Ashok Nagar", "230/8", "Nipani");

		PersonDTO person81 = new PersonDTO(81, "Mithun", "mithun.xworkz@gmail.com", 9848586878d);
		PersonDTO person82 = new PersonDTO(82, "Kartik", "kartik.xworkz@gmail.com", 9877675756d);
		PersonDTO person83 = new PersonDTO(83, "Sammed", "sammed.xworkz@gmail.com", 9075655578d);
		PersonDTO person84 = new PersonDTO(84, "Mahaveer", "mahaveer.xworkz@gmail.com", 7809834467d);
		PersonDTO person85 = new PersonDTO(85, "Lakan", "lakan.xworkz@gmail.com", 8081828384d);
		PersonDTO person86 = new PersonDTO(86, "Bahubali", "bahubali.xworkz@gmail.com", 8889046574d);
		PersonDTO person87 = new PersonDTO(87, "Baban", "baban.xworkz@gmail.com", 9903456780d);

		AddressDTO address81 = new AddressDTO(81, "Rajaramp Pure Cross", "220/6", "Kholapur");
		AddressDTO address82 = new AddressDTO(82, "Rajaramp Pure Cross", "220/6", "Kholapur");
		AddressDTO address83 = new AddressDTO(83, "Rajaramp Pure Cross", "220/6", "Kholapur");
		AddressDTO address84 = new AddressDTO(84, "Rajaramp Pure Cross", "220/6", "Kholapur");
		AddressDTO address85 = new AddressDTO(85, "Rajaramp Pure Cross", "220/6", "Kholapur");
		AddressDTO address86 = new AddressDTO(86, "Rajaramp Pure Cross", "220/6", "Kholapur");
		AddressDTO address87 = new AddressDTO(87, "Rajaramp Pure Cross", "220/6", "Kholapur");

		Map<PersonDTO, AddressDTO> map = new HashMap<PersonDTO, AddressDTO>();
		map.put(person1, address1);
		map.put(person2, address2);
		map.put(person3, address3);
		map.put(person4, address4);
		map.put(person5, address5);
		map.put(person6, address6);
		map.put(person7, address7);
		map.put(person8, address8);
		map.put(person9, address9);
		map.put(person10, address10);
		map.put(person11, address11);
		map.put(person12, address12);
		map.put(person13, address13);
		map.put(person14, address14);
		map.put(person15, address15);
		map.put(person16, address16);
		map.put(person17, address17);
		map.put(person18, address18);
		map.put(person19, address19);
		map.put(person20, address20);
		map.put(person21, address21);
		map.put(person22, address22);
		map.put(person23, address23);
		map.put(person24, address24);
		map.put(person25, address25);
		map.put(person26, address26);
		map.put(person27, address27);
		map.put(person28, address28);
		map.put(person29, address29);
		map.put(person30, address30);
		map.put(person31, address31);
		map.put(person32, address32);
		map.put(person33, address33);
		map.put(person34, address34);
		map.put(person35, address35);
		map.put(person36, address36);
		map.put(person37, address37);
		map.put(person38, address38);
		map.put(person39, address39);
		map.put(person40, address40);
		map.put(person41, address41);
		map.put(person42, address42);
		map.put(person43, address43);
		map.put(person44, address44);
		map.put(person45, address45);
		map.put(person46, address46);
		map.put(person47, address47);
		map.put(person48, address48);
		map.put(person49, address49);
		map.put(person50, address50);
		map.put(person51, address51);
		map.put(person52, address52);
		map.put(person53, address53);
		map.put(person54, address54);
		map.put(person55, address55);
		map.put(person56, address56);
		map.put(person57, address57);
		map.put(person58, address58);
		map.put(person59, address59);
		map.put(person60, address60);
		map.put(person61, address61);
		map.put(person62, address62);
		map.put(person63, address63);
		map.put(person64, address64);
		map.put(person65, address65);
		map.put(person66, address66);
		map.put(person67, address67);
		map.put(person68, address68);
		map.put(person69, address69);
		map.put(person70, address70);
		map.put(person71, address71);
		map.put(person72, address72);
		map.put(person73, address73);
		map.put(person74, address74);
		map.put(person75, address75);
		map.put(person76, address76);
		map.put(person77, address77);
		map.put(person78, address78);
		map.put(person79, address79);
		map.put(person80, address80);
		map.put(person81, address81);
		map.put(person82, address82);
		map.put(person83, address83);
		map.put(person84, address84);
		map.put(person85, address85);
		map.put(person86, address86);
		map.put(person87, address87);

		System.out.println(map.size());
		
		System.out.println("*************************************************");
		
		Set<Map.Entry<PersonDTO,AddressDTO>> sort=map.entrySet();
		sort.forEach(System.out::println);
		
		System.out.println("*************************************************");

	    Collection<AddressDTO> add= map.values();
	    add.stream().sorted().forEach(System.out::println);
	    
	    System.out.println("*************************************************");
	    
	    add.stream().filter(r -> r.getCity().contains(("Borgaon")))
		.forEach(r -> System.out.println("ALL  NAMES " + r));

	    System.out.println("*************************************************");
	     
	   add.stream().filter(
				e ->add.stream().anyMatch(f ->f.getStreet().equals("220/6") &&e.getDoorNo().equals(f.getDoorNo())))
				.collect(Collectors.toList());
		System.out.println(add);
	
	 
		

	}

}
