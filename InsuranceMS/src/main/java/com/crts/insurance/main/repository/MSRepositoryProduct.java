package com.crts.insurance.main.repository;
import org.springframework.data.repository.CrudRepository;

import com.crts.insurance.main.model.Product;


public interface MSRepositoryProduct extends CrudRepository<Product, Integer> {

}
