package com.xworkz.cutomerjdbctemplate.dao;


import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;

import com.xworkz.cutomerjdbctemplate.dto.CustomerDTO;

public class CustomerDAOImpl{
	
	private DataSource dataSource;
	
	private JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate()
	{
		return jdbcTemplate;
	}
//	public DataSource getdataSource()
//	{
//		return dataSource;
//	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	
	public int saveCustomer(CustomerDTO dto){  
	    String insertQuery="insert into customer_details values(?,?,?,?)";  
	    return jdbcTemplate.update(insertQuery,dto.getId(),dto.getName(),dto.getPhone(),dto.getEmail()); 
	}  
	public int updateCustomer(CustomerDTO dto){  
	    String insertQuery="update customer_details set  CUSTOMER_NAME='"+dto.getName()+"',PHONE_NO='"+dto.getPhone()+"',Email_ID='"+dto.getEmail()+"' where Customer_ID='"+dto.getId()+"' ";  
	    return jdbcTemplate.update(insertQuery);  
	}  
	public int deleteCustomer(CustomerDTO dto){  
	    String insertQuery="delete from customer_details where CUSTOMER_ID='"+dto.getId()+"' ";  
	    return jdbcTemplate.update(insertQuery);  
	}  


	

}
