package com.crts.insurance.main.controller;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder.In;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crts.insurance.main.model.InsuranceCompany;
import com.crts.insurance.main.service.MSinsuranceService;
@CrossOrigin("*")
@RestController
public class MSInsuranceController 
{
	@Autowired
	MSinsuranceService  	msinsuranceService;
	
	
	private static final Logger log = LoggerFactory.getLogger(MSInsuranceController.class);
@PostMapping("/addcompany")
	public ResponseEntity<String> addcompany(@Valid @RequestBody InsuranceCompany company,BindingResult result)
	{
	
	log.info("*******************"+"data insert"+"*********************");
	String resMessage;
	HttpStatus httpstatus;
	if(result.hasErrors())
	{
		resMessage="INVALID  company"+result.getFieldError();
		
		return new ResponseEntity<String>(resMessage,HttpStatus.BAD_REQUEST);
	}
	
	resMessage=msinsuranceService.savecompany(company);
	
	httpstatus=HttpStatus.CREATED;
	
	return new ResponseEntity<String>(resMessage,httpstatus);
	
	}

@GetMapping("/getallcompany")
public ResponseEntity<List<InsuranceCompany>> getAllcompany()
{
	
	log.info("******************************"+"GET ALL COMPANY"+"*****************");
	
	List<InsuranceCompany> company=msinsuranceService.getAlldata();
	
	return new ResponseEntity<List<InsuranceCompany>>(company,HttpStatus.OK);
	

}

@GetMapping("/getsingle/{companyName}")
public ResponseEntity<Object> getspecific(@PathVariable String companyName)
{
	
	log.info("********************"+"get specific result"+"***********************");
	
	InsuranceCompany company=msinsuranceService.getcompany(companyName);
	
	if(company!=null)
	{
		return new ResponseEntity<Object>(company,HttpStatus.OK);
	}
	
	return new ResponseEntity<Object>("company:  "+companyName+"DOES NOT PRESENT  ",HttpStatus.NOT_FOUND);
	

	
}
}
