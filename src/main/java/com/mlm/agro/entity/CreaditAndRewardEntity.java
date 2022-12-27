package com.mlm.agro.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "credit_rewards")
public class CreaditAndRewardEntity {
	
	@Id
	@Column
	private String sponsorId;
	@Column
	private int creditLimit;
	@Column
	private int rewards;
	@Column
	private String discount;
	
	
	public String getDiscount() {
		return discount;
	}
	public void setDiscount(String discount) {
		this.discount = discount;
	}
	public String getSponsorId() {
		return sponsorId;
	}
	public void setSponsorId(String sponsorId) {
		this.sponsorId = sponsorId;
	}
	public int getCreditLimit() {
		return creditLimit;
	}
	public void setCreditLimit(int creditLimit) {
		this.creditLimit = creditLimit;
	}
	public int getRewards() {
		return rewards;
	}
	public void setRewards(int rewards) {
		this.rewards = rewards;
	}
	
	
	@Override
	public String toString() {
		return "CreaditAndRewardEntity [sponsorId=" + sponsorId + ", creditLimit=" + creditLimit + ", rewards="
				+ rewards + "]";
	}
	
	

}
