package com.xworkz.interfacetask;

import com.xworkz.interfacetask.constants.CustomerType;
import com.xworkz.interfacetask.dao.CustomerDAO;
import com.xworkz.interfacetask.dao.CustomerDAOImplimentation;
import com.xworkz.interfacetask.dto.AddressDTO;
import com.xworkz.interfacetask.dto.CustomerDTO;
import com.xworkz.interfacetask.dto.StateDTO;
import com.xworkz.interfacetask.service.CustomerService;
import com.xworkz.interfacetask.service.CustomerServiceImplementation;

public class CustomerRunner {

	public static void main(String[] args) {

		StateDTO stateDTO = new StateDTO();
		stateDTO.setId(04);
		stateDTO.setName("Karanataka");
		stateDTO.setNoOfDistricts(31);

		StateDTO stateDTO1 = new StateDTO();
		stateDTO1.setId(10);
		stateDTO1.setName("Maharashtra");
		stateDTO1.setNoOfDistricts(35);

		AddressDTO addressDTO = new AddressDTO();
		addressDTO.setId(12);
		addressDTO.setDoorNo("H No 4");
		addressDTO.setStreet("Ashram road");
		addressDTO.setPincode(34657);
		addressDTO.setStateDTO(stateDTO);

		AddressDTO addressDTO1 = new AddressDTO();
		addressDTO.setId(15);
		addressDTO.setDoorNo("#4");
		addressDTO.setStreet("MG road");
		addressDTO.setPincode(875637);
		addressDTO.setStateDTO(stateDTO1);

		CustomerDTO customerDTO = new CustomerDTO();// new CustomerDAOImpl();
		customerDTO.setId(32);
		customerDTO.setName("Megha");
		customerDTO.setCustomerId(64);
		customerDTO.setMobile(46537282765L);
		customerDTO.setAlternativeMobile(987635418765L);
		customerDTO.setEmail("manju@gmail.com");
		customerDTO.setAlternativeEmail("megha@gmail.com");
		customerDTO.setCustomerType(CustomerType.PREMIUM);
		customerDTO.setAddressDTO(addressDTO);

		CustomerDTO customerDTO1 = new CustomerDTO();
		customerDTO1.setId(5);
		customerDTO1.setName("Manju");
		customerDTO1.setCustomerId(78);
		customerDTO1.setMobile(9853764765L);
		customerDTO1.setAlternativeMobile(6776358765L);
		customerDTO1.setEmail("pinku@gmail.com");
		customerDTO1.setAlternativeEmail("purnu@gmail.com");
		customerDTO1.setCustomerType(CustomerType.GOLD);
		customerDTO1.setAddressDTO(addressDTO);

		CustomerDAO customerDAO = new CustomerDAOImplimentation();
		System.out.println();
		CustomerService customerService = new CustomerServiceImplementation(customerDAO);
		System.out.println();
		customerService.validateAndSave(customerDTO);
		customerService.validateAndSave(customerDTO1);
		System.out.println();
		CustomerDTO dtoFound = customerService.findByName("Megha");
		System.out.println(dtoFound);
		System.out.println();
		System.out.println(customerService.findByName("Manju"));
		System.out.println();
		CustomerDTO dto1 = customerDAO.findByName("sutta");
		System.out.println(dto1);
		System.out.println();
		CustomerDTO dto2 = customerDAO.findByName("kachkebal");
		System.out.println(dto2);

		// init all variables

		// init all variables
		// addressDTO.setStateDTO(stateDTO);
		// CustomerDTO customerDTO=null;
		// init all variables inclusing addressDTO
		// customerDTO.setAddressDTO(addressDTO)

		// customerService.validateAndSave(customerDTO);

	}
}
