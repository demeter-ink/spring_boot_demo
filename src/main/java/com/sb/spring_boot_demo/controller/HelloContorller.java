package com.sb.spring_boot_demo.controller;

import com.sb.spring_boot_demo.bean4db.Banner;
import com.sb.spring_boot_demo.service.BannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;


@RestController
@RequestMapping(value = "/test")
public class HelloContorller {

    @Value("${name}")
    private String name;

    @Autowired
    private BannerService bannerService;

    @RequestMapping("/getWithMap")
    public String hello() {

        HashMap<Object,Object> map = bannerService.getWithMap(2L);

        if (null == map){
            return name + "getWithMap数据为空";
        } else {
            return map.toString();
        }

    }

    @RequestMapping("/getWithBean")
    public String getWithBean(){

        Banner banner = bannerService.getWithBean(2L);
        if (null == banner){
            return name + "getWithBean数据为空";
        } else {
            return banner.toString();
        }
    }



}
