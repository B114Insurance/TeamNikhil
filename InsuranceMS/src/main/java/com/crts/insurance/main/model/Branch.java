package com.crts.insurance.main.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;



@Entity

public class Branch 
{
	public int getBranchId() {
		return branchId;
	}
	public void setBranchId(int branchId) {
		this.branchId = branchId;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int branchId;
	
   
	@NotBlank(message = "branchName is missing")
	@Size(max = 16)
	private String branchName;
	@NotBlank(message = "branchContactNo is missing")
	@Size(max = 16)
	private String branchContactNo;
	
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public String getBranchContactNo() {
		return branchContactNo;
	}
	public void setBranchContactNo(String branchContactNo) {
		this.branchContactNo = branchContactNo;
	}
	public String getBranchEmail() {
		return branchEmail;
	}
	public void setBranchEmail(String branchEmail) {
		this.branchEmail = branchEmail;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public BranchType getBranchType() {
		return branchType;
	}
	public void setBranchType(BranchType branchType) {
		this.branchType = branchType;
	}
	public InsuranceCompany getCompany() {
		return company;
	}
	public void setCompany(InsuranceCompany company) {
		this.company = company;
	}
	@NotBlank(message = "branchEmail is missing")
	@Size(max = 32)
	private String branchEmail;
	
	
	
	
	@OneToOne(fetch = FetchType.EAGER)
	private Address address;

	

	@OneToOne(cascade = CascadeType.ALL)
	private BranchType branchType;
	
	@ManyToOne(fetch = FetchType.EAGER)
	private InsuranceCompany company;
	
}