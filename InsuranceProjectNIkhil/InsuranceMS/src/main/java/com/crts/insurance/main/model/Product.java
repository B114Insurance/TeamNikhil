package com.crts.insurance.main.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
	public class Product 
	{
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private  int productId;
		private String productprice;
		private String productType;
		
		@ManyToOne(fetch = FetchType.EAGER)
		private InsuranceCompany companyName;
		
		public InsuranceCompany getCompanyName() {
			return companyName;
		}
		public void setCompanyName(InsuranceCompany companyName) {
			this.companyName = companyName;
		}
		public int getProductId() {
			return productId;
		}
		public void setProductId(int productId) {
			this.productId = productId;
		}
		public String getProductprice() {
			return productprice;
		}
		public void setProductprice(String productprice) {
			this.productprice = productprice;
		}
		public String getProductType() {
			return productType;
		}
		public void setProductType(String productType) {
			this.productType = productType;
		}
		
		
		
		


	}
