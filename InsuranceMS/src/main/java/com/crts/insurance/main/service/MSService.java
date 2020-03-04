package com.crts.insurance.main.service;

import java.util.List;

import com.crts.insurance.main.model.Address;
import com.crts.insurance.main.model.Branch;
import com.crts.insurance.main.model.City;
import com.crts.insurance.main.model.Country;
import com.crts.insurance.main.model.Department;
import com.crts.insurance.main.model.InsuranceCompany;
import com.crts.insurance.main.model.Staff;
import com.crts.insurance.main.model.State;

public interface MSService
{
	public Branch saveallBranch(Branch branch);
	//public Address saveallAddress(Address address);
	 public List<InsuranceCompany> getAlldata();
	 public List<Department> getdeptAlldata();
	 public List<Address> getaddress();
	public Country saveallcountry(Country country);
	public State saveallstate(State state);
	public City saveallcity(City city);
	public Address savealladdress(Address address);
	public Staff saveallStaff(Staff staff);
	public InsuranceCompany saveallCompany(InsuranceCompany company);
	public Department savealldepartment(Department department);
}
