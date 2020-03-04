package com.crts.insurance.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;


import com.crts.insurance.main.model.InsuranceCompany;

@Repository
public interface MSInsuranceRepository  extends JpaRepository<InsuranceCompany, String>{
	

	
	
	
}
