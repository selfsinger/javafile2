package com.xworkz.politics.service;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.politics.dao.PoliticalPartyDAO;
import com.xworkz.politics.dto.PoliticalPartyDTO;

public class PoliticalServiceImpl implements PoliticalPartyService {

	private PoliticalPartyDAO politicalDAO;

	public PoliticalServiceImpl(PoliticalPartyDAO politicalDAO) {
		if (politicalDAO != null) {
			System.out.println("this is from:" + this.getClass().getSimpleName());
			this.politicalDAO = politicalDAO;
		}
	}

	public PoliticalPartyDAO getPoliticalDAO() {
		return politicalDAO;
	}

	public void setPoliticalDAO(PoliticalPartyDAO politicalDAO) {
		this.politicalDAO = politicalDAO;
	}

	@Override
	public boolean validateAndSave(PoliticalPartyDTO politicalDto) {

		if (politicalDto != null) {
			if (politicalDto.getId() <= 0) {
				System.out.println("id is not correct");
				return false;
			}
			if (politicalDto.getName() == null && politicalDto.getName().length() < 3 && politicalDto.getName().length() > 50
					&& !politicalDto.getName().matches("[a-zA-z]*") ) {
				System.out.println("name is not correct");
				return false;

			}

			if (politicalDto.getPresidentName() ==null && politicalDto.getPresidentName().length()<3 &&
					politicalDto.getPresidentName().length()>50 && !politicalDto.getPresidentName().matches("[a-zA-z]*")){
				System.out.println("president name is not correct");
				return false;

			}
			if(politicalDto.getNoOfMps()<=0) {
				System.out.println("noOfMp is not correct");
				return false;
			}else {
				politicalDAO.save(politicalDto);
				return true;
			}
		}
		System.out.println("empty DTO");
		return false;
	}

	@Override
	public void deleteByName(String name) {
		if (name != null) {
			System.out.println("name is not null and we can delete by name");
			politicalDAO.deleteByName(name);
		} else {
			System.out.println("name is null...we cant delete it");
		}

	}

}
