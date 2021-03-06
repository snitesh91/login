package com.login;

import java.io.Serializable;
import java.util.Date;

public class User {
	private int id;
	private String firstName;
	private String lastName;
	private String password;
	private String emailId;
	private String contactNumber;
	private String address; // Address address;
	private int failedLoginCount;
	private boolean isActive;
	private Date dateCreated;
	private Date dateModified;
	private Date lastLoginTime;
	private boolean isAdmin;
	private Date lastPasswordUpdatedTime;
	private int loginMechanism;

	
	public Date getLastLoginTime() {
		return lastLoginTime;
	}

	public void setLastLoginTime(Date lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}

	public Date getLastPasswordUpdatedTime() {
		return lastPasswordUpdatedTime;
	}

	public void setLastPasswordUpdatedTime(Date lastPasswordUpdatedTime) {
		this.lastPasswordUpdatedTime = lastPasswordUpdatedTime;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getFailedLoginCount() {
		return failedLoginCount;
	}

	public void setFailedLoginCount(int failedLoginCount) {
		this.failedLoginCount = failedLoginCount;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public Date getDateModified() {
		return dateModified;
	}

	public void setDateModified(Date dateModified) {
		this.dateModified = dateModified;
	}

	public boolean isAdmin() {
		return isAdmin;
	}

	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}
	public int getLoginMechanism() {
		return loginMechanism;
	}

	public void setLoginMechanism(int loginMechanism) {
		this.loginMechanism = loginMechanism;
	}

}
