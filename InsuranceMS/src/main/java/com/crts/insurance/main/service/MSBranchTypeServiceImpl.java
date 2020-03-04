package com.crts.insurance.main.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crts.insurance.main.model.BranchType;

import com.crts.insurance.main.repository.MSBranchtypeRepository;

@Service
public class MSBranchTypeServiceImpl implements MSBranchtypeService
{

	@Autowired
	MSBranchtypeRepository 	msBranchtypeRepository;
	
	
	@Override
	public String savebranchtype(BranchType branchType) {
		msBranchtypeRepository.save(branchType);
	     
		return "All branchType ADDED";
	}

	@Override
	public List<BranchType> getAlldata() {
List<BranchType> l=msBranchtypeRepository.findAll();
		
		
		return l;
	}

	@Override
	public BranchType getbranchtype(Integer branchTypeId) {
		Optional<BranchType> optionalsingle=msBranchtypeRepository.findById(branchTypeId);
		if(optionalsingle.isPresent())
		{
			return optionalsingle.get();
		}
		return null;
	}

	@Override
	public BranchType updatebranchtype(BranchType updatebranchtype) {
		Optional<BranchType> optionaldept=msBranchtypeRepository.findById(updatebranchtype.getBranchTypeId());
		if(optionaldept.isPresent())
		{
			msBranchtypeRepository.save(updatebranchtype);
			return updatebranchtype;
		}
		return null;
	}
	

	@Override
	public String deletebranchtype(Integer branchTypeId) {
		Optional<BranchType> optionaldel=msBranchtypeRepository.findById(branchTypeId);

		if(optionaldel.isPresent())
		{
			msBranchtypeRepository.deleteById(branchTypeId);
			return "BRANCHTYPE "+branchTypeId+"REMOVE RECORD!";
		}

		return null;
	}
	
	

}
