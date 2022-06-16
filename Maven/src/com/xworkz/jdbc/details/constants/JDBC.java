package com.xworkz.jdbc.details.constants;

public enum JDBC {

	 URL("jdbc:mysql://localhost:3306/xworkz_btm_march")
	 ,USERNAME("root")
	,SECRETS("root");
	
	private String value;
	
	private JDBC(String value) {
		this.value=value;
		System.out.println(value);
	}

	public String getValue() {
		return value;
	}

}
