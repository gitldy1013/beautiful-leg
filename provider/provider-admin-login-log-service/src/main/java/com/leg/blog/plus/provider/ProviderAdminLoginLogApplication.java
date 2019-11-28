package com.leg.blog.plus.provider;

import com.leg.blog.plus.configuration.DubboSentinelConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication(scanBasePackageClasses = {ProviderAdminLoginLogApplication.class, DubboSentinelConfiguration.class})
@MapperScan(basePackages = "com.leg.blog.plus.provider.mapper")
public class ProviderAdminLoginLogApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProviderAdminLoginLogApplication.class, args);
    }
}
