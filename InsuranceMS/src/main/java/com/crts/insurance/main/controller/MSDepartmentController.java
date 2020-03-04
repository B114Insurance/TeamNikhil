package com.crts.insurance.main.controller;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder.In;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crts.insurance.main.model.Department;
import com.crts.insurance.main.service.MSDepartmentService;
@CrossOrigin("*")
@RestController
public class MSDepartmentController
{
	
	private static final Logger log = LoggerFactory.getLogger(MSDepartmentController.class);

	@Autowired
	MSDepartmentService msDepartmentService;
	
	@PostMapping("/adddepartment")
	public ResponseEntity<String> adddepartment(@Valid @RequestBody Department department,BindingResult result)
	{
		log.info("***************************"+"INSIDE DATA"+"******************");
		
		
		String respMessage;
		HttpStatus httpstatus;
		if(result.hasErrors())
		{
			respMessage="invalid department"+result.getFieldError();
			return new ResponseEntity<String>(respMessage,HttpStatus.BAD_REQUEST);
		}
		
		respMessage=msDepartmentService.savedepartment(department);
		
		httpstatus=HttpStatus.CREATED;
		
		return new ResponseEntity<String> (respMessage,httpstatus);
		
	}
	@GetMapping("/getsingledata/{deptId}")
	public ResponseEntity<Object> getspecific(@PathVariable  Integer deptId)
	{
		
		log.info("***********************"+"GET SPECIFIC DATA"+"*****************************");
		
		Department dept=msDepartmentService.getDepartment(deptId);
		if(dept !=null)
		{
			return new ResponseEntity<Object>(dept,HttpStatus.OK);
			
		}
		return new ResponseEntity<Object>("dept:"+"deptId"+"DEPT DOES NOT EXITS",HttpStatus.NOT_FOUND);
		
	}
	@GetMapping("/getalldata")
	public ResponseEntity<List<Department>> getdata()
	{
		
		log.info("*************************"+"GET  ALL DATA"+"************************");
		List<Department> deptlist=msDepartmentService.getAlldata();
		return new ResponseEntity<List<Department>>(deptlist,HttpStatus.OK);
		
	}
	@DeleteMapping("deletedata/{deptId}")
	public ResponseEntity<String> deletedata(@PathVariable("deptId") Integer deptId)
	{
		
		log.info("*********************"+"DELETE DATA"+"***************************");
		String respMessage=msDepartmentService.deletedepartment(deptId);
		
		if(respMessage!=null)
		{
			return new ResponseEntity<String>(respMessage,HttpStatus.OK);
			
			
		}
		return new ResponseEntity<String>("DEPARTMENT"+deptId+"DOES NOT EXITS!!",HttpStatus.NOT_FOUND);
		 
		
	}
	@PutMapping("/updatedepartment")
	public ResponseEntity<Object> updatedept(@RequestBody Department department)
	{
		log.info("*****************************"+"UPDATE DATA"+"**************************");
	Department dept=msDepartmentService.updatedepartment(department);
		
		if(dept!=null)
		{
			return new ResponseEntity<Object>(department,HttpStatus.OK);
					
		}
		return new ResponseEntity<Object>("DEPARTMENT "+department.getDeptId()+"DOES NOT EXITS!",HttpStatus.NOT_FOUND);
		
	
	
		
		
	}
	
	

}
