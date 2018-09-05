package com.gdtel.beaver.itportal.vo;

import lombok.Getter;
import lombok.Setter;

/**
 * @author gdxieyue@gmail.com
 * @date 2018-08-21
 */
@Getter
@Setter
public class JWT {
    private String access_token;
    private String token_type;
    private String refresh_token;
    private int expires_in;
    private String scope;
    private String jti;
}
