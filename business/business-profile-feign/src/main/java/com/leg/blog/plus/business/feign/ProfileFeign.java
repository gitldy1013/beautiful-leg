package com.leg.blog.plus.business.feign;

import com.leg.blog.plus.business.dto.params.IconParam;
import com.leg.blog.plus.business.dto.params.PasswordParam;
import com.leg.blog.plus.business.dto.params.ProfileParam;
import com.leg.blog.plus.business.feign.fallback.ProfileFeignFallback;
import com.leg.blog.plus.configuration.FeignRequestConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * 个人信息管理
 * <p>
 * Description:
 * </p>
 *
 * @author cmcc
 * @version v1.0.0
 * @date 2019-07-31 00:47:14
 * @see com.leg.blog.plus.business.feign
 */
@FeignClient(value = "business-profile", path = "profile", configuration = FeignRequestConfiguration.class, fallback = ProfileFeignFallback.class)
public interface ProfileFeign {

    /**
     * 获取个人信息
     *
     * @param username {@code String} 用户名
     * @return {@code String} JSON
     */
    @GetMapping(value = "info/{username}")
    String info(@PathVariable String username);

    /**
     * 更新个人信息
     *
     * @param profileParam {@link ProfileParam}
     * @return {@code String} JSON
     */
    @PostMapping(value = "update")
    String update(@RequestBody ProfileParam profileParam);

    /**
     * 修改密码
     *
     * @param passwordParam {@link PasswordParam}
     * @return {@code String} JSON
     */
    @PostMapping(value = "modify/password")
    String modifyPassword(@RequestBody PasswordParam passwordParam);

    /**
     * 修改头像
     *
     * @param iconParam {@link IconParam}
     * @return {@code String} JSON
     */
    @PostMapping(value = "modify/icon")
    String modifyIcon(@RequestBody IconParam iconParam);
}
