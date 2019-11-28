package com.leg.blog.plus.cloud.feign;

import com.leg.blog.plus.configuration.FeignRequestConfiguration;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "cloud-message",path = "message",configuration = FeignRequestConfiguration.class)
public class MessageFeign {
}
