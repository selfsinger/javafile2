package com.xworkz.institute.dto;


import java.time.LocalDate;
import java.time.LocalTime;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class CourseDTO {
	
	//courseId,courseName,duration,fees,startDate,free
	
	private int id;
	private String courseName;
	private Float duration;
	private int fees;
	private LocalDate startDate;
	private boolean free;
	
	 public boolean getFree() {
		 return free;
	 }
	
	 
	

}
