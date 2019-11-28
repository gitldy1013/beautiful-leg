package com.leg.blog.plus.configuration;

import com.leg.blog.plus.interceptor.FeignRequestInterceptor;
import feign.RequestInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Feign 全局配置
 * <p>
 * Description:
 * </p>
 *
 * @author cmcc
 * @version v1.0.0
 * @date 2019-07-31 00:40:11
 * @see com.leg.blog.plus.configuration
 */
@Configuration
public class FeignRequestConfiguration {

    @Bean
    public RequestInterceptor requestInterceptor() {
        return new FeignRequestInterceptor();
    }

}
