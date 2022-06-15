package com.zensar.coupon.Service;

import java.util.List;

import com.zensar.coupon.dto.CouponDto;


public interface CouponService {
	public CouponDto getCoupon(int CouponId);

	public List<CouponDto> getCoupons();

	public CouponDto insertCoupon(CouponDto couponDto);

	public void updateCoupon(int CouponId, CouponDto couponDto);

	public void deleteCoupon(int CouponId);
}
