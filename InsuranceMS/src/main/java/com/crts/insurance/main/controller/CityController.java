package com.crts.insurance.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crts.insurance.main.model.City;
import com.crts.insurance.main.model.Country;
import com.crts.insurance.main.service.MSServiceImpl;

@RestController
@CrossOrigin("*")
public class CityController {
	@Autowired
	MSServiceImpl msservice;

	@PostMapping("/saveCity")
	public String saveadd(@RequestBody City city) {

		msservice.savecity(city);
		return "City done";

	}

	@GetMapping("/getCity/{cityID}")
	public City getcity(@PathVariable("cityID") int cityId) {

		City c = msservice.getcity(cityId);

		return c;

	}

}
