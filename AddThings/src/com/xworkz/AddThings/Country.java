package com.xworkz.AddThings;

public class Country {
//	Write a Program to add, find,update,delete and display Country
//	1. Name is not null, min chars is 3 , max chars is 50 
//	2. Name should not be null 
//	3. Add max of 20 Countries
//	4. Do not duplicate country 
//	5. Check index exists before update 
//	void add(String country);
//	boolean find(String country);
//	void display();
//	update(int index,String country);
//	delete(int index);
//	delete(String country)
	String[] countries = new String[20];
	int index;
	
	

	void add(String country)
	{
		System.out.println("Firstly,i am adding country names here:"+country);
		countries[index]=country;
		index=index+1;
		
	}
	
	boolean find(String country)
	{
       System.out.println("Here,finding the country which i want:"+country);
		boolean found=false;
		for(int i=0;i<countries.length;i++)
		{
			String cou=countries[i];
			if(cou.equals(country))
			{
				System.out.println("country is found:"+country);
				found=true;
			}
		}
				
		if(!found)
		    {		    	
				System.out.println("country is not found:"+country);
		    }
		
		return found;
	}
	void updateCountryByindex(int index,String country)
{
//		public void updateDobByLicenceNo(String dob,String licenceNo)
//		{
	System.out.println("updating country by index");
		for(int i=0;i<index;i++)
	{                    //0==India
			if(countries[index]==country)
			{             
			     countries[i].set(country);
			}
		}
	}
	void display()
	{
		System.out.println("Inside display method:");
		for(int j=0;j<countries.length;j++)
		{
			String country=this.countries[j];
			System.out.println(country);
			//System.out.println(countries[i].getName());
		}
	}
	void delete(int index)
	{
		
		System.out.println("I just want to delete the country by index");
	}
	void delete(String country)
	{
	    System.out.println("I just want to delete the country name");
	}
	
	}
