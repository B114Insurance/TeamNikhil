package com.crts.insurance.main.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crts.insurance.main.model.InsuranceCompany;
import com.crts.insurance.main.repository.MSInsuranceRepository;

@Service
public class MSInsuranceServiceImpl implements MSinsuranceService {

	@Autowired
	MSInsuranceRepository  msInsuranceRepository;
	
	
	@Override
	public String savecompany(InsuranceCompany company) {

           msInsuranceRepository.save(company);
		
		return "company addsuccessfully";
	}

	@Override
	public List<InsuranceCompany> getAlldata() {
		 
		List<InsuranceCompany> l=msInsuranceRepository.findAll();
		return l;
	}

	@Override
	public InsuranceCompany getcompany(String companyName) {
	Optional<InsuranceCompany> optionalcompany=msInsuranceRepository.findById(companyName);
	if(optionalcompany.isPresent())
	{
		return optionalcompany.get();
	}
	

	return null;
	}

}
