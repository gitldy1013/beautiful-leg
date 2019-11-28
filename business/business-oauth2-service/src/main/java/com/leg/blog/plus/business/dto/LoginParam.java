package com.leg.blog.plus.business.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * 登录参数
 * <p>
 * Description:
 * </p>
 *
 * @author cmcc
 * @version v1.0.0
 * @date 2019-07-29 11:13:56
 * @see com.leg.blog.plus.business.dto
 */
@Data
public class LoginParam implements Serializable {

    private String username;
    private String password;

}
