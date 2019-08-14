package com.covalense.springrest.bean;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("employee_response")
public class EmployeeResponse {

	@JsonProperty("status_code")
	private int statusCode;
	
	private String message;
	
	private String dec;
	
	private List<EmployeeInfoBean> beans;

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDec() {
		return dec;
	}

	public void setDec(String dec) {
		this.dec = dec;
	}

	public List<EmployeeInfoBean> getBeans() {
		return beans;
	}

	public void setBeans(List<EmployeeInfoBean> beans) {
		this.beans = beans;
	}
	
	
}
