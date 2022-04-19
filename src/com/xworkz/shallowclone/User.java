package com.xworkz.shallowclone;

public class User implements Cloneable{
	
	
	public String name;
	public int rollNo;
	public Address address;
	public User(String name, int rollNo, Address address) {
		super();
		this.name = name;
		this.rollNo = rollNo;
		this.address = address;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", rollNo=" + rollNo + ", address=" + address + "]";
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		User user=null;
		try {
			user=(User) super.clone();		
			}catch(CloneNotSupportedException e) {
				System.out.println("cloneable not supported");
			}
		user.address=(Address) this.address.clone();
		return user;
	}
	
	

	
}
