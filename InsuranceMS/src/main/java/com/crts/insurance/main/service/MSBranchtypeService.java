package com.crts.insurance.main.service;

import java.util.List;



import com.crts.insurance.main.model.BranchType;
import com.crts.insurance.main.model.Department;

public interface MSBranchtypeService
{
	public String savebranchtype(BranchType branchType);
	public List<BranchType> getAlldata();
 BranchType getbranchtype(Integer branchTypeId);
	BranchType updatebranchtype(BranchType updatebranchtype);
	String deletebranchtype(Integer branchTypeId);
	
	

	 
	 

}
