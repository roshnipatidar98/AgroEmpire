package com.mlm.agro.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "team_size")
public class TeamSizeEntity {
	
	@Id
	@Column
	private long id;
	@Column
	private String sponsorId;
	@Column
	private String childName;
	@Column
	private String childId;
	@Column
	private String childStatus;
	
	

	public TeamSizeEntity() {
		
	}
	
	public TeamSizeEntity(String sponsorId, String childName, String childId, String childStatus) {
		this.sponsorId = sponsorId;
		this.childName = childName;
		this.childId = childId;
		this.childStatus = childStatus;
	}
	
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getChildStatus() {
		return childStatus;
	}

	public void setChildStatus(String childStatus) {
		this.childStatus = childStatus;
	}
	
	public String getSponsorId() {
		return sponsorId;
	}
	public void setSponsorId(String sponsorId) {
		this.sponsorId = sponsorId;
	}
	public String getChildName() {
		return childName;
	}
	public void setChildName(String childName) {
		this.childName = childName;
	}
	public String getChildId() {
		return childId;
	}
	public void setChildId(String childId) {
		this.childId = childId;
	}
	
	
	@Override
	public String toString() {
		return "TeamSizeEntity [sponsorId=" + sponsorId + ", childName=" + childName + ", childId=" + childId + "]";
	}
	
	
	

}
