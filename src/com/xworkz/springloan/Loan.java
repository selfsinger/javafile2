package com.xworkz.springloan;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;


@Getter
@RequiredArgsConstructor
public class Loan {
	
	@Setter
	private String provider;//setter
	@NonNull
	private Salary salary;//const
	
	public boolean sanction() {
		System.out.println("running loan sanction");
		if(salary!=null) {
			System.out.println("printing salalry in loan:"+salary);
			if(salary.getNetSalary()>400 && salary.getGrossSalary()>500 &&  salary.getExisitingLoanAmount()<350)
			{
			System.out.println("eligible for loan");
			return true;
		}else {
			System.out.println("not eligible");
		}
	}
		
		return false;
}
}
