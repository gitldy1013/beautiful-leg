package com.leg.blog.plus.business.service;

import com.leg.blog.plus.provider.api.UmsAdminService;
import com.leg.blog.plus.provider.domain.UmsAdmin;
import com.google.common.collect.Lists;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 自定义认证
 * <p>
 * Description:
 * </p>
 *
 * @author cmcc
 * @version v1.0.0
 * @date 2019-07-29 13:28:10
 * @see com.leg.blog.plus.business.service
 *
 */
@Component
public class UserDetailsServiceImpl implements UserDetailsService {

    @Reference(version = "1.0.0")
    private UmsAdminService umsAdminService;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        // 查询用户
        UmsAdmin umsAdmin = umsAdminService.get(s);

        // 默认所有用户拥有 USER 权限
        List<GrantedAuthority> grantedAuthorities = Lists.newArrayList();
        GrantedAuthority grantedAuthority = new SimpleGrantedAuthority("USER");
        grantedAuthorities.add(grantedAuthority);

        // 用户存在
        if (umsAdmin != null) {
            return new User(umsAdmin.getUsername(), umsAdmin.getPassword(), grantedAuthorities);
        }

        // 用户不存在
        else {
            return null;
        }
    }

}
