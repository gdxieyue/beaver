package com.gdtel.beaver.common.security.exception;

import org.springframework.security.oauth2.common.exceptions.OAuth2Exception;

/**
 * @author gdxieyue@gmail.com
 * @date 2018-08-21
 */
public class AuthException extends OAuth2Exception {
    public AuthException(String msg) {
        super(msg);
    }
}
