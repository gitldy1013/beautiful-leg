package com.leg.blog.plus.provider.tests;

import com.leg.blog.plus.provider.api.UmsAdminService;
import com.leg.blog.plus.provider.domain.UmsAdmin;
import com.leg.blog.plus.provider.mapper.UmsAdminMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
@Rollback
@Slf4j
public class UmsAdminTests {

    @Autowired
    private UmsAdminMapper umsAdminMapper;

    @Resource
    private UmsAdminService umsAdminService;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @Test
    public void testSelectAll() {
        List<UmsAdmin> umsAdmins = umsAdminMapper.selectAll();
        umsAdmins.forEach(umsAdmin -> {
            System.out.println(umsAdmin);
        });
    }

    @Test
    public void testInsert() {
        UmsAdmin umsAdmin = new UmsAdmin();
        umsAdmin.setUsername("cmcc");
        umsAdmin.setPassword(passwordEncoder.encode("123456"));
        umsAdmin.setIcon("");
        umsAdmin.setEmail("");
        umsAdmin.setNickName("");
        umsAdmin.setNote("");
        umsAdmin.setCreateTime(new Date());
        umsAdmin.setLoginTime(new Date());
        umsAdmin.setStatus(0);

        int result = umsAdminService.insert(umsAdmin);
        Assert.assertEquals(result, 1);
    }

    @Test
    public void testUpdate() {
        UmsAdmin umsAdmin = new UmsAdmin();
        umsAdmin.setId(3L);
        umsAdmin.setUsername("admin");
        umsAdmin.setEmail("liudongyang@qq.com");
        umsAdmin.setNickName("超级管理员");
        umsAdmin.setNote("超级管理员");
        umsAdmin.setStatus(1);

        int result = umsAdminService.update(umsAdmin);
        Assert.assertEquals(result, 1);
    }

    @Test
    @Rollback(false)
    public void testSelect(){
        //测试熔断
//        UmsAdmin error = umsAdminService.get("error");
//        log.info(error.toString());

        //测试限流
        for (int i = 0; i < 5; i++) {
            UmsAdmin admin = umsAdminService.get("admin");
            log.info(admin.toString());
        }
    }
}
