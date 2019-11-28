package com.leg.blog.plus.cloud.feign.fallback;

import com.leg.blog.plus.cloud.feign.UploadFeign;
import com.leg.blog.plus.commons.dto.ResponseResult;
import com.leg.blog.plus.commons.utils.MapperUtils;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

/**
 * 文件上传熔断器
 * <p>
 * Description:
 * </p>
 *
 * @author cmcc
 * @version v1.0.0
 * @date 2019-08-28 02:31:47
 * @see com.leg.blog.plus.cloud.feign.fallback
 */
@Component
public class UploadFeignFallback implements UploadFeign {

    private static final String BREAKING_MESSAGE = "请求失败了，请检查您的网络";

    @Override
    public String upload(MultipartFile multipartFile) {
        try {
            return MapperUtils.obj2json(new ResponseResult<Void>(ResponseResult.CodeStatus.BREAKING, BREAKING_MESSAGE));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
