package com.zensar.coupon.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zensar.coupon.entity.Coupon;
public interface CouponRepository extends JpaRepository<Coupon, Integer> {
	List<Coupon>getByCouponCode(String couponCode);
	List<Coupon>findByCouponCode(String couponCode);
	List<Coupon>findByCouponCodeAndCouponPurpose(String couponCode,String couponPurpose);

}
