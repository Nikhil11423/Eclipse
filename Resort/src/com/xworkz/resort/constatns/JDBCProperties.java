package com.xworkz.resort.constatns;

public enum JDBCProperties {

	 URL("jdbc:mysql://localhost:3306/xworkz_btm_march")
	 ,USERNAME("root")
	,SECRETS("root");
	
	private String value;
	
	private JDBCProperties(String value) {
		this.value=value;
		System.out.println(value);
	}

	public String getValue() {
		return value;
	}

}
