package com.zensar.springbootcoupon.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zensar.springbootcoupon.entity.Coupon;

public interface CouponRepository extends JpaRepository<Coupon, Integer> {

}
