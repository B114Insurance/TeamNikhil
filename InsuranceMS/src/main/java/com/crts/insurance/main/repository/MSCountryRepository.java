package com.crts.insurance.main.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.crts.insurance.main.model.Country;

@Repository
public interface MSCountryRepository  extends JpaRepository<Country,Integer>{

	@Query("from Country") 
	public List<Country> findByAll();
	
	
	
}
