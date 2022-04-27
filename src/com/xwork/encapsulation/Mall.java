package com.xwork.encapsulation;

	public class Mall {
		
		private Integer no;
		private String name;
		private String ownerName;
		private Integer pinCode;
		private Boolean pvr;
		
		
		
		@Override
		public String toString()
		{
			System.out.println("running toString");
			return "mall";
		}
		
		@Override
		public int hashCode()
		{
			System.out.println("running hashCode");
			return 45;
		}
		
		public boolean equals(Object obj)
		{
			System.out.println("running equals");
			if(obj !=null)
			{
				System.out.println("mall is not null");
			
			if(obj instanceof Mall) {
				System.out.println("running a instance");
			
			Mall mall=(Mall)obj;
			
			if(this.name.equals(mall.name) && this.pinCode.equals(mall.pinCode));
			
			return true;
			}
			else 
			{
				System.out.println("mall are not equals");
			}
			}
				return false;
			
			}
			
			
		public void setNo(Integer no) {
			this.no = no;
		}

		public void setName(String name) {
			this.name = name;
		}

		public void setOwnerName(String ownerName) {
			this.ownerName = ownerName;
		}

		public void setPinCode(Integer pinCode) {
			this.pinCode = pinCode;
		}

		public void setPvr(Boolean pvr) {
			this.pvr = pvr;
		}
		
		}



