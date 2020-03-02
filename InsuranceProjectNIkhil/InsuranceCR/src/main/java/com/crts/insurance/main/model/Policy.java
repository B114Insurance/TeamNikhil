package com.crts.insurance.main.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Policy {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int policyNo;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "applicationId")
	private Application applicationId;
	@OneToOne(cascade = CascadeType.ALL)
	private Customer customerId;
	private String PolicyStartDate;
	private String policyExpriyDate;
	private String policyTermsConditionDiscription;

public int getPolicyNo() {
		return policyNo;
	}
	public void setPolicyNo(int policyNo) {
		this.policyNo = policyNo;
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
	public String getPolicyStartDate() {
		return PolicyStartDate;
	}
	public void setPolicyStartDate(String policyStartDate) {
		PolicyStartDate = policyStartDate;
	}
	public String getPolicyExpriyDate() {
		return policyExpriyDate;
	}
	public void setPolicyExpriyDate(String policyExpriyDate) {
		this.policyExpriyDate = policyExpriyDate;
	}
	public String getPolicyTermsConditionDiscription() {
		return policyTermsConditionDiscription;
	}
	public void setPolicyTermsConditionDiscription(String policyTermsConditionDiscription) {
		this.policyTermsConditionDiscription = policyTermsConditionDiscription;
	}

}
