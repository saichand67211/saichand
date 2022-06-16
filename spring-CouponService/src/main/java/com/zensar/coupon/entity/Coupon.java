package com.zensar.coupon.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries(value = {@NamedQuery(name="Coupon.test", query = "from Coupon c where c.couponCode=?1"),
@NamedQuery(name="Coupon.test1", query = "from Coupon c where c.couponCode=?1 and s.conponPurpose=?2")})

public class Coupon {
	@Id
	private int couponId;
	private String couponCode;
	private String couponpurpose;
	private int couponAmount;
	private String couponExpire;
	private Coupon() {
		super();
	}
	private Coupon(int couponId, String couponCode, String couponpurpose, int couponAmount, String couponExpire) {
		super();
		this.couponId = couponId;
		this.couponCode = couponCode;
		this.couponpurpose = couponpurpose;
		this.couponAmount = couponAmount;
		this.couponExpire = couponExpire;
	}
	public int getCouponId() {
		return couponId;
	}
	public void setCouponId(int couponId) {
		this.couponId = couponId;
	}
	public String getCouponCode() {
		return couponCode;
	}
	public void setCouponCode(String couponCode) {
		this.couponCode = couponCode;
	}
	public String getCouponpurpose() {
		return couponpurpose;
	}
	public void setCouponpurpose(String couponpurpose) {
		this.couponpurpose = couponpurpose;
	}
	public int getCouponAmount() {
		return couponAmount;
	}
	public void setCouponAmount(int couponAmount) {
		this.couponAmount = couponAmount;
	}
	public String getCouponExpire() {
		return couponExpire;
	}
	public void setCouponExpire(String couponExpire) {
		this.couponExpire = couponExpire;
	}
	@Override
	public String toString() {
		return "Coupon [couponId=" + couponId + ", couponCode=" + couponCode + ", couponpurpose=" + couponpurpose
				+ ", couponAmount=" + couponAmount + ", couponExpire=" + couponExpire + "]";
	}

	
}
