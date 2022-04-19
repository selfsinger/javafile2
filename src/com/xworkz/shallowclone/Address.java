package com.xworkz.shallowclone;

public class Address implements Cloneable{
	
	public String city,country;

	public Address(String city, String country) {
		super();
		this.city = city;
		this.country = country;
	}
	
	public Address() {
		
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		
		return (Address)super.clone();
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", country=" + country + "]";
	}
	
	
	

}
