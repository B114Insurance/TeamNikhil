package com.crts.insurance.main.controller;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder.In;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crts.insurance.main.model.Address;
import com.crts.insurance.main.model.Branch;
import com.crts.insurance.main.model.City;
import com.crts.insurance.main.model.Country;
import com.crts.insurance.main.model.Department;
import com.crts.insurance.main.model.InsuranceCompany;
import com.crts.insurance.main.model.Staff;
import com.crts.insurance.main.model.State;
import com.crts.insurance.main.service.MSService;
@CrossOrigin("*")
@RestController
public class MSController
{
	@Autowired 
	MSService 	msService;
	
	@PostMapping("/savecountry")
	public Country saveadd(@RequestBody Country country)
	{
	msService.saveallcountry(country);
	
		return country;
		
	}
	
	@PostMapping("/savestate")
	public String saveadd(@RequestBody State state)
	{
	msService.saveallstate(state);
	
		return "success";
		
	}
	
	@PostMapping("/savecity")
	public String saveadd(@RequestBody City city)
	{
	msService.saveallcity(city);
	
		return "success";
		
	}
	@PostMapping("/saveaddress")
	public String saveadd(@RequestBody Address address)
	{
	msService.savealladdress(address);
	
		return "success";
		
	}
	@GetMapping("/getdeptdata")
	public List<Department> getdeptalldata()
	{
		List<Department> l = msService.getdeptAlldata();
		return l;
	}
	
	@GetMapping("/getaddress")
	public List<Address> getadd()
	{
		List<Address> l = msService.getaddress();
		return l;
	}
	

	@GetMapping("/getinsurance")
	public List<InsuranceCompany> getalldata()
	{
		List<InsuranceCompany> l = msService.getAlldata();
		return l;
	}
	
	@PostMapping("/savebranch")
	public Branch savebranch(@RequestBody Branch branch)
	{
		msService.saveallBranch(branch);
		return branch;
	}

	@PostMapping("/saveinsurance")
	public InsuranceCompany saveinsurancecompany(@RequestBody InsuranceCompany company)
	{
		msService.saveallCompany(company);
		return company;
	}
	@PostMapping("/savedepartment")
	public Department  savedepartment(@RequestBody Department department)
	{
		msService.savealldepartment(department);
		return department;
	}
	
	@PostMapping("/savestaff")
	public Staff  saveStaff(@RequestBody Staff staff)
	{
		msService.saveallStaff(staff);
		return staff;
	}
	
	
}
