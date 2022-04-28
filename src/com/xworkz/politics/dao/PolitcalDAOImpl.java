package com.xworkz.politics.dao;

import java.util.*;

import com.xworkz.politics.comparator.PoliticalPartyIdComparator;
import com.xworkz.politics.dto.PoliticalPartyDTO;

public class PolitcalDAOImpl implements PoliticalPartyDAO {

	public PolitcalDAOImpl() {
		System.out.println("this is from:" + this.getClass().getSimpleName());
	}

	List<PoliticalPartyDTO> political = new ArrayList<PoliticalPartyDTO>();

	@Override
	public boolean save(PoliticalPartyDTO dto) {
		if (dto != null) {
			System.out.println(political.add(dto));
			System.out.println("Here.... saving the elements :" + political.size());
			return true;
		}

		return false;
	}

	public void display() {
		System.out.println("here..displayng values:" + political);
	}

	@Override
	public PoliticalPartyDTO deleteByName(String name) {
		for (PoliticalPartyDTO d : political) {
			if (d.getName().equals(name)) {
				political.remove(name);
				System.out.println("Its deleted by name:" + d);
			}
		}

		return null;
	}

	@Override
	public Collection<PoliticalPartyDTO> sorter(Comparator<PoliticalPartyDTO> comparator) {
		if (comparator != null) {
			political.sort(comparator);
			return political;
		}
		System.out.println("No comparators");
		return political;
	}

}
