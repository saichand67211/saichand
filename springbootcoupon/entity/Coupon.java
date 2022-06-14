package com.zensar.springbootcoupon.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Coupon {
	@Id
	private int couponId;
	private String couponUse;
	private int couponAmount;
	private Coupon() {
		super();
	}
	public Coupon(int couponId, String couponUse, int couponAmount) {
		super();
		this.couponId = couponId;
		this.couponUse = couponUse;
		this.couponAmount = couponAmount;
	}
	public int getCouponId() {
		return couponId;
	}
	public void setCouponId(int couponId) {
		this.couponId = couponId;
	}
	public String getCouponUse() {
		return couponUse;
	}
	public void setCouponUse(String couponUse) {
		this.couponUse = couponUse;
	}
	public int getCouponAmount() {
		return couponAmount;
	}
	public void setCouponAmount(int couponAmount) {
		this.couponAmount = couponAmount;
	}
	@Override
	public String toString() {
		return "Coupon [couponId=" + couponId + ", couponUse=" + couponUse + ", couponAmount=" + couponAmount + "]";
	}

	
}
