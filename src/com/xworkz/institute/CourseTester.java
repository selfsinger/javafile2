package com.xworkz.institute;

import java.sql.Date;
import java.time.*;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.institute.dto.CourseDTO;
import com.xworkz.institute.service.*;

public class CourseTester {

	public static void main(String[] args) {

		//CourseDTO dto1 = new CourseDTO(1, "JAVA", 5.5f, 45000, LocalDate.now(), true);
		//CourseDTO dto2 = new CourseDTO(2, "SQL", 14.5f, 48000, LocalDate.of(2022, 07, 11), false);
		CourseDTO dto3 = new CourseDTO(3, "WEB", 10.14f, 40000, LocalDate.now(), true);
		CourseDTO dto4 = new CourseDTO(4, "JavaScript", 16.70f, 40000, LocalDate.of(2022,Month.JUNE, 12), true);
		ApplicationContext application=new ClassPathXmlApplicationContext("resources/Spring.xml");
		CourseService service=application.getBean(CourseService.class);
		boolean saved=service.saveTheData(dto3);
		boolean saved1=service.saveTheData(dto4);
		System.out.println(saved);
//		CourseDTO dto4 = new CourseDTO(4, "JAVASCRIPT", 7.7f, 35000, LocalDate.of(2022, 6, 13), true);

		//CourseService service = new CourseServiceImpl();
		//System.out.println(service.saveTheData(dto1) +"\n"+service.saveTheData(dto2));
		

	

}
}
