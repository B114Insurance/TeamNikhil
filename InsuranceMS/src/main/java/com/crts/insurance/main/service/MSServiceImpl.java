package com.crts.insurance.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crts.insurance.main.model.Address;
import com.crts.insurance.main.model.Branch;
import com.crts.insurance.main.model.BranchType;
import com.crts.insurance.main.model.City;
import com.crts.insurance.main.model.Country;
import com.crts.insurance.main.model.Department;
import com.crts.insurance.main.model.InsuranceCompany;
import com.crts.insurance.main.model.Product;
import com.crts.insurance.main.model.Role;
import com.crts.insurance.main.model.Staff;
import com.crts.insurance.main.model.State;
import com.crts.insurance.main.model.Statusinfo;
import com.crts.insurance.main.repository.MSRepository;
import com.crts.insurance.main.repository.MSRepositoryAddress;
import com.crts.insurance.main.repository.MSRepositoryBranch;
import com.crts.insurance.main.repository.MSRepositoryBranchType;
import com.crts.insurance.main.repository.MSRepositoryCity;
import com.crts.insurance.main.repository.MSRepositoryCountry;
import com.crts.insurance.main.repository.MSRepositoryDepartment;
import com.crts.insurance.main.repository.MSRepositoryInsurance;
import com.crts.insurance.main.repository.MSRepositoryProduct;
import com.crts.insurance.main.repository.MSRepositoryRole;
import com.crts.insurance.main.repository.MSRepositoryStaff;
import com.crts.insurance.main.repository.MSRepositoryState;
import com.crts.insurance.main.repository.MSRepositoryStatusInfo;


@Service
public class MSServiceImpl implements MSService

{
	@Autowired
	MSRepositoryProduct repoproduct;
	@Autowired
	MSRepositoryStatusInfo repostatusinfo;
	@Autowired
	MSRepositoryCity  repocity;
	@Autowired
	MSRepositoryAddress	repoAddress;
	@Autowired
	MSRepositoryCountry repocountry;
	
	@Autowired
	MSRepositoryState repostate; 
	
	
	@Autowired
	MSRepositoryStaff repostaff;
	
	

	@Autowired
   MSRepositoryDepartment repodepartment; 

	
	@Autowired
	
