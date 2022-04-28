package com.xworkz.politics.comparator;

import java.util.Comparator;

import com.xworkz.politics.dto.PoliticalPartyDTO;

public class PoliticalPartyNameComparator implements Comparator<PoliticalPartyDTO>{

	@Override
	public int compare(PoliticalPartyDTO o1, PoliticalPartyDTO o2)
	{
		System.out.println("comparing politicalParty dtos by name");
		int comparision=0;
		comparision=o1.getName().compareTo(o2.getName());
		return comparision;
		
		
	}

}
