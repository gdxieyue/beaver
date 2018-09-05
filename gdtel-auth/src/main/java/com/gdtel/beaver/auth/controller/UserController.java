package com.gdtel.beaver.auth.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/**
 * @author gdxieyue@gmail.com
 * @date 2018-08-23
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping(value = "/current", method = RequestMethod.POST)
    public Principal getUser(Principal principal) {
        return principal;
    }

}
