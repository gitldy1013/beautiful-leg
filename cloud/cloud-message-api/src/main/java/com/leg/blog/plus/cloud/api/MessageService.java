package com.leg.blog.plus.cloud.api;

import com.leg.blog.plus.cloud.dto.UmsAdminLoginLogDTO;

public interface MessageService {

    boolean sendAdminLoginLog(UmsAdminLoginLogDTO umsAdminLoginLogDTO);
}
