package com.sb.spring_boot_demo.bean4db;

import lombok.Data;
import java.math.BigInteger;

@Data
public class Banner {

    private BigInteger bannerId;

    private String bannerName;

    private String bannerPicture;

    private Integer isOnline;

    private String channelId;
}
