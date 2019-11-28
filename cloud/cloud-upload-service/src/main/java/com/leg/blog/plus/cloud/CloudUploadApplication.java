package com.leg.blog.plus.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CloudUploadApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudUploadApplication.class, args);
    }

}
