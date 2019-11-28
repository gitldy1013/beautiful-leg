package com.leg.blog.plus.message;

import com.leg.blog.plus.message.sink.AdminLoginLogSink;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

@SpringBootApplication
@EnableBinding({AdminLoginLogSink.class})
public class MessageAdminLoginLogApplication {

}
