package com.xworkz.bike.functions;

public  class AbstractKtm extends AbstractBike{

	public AbstractKtm(Integer speed, Integer gear) {
		super(speed, gear);	
	}

    
	public void setSpeed() {
		System.out.println("runinng a setspeed");
		
	}


	public void setGear() {
		System.out.println("runing a setgear");
		
		}

}
