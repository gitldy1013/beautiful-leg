package com.leg.blog.plus.business.feign.fallback;

import com.leg.blog.plus.business.dto.params.IconParam;
import com.leg.blog.plus.business.dto.params.PasswordParam;
import com.leg.blog.plus.business.dto.params.ProfileParam;
import com.leg.blog.plus.business.feign.ProfileFeign;
import com.leg.blog.plus.commons.dto.ResponseResult;
import com.leg.blog.plus.commons.utils.MapperUtils;
import org.springframework.stereotype.Component;

/**
 * 个人信息服务熔断器
 * <p>
 * Description:
 * </p>
 *
 * @author cmcc
 * @version v1.0.0
 * @date 2019-08-27 23:50:08
 * @see com.leg.blog.plus.business.feign.fallback
 */
@Component
public class ProfileFeignFallback implements ProfileFeign {

    public static final String BREAKING_MESSAGE = "请求失败了，请检查您的网络";

    @Override
    public String info(String username) {
        try {
            return MapperUtils.obj2json(new ResponseResult<Void>(ResponseResult.CodeStatus.BREAKING, BREAKING_MESSAGE));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String update(ProfileParam profileParam) {
        try {
            return MapperUtils.obj2json(new ResponseResult<Void>(ResponseResult.CodeStatus.BREAKING, BREAKING_MESSAGE));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String modifyPassword(PasswordParam passwordParam) {
        try {
            return MapperUtils.obj2json(new ResponseResult<Void>(ResponseResult.CodeStatus.BREAKING, BREAKING_MESSAGE));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String modifyIcon(IconParam iconParam) {
        try {
            return MapperUtils.obj2json(new ResponseResult<Void>(ResponseResult.CodeStatus.BREAKING, BREAKING_MESSAGE));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
