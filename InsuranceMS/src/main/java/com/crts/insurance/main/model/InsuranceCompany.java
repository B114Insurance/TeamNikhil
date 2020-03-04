package com.crts.insurance.main.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class InsuranceCompany 
{
	@Id
@NotBlank(message = "CompanyName is missing")
	@Size(max = 32)
	private String companyName;
	@NotBlank(message = "companyMobileno is missing")
	@Size(max = 10)
	private String companyMobileno;
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCompanyMobileno() {
		return companyMobileno;
	}
	public void setCompanyMobileno(String companyMobileno) {
		this.companyMobileno = companyMobileno;
	}
	public String getCompanyWebsite() {
		return companyWebsite;
	}
	public void setCompanyWebsite(String companyWebsite) {
		this.companyWebsite = companyWebsite;
	}
	public String getCompanyEmail() {
		return companyEmail;
	}
	public void setCompanyEmail(String companyEmail) {
		this.companyEmail = companyEmail;
	}
	public String getCompanyLocation() {
		return companyLocation;
	}
	public void setCompanyLocation(String companyLocation) {
		this.companyLocation = companyLocation;
	}
	public String getCompanyFax() {
		return CompanyFax;
	}
	public void setCompanyFax(String companyFax) {
		CompanyFax = companyFax;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@NotBlank(message = "companywebsite is not blank")
	@Size(max = 25)
	private String companyWebsite;
	@NotBlank(message = "companyEmail is not balnk")
	@Size(max = 25)
	private String companyEmail;
	@NotBlank(message = "companylocation is not balnk ")
	@Size(max = 10)
	private String companyLocation;
	@NotBlank(message = "companyfax is not blank")
	@Size(max = 16)
	private  String CompanyFax;
	@OneToOne(fetch = FetchType.EAGER)
	private Address address;
	
	

}
