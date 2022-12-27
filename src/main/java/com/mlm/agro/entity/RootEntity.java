package com.mlm.agro.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "roots")
public class RootEntity {
	
	@Id
//	@Column (name = "sponsorId")
	private String sponsorId;
	//@Column(name = "parentId1")
	private String parentId1;
	//@Column(name = "parentId2")
	private String parentId2;
	//@Column(name = "parentId3")
	private String parentId3;
	//@Column(name = "parentId4")
	private String parentId4;
	//@Column(name = "parentId5")
	private String parentId5;
	//@Column(name = "parentId6")
	private String parentId6;
	//@Column(name = "parentId7")
	private String parentId7;
	//@Column(name = "parentId8")
	private String parentId8;
	//@Column(name = "parentId9")
	private String parentId9;
	//@Column(name = "parentId10")
	private String parentId10;
	
	
	public String getSponsorId() {
		return sponsorId;
	}
	public void setSponsorId(String sponsorId) {
		this.sponsorId = sponsorId;
	}
	public String getParentId1() {
		return parentId1;
	}
	public void setParentId1(String parentId1) {
		this.parentId1 = parentId1;
	}
	public String getParentId2() {
		return parentId2;
	}
	public void setParentId2(String parentId2) {
		this.parentId2 = parentId2;
	}
	public String getParentId3() {
		return parentId3;
	}
	public void setParentId3(String parentId3) {
		this.parentId3 = parentId3;
	}
	public String getParentId4() {
		return parentId4;
	}
	public void setParentId4(String parentId4) {
		this.parentId4 = parentId4;
	}
	public String getParentId5() {
		return parentId5;
	}
	public void setParentId5(String parentId5) {
		this.parentId5 = parentId5;
	}
	public String getParentId6() {
		return parentId6;
	}
	public void setParentId6(String parentId6) {
		this.parentId6 = parentId6;
	}
	public String getParentId7() {
		return parentId7;
	}
	public void setParentId7(String parentId7) {
		this.parentId7 = parentId7;
	}
	public String getParentId8() {
		return parentId8;
	}
	public void setParentId8(String parentId8) {
		this.parentId8 = parentId8;
	}
	public String getParentId9() {
		return parentId9;
	}
	public void setParentId9(String parentId9) {
		this.parentId9 = parentId9;
	}
	public String getParentId10() {
		return parentId10;
	}
	public void setParentId10(String parentId10) {
		this.parentId10 = parentId10;
	}
	
	
	@Override
	public String toString() {
		return "RootEntity [sponsorId=" + sponsorId + ", parentId1=" + parentId1 + ", parentId2=" + parentId2
				+ ", parentId3=" + parentId3 + ", parentId4=" + parentId4 + ", parentId5=" + parentId5 + ", parentId6="
				+ parentId6 + ", parentId7=" + parentId7 + ", parentId8=" + parentId8 + ", parentId9=" + parentId9
				+ ", parentId10=" + parentId10 + "]";
	}

	
	
}
