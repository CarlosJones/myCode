package com.learning.Entities;


import java.sql.Timestamp;
import java.util.List;

import com.mysql.jdbc.util.TimezoneDump;

public class Sales {
	private int salesID;
	private String salesName;
	private String phone;
	private String fax;
	private String email;
	private int isValid;
	private Timestamp createTime;
	private TimezoneDump updateTime;
	private User userInfo;
	private List<Customer> customers;
	public List<Customer> getCustomers() {
		return customers;
	}
	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}
	public int getSalesID() {
		return salesID;
	}
	public void setSalesID(int salesID) {
		this.salesID = salesID;
	}
	public String getSalesName() {
		return salesName;
	}
	public void setSalesName(String salesName) {
		this.salesName = salesName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getIsValid() {
		return isValid;
	}
	public void setIsValid(int isValid) {
		this.isValid = isValid;
	}
	public Timestamp getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}
	public TimezoneDump getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(TimezoneDump updateTime) {
		this.updateTime = updateTime;
	}
	public User getUserInfo() {
		return userInfo;
	}
	public void setUserInfo(User userInfo) {
		this.userInfo = userInfo;
	}
}