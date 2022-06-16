package com.zensar.coupon.Service;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.zensar.coupon.dto.CouponDto;
import com.zensar.coupon.entity.Coupon;
import com.zensar.coupon.repository.CouponRepository;

@Service
public class CouponServiceImpl implements CouponService {
	@Autowired
	private CouponRepository couponRepository;

	@Autowired
	private ModelMapper modelMapper;

	public CouponServiceImpl() {
	}

	@Override
	public CouponDto getCoupon(int couponId) {
		Coupon getCoupon = couponRepository.findById(couponId).get();
		return modelMapper.map(getCoupon, CouponDto.class);
		// return mapToDto(getCoupon);
	}

	@Override
	public List<CouponDto> getCoupons(int pageNumber, int pageSize) {
		// List<Coupon> listOfCoupons = couponRepository.findAll();
		List<CouponDto> listOfCouponDto = new ArrayList<CouponDto>();
		Page<Coupon> findAll = couponRepository.findAll(PageRequest.of(pageNumber, pageSize));
		List<Coupon> content = findAll.getContent();
		for (Coupon coupon : content) {
			// listOfCouponDto.add(mapToDto(coupon));
			listOfCouponDto.add(modelMapper.map(coupon, CouponDto.class));
		}
		return listOfCouponDto;
	}

	@Override
	public CouponDto insertCoupon(CouponDto couponDto) {
		/*
		 * Coupon coupon = new Coupon(); coupon.setCouponId(couponDto.getCouponId());
		 * coupon.setCouponCode(couponDto.getCouponCode());
		 * coupon.setExpDate(couponDto.getExpDate());
		 * coupon.setCouponPrice(couponDto.getCouponPrice());
		 * coupon.setCouponDesc(couponDto.getCouponDesc());
		 */
		// Coupon coupon = mapToEntity(couponDto);
		Coupon coupon = modelMapper.map(couponDto, Coupon.class);
		Coupon insertedCoupon = couponRepository.save(coupon);
		// return mapToDto(insertedCoupon);
		return modelMapper.map(insertedCoupon, CouponDto.class);

	}

	@Override
	public void updateCoupon(int couponId, CouponDto couponDto) {
		/*
		 * Coupon coupon = new Coupon(); coupon.setCouponId(couponDto.getCouponId());
		 * coupon.setCouponCode(couponDto.getCouponCode());
		 * coupon.setExpDate(couponDto.getExpDate());
		 * coupon.setCouponPrice(couponDto.getCouponPrice());
		 * coupon.setCouponDesc(couponDto.getCouponDesc());
		 */
		// Coupon coupon = mapToEntity(couponDto);
		Coupon coupon = modelMapper.map(couponDto, Coupon.class);
		couponRepository.save(coupon);

	}

	@Override
	public void deleteCoupon(int couponId) {
		couponRepository.deleteById(couponId);

	}

	@Override
	public List<Coupon> getByCouponCode(String couponCode) {
		// TODO Auto-generated method stub
		return couponRepository.getByCouponCode(couponCode);
	}

	@Override
	public List<Coupon> findByCouponCode(String couponCode) {
		// TODO Auto-generated method stub
		return couponRepository.findByCouponCode(couponCode);
	}

	@Override
	public List<Coupon> findByCouponCodeAndCouponPurpose(String couponCode, String couponPurpose) {
		// TODO Auto-generated method stub
		return couponRepository.findByCouponCodeAndCouponPurpose(couponCode, couponPurpose);
	}

	/*
	 * public Coupon mapToEntity(CouponDto couponDto) { Coupon coupon = new
	 * Coupon(); coupon.setCouponId(couponDto.getCouponId());
	 * coupon.setCouponCode(couponDto.getCouponCode());
	 * coupon.setExpDate(couponDto.getExpDate());
	 * coupon.setCouponPrice(couponDto.getCouponPrice());
	 * coupon.setCouponDesc(couponDto.getCouponDesc()); return coupon; }
	 */
	/*
	 * public CouponDto mapToDto(Coupon coupon) { CouponDto couponDto = new
	 * CouponDto(); couponDto.setCouponId(coupon.getCouponId());
	 * couponDto.setCouponCode(coupon.getCouponCode());
	 * couponDto.setExpDate(coupon.getExpDate());
	 * couponDto.setCouponPrice(coupon.getCouponPrice());
	 * couponDto.setCouponDesc(coupon.getCouponDesc()); return couponDto; }
	 */

}
