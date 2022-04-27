package com.xwork.encapsulation;

	public class Task {
		
		protected Object clone()
		{
			System.out.println("running object");
			return null;
		}
		
		@Override
		public boolean equals(Object obj)
		{
			System.out.println("running equlas");
			return true;
		}
	    
		@Override
		protected void finalize()
		{
			System.out.println("running finalize");
			
		}
		
		@Override
		public int hashCode()
		{
			System.out.println("running hashCode");
			return 12;
		}
		public String toString()
		{
			System.out.println("running toString ");
			return null;
		}
	}


