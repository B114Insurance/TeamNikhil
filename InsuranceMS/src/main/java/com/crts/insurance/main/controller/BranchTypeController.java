package com.crts.insurance.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crts.insurance.main.model.BranchType;
import com.crts.insurance.main.service.MSServiceImpl;

@RestController
@CrossOrigin("*")
public class BranchTypeController
{
     @Autowired
	MSServiceImpl msservice;
	
     @PostMapping("/storeBranchType")
 	public String storeBranchType(@RequestBody BranchType branchtype)
 	{
 		
 		
    	 msservice.saveBranchType(branchtype);
 		
 		return "branch type  store successfully";
 	}
 	
 	
 	@GetMapping("/getBranchtype/{branchtypeid}")
 	public BranchType getBranch(@PathVariable("branchtypeid")  int branchtypeid)
 	{
 		
 		BranchType branchtype=  msservice.getbranchtype(branchtypeid);
 		
 		
 		return branchtype;
 		
 		
 		
 		
 	}
 	@GetMapping("/getBranchtypes")
 	public List<BranchType> getBranchtypes()
 	{
 		List<BranchType> list=  msservice.getbranchtypes();
 		
 		return list;
 	}
 	
 	@DeleteMapping("/deleteBranchType/{branchid}")
 	public String deletebBranchType(@PathVariable("branchid") int branchid)
 	{
 		
 		 msservice.deleteBranchType(branchid);
 		return "branch Type deleted successfully";
 		
 		
 		
 	}
 	
 	@PutMapping("/updateBranchType")
 	public String updateBranchType(@RequestBody BranchType branchtype)
 	{
 		
 		 msservice.updateBranchType(branchtype);
 		return "branchtype updated successfully";

 		
 	}
 	
	
}
