package com.xworkz.jdbc.update.constants;

public enum JdbcProperties {

	 URL("jdbc:mysql://localhost:3306/xworkz_btm_march")
	 ,USERNAME("root")
	,SECRETS("root");
	
	private String value;
	
	private JdbcProperties(String value) {
		this.value=value;
		System.out.println(value);
	}

	public String getValue() {
		return value;
	}
	
	

	
}
