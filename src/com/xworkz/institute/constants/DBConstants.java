package com.xworkz.institute.constants;

public enum DBConstants {
	
	URL("jdbc:mysql://localhost:3306/course"),USERNAME("root"),PASSWORD("Sql@#meg4$");
	
	public String value;
	
	DBConstants(String value){
		this.value=value;
	}

}
