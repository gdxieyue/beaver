package com.gdtel.beaver.itportal.feign;

import com.gdtel.beaver.itportal.entity.BasUser;
import com.gdtel.beaver.itportal.feign.fallback.RemoteUserServiceFallbackImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author gdxieyue@gmail.com
 * @date 2018-08-21
 */
@FeignClient(value = "gdtel-itportal", fallback = RemoteUserServiceFallbackImpl.class)
public interface RemoteUserService {

    @GetMapping("/itportal/user/checkuser")
    BasUser info(@RequestParam(value = "id") String id);
}
