package com.xworkz.politics.service;

import java.util.Collection;
import java.util.List;

import com.xworkz.politics.dto.PoliticalPartyDTO;

public interface PoliticalPartyService {
	
	public boolean save(PoliticalPartyDTO dto);
	boolean validateAndSave(PoliticalPartyDTO dto);
	void deleteByName(String name);
	Collection<PoliticalPartyDTO> sortByName();
	 Collection<PoliticalPartyDTO> sortById(); 
	Collection<PoliticalPartyDTO> sortByNameAndId();

}
