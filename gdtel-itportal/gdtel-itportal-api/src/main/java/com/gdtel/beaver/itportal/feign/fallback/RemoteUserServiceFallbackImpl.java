package com.gdtel.beaver.itportal.feign.fallback;

import com.gdtel.beaver.itportal.entity.BasUser;
import com.gdtel.beaver.itportal.feign.RemoteUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Component;

/**
 * @author gdxieyue@gmail.com
 * @date 2018-08-21
 */
@Slf4j
@Component
@EnableAutoConfiguration
public class RemoteUserServiceFallbackImpl implements RemoteUserService {

    @Override
    public BasUser info(String userId) {
        log.error("feign 查询用户信息失败:{}", userId);
        return null;
    }
}
