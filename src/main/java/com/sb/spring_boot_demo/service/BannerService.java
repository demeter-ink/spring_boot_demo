package com.sb.spring_boot_demo.service;

import com.sb.spring_boot_demo.bean4db.Banner;
import com.sb.spring_boot_demo.mapper.BannerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.HashMap;


@Service
public class BannerService {

    @Autowired
    BannerMapper bannerMapper;

    public Banner getWithBean(Long bannerId){
        return bannerMapper.GetWithBean(bannerId);
    }

    public HashMap<Object, Object> getWithMap(Long bannerId){
        return bannerMapper.GetWithMap(bannerId);
    }

}
