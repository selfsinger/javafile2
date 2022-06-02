package com.xworkz.batch.constants;

public enum BatchSqlProperties {
	
URL("jdbc:mysql://localhost:3306/batch"),USERNAME("root"),PASSWORD("Sql@#meg4$");
	
	private String value;
	
	private BatchSqlProperties(String value)
	{
		this.value=value;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	

}
