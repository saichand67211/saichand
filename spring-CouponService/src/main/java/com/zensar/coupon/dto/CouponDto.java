package com.zensar.coupon.dto;

public class CouponDto {
	private int couponId;
	private String couponCode;
	private String couponPurpose;
	private int couponAmount;
	private String couponExpire;
	private CouponDto() {
		super();
	}
	private CouponDto(int couponId, String couponCode, String couponPurpose, int couponAmount, String couponExpire) {
		super();
		this.couponId = couponId;
		this.couponCode = couponCode;
		this.couponPurpose = couponPurpose;
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
	public String getCouponPurpose() {
		return couponPurpose;
	}
	public void setCouponPurpose(String couponPurpose) {
		this.couponPurpose = couponPurpose;
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
		return "CouponDto [couponId=" + couponId + ", couponCode=" + couponCode + ", couponPurpose=" + couponPurpose
				+ ", couponAmount=" + couponAmount + ", couponExpire=" + couponExpire + "]";
	}
	
	
}
