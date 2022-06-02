package com.xworkz.batch.service;


import java.time.LocalDate;

import com.xworkz.batch.dao.*;
import com.xworkz.batch.dto.BatchDTO;

public class BatchServiceImpl implements BatchService {

	BatchDAO dao ;

	@Override
	public boolean validate(BatchDTO dto)  {
		if (dto != null) {
LocalDate date=dto.getStartDate();
		System.out.println("validating batch details...");
		if (dto.getId() > 0 && dto.getCourseName()!=null && dto.getCourseName().length()>2 &&
			dto.getCourseName().length()<25 && dto.getFees()>=5000  && date.isAfter(LocalDate.of(2022,05,20))) {
		System.out.println("validation is successfull");
			return true;
		
		}
		else {
			System.out.println("validaiton not successfull");
			return false;
		}
	}
		return false;	
	}
	@Override
	public boolean save(BatchDTO dto){
		if (validate(dto)) {
			System.out.println("data is saved(stored)");
			return  new BatchDAOImpl().save(dto);
		}
		return false;
	}
}
