package com.mlm.agro.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity(name = "user")
@Table(name = "user")
public class UserEntity {
	
	@Id
	@Column
	private String userId;
	@Column
	private String name;
	@Column
	private String mobileNo;
	@Column
	private String email;
	@Column
	private String password;
	@Column
	private String referalLink;
	@Column
	private String parentId;
	@Column
	private String status;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getReferalLink() {
		return referalLink;
	}

	public void setReferalLink(String referalLink) {
		this.referalLink = referalLink;
	}

	public String getParentId() {
		return parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	

}