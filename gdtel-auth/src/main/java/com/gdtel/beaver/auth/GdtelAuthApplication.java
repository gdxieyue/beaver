package com.gdtel.beaver.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

/**
 * @author gdxieyue@gmail.com
 * @date 2018-08-20
 */
@SpringCloudApplication
@EnableAuthorizationServer
@EnableFeignClients({"com.gdtel.beaver.itportal.feign"})
@ComponentScan("com.gdtel.beaver")
public class GdtelAuthApplication {
    public static void main(String[] args) {
        SpringApplication.run(GdtelAuthApplication.class, args);
    }

}
