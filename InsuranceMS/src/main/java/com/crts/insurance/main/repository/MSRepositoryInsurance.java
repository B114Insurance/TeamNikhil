package com.crts.insurance.main.repository;

import org.springframework.data.repository.CrudRepository;

import com.crts.insurance.main.model.InsuranceCompany;

public interface MSRepositoryInsurance  extends CrudRepository<InsuranceCompany, String> {

	
	
}
