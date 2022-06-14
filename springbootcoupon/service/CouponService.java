package com.zensar.springbootcoupon.service;

import java.util.List;

import com.zensar.springbootcoupon.entity.Coupon;

public interface CouponService {

	public Coupon getCoupon(int couponId);

	List<Coupon> getAllCoupons();

	public void insertCoupon(Coupon coupon);

	public void updateCoupon(int couponId, Coupon coupon);

	public void deleteCoupon(int couponId);
}