package com.xworkz.politics.dao;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;

import com.xworkz.politics.dto.PoliticalPartyDTO;

public interface PoliticalPartyDAO {
	
	public boolean save(PoliticalPartyDTO dto);
	 public PoliticalPartyDTO deleteByName(String name);
	
	Collection<PoliticalPartyDTO> sorter(Comparator<PoliticalPartyDTO> comparator) ;
	 
	 

}
