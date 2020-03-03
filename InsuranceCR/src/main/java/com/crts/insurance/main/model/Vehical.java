package com.crts.insurance.main.model;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Vehical {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int vehicalId;
	/*
	 * @OneToOne(cascade = CascadeType.ALL) private Policy policyNo;
	 */
	private  String vehicalResgistration;
	private String vehicalValue;
	private String vehicalSize;
	private String vehicalType;
	private String vehicalManufacture;
	private String vehicalEngineNo;
	private String numberOfSeats;
	private String vehicalChassisNo;
	private String vehicalNo;
	@OneToOne(fetch = FetchType.EAGER)
	private Customer customerId;
	
	public Customer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Customer customerId) {
		this.customerId = customerId;
	}
	
	public int getVehicalId() {
		return vehicalId;
	}
	public void setVehicalId(int vehicalId) {
		this.vehicalId = vehicalId;
	}
		public String getVehicalResgistration() {
		return vehicalResgistration;
	}
	public void setVehicalResgistration(String vehicalResgistration) {
		this.vehicalResgistration = vehicalResgistration;
	}
	public String getVehicalValue() {
		return vehicalValue;
	}
	public void setVehicalValue(String vehicalValue) {
		this.vehicalValue = vehicalValue;
	}
	public String getVehicalSize() {
		return vehicalSize;
	}
	public void setVehicalSize(String vehicalSize) {
		this.vehicalSize = vehicalSize;
	}
	public String getVehicalType() {
		return vehicalType;
	}
	public void setVehicalType(String vehicalType) {
		this.vehicalType = vehicalType;
	}
	public String getVehicalManufacture() {
		return vehicalManufacture;
	}
	public void setVehicalManufacture(String vehicalManufacture) {
		this.vehicalManufacture = vehicalManufacture;
	}
	public String getVehicalEngineNo() {
		return vehicalEngineNo;
	}
	public void setVehicalEngineNo(String vehicalEngineNo) {
		this.vehicalEngineNo = vehicalEngineNo;
	}
	public String getNumberOfSeats() {
		return numberOfSeats;
	}
	public void setNumberOfSeats(String numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}
	public String getVehicalChassisNo() {
		return vehicalChassisNo;
	}
	public void setVehicalChassisNo(String vehicalChassisNo) {
		this.vehicalChassisNo = vehicalChassisNo;
	}
	public String getVehicalNo() {
		return vehicalNo;
	}
	public void setVehicalNo(String vehicalNo) {
		this.vehicalNo = vehicalNo;
	}
	
	
	
	
	
	
	
	

}
