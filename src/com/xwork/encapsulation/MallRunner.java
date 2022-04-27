package com.xwork.encapsulation;

	public class MallRunner {
		
		public static void main(String[] args)
		{
			
			Mall mall=new Mall();
			System.out.println(mall.toString());
			System.out.println(mall.hashCode());
			
			mall.setNo(122);
			mall.setName("ORIAN");
			mall.setOwnerName("NIKHIL");
			mall.setPinCode(59116);
			mall.setPvr(true);
			
			
			Mall mall1=new Mall();
			mall1.setNo(122);
			mall1.setName("ORIAN");
			mall1.setOwnerName("NIKHIL");
			mall1.setPinCode(59116);
			mall1.setPvr(true);
			
			boolean cd=mall.equals(mall1);
			
			System.out.println(cd);
			
		}
	}



