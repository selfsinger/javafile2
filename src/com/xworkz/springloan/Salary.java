package com.xworkz.springloan;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Getter
@RequiredArgsConstructor
@ToString
public class Salary {
	
	@NonNull
	private Double netSalary;//const
	@NonNull
	private Double grossSalary;//const
	@Setter
	private Double exisitingLoanAmount;//setter(property)

}
