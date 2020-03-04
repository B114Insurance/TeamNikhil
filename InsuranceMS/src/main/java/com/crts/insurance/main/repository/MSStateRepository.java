package com.crts.insurance.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crts.insurance.main.model.State;

@Repository
public interface MSStateRepository  extends JpaRepository<State,Integer>
{
   State findAllByStateId(int stateId);
}
