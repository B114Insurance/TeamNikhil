package com.crts.insurance.main.model;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
@Entity
public class Quotation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int QuotationId;
	private String quatationIussueDate;
	private String quatationDiscription;
	
	@OneToOne(fetch = FetchType.EAGER)
	private Application applicationId;
	
	@OneToOne(fetch = FetchType.EAGER)
	private Customer customerId;
	

	  @OneToOne(fetch = FetchType.EAGER)
	  private Product product;
	 
	
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public int getQuotationId() {
		return QuotationId;
	}
	public void setQuotationId(int quotationId) {
		QuotationId = quotationId;
	}
	public Application getApplicationId() {
		return applicationId;
	}
	public void setApplicationId(Application applicationId) {
		this.applicationId = applicationId;
	}
	public Customer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Customer customerId) {
		this.customerId = customerId;
	}
	public String getQuatationIussueDate() {
		return quatationIussueDate;
	}
	public void setQuatationIussueDate(String quatationIussueDate) {
		this.quatationIussueDate = quatationIussueDate;
	}
	public String getQuatationDiscription() {
		return quatationDiscription;
	}
	public void setQuatationDiscription(String quatationDiscription) {
		this.quatationDiscription = quatationDiscription;
	}
	
	

	
	

}
