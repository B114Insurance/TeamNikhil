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

import com.crts.insurance.main.model.Branch;
import com.crts.insurance.main.service.MSServiceImpl;

@RestController
@CrossOrigin("*")
public class BranchController 
{
  @Autowired
	MSServiceImpl msservice;
	
	@GetMapping("/getbranches")
	public List<Branch> getbranches()
	{
		
		
		List<Branch> branch =msservice.getbranches();
		
	return branch;
		
		
	}
	
	@GetMapping("/getbranch/{branchId}")
	public Branch getbranches(@PathVariable("branchId") int branchId)
	{
		
		
		Branch branch =msservice.getbranch(branchId);
		
	return branch;
		
		
	}
	
	
	
	@PostMapping("/storeBranch")
	public String storeBranch(@RequestBody Branch branch)
	{
		
		
		msservice.savebranch(branch);
		
		return "branch   store successfully";
	}
	
	@PutMapping("/updateBranch")
	public String updateBranch(@RequestBody Branch branch)
	{
		
		
		
		msservice.updateBranch(branch);
		return "Branch updated succcessfully";
	}
	
	@DeleteMapping("/deleteBranch/{branchid}")
	public String deletebranch(@PathVariable("branchid") int branchid)
	{
		
		msservice.deleteBranch(branchid);
		
		
		return "branch deleted successfully";
	}
}
