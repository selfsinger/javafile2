package com.xworkz.interfacetask.service;

import com.xworkz.interfacetask.dao.CustomerDAO;
import com.xworkz.interfacetask.dto.AddressDTO;
import com.xworkz.interfacetask.dto.CustomerDTO;

public class CustomerServiceImplementation implements CustomerService{

	private CustomerDAO customerDAO;
	
	public CustomerServiceImplementation(CustomerDAO customerDAO) {
		if(customerDAO!=null) {
			this.customerDAO=customerDAO;
			System.out.println("generated:"+this.getClass().getSimpleName());
			return;
		}
		System.out.println("cutsomerDAO is nulll");
	}

	@Override
	public boolean validateAndSave(CustomerDTO customerDTO) {
		if(customerDTO!=null) {
			if(customerDTO.getId()<=0) {
				System.out.println("id is correct");
			}
			if(customerDTO.getName()==null || customerDTO.getName().length()<3
					|| customerDTO.getName().length()>50) {
				System.err.println("cutsomer name is incorrect");
				return false;
			}
			if(customerDTO.getCustomerId()<=0) {
				System.out.println("cutsomer id is invalid");
				return false;
			}
			if(String.valueOf(customerDTO.getMobile()).length()!=10){
				System.out.println("moble number is incorrect");
				return false;
			}
			if(String.valueOf(customerDTO.getAlternativeMobile()).length()!=10){
				System.out.println("alternative moble number is incorrect");
				return false;
			}
			if(customerDTO.getEmail()==null || customerDTO.getEmail().length()<7
					|| customerDTO.getEmail().length()>50 || 
					!customerDTO.getEmail().contains("@")
					|| !customerDTO.getEmail().endsWith(".com")
					|| customerDTO.getAlternativeEmail().endsWith(".edu")
				||customerDTO.getAlternativeEmail().endsWith(".in")||
				customerDTO.getAlternativeEmail().endsWith(".org")){
					System.out.println("customer email is incorrect");
					return false;
				}
			if(customerDTO.getAddressDTO()==null) {
				System.out.println("customer DTO address is incorrect");
				return false;
			}
			boolean found = customerDAO.findDTO(customerDTO);
			if(found) {
				System.err.println("cannot be added");
				return false;
			}else {
				System.out.println("cutsomer details are rght...we can add it...!");
				customerDAO.save(customerDTO);
				return true;
			}
			}
		System.out.println("customerDTO is null...we cannot be added");
		return false;
		
	}

	@Override
	public CustomerDTO findByName(String name) {
		if(name!=null) {
			CustomerDTO dtoFound=customerDAO.findByName(name);
			return dtoFound;
		}
		System.out.println("name is not found");
		
		return null;
	}

	@Override
	public boolean validateAddressDTO(CustomerDTO customerDTO) {
		AddressDTO address=customerDTO.getAddressDTO();
		if(address!=null && address.getId()>0 && address.getId()<1000 && address.getStreet() !=null
				&&  address.getStreet().length()>0 && address.getStreet().length()<100 &&
				address.getDoorNo()!=null &&  address.getDoorNo().length()>2 &&
				String.valueOf(address.getPincode()).length()==5){
					if(address.getStateDTO() !=null && address.getStateDTO().getId()>0
							&&  address.getStateDTO().getId()<100 
							&& address.getStateDTO().getNoOfDistricts()>0 && address.getStateDTO().getNoOfDistricts()>0
							&& address.getStateDTO().getName()!=null 
							&& address.getStateDTO().getName().length()>1 
							&& address.getStateDTO().getName().length()<35)
						return true;
				}else {
					System.out.println("its not a valid details");
				}
	
		return false;
	
	}
	
}
