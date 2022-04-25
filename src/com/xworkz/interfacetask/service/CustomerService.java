package com.xworkz.interfacetask.service;

import com.xworkz.interfacetask.dto.CustomerDTO;

public interface CustomerService {

	boolean validateAndSave(CustomerDTO customerDTO);

	CustomerDTO findByName(String name);
	boolean validateAddressDTO(CustomerDTO customerDTO);

}
