package com.xworkz.politics.dao;

import com.xworkz.politics.dto.PoliticalPartyDTO;

public interface PoliticalPartyDAO {
	
	public boolean save(PoliticalPartyDTO dto);
	 public PoliticalPartyDTO deleteByName(String name);
	 public void sortById();
	 
	 

}
