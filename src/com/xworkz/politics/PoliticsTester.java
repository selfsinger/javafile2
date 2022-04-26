package com.xworkz.politics;

import java.util.Collection;
import java.util.LinkedList;

import com.xworkz.politics.dao.PolitcalDAOImpl;
import com.xworkz.politics.dao.PoliticalPartyDAO;
import com.xworkz.politics.dto.PoliticalPartyDTO;
import com.xworkz.politics.service.PoliticalServiceImpl;

public class PoliticsTester {
	
	public static void main(String[] args) {
		PoliticalPartyDTO politics1=new PoliticalPartyDTO(201,"BJP","J.P.Nadda",true,300);
		PoliticalPartyDTO politics2=new PoliticalPartyDTO(204,"INC","Sonia Gandhi",true,150);
		PoliticalPartyDTO politics3=new PoliticalPartyDTO(203,"NPP","Conrad Sangma",true,10);
		PoliticalPartyDTO politics4=new PoliticalPartyDTO(202,"CPI","D  Raja",true,19);
		
		PolitcalDAOImpl dao=new PolitcalDAOImpl();
		
		
		
		System.out.println();
		PoliticalServiceImpl service=new PoliticalServiceImpl(dao);
		service.validateAndSave(politics1);
		System.out.println();
		service.validateAndSave(politics2);
		System.out.println();
		service.validateAndSave(politics3);
		System.out.println();
		service.validateAndSave(politics4);
		
		System.out.println();
		service.deleteByName("CPI");
		dao.deleteByName("INC");
		
		dao.display();
		dao.sortById();
		
		
		
		
	}

}
