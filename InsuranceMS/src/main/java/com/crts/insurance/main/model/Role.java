package com.crts.insurance.main.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Role 
{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int roleId;
	private String roleName;
	@OneToOne(fetch = FetchType.EAGER)
	private StatusInfo statusCode;
	public int getRoleId() {
		return roleId;
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public StatusInfo getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(StatusInfo statusCode) {
		this.statusCode = statusCode;
	}
}
