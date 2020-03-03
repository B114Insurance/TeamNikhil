package com.crts.insurance.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crts.insurance.main.model.Staff;
import com.crts.insurance.main.service.MSServiceImpl;

@RestController
@CrossOrigin("*")
public class StaffConntroller 
{

	@Autowired
	MSServiceImpl msservice;

	
	@PostMapping("/storestaff")
	public String savestore(@RequestBody Staff staff)
	{
		msservice.savestaff(staff);
		
		return "staff store successfully";
		
		
		
	}
	
	@GetMapping("/getstaffs")
	public List<Staff> getstaffs()
	{
		List<Staff> s1= msservice.getstaffs();
		
		return s1;
	
	}
	
	
	@GetMapping("/getstaff/{staffId}")
	public Staff gatestore(@PathVariable("staffId") int  staff)
	{
		Staff s1= msservice.getstaff(staff);
		
		return s1;
		
		
		
	}
	
	
	@PutMapping("/updatestaff")
	public String updateStaff(Staff staff)
	{
		msservice.updateStaff(staff);
		
		return "updated successfully";
		
		
		
	}
	@DeleteMapping("/deletestaff/{staffid}")
	public String deleteStaff(@PathVariable("staffid") int staffid)
	{
		msservice.deleteStaff(staffid);
		
		return "deleted successfully";
		
		
		
	}
}
