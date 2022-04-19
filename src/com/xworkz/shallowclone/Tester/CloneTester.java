package com.xworkz.shallowclone.Tester;

import com.xworkz.shallowclone.Address;
import com.xworkz.shallowclone.User;

public class CloneTester {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		Address address = new Address("shimoga","India");
		User user1=new User("Megha",24,address);
		User user2=(User) user1.clone();
		
		System.out.println("user1:"+user1.toString());
		System.out.println("user2:"+user2.toString());
		
		System.out.println();
		
		user1.address.city="Delhi";
		
		
		System.out.println("\n===============After changing the city=============");
		System.out.println("user1:"+user1.toString());
		System.out.println("user2:"+user2.toString());
 		
	}

}
