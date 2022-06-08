package com.xworkz.cutomerjdbctemplate.dao;

import com.xworkz.cutomerjdbctemplate.dto.CustomerDTO;

public interface CustomerDAO {
	public int saveCustomer(CustomerDTO dto);
	public int updateCustomer(CustomerDTO dto);
	public int deleteCustomer(CustomerDTO dto);
}
