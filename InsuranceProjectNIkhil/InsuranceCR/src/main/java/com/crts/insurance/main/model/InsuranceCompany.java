package com.crts.insurance.main.model;



import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class InsuranceCompany 
{

	@Id
    private String companyName;
	private long companyMobileNo;
	private String companyWebsite;
	private String companyEmail;
	private String companyLocation;
	private String companyfax;
	
	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public long getCompanyMobileNo() {
		return companyMobileNo;
	}

	public void setCompanyMobileNo(long companyMobileNo) {
		this.companyMobileNo = companyMobileNo;
	}

	public String getCompanyWebsite() {
		return companyWebsite;
	}

	public void setCompanyWebsite(String companyWebsite) {
		this.companyWebsite = companyWebsite;
	}

	
	public String getCompanyLocation() {
		return companyLocation;
	}

	public void setCompanyLocation(String companyLocation) {
		this.companyLocation = companyLocation;
	}

	public String getCompanyfax() {
		return companyfax;
	}

	public void setCompanyfax(String companyfax) {
		this.companyfax = companyfax;
	}



	
	public String getCompanyEmail() {
		return companyEmail;
	}

	public void setCompanyEmail(String companyEmail) {
		this.companyEmail = companyEmail;
	}



@OneToOne(fetch = FetchType.EAGER)
private  Address address;




public Address getAddress() {
	return address;
}

public void setAddress(Address address) {
	this.address = address;
}





}
