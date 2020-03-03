package com.crts.insurance.main.repository;
import org.springframework.data.repository.CrudRepository;

import com.crts.insurance.main.model.Address;


public interface MSRepositoryAddress  extends CrudRepository<Address,Integer>{

	
Address findAllByAddressId(int addressId);
}
