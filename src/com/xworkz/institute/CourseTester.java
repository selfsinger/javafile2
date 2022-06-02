package com.xworkz.institute;


import java.time.*;


import com.xworkz.institute.dto.CourseDTO;
import com.xworkz.institute.service.*;

public interface CourseTester {
	
	public static void main(String[] args) {
		
		CourseDTO dto1=new CourseDTO(1,"JAVA",LocalTime.now(),45000,LocalDate.now(),true);
		CourseDTO dto2=new CourseDTO(2,"JAVA",LocalTime.now(),48000,LocalDate.now(),false);
		CourseDTO dto3=new CourseDTO(3,"SQL",LocalTime.now(),40000,LocalDate.now(),true);
		CourseDTO dto4=new CourseDTO(4,"WEB",LocalTime.of(6, 30),35000,LocalDate.of(2022, 6, 13),true);
		
		
		
		
	
		CourseService service=new CourseServiceImpl();
		System.out.println(service.save(dto1)+"\n"+service.save(dto2)+"\n"+service.save(dto3)
		+"\n"+service.save(dto4));
		
		
		
		
		
	}

}
