package com.xworkz.institute.service;

import java.time.*;

import com.xworkz.institute.dao.*;
import com.xworkz.institute.dto.CourseDTO;

public class CourseServiceImpl implements CourseService {

	private CourseDAO dao;

	public CourseServiceImpl(CourseDAO dao) {
		super();
		this.dao = dao;
	}

	@Override
	public boolean validate(CourseDTO dto) {
		if (dto != null) {
			Float time = dto.getDuration();
			LocalDate greaterthansevendays = LocalDate.now().plusDays(7);

			System.out.println("Here validating details of course...");
			if (dto.getId() > 0 && dto.getCourseName() != null
					&& (dto.getCourseName().length() >= 3 && dto.getCourseName().length() < 30 && time > 0 && time < 6
							&& dto.getFees() >= 0 && dto.getFees() <= 50000)
					&& dto.getStartDate().isAfter(greaterthansevendays)) {
				System.out.println("validation successfull");
				return true;
			} else {
				System.out.println("not successfull");
				return false;
			}

		}

		return false;

	}

	@Override
	public boolean saveTheData(CourseDTO dto) {
		return dao.saveTheData(dto);
	}

}
