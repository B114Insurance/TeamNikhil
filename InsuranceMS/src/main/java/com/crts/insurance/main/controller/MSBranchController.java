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

import com.crts.insurance.main.model.Branch;
import com.crts.insurance.main.model.BranchType;
import com.crts.insurance.main.service.MSBranchService;

@CrossOrigin("*")
@RestController
public class MSBranchController
{
	@Autowired
	MSBranchService  msBranchService;
	
	private static final Logger log = LoggerFactory.getLogger(MSBranchController.class);

	@PostMapping("/addbranch")
	public ResponseEntity<String> addbranchtype(@Valid @RequestBody Branch branch,BindingResult result)
	{
		log.info("***************************"+"INSIDE DATA"+"******************");
		
		
		String respMessage;
		HttpStatus httpstatus;
		if(result.hasErrors())
		{
			respMessage="invalid branchtype"+result.getFieldError();
			return new ResponseEntity<String>(respMessage,HttpStatus.BAD_REQUEST);
		}
		
		respMessage=msBranchService.savebranch(branch);
		httpstatus=HttpStatus.CREATED;
		
		return new ResponseEntity<String> (respMessage,httpstatus);
	}
	@GetMapping("/getbranch/{branchId}")
	public ResponseEntity<Object> getspecific(@PathVariable  Integer branchId)
	{
		
		log.info("***********************"+"GET SPECIFIC DATA"+"*****************************");
		
		Branch branch=msBranchService.getbranch(branchId);
		if(branch !=null)
		{
			return new ResponseEntity<Object>(branch,HttpStatus.OK);
			
		}
		return new ResponseEntity<Object>("branch:"+branchId+"branch DOES NOT EXITS",HttpStatus.NOT_FOUND);
		
	}
	@GetMapping("/getallbranch")
	public ResponseEntity<List<Branch>> getalldata()
	{
		
		log.info("*************************"+"GET  ALL DATA"+"************************");
		List<Branch> branchlist=msBranchService.getAlldata();
		return new ResponseEntity<List<Branch>>(branchlist,HttpStatus.OK);
		
	}
	@DeleteMapping("/deletebranch/{branchId}")
	public ResponseEntity<String> deletedata(@PathVariable("branchId") Integer branchId)
	{
		
		log.info("*********************"+"DELETE DATA"+"***************************");
		String respMessage=msBranchService.deletebranch(branchId);
		
		if(respMessage!=null)
		{
			return new ResponseEntity<String>(respMessage,HttpStatus.OK);
			
			
		}
		return new ResponseEntity<String>("BRANCH"+branchId+"DOES NOT EXITS!!",HttpStatus.NOT_FOUND);
		 
		
	}
	
	@PutMapping("/updatebranch")
	public ResponseEntity<Object> updatebranch(@RequestBody Branch branch)
	{
		log.info("*****************************"+"UPDATE DATA"+"**************************");
	Branch branchup=msBranchService.updatebranch(branch);
		
		if(branchup!=null)
		{
			return new ResponseEntity<Object>(branchup,HttpStatus.OK);
					
		}
		return new ResponseEntity<Object>("BRANCHTYPE "+branch.getBranchId()+"DOES NOT EXITS!",HttpStatus.NOT_FOUND);
		


		
		
	}

}
