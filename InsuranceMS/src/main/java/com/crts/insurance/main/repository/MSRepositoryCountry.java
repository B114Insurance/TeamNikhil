package com.crts.insurance.main.repository;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.crts.insurance.main.model.Country;


public interface MSRepositoryCountry extends CrudRepository<Country, Integer> {
	
	@Query(" FROM Country " )
		  public List<Country> findByall();
	
		

}


//@Query(" FROM Student  where username = username AND password = password")
	 // public List<Student> findByuserAndpassword(@Param("username") String username,
	  //@Param("password") String password);
	