package com.intelligent.response.Bean.POJO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name="Ambulance")
@XmlRootElement
public class AmbulancesBean {
	
	@Id
	@Column(name="Ambulance_ID")
	private long ambulanceID;
	
	@Column(name="Reg_No")
	private String regNo;
	
	@Column(name="Ambulance_Name")
	private String ambulanceName;
	
	@Column(name="Phone_No")
	private String phoneNo;
	
	@Column(name="Email_Addr")
	private String emailAddress;
	
	@Column(name="Street")
	private String Street;
	
	@Column(name="Surburb")
	private String subub;
	
	@Column(name="Province")
	private String province;
	
	
	public AmbulancesBean() {
		
	}

	

	/**
	 * @param ambulanceID
	 * @param regNo
	 * @param ambulanceName
	 * @param phoneNo
	 * @param emailAddress
	 * @param street
	 * @param subub
	 * @param province
	 */
	public AmbulancesBean(long ambulanceID, String regNo, String ambulanceName, String phoneNo, String emailAddress,
			String street, String subub, String province) {
		super();
		this.ambulanceID = ambulanceID;
		this.regNo = regNo;
		this.ambulanceName = ambulanceName;
		this.phoneNo = phoneNo;
		this.emailAddress = emailAddress;
		Street = street;
		this.subub = subub;
		this.province = province;
	}



	/**
	 * @return the ambulanceID
	 */
	public long getAmbulanceID() {
		return ambulanceID;
	}


	/**
	 * @param ambulanceID the ambulanceID to set
	 */
	public void setAmbulanceID(long ambulanceID) {
		this.ambulanceID = ambulanceID;
	}


	/**
	 * @return the regNo
	 */
	public String getRegNo() {
		return regNo;
	}


	/**
	 * @param regNo the regNo to set
	 */
	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}


	/**
	 * @return the ambulanceName
	 */
	public String getAmbulanceName() {
		return ambulanceName;
	}


	/**
	 * @param ambulanceName the ambulanceName to set
	 */
	public void setAmbulanceName(String ambulanceName) {
		this.ambulanceName = ambulanceName;
	}


	/**
	 * @return the phoneNo
	 */
	public String getPhoneNo() {
		return phoneNo;
	}


	/**
	 * @param phoneNo the phoneNo to set
	 */
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}


	/**
	 * @return the emailAddress
	 */
	public String getEmailAddress() {
		return emailAddress;
	}


	/**
	 * @param emailAddress the emailAddress to set
	 */
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}


	/**
	 * @return the street
	 */
	public String getStreet() {
		return Street;
	}


	/**
	 * @param street the street to set
	 */
	public void setStreet(String street) {
		Street = street;
	}


	/**
	 * @return the subub
	 */
	public String getSubub() {
		return subub;
	}


	/**
	 * @param subub the subub to set
	 */
	public void setSubub(String subub) {
		this.subub = subub;
	}


	/**
	 * @return the province
	 */
	public String getProvince() {
		return province;
	}


	/**
	 * @param province the province to set
	 */
	public void setProvince(String province) {
		this.province = province;
	}



	@Override
	public String toString() {
		return "AmbulancesBean [ambulanceID=" + ambulanceID + ", regNo=" + regNo + ", ambulanceName=" + ambulanceName
				+ ", phoneNo=" + phoneNo + ", emailAddress=" + emailAddress + ", Street=" + Street + ", subub=" + subub
				+ ", province=" + province + "]";
	}
	
	
	

	
}
