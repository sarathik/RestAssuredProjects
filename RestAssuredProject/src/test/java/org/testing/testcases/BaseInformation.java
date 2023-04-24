package org.testing.testcases;

public class BaseInformation {
	
	private String idValue;
	private String fname;
	private String city;
	private String designation;
	
	private AddressInformation addressDetails;
		
	public AddressInformation getAddressDetails() {
		return addressDetails;
	}
	public void setAddressDetails(AddressInformation addressDetails) {
		this.addressDetails = addressDetails;
	}
	
	public String getIdValue() {
		return idValue;
	}
	public void setIdValue(String idValue) {
		this.idValue = idValue;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	

}
