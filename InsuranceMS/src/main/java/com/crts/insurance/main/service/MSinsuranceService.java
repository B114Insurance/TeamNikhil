package com.crts.insurance.main.service;

import java.util.List;

import com.crts.insurance.main.model.InsuranceCompany;

public interface MSinsuranceService{
	
	public String savecompany(InsuranceCompany company);
	public List<InsuranceCompany> getAlldata();
	InsuranceCompany getcompany(String companyName);

}
