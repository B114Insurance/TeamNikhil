package com.crts.insurance.main.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.crts.insurance.main.model.Branch;
@Repository
public interface MSBranchRepository extends JpaRepository<Branch, Integer>
{

}
