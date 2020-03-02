package com.crts.insurance.main.model;


import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Staff {

	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int staffId;
	private String staffName;
	private String staffAllowance;
	private String staffNationlity;
	private String matritalStatus;
	private String staffQualification;
	@OneToOne(fetch = FetchType.EAGER)
	private Address staffAddress;
	public int getStaffId() {
		return staffId;
	}
	public void setStaffId(int staffId) {
		this.staffId = staffId;
	}
	public String getStaffName() {
		return staffName;
	}
	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}
	public String getStaffAllowance() {
		return staffAllowance;
	}
	public void setStaffAllowance(String staffAllowance) {
		this.staffAllowance = staffAllowance;
	}
	public String getStaffNationlity() {
		return staffNationlity;
	}
	public void setStaffNationlity(String staffNationlity) {
		this.staffNationlity = staffNationlity;
	}
	public String getMatritalStatus() {
		return matritalStatus;
	}
	public void setMatritalStatus(String matritalStatus) {
		this.matritalStatus = matritalStatus;
	}
	public String getStaffQualification() {
		return staffQualification;
	}
	public void setStaffQualification(String staffQualification) {
		this.staffQualification = staffQualification;
	}
	public Address getStaffAddress() {
		return staffAddress;
	}
	public void setStaffAddress(Address staffAddress) {
		this.staffAddress = staffAddress;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	@ManyToOne(fetch = FetchType.EAGER)
	private Department department;
}
