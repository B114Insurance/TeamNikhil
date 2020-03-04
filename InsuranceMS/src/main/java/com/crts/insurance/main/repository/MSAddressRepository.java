package com.crts.insurance.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crts.insurance.main.model.Address;

@Repository
public interface MSAddressRepository extends JpaRepository<Address,Integer> {

}
