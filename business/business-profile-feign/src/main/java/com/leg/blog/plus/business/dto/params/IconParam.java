package com.leg.blog.plus.business.dto.params;

import lombok.Data;

import java.io.Serializable;

/**
 * 修改头像参数
 * <p>
 * Description:
 * </p>
 *
 * @author cmcc
 * @version v1.0.0
 * @date 2019-08-26 23:44:42
 * @see com.leg.blog.plus.business.dto
 */
@Data
public class IconParam implements Serializable {

    /**
     * 用户名
     */
    private String username;

    /**
     * 头像地址
     */
    private String path;

}
