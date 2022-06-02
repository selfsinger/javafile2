package com.xworkz.batch.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BatchDTO {
	
	//id,coursename,startdate,fees
	private int id;
	private String courseName;
	private LocalDate startDate;
	private int fees;
	

}
