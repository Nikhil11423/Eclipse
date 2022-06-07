package com.xworkz.dto.runner;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.xworkz.dto.NewsPaperDTO;
import com.xworkz.newspaper.constants.Lang;
import com.xworkz.newspaper.constants.Type;


public class NewsPaperRunner {

	public static void main(String[] args) {
		NewsPaperDTO newsPaperDTO = new NewsPaperDTO(1, "VK", 4.5, Lang.KANNADA, Type.BROADSHEET);
		NewsPaperDTO newsPaperDTO1 = new NewsPaperDTO(2, "Pudari", 5.0, Lang.MARATHI, Type.TABLOID);
		NewsPaperDTO newsPaperDTO2 = new NewsPaperDTO(3, "The Hindu", 8.0, Lang.ENGLISH, Type.BROADSHEET);
		NewsPaperDTO newsPaperDTO3 = new NewsPaperDTO(4, "Dainik Bhaskar", 4.5, Lang.HINDI, Type.TABLOID);
		NewsPaperDTO newsPaperDTO4 = new NewsPaperDTO(5, "Dinakaran", 5.0, Lang.TAMIL, Type.BROADSHEET);
		NewsPaperDTO newsPaperDTO5 = new NewsPaperDTO(3, "The Hindu", 8.0, Lang.ENGLISH, Type.BROADSHEET);

		Set<NewsPaperDTO> news = new HashSet<NewsPaperDTO>();
		news.add(newsPaperDTO);
		news.add(newsPaperDTO1);
		news.add(newsPaperDTO2);
		news.add(newsPaperDTO3);
		news.add(newsPaperDTO4);
		news.add(newsPaperDTO5);
		news.forEach(System.out::println);
		
		

	}

}
