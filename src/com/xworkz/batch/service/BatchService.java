package com.xworkz.batch.service;



import com.xworkz.batch.dto.BatchDTO;

public interface BatchService {
	
	boolean validate(BatchDTO dto) ;
	
	 boolean save(BatchDTO dto) ;
	 }


