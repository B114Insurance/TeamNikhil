package com.crts.insurance.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crts.insurance.main.model.Product;
import com.crts.insurance.main.service.MSServiceImpl;

@RestController
@CrossOrigin("*")
public class ProductController 
{

	@Autowired
	MSServiceImpl msservice;

	@PostMapping("/storeProduct")
	public String storeProduct(@RequestBody Product product)
	{
		
		msservice.saveProduct(product);
		return "product saved";
		
		
	}
	
	@GetMapping("/getproducts")
	public List<Product> getproducts()
	{
		List<Product> l =msservice.getProductList();
		
		return l;
		
		
	}
	
	
	@GetMapping("/getProduct/{productid}")
	public Product getProduct(@PathVariable("productid") int productId)
	{
		Product p= msservice.getproduct(productId);
		return p;
	}
	
	@DeleteMapping("/deleteProduct/{productid}")
	public void deleteProduct(@PathVariable("productid") int productid)
	{
		
		msservice.deleteProduct( productid);
	}
	
	@PutMapping("/updateProduct")
	public void updateProduct(@RequestBody Product product)
	{
		
		
		msservice.updateProduct(product);
	}
}
