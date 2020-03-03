package com.crts.insurance.main.repository;
import org.springframework.data.repository.CrudRepository;

import com.crts.insurance.main.model.Department;


public interface MSRepositoryDepartment extends CrudRepository<Department, Integer> {
	
	Department findAllBydeptId(int deptId);

}
