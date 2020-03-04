package com.crts.insurance.main.controller;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crts.insurance.main.model.BranchType;

import com.crts.insurance.main.service.MSBranchtypeService;
@CrossOrigin("*")
@RestController
public class MSBranchTypeController
{
	@Autowired
	MSBranchtypeService msBranchtypeService;
	
	
	private static final Logger log = LoggerFactory.getLogger(MSBranchTypeController.class);


@PostMapping("/addbranchtype")
public ResponseEntity<String> addbranchtype(@Valid @RequestBody BranchType branchType,BindingResult result)
{
	log.info("***************************"+"INSIDE DATA"+"******************");
	
	
	String respMessage;
	HttpStatus httpstatus;
	if(result.hasErrors())
	{
		respMessage="invalid branchtype"+result.getFieldError();
		return new ResponseEntity<String>(respMessage,HttpStatus.BAD_REQUEST);
	}
	
	respMessage=msBranchtypeService.savebranchtype(branchType);
	
	httpstatus=HttpStatus.CREATED;
	
	return new ResponseEntity<String> (respMessage,httpstatus);
}
@GetMapping("/getbranchtype/{branchTypeId}")
public ResponseEntity<Object> getspecific(@PathVariable  Integer branchTypeId)
{
	
	log.info("***********************"+"GET SPECIFIC DATA"+"*****************************");
	
	BranchType branchty=msBranchtypeService.getbranchtype(branchTypeId);
	if(branchty !=null)
	{
		return new ResponseEntity<Object>(branchty,HttpStatus.OK);
		
	}
	return new ResponseEntity<Object>("branchtype:"+"branchTypeId"+"branchtype DOES NOT EXITS",HttpStatus.NOT_FOUND);
	
}
@GetMapping("/getallbranchtype")
public ResponseEntity<List<BranchType>> getalldata()
{
	
	log.info("*************************"+"GET  ALL DATA"+"************************");
	List<BranchType> branchlist=msBranchtypeService.getAlldata();
	return new ResponseEntity<List<BranchType>>(branchlist,HttpStatus.OK);
	
}
@DeleteMapping("/deletebrtypedata/{branchTypeId}")
public ResponseEntity<String> deletedata(@PathVariable("branchTypeId") Integer branchTypeId)
{
	
	log.info("*********************"+"DELETE DATA"+"***************************");
	String respMessage=msBranchtypeService.deletebranchtype(branchTypeId);
	
	if(respMessage!=null)
	{
		return new ResponseEntity<String>(respMessage,HttpStatus.OK);
		
		
	}
	return new ResponseEntity<String>("BRANCHTYPE"+branchTypeId+"DOES NOT EXITS!!",HttpStatus.NOT_FOUND);
	 
	
}
@PutMapping("/updatebranchtype")
public ResponseEntity<Object> updatebranch(@RequestBody BranchType branchType)
{
	log.info("*****************************"+"UPDATE DATA"+"**************************");
BranchType branchty=msBranchtypeService.updatebranchtype(branchType);
	
	if(branchty!=null)
	{
		return new ResponseEntity<Object>(branchty,HttpStatus.OK);
				
	}
	return new ResponseEntity<Object>("BRANCHTYPE "+branchType.getBranchTypeId()+"DOES NOT EXITS!",HttpStatus.NOT_FOUND);
	


	
	
}


}