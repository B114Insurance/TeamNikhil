package com.crts.insurance.main.model;


import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;



@Entity
public class City 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cityId;
	private String cityName;
	private String cityCode;
	public int getCityId() {
		return cityId;
	}
	public void setCityId(int cityId) {
		this.cityId = cityId;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getCityCode() {
		return cityCode;
	}
	public State getCitystate() {
		return citystate;
	}
	public void setCitystate(State citystate) {
		this.citystate = citystate;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}
	@ManyToOne(fetch = FetchType.EAGER)
	private State citystate;

	
}
