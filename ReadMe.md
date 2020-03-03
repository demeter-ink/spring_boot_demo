#### 建表语句

```sql

CREATE TABLE `banner` (
  `banner_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `banner_name` varchar(200) DEFAULT NULL COMMENT '名称',
  `banner_picture` varchar(500) DEFAULT NULL COMMENT '图片',
  `is_online` int(1) DEFAULT NULL COMMENT '',
  `channel_id` varchar(32) DEFAULT NULL COMMENT '渠道',
  PRIMARY KEY (`banner_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 ROW_FORMAT=COMPACT;
```

#### 请求地址
curl http://localhost:8075/spring_boot_demo-0.0.1-SNAPSHOT/test/getWithBean

#### 压测命令
 ab -n 100000 -c 150 http://localhost:8075/spring_boot_demo-0.0.1-SNAPSHOT/test/getWithBean