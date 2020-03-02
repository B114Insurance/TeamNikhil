package com.crts.insurance.main.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class InsuranceCompany {
	

		@Id
		private String companyName;
		private long companyMobileNo;
		private String companyWebsite;
		private String companyEmail;
		private String companyLocation;
		private String companyFax;
		@OneToOne(fetch = FetchType.EAGER)
		private Address address;
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
			return companyFax;
		}
		public void setCompanyFax(String companyFax) {
			this.companyFax = companyFax;
		}
		public Address getAddress() {
			return address;
		}
		public void setAddress(Address address) {
			this.address = address;
		}
	
		
		


}
