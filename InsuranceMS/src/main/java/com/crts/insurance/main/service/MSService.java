package com.crts.insurance.main.service;

import java.util.List;

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

public interface MSService
{
	List<Product> getProductList();
	List<Department> getdepartments();
	List<Branch> getbranches();
	List<Staff> getstaffs();
	
	Branch getbranch(int branchId);
	
	

	void saveProduct(Product product);
	Product getproduct(int productID);
	void deleteProduct(int productid);
	void updateProduct(Product product);
	void savebranch(Branch branch);
	void deleteBranch(int branchid);
	void updateBranch(Branch branch);
	void saveBranchType(BranchType branchtype);
	BranchType getbranchtype(int branchtypeid);
	List<BranchType> getbranchtypes();
	void deleteBranchType(int branchid);
	void updateBranchType(BranchType branchtype);

	void saveinsurance( InsuranceCompany insurance);
	
	void savecountry(Country c);
	void savestate(State s);
	void savedepartment( Department dept);
	
	void deleteDepartment(int departmentid);
	void updateDepartment(Department department);
	void  savecity(City city);
	void  saveaddress(Address address);
	Country getcountry(int countryId);
	List<Country> getcountries();
	/* List<CountryStatedto> getjoininformation(int id); */
	
	Department getdepartment(int department);
	State getstate(int stateId);
	
	City getcity(int cityId);
	
	Address getAddress(int addressId);
	
	//List<CountryStatedto> querydata(int  stateId);
	
	InsuranceCompany getcompanydetails(String companyId);
	
	void savestaff(Staff staff);
	Staff getstaff(int staffid);
	void deleteStaff(int staffid);
	void updateStaff(Staff staff);
	
	
	void saveRole(Role role);
	void deleteRole(int roleid);
	void updateRole(Role role);
	Role getRole(int roleid);
	List<Role> getRoles();
	
	
	
	void saveStatusinfo(Statusinfo statusinfo);
	void deleteStatusinfoe(int statusinfoid);
	void updateStatusinfo(Statusinfo statusinfoid);
	Statusinfo getStatusinfo(int statusinfoid);
	List<Statusinfo> getAllStatusinfo();
	
	
}
