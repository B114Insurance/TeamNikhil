package com.crts.insurance.main.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class BranchType 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int branchTypeId;
	@NotBlank(message = "branchtypeName is missing")
	@Size(max = 16)
	private String branchTypeName;
	@NotBlank(message = "branchtypecode is missing ")
	@Size(max = 16)
	private String branchTypeCode;
	public int getBranchTypeId() {
		return branchTypeId;
	}
	public void setBranchTypeId(int branchTypeId) {
		this.branchTypeId = branchTypeId;
	}
	public String getBranchTypeName() {
		return branchTypeName;
	}
	public void setBranchTypeName(String branchTypeName) {
		this.branchTypeName = branchTypeName;
	}
	public String getBranchTypeCode() {
		return branchTypeCode;
	}
	public void setBranchTypeCode(String branchTypeCode) {
		this.branchTypeCode = branchTypeCode;
	}
	

}
