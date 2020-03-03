package com.crts.insurance.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crts.insurance.main.model.Country;
import com.crts.insurance.main.service.MSService;
import com.crts.insurance.main.service.MSServiceImpl;
@CrossOrigin("*")
@RestController
public class CountryController 
{
	@Autowired
	MSServiceImpl msservice;

	@PostMapping("/storeCountry")
	public String savecountry(@RequestBody Country c)
	{
		
		msservice.savecountry(c);
		return "country enter succcefully";
		
		
	}
	
	@GetMapping("/getCountry/{countryid}")
	public Country getcountry(@PathVariable("countryid") int countryid)
	{
		
		Country c = msservice.getcountry(countryid);

		return c;
	
	}
	
	@GetMapping("/getCountries")
	public List<Country> getcountry()
	{
		
		List<Country> c = msservice.getcountries();
		
	
		
		return c;
	
	}
	
	
}
