package com.gdtel.beaver.config;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author gdxieyue@gmail.com
 * @date 2018-07-26
 */
@EnableConfigServer
@SpringCloudApplication
public class GdtelConfigApplication {
    public static void main(String[] args) {
        SpringApplication.run(GdtelConfigApplication.class, args);
    }
}
