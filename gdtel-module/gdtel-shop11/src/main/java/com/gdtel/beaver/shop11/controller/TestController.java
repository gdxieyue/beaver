package com.gdtel.beaver.shop11.controller;


import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
import com.gdtel.common.spring.web.SuperController;
import com.gdtel.beaver.shop11.entity.Test;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author gdxieyue@gmail.com
 * @since 2018-09-06
 */
@RestController
@RequestMapping("/shop11/test")
public class TestController extends SuperController<Test> {

}

