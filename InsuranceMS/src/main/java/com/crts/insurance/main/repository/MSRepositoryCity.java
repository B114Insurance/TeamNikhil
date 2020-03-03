package com.crts.insurance.main.repository;
import org.springframework.data.repository.CrudRepository;

import com.crts.insurance.main.model.City;


public interface MSRepositoryCity extends CrudRepository<City, Integer> {
	
	City findAllByCityId(int cityId);

}
