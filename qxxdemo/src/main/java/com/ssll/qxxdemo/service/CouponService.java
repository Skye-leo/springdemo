package com.ssll.qxxdemo.service;

import com.ssll.qxxdemo.pojo.Coupon;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CouponService extends JpaRepository<Coupon,Integer>{

}
