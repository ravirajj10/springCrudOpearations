package com.saikrupa.entities;

public class CustomerDetails {
	private String name = null;
	private String buildingNumber = null;
	private String flatNumber = null;
	private String mobileNo = null;
	private String emailAddress = null;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBuildingNumber() {
		return buildingNumber;
	}

	public void setBuildingNumber(String buildingNumber) {
		this.buildingNumber = buildingNumber;
	}

	public String getFlatNumber() {
		return flatNumber;
	}

	public void setFlatNumber(String flatNumber) {
		this.flatNumber = flatNumber;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	@Override
	public String toString() {
		return "CustomerDetails [name=" + name + ", buildingNumber=" + buildingNumber + ", flatNumber=" + flatNumber
				+ ", mobileNo=" + mobileNo + ", emailAddress=" + emailAddress + "]";
	}

}
