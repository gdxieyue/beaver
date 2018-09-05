package com.gdtel.beaver.itportal.feign.fallback;

import com.gdtel.beaver.itportal.feign.AuthServiceClient;
import com.gdtel.beaver.itportal.vo.JWT;
import org.springframework.stereotype.Component;

/**
 * @author gdxieyue@gmail.com
 * @date 2018-08-21
 */

@Component
public class AuthServiceClientFallbackImpl implements AuthServiceClient {
    @Override
    public JWT getToken(String authorization, String type, String username, String password) {
        System.out.println("--------opps getToken hystrix---------");
        return null;
    }
}
