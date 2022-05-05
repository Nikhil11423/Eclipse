package com.xworkz.song;

import com.xworkz.song.constant.Lang;
import com.xworkz.song.dao.SongDAO;
import com.xworkz.song.dto.SongDTO;

public class SongRunner {

	public static void main(String[] args) {
		SongDTO song = new SongDTO();
		song.setId(1);
		song.setLang(Lang.KANAADA);
		song.setName("Hutidhare Kannada");
		song.setDuration(3.5);
		song.setSingerName("Rajkumar");
		song.setYear(1995);

		SongDAO dao = new SongDAO();
		boolean saveDTO = dao.save(song);
		System.out.println(saveDTO);
		System.out.println("*********************************************************************************");

		SongDTO song1 = new SongDTO();
		song1.setId(2);
		song1.setLang(Lang.HINDI);
		song1.setName("Main Hoon Na");
		song1.setDuration(4.2);
		song1.setSingerName("Sonu Nigam");
		song1.setYear(2001);

		boolean saveDTO1 = dao.save(song1);
		System.out.println(saveDTO1);
		System.out.println("*********************************************************************************");

		SongDTO song2 = new SongDTO();
		song2.setId(3);
		song2.setLang(Lang.TAMIL);
		song2.setName("Yaanji");
		song2.setDuration(4.4);
		song2.setSingerName("Anirudh");
		song2.setYear(2016);

		boolean saveDTO2 = dao.save(song2);
		System.out.println(saveDTO2);
		System.out.println("*********************************************************************************");

		SongDTO song3 = new SongDTO();
		song3.setId(4);
		song3.setLang(Lang.KANAADA);
		song3.setName("Ninne RajaKumara");
		song3.setDuration(4.50);
		song3.setSingerName("Vijay Prakash");
		song3.setYear(2015);

		boolean saveDTO3 = dao.save(song3);
		System.out.println(saveDTO3);
		System.out.println("*********************************************************************************");

		SongDTO song4 = new SongDTO();
		song4.setId(5);
		song4.setLang(Lang.TAMIL);
		song4.setName("BlockBuster");
		song4.setDuration(4.10);
		song4.setSingerName("Shreya Ghosal");
		song4.setYear(2016);

		boolean saveDTO4 = dao.save(song4);
		System.out.println(saveDTO4);
		System.out.println("*********************************************************************************");
		SongDTO song5 = new SongDTO();
		song5.setId(6);
		song5.setLang(Lang.HINDI);
		song5.setName("Pyaar karte Ho Na");
		song5.setDuration(6.5);
		song5.setSingerName("Shreya ghosal");
		song5.setYear(2021);

		boolean saveDTO5 = dao.save(song5);
		System.out.println(saveDTO5);
		System.out.println("*********************************************************************************");
		SongDTO song6 = new SongDTO();
		song6.setId(7);
		song6.setLang(Lang.KANAADA);
		song6.setName("Suraj R");
		song6.setDuration(5.1);
		song6.setSingerName("Suraj Rajendran");
		song6.setYear(2021);

		boolean saveDTO6 = dao.save(song6);
		System.out.println(saveDTO6);
		System.out.println("*********************************************************************************");
		SongDTO song7 = new SongDTO();
		song7.setId(8);
		song7.setLang(Lang.KANAADA);
		song7.setName("Sahasa Simha");
		song7.setDuration(3.4);
		song7.setSingerName("SP Balasubramanyam");
		song7.setYear(2005);

		boolean saveDTO7 = dao.save(song7);
		System.out.println(saveDTO7);
		System.out.println("*********************************************************************************");

		SongDTO song8 = new SongDTO();
		song8.setId(9);
		song8.setLang(Lang.KANAADA);
		song8.setName("Mehabooba");
		song8.setDuration(6.2);
		song8.setSingerName("Ravi Basrur");
		song8.setYear(2022);

		boolean saveDTO8 = dao.save(song8);
		System.out.println(saveDTO8);
		System.out.println("*********************************************************************************");
		SongDTO song9 = new SongDTO();
		song9.setId(10);
		song9.setLang(Lang.MALYALAM);
		song9.setName("Puthiyoru lokam");
		song9.setDuration(5.8);
		song9.setSingerName("Hridayam");
		song9.setYear(2021);

		boolean saveDTO9 = dao.save(song9);
		System.out.println(saveDTO9);
		System.out.println("*********************************************************************************");
		SongDTO[] name = { song3, song4, song5, song6, song7, song8, song9 };
		dao.saveMultiple(name);

		boolean update1 = dao.updateDurationByName(5.8, "Puthiyoru lokam");
		System.out.println(update1);
		System.out.println("***********************************************************************************");

		boolean update2 = dao.updateSingerNameByName("Kumara", "RajaKumara");
		System.out.println(update2);
		System.out.println("************************************************************************************");

		boolean update3 = dao.updateNameById("Ninne RajaKumara", 4);
		System.out.println(update3);
		System.out.println("*********************************************************************************");

		SongDTO find = dao.findBySingerName("Ravi Basrur");
		System.out.println(find);
		System.out.println("*********************************************************************************");

		String find1 = dao.findSingerNameByName("Mehabooba");
		System.out.println(find1);
		System.out.println("*********************************************************************************");

		Lang find2 = dao.findLangByName("Vijay Prakash");
		System.out.println(find2);
		System.out.println("*********************************************************************************");

		Double find3 = dao.findDurationByName("Suraj R");
		System.out.println(find3);
		System.out.println("*********************************************************************************");
		
		String find4 = dao.findSingerNameByName("Vijay Prakash");
		System.out.println(find4);
		System.out.println("*********************************************************************************");
		
		
		Double find5 = dao.findByMaxDuration();
		System.out.println(find5);
		System.out.println("*********************************************************************************");
		
		
		Double find6=dao.findByMinduration();
		System.out.println(find6);
		System.out.println("*********************************************************************************");
		
		SongDTO[] find7 = dao.findTotal();
		System.out.println(find7);
		System.out.println("*********************************************************************************");
		
		
		
	}

}
