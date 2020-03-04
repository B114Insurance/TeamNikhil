package com.crts.insurance.main.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crts.insurance.main.model.Branch;
import com.crts.insurance.main.model.BranchType;
import com.crts.insurance.main.repository.MSBranchRepository;

@Service
public class MSBranchServiceimpl implements MSBranchService
{
	@Autowired
	MSBranchRepository msBranchRepository;

	@Override
	public String savebranch(Branch branch) {
		msBranchRepository.save(branch);
	     
		return "All branch ADDED";
	}

	@Override
	public List<Branch> getAlldata() {
List<Branch> l=msBranchRepository.findAll();
		
		
		return l;
	}
	

	@Override
	public Branch getbranch(Integer branchId) {
		Optional<Branch> optionalsingle=msBranchRepository.findById(branchId);
		if(optionalsingle.isPresent())
		{
			return optionalsingle.get();
		}
		return null;
	}

	@Override
	public Branch updatebranch(Branch updatebranch) {
		Optional<Branch> optionaldept=msBranchRepository.findById(updatebranch.getBranchId());
		if(optionaldept.isPresent())
		{
			msBranchRepository.save(updatebranch);
			return updatebranch;
		}
		return null;
	}

	@Override
	public String deletebranch(Integer branchId) {
		Optional<Branch> optionaldel=msBranchRepository.findById(branchId);

		if(optionaldel.isPresent())
		{
			msBranchRepository.deleteById(branchId);
			return "BRANCHTYPE "+branchId+"REMOVE RECORD!";
		}

		return null;
	}
	

}
