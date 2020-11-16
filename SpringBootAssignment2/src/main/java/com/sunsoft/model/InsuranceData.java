package com.sunsoft.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="insurance_data")
public class InsuranceData {
	@Id
	@Column
	String customername ;
	@Column
	int policyno ;
	@Column
	String validity ;
	@Column
	String policy;
	
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	public int getPolicyno() {
		return policyno;
	}
	public String getPolicy() {
		return policy;
	}
	public void setPolicy(String policy) {
		this.policy = policy;
	}
	public void setPolicyno(int policyno) {
		this.policyno = policyno;
	}
	public String getValidity() {
		return validity;
	}
	public void setValidity(String validity) {
		this.validity = validity;
	}
}
	
	