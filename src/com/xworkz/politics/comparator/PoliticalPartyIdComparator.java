package com.xworkz.politics.comparator;

import java.util.Collection;
import java.util.Comparator;

import com.xworkz.politics.dto.PoliticalPartyDTO;

public class PoliticalPartyIdComparator implements Comparator<PoliticalPartyDTO>{

	@Override
	public int compare(PoliticalPartyDTO object1, PoliticalPartyDTO object2) {
		System.out.println("comparing politicalParty dtos by id");
		int id1=object1.getId();
		int id2=object2.getId();
		
		if(id1==id2)
			return 0;
		if(id1>id2)
			return 100;
		if(id1<id2)
			return -50;
		return 0;
		
	}

}
