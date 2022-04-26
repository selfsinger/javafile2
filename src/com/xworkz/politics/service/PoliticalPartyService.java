package com.xworkz.politics.service;

import com.xworkz.politics.dto.PoliticalPartyDTO;

public interface PoliticalPartyService {
	
	boolean validateAndSave(PoliticalPartyDTO dto);
	void deleteByName(String name);

}
