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

import com.crts.insurance.main.model.Statusinfo;
import com.crts.insurance.main.service.MSServiceImpl;

@RestController
@CrossOrigin("*")
public class StatusInfoController 
{
	@Autowired
	MSServiceImpl msservice;

	
	@PostMapping("/saveStatusInfo")
	public String storeStatusInfo(@RequestBody Statusinfo statusinfo)
	{
		msservice.saveStatusinfo(statusinfo);
		return " statusinfo store  succesfully";
		
		
	}
	@GetMapping("/getStatusInfo/{statusinfoid}")
	public Statusinfo getStatusInfo(@PathVariable("statusinfoid") int statusinfoid)
	{
		
	Statusinfo statusinfo =	msservice.getStatusinfo(statusinfoid);
		return statusinfo;
		
		
	}
	@GetMapping("/getAllStatusInfo")
	public List<Statusinfo> getAllStatusInfo()
	{
		
		List<Statusinfo> list= msservice.getAllStatusinfo(); 
		return list ;
		
		
	}
	
	@PutMapping("/updateStatusInfo")
	public String updateStatusInfo(@RequestBody Statusinfo statusinfo)
	{
		msservice.updateStatusinfo(statusinfo);;
		return "statusinfo upadated  succesfully";
		
		
	}
	
	@DeleteMapping("/deleteStatusInfo/{statusinfoid}")
	public String deleteStatusInfo(@PathVariable("statusinfoid") int statusinfoid)
	
	{
		msservice.deleteStatusinfoe(statusinfoid);
		return "statusinfo delete  succesfully";
		
		
	}
}
