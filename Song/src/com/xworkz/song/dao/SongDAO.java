package com.xworkz.song.dao;

import com.xworkz.song.constant.Lang;
import com.xworkz.song.dto.SongDTO;

public class SongDAO {
	private SongDTO[] dtos = new SongDTO[10];
	private int index;

	public boolean save(SongDTO dto) {
		System.out.println("Storing " + dto);
		if (index < this.dtos.length) {
			this.dtos[index] = dto;
			index++;

			System.out.println("New Song Added ");
			return true;
		} else {
			System.out.println("Array out of Index");
		}
		return false;

	}

	public void saveMultiple(SongDTO[] dtos) {
		System.out.println("Storing Multiple Songs ");
		for (int i = 0; i < dtos.length; i++) {
			SongDTO songDTO = dtos[i];
			this.save(songDTO);
			break;
		}

	}

	public boolean updateDurationByName(Double durationToUpdate, String name) {
		for (int index = 0; index < this.dtos.length; index++) {
			SongDTO dto = dtos[index];
			System.out.println("Name is " + name);
			if (dto.getName().equals(name)) {
				dto.setDuration(durationToUpdate);
				System.out.println("Updated Duration " + durationToUpdate);
				return true;
			} else {
				System.out.println("Duration Cannot be Updated By name");
			}
			break;
		}
		return false;
	}

	public boolean updateSingerNameByName(String singerNameToUpdate, String name) {
		for (int index = 0; index < this.dtos.length; index++) {
			SongDTO dto1 = dtos[index];
			System.out.println("Name is " + name);
			if (dto1.getName().equals(name)) {
				dto1.setSingerName(singerNameToUpdate);
				System.out.println("Updated SingerName " + singerNameToUpdate);
				return true;
			} else {
				System.out.println("Singer Name Cannot be Updated");
			}
			break;
		}
		return false;

	}

	public boolean updateNameById(String nameToUpdate, Integer id) {
		for (int index = 0; index < this.dtos.length; index++) {
			SongDTO dto2 = dtos[index];
			System.out.println("Name is " + nameToUpdate);
			if (dto2.getId().equals(id)) {
				dto2.setName(nameToUpdate);
				System.out.println("Updated Name " + nameToUpdate);
				return true;
			} else {
				System.out.println("Name Cannot be Updated");
			}
			break;
		}
		return false;

	}

	public SongDTO findBySingerName(String singerName) {
		for (int index = 0; index < dtos.length; index++) {
			SongDTO dto3 = dtos[index];
			System.out.println("Singer Name " + singerName);
			if (dto3.getSingerName().equals(singerName)) {
				System.out.println("The Singer name is found " + singerName);
				break;
			} else {
				System.out.println(singerName + " is not found");
			}
			break;
		}
		return null;
	}

	public Double findDurationByName(String name) {
		for (int index = 0; index < dtos.length; index++) {
			SongDTO dto4 = dtos[index];
			System.out.println("The Name is " + name);
			if (dto4.getName().equals(name)) {
				return dto4.getDuration();

			} else {
				System.out.println("Name is Not Found");
			}
			break;
		}
		return null;
	}

	public String findSingerNameByName(String name) {
		for (int index = 0; index < dtos.length; index++) {
			SongDTO dto5 = dtos[index];
			System.out.println("The Name is " + name);
			if (dto5.getName().equals(name)) {
				return dto5.getSingerName();
			} else {
				System.out.println("Name is Not Found");
			}
			break;
		}
		return null;
	}

	public Lang findLangByName(String name) {
		for (int index = 0; index < dtos.length; index++) {
			SongDTO dto6 = dtos[index];
			System.out.println("The Name is " + name);
			if (dto6.getName().equals(name)) {
				return dto6.getLang();
			} else {
				System.out.println("Name is Not Found");
			}
			break;
		}
		return null;
	}
	public Double findByMaxDuration() {
		double max = Double.MAX_VALUE;
		//SongDTO tempCakeDTO=null;
		for(int index=0; index<this.dtos.length; index++) {
			SongDTO dto7 = dtos[index];
			double Duration = dto7.getDuration();
			System.out.println("Maximum price is=" + Duration);
			max = Math.max(max, Duration);
		}
		return max;
		
	}
	public Double findByMinduration() {
		double min=0;
		//SongDTO tempCakeDTO=null;
		for(int index=0; index<this.dtos.length; index++) {
			SongDTO dto8 = dtos[index];
			double Duration = dto8.getDuration();
			System.out.println("Minimum Duration  is=" + Duration);
			min =Math.min(min, Duration);	
		}
		return min;
	}

	public SongDTO[] findTotal() {
		for(int index=0; index<this.dtos.length; index++) {
			SongDTO dto9 = dtos[index];
			if(dto9 !=null) {
			System.out.println("All conditions are Satisfied");
			return dtos;
			}
			else {
				System.out.println("All conditions are not Satisfied");
			}
		}
		return null;
		
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
