package com.gdtel.beaver.itportal.controller;


import com.gdtel.beaver.itportal.entity.BasUser;
import com.gdtel.common.base.exception.CommonException;
import com.gdtel.common.spring.web.SuperController;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 用户表 前端控制器
 * </p>
 *
 * @author gdxieyue@gmail.com
 * @since 2018-08-15
 */
@RestController
@RequestMapping("/itportal/user")
public class BasUserController extends SuperController<BasUser> {

    @GetMapping("/checkuser")
    public BasUser checkuser(@RequestParam String id) throws CommonException {
        this.checkSelect(id);
        return this.baseService.selectById(id);
    }

    @PreAuthorize("hasAuthority('USER')")
    @GetMapping("/hi")
    public String hihi() {
        return "hi,so good";
    }


    @PreAuthorize("hasAuthority('USER2')")
    @GetMapping("/hi2")
    public String u2() {
        return "hi,USER2 is ok" ;
    }

    @PreAuthorize("hasAuthority('USER3')")
    @GetMapping("/hi3")
    public String u3() {
        return "hi,USER3 is ok" ;
    }
}

