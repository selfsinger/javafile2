package com.xworkz.bottle.dto;

public class Bottle {

	private String name,color,type,purpose;
	double price;

	public Bottle(String name, String color, String type, String purpose, double price) {
		super();
		this.name = name;
		this.color = color;
		this.type = type;
		this.purpose = purpose;
		this.price = price;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getColor()
	{
		return color;
	}

	public void setColor(String color)
	{
		this.color = color;
	}

	public String getType()
	{
		return type;
	}

	public void setType(String type) 
	{
		this.type = type;
	}

	public String getPurpose() 
	{
		return purpose;
	}

	public void setPurpose(String purpose) 
	{
		this.purpose = purpose;
	}

	public double getPrice() 
	{
		return price;
	}

	public void setPrice(double price)
	{
		this.price = price;
	}
}
	
