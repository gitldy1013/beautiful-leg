package com.leg.blog.plus.cloud.feign.fallback;

import org.springframework.stereotype.Component;

@Component
public class MessageFeignFallback {
    private static final String BREAKING_MESSAGE = "请求失败了，请检查您的网络";
}
