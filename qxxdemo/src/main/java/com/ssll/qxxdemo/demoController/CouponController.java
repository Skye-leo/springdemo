package com.ssll.qxxdemo.demoController;

import com.ssll.qxxdemo.pojo.Coupon;
import com.ssll.qxxdemo.service.CouponService;
import com.sun.corba.se.impl.protocol.JIDLLocalCRDImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CouponController {

    @Autowired
    private CouponService couponService;

    @GetMapping(value = "/getCouponList")
    public List<Coupon> getCouponList(){
        return couponService.findAll();
    }

    @PostMapping(value = "/insertCoupon")
    public Coupon insertCoupon(@RequestParam("name") String name,
                               @RequestParam("code") long code){
        Coupon coupon = new Coupon();
        coupon.setCode(code);
        coupon.setName(name);
        return couponService.save(coupon);
    }

    @GetMapping(value = "/getOneCoupon/{id}")
    public Coupon getOneCoupon(@PathVariable("id") Integer id){
        Optional<Coupon> res = couponService.findById(id);
        if(res.isPresent()){
            return res.get();
        }
        return null;
    }

    @PostMapping(value = "/updateCoupon")
    public Coupon updateCoupon(@RequestParam("id") Integer id,
                               @RequestParam("name") String name,
                               @RequestParam("code") long code){
        Coupon coupon = new Coupon();
        coupon.setName(name);
        coupon.setId(id);
        coupon.setCode(code);
        System.out.println("");
        return couponService.save(coupon);
    }
}
