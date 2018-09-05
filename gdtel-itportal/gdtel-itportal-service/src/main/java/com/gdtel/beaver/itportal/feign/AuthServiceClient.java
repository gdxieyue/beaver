package com.gdtel.beaver.itportal.feign;

import com.gdtel.beaver.itportal.feign.fallback.AuthServiceClientFallbackImpl;
import com.gdtel.beaver.itportal.vo.JWT;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author gdxieyue@gmail.com
 * @date 2018-08-21
 */
@FeignClient(value = "auth-service",fallback = AuthServiceClientFallbackImpl.class )
public interface AuthServiceClient {

    @PostMapping(value = "/oauth/token")
    JWT getToken(@RequestHeader(value = "Authorization") String authorization, @RequestParam("grant_type") String type,
                 @RequestParam("userId") String userId, @RequestParam("password") String password);
}