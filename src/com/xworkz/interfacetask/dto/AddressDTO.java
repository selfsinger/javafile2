package com.xworkz.interfacetask.dto;

import java.io.Serializable;

public class AddressDTO implements Serializable{
	
	

		private int id;// >0 <1000
		private String street;//min 2 , max 100
		private String doorNo;//min 1
		private int pincode;// 6 digits 
		private StateDTO stateDTO;// valid state
		
		public AddressDTO() {
			System.out.println("ADdressDTO is creatd:"+this.getClass().getSimpleName());
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getStreet() {
			return street;
		}

		public void setStreet(String street) {
			this.street = street;
		}

		public String getDoorNo() {
			return doorNo;
		}

		public void setDoorNo(String doorNo) {
			this.doorNo = doorNo;
		}

		public int getPincode() {
			return pincode;
		}

		public void setPincode(int pincode) {
			this.pincode = pincode;
		}

		public StateDTO getStateDTO() {
			return stateDTO;
		}

		public void setStateDTO(StateDTO stateDTO) {
			this.stateDTO = stateDTO;
		}
		
	}


