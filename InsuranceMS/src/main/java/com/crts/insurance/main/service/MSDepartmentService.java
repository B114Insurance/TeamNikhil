package com.crts.insurance.main.service;

import java.util.List;



import com.crts.insurance.main.model.Department;


public interface MSDepartmentService 
{
	public String savedepartment(Department department);
	public List<Department> getAlldata();
 Department getDepartment(Integer deptId);
	Department updatedepartment(Department updatedepartment);
	String deletedepartment(Integer deptId);
	

}
