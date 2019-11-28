package com.leg.blog.plus.provider.tests;

import com.leg.blog.plus.provider.api.UmsAdminLoginLogService;
import com.leg.blog.plus.provider.domain.UmsAdminLoginLog;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
@Rollback
public class UmsAdminLoginLogTests {

    @Resource
    private UmsAdminLoginLogService umsAdminLoginLogService;

    @Test
//    @Rollback(false)
    public void testInsert() {
        UmsAdminLoginLog umsAdminLoginLog = new UmsAdminLoginLog();
        umsAdminLoginLog.setAdminId(1L);
        umsAdminLoginLog.setCreateTime(new Date());
        umsAdminLoginLog.setIp("0.0.0.0");
        umsAdminLoginLog.setAddress("0.0.0.0");
        umsAdminLoginLog.setUserAgent("0.0.0.0");
        umsAdminLoginLogService.insert(umsAdminLoginLog);
    }
}
