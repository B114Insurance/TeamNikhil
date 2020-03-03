package com.crts.insurance.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crts.insurance.main.model.Role;
import com.crts.insurance.main.service.MSServiceImpl;

@RestController
@CrossOrigin
public class RoleController 
{
	@Autowired
	MSServiceImpl msservice;

	
	@PostMapping("/saveRole")
	public String saveRole(@RequestBody Role role)
	{
		msservice.saveRole(role);
		return " statusinfo store  succesfully";
		
		
	}
	
	@GetMapping("/getRole/{roleid}")
	public Role sgetRole(@PathVariable("roleid") int roleid)
	{
		Role role = msservice.getRole(roleid);
		
		return role;
		
		
	}
	@PutMapping("/updateRole")
	public String updateRole(@RequestBody Role role)
	{
		
		msservice.updateRole(role);
		return " statusinfo store  succesfully";
		
		
	}
	@DeleteMapping("/deleteRole/{roleid}")
	public String deleteRole(@PathVariable("roleid") int roleid)
	{
		
		msservice.deleteStatusinfoe(roleid);
		return " statusinfo store  succesfully";
		
		
	}
}
