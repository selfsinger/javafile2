package com.xworkz.interfacetask.dao;

import com.xworkz.interfacetask.dto.CustomerDTO;

public interface CustomerDAO {
	
	boolean save(CustomerDTO customerDTO);

	boolean findDTO(CustomerDTO customerDTO);
	CustomerDTO findByName(String name);

}


