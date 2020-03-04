package com.crts.insurance.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crts.insurance.main.model.Address;
import com.crts.insurance.main.model.Branch;
import com.crts.insurance.main.model.City;
import com.crts.insurance.main.model.Country;
import com.crts.insurance.main.model.Department;
import com.crts.insurance.main.model.InsuranceCompany;
import com.crts.insurance.main.model.Staff;
import com.crts.insurance.main.model.State;
import com.crts.insurance.main.repository.MSAddressRepository;
import com.crts.insurance.main.repository.MSBranchRepository;
import com.crts.insurance.main.repository.MSCityRepository;
import com.crts.insurance.main.repository.MSCountryRepository;
import com.crts.insurance.main.repository.MSDepartmentRepository;
import com.crts.insurance.main.repository.MSInsuranceRepository;
import com.crts.insurance.main.repository.MSStaffRepository;
import com.crts.insurance.main.repository.MSStateRepository;

@Service
public class MSServiceImpl implements MSService

{
	@Autowired
	MSCityRepository  msCityRepository;
	@Autowired
	MSAddressRepository 	msAddressRepository;
	@Autowired
	MSCountryRepository msCountryRepository;
	
	@Autowired
	MSStateRepository msStateRepository; 
	
	
	@Autowired
	MSStaffRepository msStaffRepository;
	
	@Autowired
	MSBranchRepository  	msRepository ;

	@Autowired
MSDepartmentRepository msDepartmentRepository; 

	
	@Autowired
	
	MSInsuranceRepository  msInsuranceRepository;




	@Override
	public Branch saveallBranch(Branch branch) 
	{
		msRepository.save(branch);
		
		return branch;
	}

	@Override
	public InsuranceCompany saveallCompany(InsuranceCompany company) {
		msInsuranceRepository.save(company);
	 	
		
		return company;
	}

	@Override
	public Department savealldepartment(Department department) {
		 

		msDepartmentRepository.save(department);
		
		
		return department;
	}

	@Override
	public Staff saveallStaff(Staff staff) {
		msStaffRepository.save(staff);
		return staff;
	}

	@Override
	public Country saveallcountry(Country country) {
		msCountryRepository.save(country);
		return country;
	}

	@Override
	public State saveallstate(State state) {
	msStateRepository.save(state);
		return state;
	}

	@Override
	public City saveallcity(City city) {
		msCityRepository.save(city);
		return city;
	}

	@Override
	public Address savealladdress(Address address) {
		msAddressRepository.save(address);
		return address;
	}

	@Override
	public List<InsuranceCompany> getAlldata() {
		List l=msInsuranceRepository.findAll();
		return l;
	}

	@Override
	public List<Department> getdeptAlldata() {
	List list=	msDepartmentRepository.findAll();
		return list;
	}

	@Override
	public List<Address> getaddress() {
		// TODO Auto-generated method stub
		
		List<Address> l=msAddressRepository.findAll();
		return l;
	}



}
