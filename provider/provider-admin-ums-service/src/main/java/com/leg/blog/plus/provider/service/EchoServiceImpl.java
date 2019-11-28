package com.leg.blog.plus.provider.service;

import com.leg.blog.plus.provider.api.EchoService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@Service(version = "1.0.0")
@RefreshScope
public class EchoServiceImpl implements EchoService {

    @Value("${nacos.config.username}")
    private String username;

    @Override
    public String echo(String string) {
        return "Hello Dubbo" + string + username;
    }
}
