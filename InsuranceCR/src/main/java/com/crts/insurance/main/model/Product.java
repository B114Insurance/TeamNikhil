package com.crts.insurance.main.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Product {
	@Id
	private String productName;
	private double productPrice;
	private String productType;
	
	@ManyToOne(fetch = FetchType.EAGER)
	private InsuranceCompany companyName;
	
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	public InsuranceCompany getCompanyName() {
		return companyName;
	}
	public void setCompanyName(InsuranceCompany companyName) {
		this.companyName = companyName;
	}
	
	//@ManyToOne(cascade = CascadeType.ALL)
	
	/*
	 * @ManyToOne(fetch = FetchType.EAGER) private Quotation quotation;
	 * 
	 * public Quotation getQuotation() { return quotation; } public void
	 * setQuotation(Quotation quotation) { this.quotation = quotation; }
	 */
	 

}
