package com.gdtel.beaver.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author gdxieyue@gmail.com
 * @date 2018-07-25
 */
@EnableEurekaServer
@SpringBootApplication
public class GdtelEurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(GdtelEurekaApplication.class, args);
    }
}
