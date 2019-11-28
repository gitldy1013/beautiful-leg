package com.leg.blog.plus.cloud.producer;

import com.leg.blog.plus.cloud.api.MessageService;
import com.leg.blog.plus.cloud.dto.UmsAdminLoginLogDTO;
import com.leg.blog.plus.cloud.message.MessageSource;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * 消息生产者
 * <p>
 * Description:
 * </p>
 *
 * @author cmcc
 * @version v1.0.0
 * @date 2019-10-20 17:33:21
 * @see com.leg.blog.plus.cloud.producer
 */
@Component
@Service(version = "1.0.0")
public class MessageProducer implements MessageService {

    @Resource
    private MessageSource source;

    /**
     * 管理登录日志
     *
     * @param dto {@link UmsAdminLoginLogDTO}
     * @return {@code boolean}
     */
    @Override
    public boolean sendAdminLoginLog(UmsAdminLoginLogDTO dto) {
        return source.adminLoginLog().send(MessageBuilder.withPayload(dto).build());
    }
}
