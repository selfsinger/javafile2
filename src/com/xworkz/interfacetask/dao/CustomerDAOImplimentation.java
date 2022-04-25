package com.xworkz.interfacetask.dao;

import com.xworkz.interfacetask.dto.CustomerDTO;

public class CustomerDAOImplimentation implements CustomerDAO{
	
	private CustomerDTO[] customerDTOs=new CustomerDTO[5];
	private int index=0;
	
	public CustomerDAOImplimentation() {
		System.out.println("this is from:"+this.getClass().getSimpleName());
	}
	
//	public CustomerDTO[] getCustomerDTOs() {
//		
//		return customerDTOs;
//
//		}

	@Override
	public boolean save(CustomerDTO customerDTO) {
		if(this.index<this.customerDTOs.length) {
			this.customerDTOs[this.index]=customerDTO;
		System.out.println("customerDTO is saved @index:"+this.index);
		this.index++;
		return true;
	}
	System.out.println("cant add more than 20 elements");
	return false;
}

	@Override
	public boolean findDTO(CustomerDTO customerDTO) {
		if(customerDTO !=null)
		{
			for(int i=0;i<customerDTOs.length;i++) {
				if(this.customerDTOs[i]!=null && this.customerDTOs[i].equals(customerDTO)){
					System.out.println("DTO is found");
					return true;
				}
			}
		}
		System.out.println("DTO is not found");
		return false;
	}
	@Override
	public CustomerDTO findByName(String name) {
		if(name!=null) {
			for(int i=0;i<customerDTOs.length;i++) {
				if(this.customerDTOs[i]!=null && this.customerDTOs[i].getName().equals(name)){
					System.out.println("Customer name is found @index"+i);
					return customerDTOs[i];
				}
			}
		}
		System.out.println("customer name is not  found");
		return null ;
	}

	

}
