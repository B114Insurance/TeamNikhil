package com.crts.insurance.main.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crts.insurance.main.model.State;
import com.crts.insurance.main.service.MSServiceImpl;
@CrossOrigin("*")
@RestController
public class StateController
{
	MSServiceImpl msservice;
	
	@PostMapping("/storeState"  )
	public String savestate(@RequestBody  State s)
	{
		System.out.println("/n/n/n/n/n/n");
		//System.out.println(s.getCountry().getCountryName());
		//System.out.println(s.getStateName);
		//System.out.println(s.getSt().getCountryId() + " "+s.getSt().getCountryName()  + " "+ s.getSt().getCountryCode());
		System.out.println("\n\n\n\n\n\n");	
		
		msservice.savestate(s);
		return "state  succcefully";
		
		
	}
	
	@GetMapping("/getState/{stateid}")
	public State getstate(@PathVariable("stateid") int stateid)
	{
		
		State s= msservice.getstate(stateid);
		
		
		return s;
	
	}
}
