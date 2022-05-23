package com.xworkz.api;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.xworkz.api.constants.BiryaniType;
import com.xworkz.api.constants.Quantity;
import com.xworkz.api.dto.BiryaniDTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor


public class BiryaniRunner {

		public static void main(String[] args) {

			BiryaniDTO biryaniDTO = new BiryaniDTO();
			biryaniDTO.setColor("Green");
			biryaniDTO.setKushka(false);
			biryaniDTO.setVeg(true);
			biryaniDTO.setType(BiryaniType.MUTTON);
			biryaniDTO.setPrice(300D);
			String[] items = { "mutton", "rice", "oil", "onion", "chilli", "garam masala", "salt", "garlic", "kotmari",
					"coconut", "ghee" };

			biryaniDTO.setIngredients(items);
			biryaniDTO.setQuantity(Quantity.HALF);

			String[] eggItems = new String[items.length];

			System.arraycopy(items, 0, eggItems, 0, items.length);

			eggItems[0] = "Egg";

			BiryaniDTO biryaniDTO2 = new BiryaniDTO(BiryaniType.EGG, 150D, Quantity.FULL, eggItems, "green", false, false);

			String[] fishItems = new String[items.length];

			System.arraycopy(items, 0, fishItems, 0, items.length);
			fishItems[0] = "fish";
			for (String string : fishItems) {
				System.out.println(string);
			}

			BiryaniDTO biryaniDTO3 = new BiryaniDTO(BiryaniType.FISH, 150D, Quantity.FULL, fishItems, "green", false,
					false);
			System.out.println("*****************************************************************");
			String[] paniritems = new String[items.length];
			System.arraycopy(items, 0, paniritems, 0,items.length);
			paniritems[0] = "panir";
			for (String string : paniritems) {
				System.out.println(string);
			}
			
			System.out.println("******************************************************************");
			BiryaniDTO biryaniDTO4 =new BiryaniDTO(BiryaniType.PANIR, 120D, Quantity.FULL, paniritems, "WHITE", false, false);
			Collection<BiryaniDTO> biryaniDTOs = new ArrayList<>();
			biryaniDTOs.add(biryaniDTO2);
			biryaniDTOs.add(biryaniDTO);
			biryaniDTOs.add(biryaniDTO3);
			biryaniDTOs.add(biryaniDTO4);


			Iterator<BiryaniDTO> itr = biryaniDTOs.iterator();
			while (itr.hasNext()) {
				BiryaniDTO temp = itr.next();
				System.out.println(temp);
			}
			BiryaniDTO belagavi = new BiryaniDTO();
			belagavi.setType(BiryaniType.FISH);
			 biryaniDTOs.add(belagavi);

			boolean contains = biryaniDTOs.contains(belagavi);
			
			System.out.println(contains);

		}
	}

