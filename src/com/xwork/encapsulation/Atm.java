package com.xwork.encapsulation;

	public class Atm {

			
		private String bankName;
		private boolean securityGuard;
		private boolean ac;
		private int moneyAvailable;
		private String homeBranch;
		
		public String getBankName() 
		{
			return bankName;
		}
		public void setBankName(String bankName) 
		{
			this.bankName = bankName;
		}
		public boolean isSecurityGuard()
		{
			return securityGuard;
		}
		public void setSecurityGuard(boolean securityGuard)
		{
			this.securityGuard = securityGuard;
		}
		public boolean isAc()
		{
			return ac;
		}
		public void setAc(boolean ac) 
		{
			this.ac = ac;
		}
		public int getMoneyAvailable() 
		{
			return moneyAvailable;
		}
		public void setMoneyAvailable(int moneyAvailable)
		{
			this.moneyAvailable = moneyAvailable;
		}
		public String getHomeBranch()
		{
			return homeBranch;
		}
		public void setHomeBranch(String homeBranch) 
		{
			this.homeBranch = homeBranch;
		}
				
	}



