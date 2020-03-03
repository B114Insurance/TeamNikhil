package com.crts.insurance.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crts.insurance.main.model.Address;
import com.crts.insurance.main.service.MSServiceImpl;
@CrossOrigin("*")
@RestController
public class AddressConntroller 
{
	@Autowired
	MSServiceImpl msservice;
	
	@PostMapping("/saveAddress")
	public String saveadd(@RequestBody  Address address)
	{
		
		msservice.saveaddress(address);
		return "address done";
		
	}

	
	@GetMapping("/getAddress/{addressId}")
	public Address getaddress(@PathVariable("addressId") int addressId)
	{
		
		Address address = msservice.getAddress(addressId);
		
	
		
		return address ;
	
	}
	
}
