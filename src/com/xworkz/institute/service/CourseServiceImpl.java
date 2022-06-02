package com.xworkz.institute.service;

import java.time.*;

import com.xworkz.institute.dao.*;
import com.xworkz.institute.dto.CourseDTO;

public class CourseServiceImpl implements CourseService {

	CourseDAO dao;

	@Override
	public boolean validate(CourseDTO dto) {
		if (dto != null) {
			LocalTime time = dto.getDuration();
			LocalDate date=dto.getStartDate();
			
			System.out.println("Here validating details of course...");
			if (dto.getId() > 0 && dto.getCourseName() != null && (dto.getCourseName().length() >=3 && dto.getCourseName().length()<30 
					&& dto.getCourseName().length() < 30 && time.isAfter(LocalTime.of(4, 30)) && dto.getFees() >0
					&& dto.getFees() <=50000 )&& date.isAfter(LocalDate.of(2022, 6, 10))) {
				System.out.println("validation successfull");
				return true;
			} else {
				System.out.println("not successfull");
			}
			//time.isAfter(LocalTime.of(01, 30))
			//&& time.isAfter(LocalTime.of(05, 40))
//			if(dto.getId()>0) {
//				System.out.println("id validation is correct");
//				
//				if(dto.getCourseName()!=null  && dto.getCourseName().length()>3 &&
//						dto.getCourseName().length()<30) {
//					System.out.println("course validation is correct");
//					
//					if(time.isAfter(LocalTime.of(01, 30)) && time.isAfter(LocalTime.of(05, 40))) {
//						System.out.println("duration validation is correct");
//						
//						if(dto.getFees()<50000 && dto.getFees()>0) {
//							System.out.println("fees validation is correct");
//							
////							if(date.isAfter(LocalDate.of(2022, 07, 10))) {
////								System.out.println("date validation is correct");
////								return true;
////							}
//						}
//					}
//				}
//			}
//			else {
//				System.out.println("not successfull");
//			}
		}

		return false;
	}

	@Override
	public boolean save(CourseDTO dto) {
		if (validate(dto)) {

			System.out.println("saving data...");
			return new CourseDAOImpl().save(dto);
		}

		return false;
	}

}
