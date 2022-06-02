package com.xworkz.batch;

import java.sql.SQLException;
import java.time.LocalDate;

import com.xworkz.batch.dto.BatchDTO;
import com.xworkz.batch.service.BatchService;
import com.xworkz.batch.service.BatchServiceImpl;

public class BatchTester{

	public static void main(String[] args) {
		
		BatchDTO dto1=new BatchDTO(100,"java",LocalDate.now(),6000);
		BatchDTO dto2=new BatchDTO(101,"SQL",LocalDate.now(),7000);
		BatchDTO dto3=new BatchDTO(102,"JAVASCRIPT",LocalDate.now(),8000);
		
		
		BatchService service=new BatchServiceImpl();
		System.out.println(service.save(dto1));
		System.out.println(service.save(dto2));
		System.out.println(service.save(dto3));
		
	}
}
