package com.crts.insurance.main.service;

import java.util.List;

import com.crts.insurance.main.model.Branch;


public interface MSBranchService
{
	public String savebranch(Branch branch);
	public List<Branch> getAlldata();
 Branch getbranch(Integer branchId);
	Branch updatebranch(Branch updatebranch);
	String deletebranch(Integer branchId);
	

}
