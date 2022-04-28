package com.xworkz.politics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import com.xworkz.politics.comparator.PoliticalPartyIdComparator;
import com.xworkz.politics.comparator.PoliticalPartyNameComparator;
import com.xworkz.politics.dao.PolitcalDAOImpl;
import com.xworkz.politics.dao.PoliticalPartyDAO;
import com.xworkz.politics.dto.PoliticalPartyDTO;
import com.xworkz.politics.service.PoliticalServiceImpl;

public class PoliticsTester {

	public static void main(String[] args) {
		PoliticalPartyDTO politics1 = new PoliticalPartyDTO(201, "BJP", "J.P.Nadda", true, 300);
		PoliticalPartyDTO politics2 = new PoliticalPartyDTO(204, "DNC", "Sonia Gandhi", true, 150);
		PoliticalPartyDTO politics3 = new PoliticalPartyDTO(203, "EPP", "Conrad Sangma", true, 10);
		PoliticalPartyDTO politics4 = new PoliticalPartyDTO(202, "CPI", "D  Raja", true, 19);

		PolitcalDAOImpl dao = new PolitcalDAOImpl();

		System.out.println();
		PoliticalServiceImpl service = new PoliticalServiceImpl(dao);
		service.validateAndSave(politics1);
		System.out.println();
		service.validateAndSave(politics2);
		System.out.println();
		service.validateAndSave(politics3);
		System.out.println();
		service.validateAndSave(politics4);
		service.sortById();

		System.out.println();
		service.deleteByName("CPI");
		dao.deleteByName("INC");

		dao.display();
		System.out.println();

		System.out.println(service.sortById());

		System.out.println();
		System.out.println(service.sortByName());
		System.out.println(service.sortByNameAndId());
		System.out.println();
		service.save(politics1);
		service.save(politics2);
		service.save(politics3);
		service.save(politics4);

		System.out.println();
//	    Collection<PoliticalPartyDTO> list2=service.sortByNameAndId();
//	    System.out.println(list2);
	    service.sortByNameAndId();
		
		

	}

}
