package com.xworkz.springheadset;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class HeadSet {

	private String brand;
	private int cost;
	private String warranty;
	private String color;
	private boolean useful;

	public HeadSet(String brand, String color) {
		// System.out.println("first constructor");
		this.brand = brand;
		this.color = color;
	}

	public HeadSet(String warranty, int cost) {
		// System.out.println("second constructor");
		this.warranty = warranty;
		this.cost = cost;
	}

	public HeadSet(String brand, String warranty, int cost) {
		// System.out.println("third constructor");
		this.brand = brand;
		this.warranty = warranty;
		this.cost = cost;
	}

	public HeadSet(String color) {
		// System.out.println("fourth constructor");
		this.color = color;
	}

	public HeadSet(int cost) {
		// System.out.println("fifth constructor");
		this.cost = cost;

	}

	public HeadSet(int cost, String color) {
		// System.out.println("sixth constructor");
		this.cost = cost;
		this.color = color;

	}

	public HeadSet(String brand, boolean useful) {
		// System.out.println("seventh constructor");
		this.brand = brand;
		this.useful = useful;

	}

	public boolean getUseful() {
		return useful;
	}

	public HeadSet(boolean useful) {
		// System.out.println("eigth constructor");
		this.useful = useful;
	}

}
