package com.crts.insurance.main.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crts.insurance.main.model.State;



@Repository
public interface MSRepositoryState  extends JpaRepository<State, Integer>
{
	
	State findAllByStateId(int stateId);
	
	
	
	
	
	//@Query(" FROM Student  where username = username AND password = password")
		 // public List<Student> findByuserAndpassword(@Param("username") String username,
		  //@Param("password") String password);
		
	
	
	
	//state_id, state_code, state_name, state_countryid_country_id
	
	
	
	
	
	
	
	
	
	
	

	
	/*
	 * @Query(value =
	 * "SELECT new com.crts.insurance.main.dto.CountryStatedto (c.country_name,s.state_name) FROM  Country c join  State s on c.country_id =s.state_countryid_country_id  WHERE s.state_id = :firstName"
	 * , nativeQuery = true) List<CountryStatedto>
	 * findStateByState(@Param("firstName") int stateId);
	 * 
	 */
	//country_id, country_code, country_name   state_id, state_code, state_name, state_countryid_country_id
	/*
	 * @Query
	 * ("select new com.crts.insurance.main.dto.CountryStatedto (c.country_name,s.state_name) from com.crts.insurance.main.Model.Country c join  com.crts.insurance.main.Model.State  s "
	 * ) public List<CountryStatedto > getjoinInformation();
	 */
	
	
	
	
	
	
	/*
	 * public final static String GET_LOAN_REPORTS =
	 * "SELECT new FROM com.crts.insurance.main.Model.State InnerJoin com.crts.insurance.main.Model.Country on  State.state_countryid_country_id = Country.country_id where  State.state_id=:state_id"
	 * ;
	 * 
	 * @Query(GET_LOAN_REPORTS) State findByPreference(@Param("state_id") int
	 * state_id );
	 */



}


//state_id, state_code, state_name, state_countryid_country_id