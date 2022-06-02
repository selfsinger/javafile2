package com.xworkz.institute.service;

import com.xworkz.institute.dto.CourseDTO;

public interface CourseService {
	
	boolean validate(CourseDTO dto) ;
	
	 boolean saveTheData(CourseDTO dto) ;
	 }


