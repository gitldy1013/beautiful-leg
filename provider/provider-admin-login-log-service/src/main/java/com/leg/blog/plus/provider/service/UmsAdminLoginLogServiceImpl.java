package com.leg.blog.plus.provider.service;

import com.leg.blog.plus.provider.api.UmsAdminLoginLogService;
import com.leg.blog.plus.provider.domain.UmsAdminLoginLog;
import com.leg.blog.plus.provider.mapper.UmsAdminLoginLogMapper;
import org.apache.dubbo.config.annotation.Service;

import javax.annotation.Resource;

@Service(version = "1.0.0")
public class UmsAdminLoginLogServiceImpl implements UmsAdminLoginLogService{

    @Resource
    private UmsAdminLoginLogMapper umsAdminLoginLogMapper;

    @Override
    public int insert(UmsAdminLoginLog umsAdminLoginLog) {
        return umsAdminLoginLogMapper.insert(umsAdminLoginLog);
    }
}
