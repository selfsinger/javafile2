package com.xworkz.loantester;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.springloan.Loan;

public class LoanRunner {
	
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("resources/spring-loan.xml");
		System.out.println("total objects managed:"+context.getBeanDefinitionCount());
		System.out.println(Arrays.toString(context.getBeanDefinitionNames()));
		
		Loan loan=context.getBean(Loan.class);
		boolean sanctioned=loan.sanction();
		System.out.println("sanctioned:"+sanctioned);
	}

}
