package com.xworkz.interfacetask.dto;

import java.io.Serializable;

public class StateDTO implements Serializable{

	private int id;//>0 < 2000
	private String name;//min 3 , max 40
	private int noOfDistricts; //>0 , <100s
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNoOfDistricts() {
		return noOfDistricts;
	}
	public void setNoOfDistricts(int noOfDistricts) {
		this.noOfDistricts = noOfDistricts;
	}
	
	
}
