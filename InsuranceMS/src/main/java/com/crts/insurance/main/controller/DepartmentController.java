package com.crts.insurance.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.crts.insurance.main.model.Department;
import com.crts.insurance.main.service.MSServiceImpl;

public class DepartmentController {
	
	
	@Autowired
	MSServiceImpl msservice;
	
	@GetMapping("/getdepartments")
	public List<Department> getdepartment()
	{
		List<Department> d = msservice.getdepartments();
		
		return d;
		
		
	}

		
     @GetMapping("/getdepartment/{department}")
	 public Department getdepartment(@PathVariable("department") int department)
		{
			Department d = msservice.getdepartment(department);
			
			return d;
			
			
		}
		
		
		@PostMapping("/storeDepartment"  )
		public String storedepartment(@RequestBody Department dept)
		{
			
			msservice.savedepartment(dept);
			return "department done";
			
			
		}
		
		
		
		@DeleteMapping("/deleteDepartment/{departmentId}")
		public String deleteDepartment(@PathVariable("departmentId") int departmentid)
		{
			
			msservice.deleteDepartment(departmentid);
			return "deleted successfully ";
			
		}
		
		
		@PutMapping("/updateDeparment")
		public String updateDepartment(Department department)
		{
			
			msservice.updateDepartment(department);
			return "department updated Successfully";
			
			
		}
		
		

}
