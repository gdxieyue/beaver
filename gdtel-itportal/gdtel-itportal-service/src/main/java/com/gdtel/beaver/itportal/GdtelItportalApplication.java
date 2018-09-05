package com.gdtel.beaver.itportal;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author gdxieyue@gmail.com
 * @date 2018-08-14
 */
@SpringCloudApplication
@EnableFeignClients
public class GdtelItportalApplication {
    public static void main(String[] args) {
        SpringApplication.run(GdtelItportalApplication.class, args);
    }
}
