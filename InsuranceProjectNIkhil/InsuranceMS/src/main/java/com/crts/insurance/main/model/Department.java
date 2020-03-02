package com.crts.insurance.main.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;



@Entity
public class Department 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int deptId;
	private String deptName;
	private String deptLedger;
	@ManyToOne(fetch = FetchType.EAGER)
	private Branch branch;
	@ManyToOne(fetch = FetchType.EAGER)   // no use actually here data repeating
	private InsuranceCompany company;
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
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
	public Branch getBranch() {
		return branch;
	}
	public void setBranch(Branch branch) {
		this.branch = branch;
	}
	public InsuranceCompany getCompany() {
		return company;
	}
	public void setCompany(InsuranceCompany company) {
		this.company = company;
	}









	

	
	

	
	

}
	 
	 
