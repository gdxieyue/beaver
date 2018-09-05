package com.gdtel.beaver.auth.service;

import com.gdtel.beaver.itportal.entity.BasUser;
import com.gdtel.beaver.itportal.feign.RemoteUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * @author gdxieyue@gmail.com
 * @date 2018-08-20
 */
@Slf4j
@Service("gdtelUserDetailsService")
public class GdtelUserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private RemoteUserService remoteUserService;

    @Override
    public UserDetails loadUserByUsername(String userId) throws UsernameNotFoundException {
        log.debug("loadUserByUsername参数为：{}", userId);

        BasUser basUser = remoteUserService.info(userId);
        Collection<? extends GrantedAuthority> authorities
                = AuthorityUtils.createAuthorityList("USER", "USER2");
        UserDetails user = new User(basUser.getUserId(), "{noop}" + basUser.getPassword(), true,
                true, true, true, authorities);

        return user;
    }
}
