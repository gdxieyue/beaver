package com.gdtel.beaver.itportal.vo;

import com.gdtel.beaver.itportal.entity.BasUser;
import lombok.Data;

/**
 * @author gdxieyue@gmail.com
 * @date 2018-08-21
 */
@Data
public class LoginDTO {
    private BasUser user;
    private String token;
}
