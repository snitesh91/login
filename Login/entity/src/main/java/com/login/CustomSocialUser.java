package com.login;

import java.util.Collection;
import java.util.Date;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.social.security.SocialUser;

public class CustomSocialUser extends SocialUser {
	private static final long serialVersionUID = 1L;

	private String firstName;
	private String lastName;
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

	public Date getLastLoginTime() {
		return lastLoginTime;
	}

	public void setLastLoginTime(Date lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}

	public boolean isAdmin() {
		return isAdmin;
	}

	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}

	public Date getLastPasswordUpdatedTime() {
		return lastPasswordUpdatedTime;
	}

	public void setLastPasswordUpdatedTime(Date lastPasswordUpdatedTime) {
		this.lastPasswordUpdatedTime = lastPasswordUpdatedTime;
	}

	public int getLoginMechanism() {
		return loginMechanism;
	}

	public void setLoginMechanism(int loginMechanism) {
		this.loginMechanism = loginMechanism;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	public CustomSocialUser(String username, String password,Collection<? extends GrantedAuthority> authorities) {
		super(username, password, authorities);
	}

}
