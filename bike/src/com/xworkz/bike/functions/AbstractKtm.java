package com.xworkz.bike.functions;

public  class Ktm extends AbstractBike{

	public Ktm(Integer speed, Integer gear) {
		super(speed, gear);	
	}

        @Override
	public void setSpeed() {
		System.out.println("runinng a setspeed");
		
	}

         @Override
	public void setGear() {
		System.out.println("runing a setgear");
		
		}

}
