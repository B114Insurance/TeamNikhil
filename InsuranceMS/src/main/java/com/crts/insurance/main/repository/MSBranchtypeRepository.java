package com.crts.insurance.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crts.insurance.main.model.BranchType;

@Repository
public interface MSBranchtypeRepository  extends JpaRepository<BranchType,Integer>{

}
