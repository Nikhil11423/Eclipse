package com.xworkz.watertank.dao;

import com.xworkz.watertank.dto.WaterTankDTO;

public class WaterTankDAO {
	private WaterTankDTO[] dtos = new WaterTankDTO[5];
	private int index;

	public boolean save(WaterTankDTO dto) {
		System.out.println("HashCode of waterTankDTO "+ dto.hashCode());

		if (index < this.dtos.length) {
			this.dtos[index] = dto;
			index++;
			System.out.println("Water Tank is Full =" + dto);
			return true;
		} else {
			System.out.println("Water Tank is not Full");
		}
			return false;

		
	}

}
