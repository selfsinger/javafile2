package com.xworkz.politics.dao;

import java.util.*;

import com.xworkz.politics.comparator.PoliticalPartyNameComparator;
import com.xworkz.politics.dto.PoliticalPartyDTO;

public class PolitcalDAOImpl implements PoliticalPartyDAO {

	public PolitcalDAOImpl() {
		System.out.println("this is from:" + this.getClass().getSimpleName());
	}

	Collection<PoliticalPartyDTO> collect = new ArrayList<>();
	List<PoliticalPartyDTO> political = new LinkedList<PoliticalPartyDTO>();

	@Override
	public boolean save(PoliticalPartyDTO dto) {
		if (dto != null) {
			System.out.println(political.add(dto));
			System.out.println("Here.... saving the elements :" + political.size());
			// System.out.println(collect.toString());
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
	public void sortById() {
		Comparator<PoliticalPartyDTO> comparator=new PoliticalPartyNameComparator();
		System.out.println("Before sorting......");
		for(PoliticalPartyDTO party:political) {
			System.out.println(party);
		}
		System.out.println("After sorting.......");
		political.sort(comparator);
		for(PoliticalPartyDTO party:political) {
			System.out.println(party);

	}

}
}
