package com.xworkz.politics.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.xworkz.politics.dto.PoliticalPartyDTO;

public class PoliticalPartyIdNameComparator implements Comparator<PoliticalPartyDTO> {
	

	
	@Override
	public int compare(PoliticalPartyDTO o1, PoliticalPartyDTO o2) {
		Integer id1 = o1.getId();
		Integer id2 = o2.getId();
		int comparision = 0;
		comparision = o1.getName().compareTo(o2.getName());
		if (comparision == 0) {
			comparision = id1.compareTo(id2);
		}
		
		return comparision;
		 
	}

}
