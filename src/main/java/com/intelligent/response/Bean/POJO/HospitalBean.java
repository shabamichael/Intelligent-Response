package com.intelligent.response.Bean.POJO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
@Table(name="hospital")
public class HospitalBean {
	
	@Id
	@Column(name="Hospital_ID")
	private long HospitalID;
	
	@Column(name="Reg_No")
	private String  RegNo;
	
	@Column(name="Hospital_Name")
	private String HospitalName;
	
	@Column(name="Phone_No")
	private String phoneNo;
	
	@Column(name="Email_Addr")
	private String email;
		
	@Column(name="Street")
	private String Street;
	
	@Column(name="Surburb")
	private String suburb;
	
	@Column(name="Province")
	private String province;
	
	public long getHospitalID() {
		return HospitalID;
	}
	public void setHospitalID(long hospitalID) {
		HospitalID = hospitalID;
	}
	public String getRegNo() {
		return RegNo;
	}
	public void setRegNo(String regNo) {
		RegNo = regNo;
	}
	public String getHospitalName() {
		return HospitalName;
	}
	public void setHospitalName(String hospitalName) {
		HospitalName = hospitalName;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getStreet() {
		return Street;
	}
	public void setStreet(String street) {
		Street = street;
	}
	public String getSurburb() {
		return suburb;
	}
	public void setSurburb(String surburb) {
		this.suburb = surburb;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	
	
	
	public HospitalBean() {
				
	}
	
	public HospitalBean(long hospitalID, String regNo, String hospitalName, String phoneNo, String email, String street,
			String suburb, String province) {
		super();
		HospitalID = hospitalID;
		RegNo = regNo;
		HospitalName = hospitalName;
		this.phoneNo = phoneNo;
		this.email = email;
		Street = street;
		this.suburb = suburb;
		this.province = province;
	}
	
	
	@Override
	public String toString() {
		return "HospitalBean [HospitalID=" + HospitalID + ", RegNo=" + RegNo + ", HospitalName=" + HospitalName
				+ ", phoneNo=" + phoneNo + ", email=" + email + ", Street=" + Street + ", suburb=" + suburb
				+ ", province=" + province + "]";
	}
	
	
	

}
