package com.crts.insurance.main.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Branch {
	
	@Id
	   @GeneratedValue(strategy = GenerationType.IDENTITY)
		private int branchid;
		private String branchName;
		private String branchContactNo;
		private String branchEmail;
		
		@OneToOne(fetch = FetchType.EAGER)
		private Address address;
		@OneToOne(fetch = FetchType.EAGER)
		private BranchType branchType;
		@ManyToOne(fetch = FetchType.EAGER)
		private InsuranceCompany company;
		public int getBranchid() {
			return branchid;
		}

		public void setBranchid(int branchid) {
			this.branchid = branchid;
		}

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

	
	
	
	

}
