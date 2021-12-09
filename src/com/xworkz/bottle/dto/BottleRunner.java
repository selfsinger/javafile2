package com.xworkz.bottle.dto;

public class BottleRunner {

	

	public static void main(String args[])
	{
		Bottle b=new Bottle("Ankaret Stainless Steel","Brown","Steel","To store liquids(water,milk,medicine,cooking oil,shampoo.etc",
				400);
		System.out.println(b.getName()+" \n"+b.getColor()+"\n "+b.getType()+"\n "+b.getPurpose()+"\n"+b.getPrice());
		System.out.println();
		Bottle b2=new Bottle("Purple Tree Hello Master Plastic WB","Purple","plastic","To store liquids(water,milk,medicine,cooking oil,shampoo.etc",
				300);

		System.out.println(b2.getName()+"\n "+b2.getColor()+"\n "+b2.getType()+"\n "+b2.getPurpose()+"\n "+b2.getPrice());
		System.out.println();
	    
		b2.setColor("white");
		System.out.println(b2.getName()+"\n "+b2.getColor()+"\n "+b2.getType()+"\n "+b2.getPurpose()+"\n "+b2.getPrice());
		System.out.println();
		
		b.setPrice(389);
		System.out.println(b.getName()+" \n"+b.getColor()+"\n "+b.getType()+"\n "+b.getPurpose()+"\n"+b.getPrice());
		
	}

}