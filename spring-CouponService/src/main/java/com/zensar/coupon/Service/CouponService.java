package com.zensar.coupon.Service;

import java.util.List;

import com.zensar.coupon.dto.CouponDto;
import com.zensar.coupon.entity.Coupon;


public interface CouponService {
	public CouponDto getCoupon(int couponId);
	List<Coupon>findByCouponCode(String couponCode);
	List<Coupon>findByCouponCodeAndCouponPurpose(String couponCode,String couponPurpose);
	//List<Coupon>testCouponCode(String couponCode);
	
	List<Coupon>getByCouponCode(String couponCode);
	public List<CouponDto> getCoupons(int pageNumber,int pageSize);

	public CouponDto insertCoupon(CouponDto couponDto);

	public void updateCoupon(int CouponId, CouponDto couponDto);

	public void deleteCoupon(int CouponId);
}
