package com.xwork.encapsulation;

public class MacRunner {

	
	public static void main(String[] args) {
	
		
	Money money=new Money();
	
	money.setMaterial("PAPER");
	money.setCurreny("RUPPES");
	money.setCountry("INDIA");
	money.setColor("PINK");
	money.setDenomination(2000);
   
	System.out.println(money.getMaterial());
	System.out.println(money.getCurreny());
	System.out.println(money.getCountry());
	System.out.println(money.getColor());
	System.out.println(money.getDenomination());

	System.out.println("////////////////////////////////////////////////");
	
	
	Cooker cooker=new Cooker();
	
	cooker.setCompanyName("PIGO");
	cooker.setCapacity(2);
	cooker.setPrice(1500);
	cooker.setMaterial("STEEL");
	cooker.setWarranty(2);
	cooker.setWeight(1);
	cooker.setHeight(2.5);
	cooker.setType(Type.MILK_COOKER);
	cooker.setIsiMarked(true);
	cooker.setManufacturesDate("SEP 09");
	cooker.setDiscountPercentage(32.1f);
	cooker.setFreeItem(true);
	
	System.out.println(cooker.getCompanyName());
	System.out.println(cooker.getCapacity());
	System.out.println(cooker.getPrice());
	System.out.println(cooker.getMaterial());
	System.out.println(cooker.getWarranty());
	System.out.println(cooker.getWeight());
	System.out.println(cooker.getHeight());
	System.out.println(cooker.getType());
	System.out.println(cooker.isIsiMarked());
	System.out.println(cooker.getManufacturesDate());
	System.out.println(cooker.getDiscountPercentage());
	System.out.println(cooker.isFreeItem());
	
	System.out.println("////////////////////////////////////////////////");
	
	Atm atm=new Atm();
	
	atm.setBankName("SBI");
	atm.setSecurityGuard(true);
	atm.setAc(true);
	atm.setMoneyAvailable(230000);
	atm.setHomeBranch("NIAPNI");
	
	System.out.println(atm.getBankName());
	System.out.println(atm.isSecurityGuard() );
	System.out.println(atm.isAc());
	System.out.println(atm.getMoneyAvailable());
	System.out.println(atm.getHomeBranch());
	
	
	

}


}
