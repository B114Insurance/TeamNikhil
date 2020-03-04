package com.crts.insurance.main.model;


import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Staff
{
	@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private  int staffId;
	private String staffName;
	
	private String staffGender;
	private String staffMaritalStatus;
	private String staffNationality;
	private String staffQualification;
	private String  staffAllowances;
	
	
	private String password;
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	@OneToOne(fetch = FetchType.EAGER)
	
	private Role role;
	
	public Address getStaffaddress() {
		return staffaddress;
	}

	public void setStaffaddress(Address staffaddress) {
		this.staffaddress = staffaddress;
	}

	@OneToOne(fetch = FetchType.EAGER)
 private Address staffaddress;
	
	
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

	
	
	

	public String getStaffGender() {
		return staffGender;
	}

	public void setStaffGender(String staffGender) {
		this.staffGender = staffGender;
	}

	public String getStaffMaritalStatus() {
		return staffMaritalStatus;
	}

	public void setStaffMaritalStatus(String staffMaritalStatus) {
		this.staffMaritalStatus = staffMaritalStatus;
	}

	public String getStaffNationality() {
		return staffNationality;
	}

	public void setStaffNationality(String staffNationality) {
		this.staffNationality = staffNationality;
	}

	public String getStaffQualification() {
		return staffQualification;
	}

	public void setStaffQualification(String staffQualification) {
		this.staffQualification = staffQualification;
	}

	public String getStaffAllowances() {
		return staffAllowances;
	}

	public void setStaffAllowances(String staffAllowances) {
		this.staffAllowances = staffAllowances;
	}

	public InsuranceCompany getCompany() {
		return company;
	}

	public void setCompany(InsuranceCompany company) {
		this.company = company;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	private InsuranceCompany company;


	@ManyToOne(fetch = FetchType.EAGER)
	private Department department;
	
}
