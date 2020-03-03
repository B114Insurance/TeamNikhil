package com.crts.insurance.main.model;


import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Application {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int applicationId;
@OneToOne(fetch = FetchType.EAGER)
@JoinColumn(name = "vehicalId") 
private Vehical vehicalId;	 
@OneToOne(fetch = FetchType.EAGER)
@JoinColumn(name ="customerId")
private Customer customerId;

private String applicationStatus;

public String getApplicationStatus() {
	return applicationStatus;
}
public void setApplicationStatus(String applicationStatus) {
	this.applicationStatus = applicationStatus;
}
public int getApplicationId() {
	return applicationId;
}
public void setApplicationId(int applicationId) {
	this.applicationId = applicationId;
}
public Customer getCustomerId() {
	return customerId;
}
public void setCustomerId(Customer customerId) {
	this.customerId = customerId;
}
	
	  public Vehical getVehicalId() 
{ return vehicalId; 
} 
public void setVehicalId(Vehical vehicalId)
 { 
this.vehicalId = vehicalId; }
	 }