	MSRepositoryInsurance  repoinsurance;

@Autowired
MSRepositoryBranch repobranch  ;
@Autowired
MSRepositoryBranchType repobranchtype;

@Autowired
MSRepositoryRole  reporole;


@Override
public void savecountry(Country c) {
	repocountry.save(c);
	
}

@Override
public void savestate(State s) {
	repostate.save(s);
	
}


@Override
public void savecity(City city) {
	repocity.save(city);
	
}

@Override
public void saveaddress(Address address) {
	repoAddress.save(address);		
}


@Override
public Country getcountry(int  countryId) {
	Country temp =  repocountry.findById(countryId).get();

	
		
		System.out.println(temp.getCountryId() + " "+temp.getCountryName() + " "+ temp.getCountryCode() + " "+temp.getCountryName());
		
	

	return temp;
}

@Override
public List<Country> getcountries() {
	//List<Country>  c = (List<Country>) repocountry.findAll();
	
	List<Country>  c =(List<Country>) repocountry.findByall();
	System.out.println("List is");
	for(Country temp :c)
	{
		
		System.out.println(temp.getCountryId() + " "+temp.getCountryName() + " "+ temp.getCountryCode() + " "+temp.getCountryName());
		
	
	}
	return c;
}

@Override
public State getstate(int stateId) {
	
	State s1 = repostate.findAllByStateId(stateId);
	return s1;	
}

@Override
public City getcity(int cityId) {
	
	
	City c = repocity.findAllByCityId(cityId);
	
	return c;
}

@Override
public Address getAddress(int addressId) {
	Address a = repoAddress.findAllByAddressId(addressId);
	return a;
}

/*
 * @Override public List<CountryStatedto> querydata(int stateId) {
 * 
 * 
 * List<CountryStatedto> l = repostate.findStateByState return l; }
 * 
 * 
 * 
 */

@Override
public void saveinsurance(InsuranceCompany insurance) {
	
	repoinsurance.save(insurance);		
}

@Override
public void savedepartment(Department dept) {
	repodepartment.save(dept);
	
}

@Override
public Department getdepartment(int department) {
	Department d =repodepartment.findAllBydeptId(department);
	return d;
}

@Override
public InsuranceCompany getcompanydetails(String companyId) {
	InsuranceCompany i =  repoinsurance.findById(companyId).get();
	return i;
}

@Override
public void savestaff(Staff staff) {
	Staff s= repostaff.save(staff);		
}

@Override
public Staff getstaff(int staffid) {
	Staff s = repostaff.findById(staffid).get();
	return s;
}

@Override
public void saveBranchType(BranchType branchtype) {
	
	repobranchtype.save(branchtype);
	
}

@Override
public void savebranch(Branch branch) {
 repobranch.save(branch);
	
}

@Override
public void saveProduct(Product product) {
	repoproduct.save(product);
}

@Override
public Product getproduct(int productID) {
	
	
	Product p = repoproduct.findById(productID).get();
	return p;
}

@Override
public List<Product> getProductList() {
	List<Product> l = (List<Product>) repoproduct.findAll();
	
			return l;
}

@Override
public List<Department> getdepartments() {
	List<Department> d = (List<Department>) repodepartment.findAll();
	return d;
}

@Override
public List<Branch> getbranches() {
	
	
	List<Branch> branch = (List<Branch>) repobranch.findAll();
	return branch;
}

@Override
public Branch getbranch(int branchId) {
	Branch branch = repobranch.findById(branchId).get();
	return branch;
}

@Override
public List<Staff> getstaffs() {
	List<Staff> stafflist = (List<Staff>) repostaff.findAll();
	return stafflist;
}

@Override
public void deleteProduct(int productid) {
	repoproduct.deleteById(productid);
	
}

@Override
public void updateProduct(Product product) {
	repoproduct.save(product);
	
}

@Override
public void deleteBranch(int branchid) {
repobranch.deleteById(branchid);
	
}

@Override
public void updateBranch(Branch branch) {
	repobranch.save(branch);
	
}

@Override
public void deleteDepartment(int departmentid) {
	repodepartment.deleteById(departmentid);
	
}

@Override
public void updateDepartment(Department department) {
	repodepartment.save(department);
	
}

@Override
public void deleteStaff(int staffid) {
	repostaff.deleteById(staffid);
	
}

@Override
public void updateStaff(Staff staff) {
repostaff.save(staff);
	
}

@Override
public BranchType getbranchtype(int branchtypeid) {
	BranchType branchType = repobranchtype.findById(branchtypeid).get(); 
	return branchType;
}

@Override
public List<BranchType> getbranchtypes() {
	List<BranchType> branchtypes = (List<BranchType>) repobranchtype.findAll();
	return  branchtypes;
}

@Override
public void deleteBranchType(int branchid) {
repobranchtype.deleteById(branchid);
	
}

@Override
public void updateBranchType(BranchType branchtype) {
	repobranchtype.save(branchtype);
	
}

@Override
public void saveRole(Role role) {
	
	reporole.save(role);
}

@Override
public void deleteRole(int roleid) {
	reporole.deleteById(roleid);
	
}

@Override
public void updateRole(Role role) {
	reporole.save(role);
	
}

@Override
public Role getRole(int roleid) {
	Role role = reporole.findById(roleid).get();
	return role;
}

@Override
public List<Role> getRoles() {
	List<Role> list = (List<Role>) reporole.findAll();
		return list;
}

@Override
public void saveStatusinfo(Statusinfo statusinfo) {
	
	
	repostatusinfo.save(statusinfo);
	
}

@Override
public void deleteStatusinfoe(int statusinfoid) {
repostatusinfo.deleteById(statusinfoid);
	
}

@Override
public void updateStatusinfo(Statusinfo statusinfoid) {
	repostatusinfo.save(statusinfoid);
	
}

@Override
public Statusinfo getStatusinfo(int statusinfoid) {
	Statusinfo statusinfo = repostatusinfo.findById(statusinfoid).get();
	return statusinfo;
}

@Override
public List<Statusinfo> getAllStatusinfo() {
	List<Statusinfo> list = (List<Statusinfo>) repostatusinfo.findAll();
	return list;
}

}


