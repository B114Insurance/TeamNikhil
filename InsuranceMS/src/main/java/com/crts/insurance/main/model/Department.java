package com.crts.insurance.main.model;


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
public class Department 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int deptId;
	
public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public Branch getBranch() {
		return branch;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}
	@NotBlank(message = "DEPT NAME  is missing")
	@Size(max = 16)
private String deptName;
	
	private String deptLedger;
	

	@ManyToOne(fetch = FetchType.EAGER)
	private InsuranceCompany company;
	

	public InsuranceCompany getCompany() {
		return company;
	}

	public void setCompany(InsuranceCompany company) {
		this.company = company;
	}

	
	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getDeptLedger() {
		return deptLedger;
	}

	public void setDeptLedger(String deptLedger) {
		this.deptLedger = deptLedger;
	}
@OneToOne(fetch = FetchType.EAGER)
private Branch branch;

	

}
	 
	 

