package com.crts.insurance.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crts.insurance.main.model.InsuranceCompany;
import com.crts.insurance.main.service.MSServiceImpl;

@CrossOrigin("*")
@RestController
public class InsuranceController 
{

	@Autowired
	MSServiceImpl msservice;
	
	@PostMapping("/storeInsuranceCompany")
	public String storeInsurance(@RequestBody  InsuranceCompany insurance)
	{
		
		msservice.saveinsurance(insurance);
		return "insurance done";
		
		
	}
@GetMapping("/getInsuranceCompany/{companyid}")
public InsuranceCompany getcompantdtails(@PathVariable("companyid") String CompanyId)
{
	InsuranceCompany i = msservice.getcompanydetails(CompanyId);
	

	
			return i;
	
	
}

	
}
