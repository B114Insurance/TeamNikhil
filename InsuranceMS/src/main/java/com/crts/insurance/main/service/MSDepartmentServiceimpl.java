package com.crts.insurance.main.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crts.insurance.main.model.Department;
import com.crts.insurance.main.repository.MSDepartmentRepository;

@Service
public class MSDepartmentServiceimpl implements MSDepartmentService
{
	@Autowired
	MSDepartmentRepository  msDepartmentRepository;

	@Override
	public String savedepartment(Department department) {
      msDepartmentRepository.save(department);
     
		return "All department ADDED";
	}

	@Override
	public List<Department> getAlldata() {
		
		List<Department> l=msDepartmentRepository.findAll();
		
		
		return l;
	}

	@Override
	public Department updatedepartment(Department updatedepartment) {
		
		Optional<Department> optionaldept=msDepartmentRepository.findById(updatedepartment.getDeptId());
		if(optionaldept.isPresent())
		{
			msDepartmentRepository.save(updatedepartment);
			return updatedepartment;
		}
		return null;
	}

	@Override
	public String deletedepartment(Integer deptId) {

Optional<Department> optionaldel=msDepartmentRepository.findById(deptId);

if(optionaldel.isPresent())
{
	msDepartmentRepository.deleteById(deptId);
	return "DEPARTMENT "+deptId+"REMOVE RECORD!";
}

return null;
	}

	@Override
	public Department getDepartment(Integer deptId) {
		Optional<Department> optionalsingle=msDepartmentRepository.findById(deptId);
		if(optionalsingle.isPresent())
		{
			return optionalsingle.get();
		}
		return null;
	}
	
	
	

}
