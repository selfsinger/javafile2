package com.xworkz.politics.dto;

import java.io.Serializable;

public class PoliticalPartyDTO implements Serializable{

	int id;
	String name,presidentName;
	boolean nationalParty;
	int noOfMps;
	

	public PoliticalPartyDTO(int id, String name, String presidentName, boolean nationalParty, int noOfMps) {
		super();
		this.id = id;
		this.name = name;
		this.presidentName = presidentName;
		this.nationalParty = nationalParty;
		this.noOfMps = noOfMps;
	}

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

	public String getPresidentName() {
		return presidentName;
	}

	public void setPresidentName(String presidentName) {
		this.presidentName = presidentName;
	}

	public boolean isNationalParty() {
		return nationalParty;
	}

	public void setNationalParty(boolean nationalParty) {
		this.nationalParty = nationalParty;
	}

	public int getNoOfMps() {
		return noOfMps;
	}

	public void setNoOfMps(int noOfMps) {
		this.noOfMps = noOfMps;
	}

	@Override
	public String toString() {
		return "PoliticalPartyDTO [id=" + id + ", name=" + name + ", presidentName=" + presidentName
				+ ", nationalParty=" + nationalParty + ", noOfMps=" + noOfMps + "]";
	}

	
}
