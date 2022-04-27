package com.xwork.encapsulation.objects;

public class Helmet {

	private String company;
	private Boolean isiCertified;
	private Integer price;
	Type type;
	private Float rating;
	
	    @Override
		public String toString()
		{
			System.out.println("running toString ");
			return super.toString();
		}
	
	
	   @Override
	   public int hashCode()
	   {
		System.out.println("running is a hashCode");
		return super.hashCode();
	   }
	
	   public  boolean equals(Object obj) {
		  System.out.println("running equals");
	  
	    if(obj !=null) {
	    	System.out.println("helmet is a not null");
	   
	    if(obj instanceof Helmet) {
	    	System.out.println("helmet is a insatnce");
	    
	    	
	    Helmet other = (Helmet) obj;
	    
	    if (this.price.equals(other.price) && this.isiCertified.equals(other.isiCertified) && this.rating.equals(other.rating) && this.type.equals(other.type))
	 
	    	return true;
	    }
		else{
			System.out.println("running helmet is unsefty");
		}
	    
	    }
			return false;
	    }	
	

	public void setCompany(String company) 
	{
		this.company = company;
	}

	public void setIsiCertified(boolean isiCertified) 
	{
		this.isiCertified = isiCertified;
	}

	public void setPrice(int price)
	{
		this.price = price;
	}

	public void setType(Type type)
	{
		this.type = type;
	}

	public void setRating(float rating)
	{
		this.rating = rating;
	}
	    






}
