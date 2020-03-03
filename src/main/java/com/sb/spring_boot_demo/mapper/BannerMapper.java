package com.sb.spring_boot_demo.mapper;

import com.sb.spring_boot_demo.bean4db.Banner;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import java.util.HashMap;

@Repository
@Mapper
public interface BannerMapper {

    Banner GetWithBean(Long bannerId);
    HashMap<Object, Object> GetWithMap(Long bannerId);


}
