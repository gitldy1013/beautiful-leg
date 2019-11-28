package com.leg.blog.plus.business;

/**
 * 全局业务异常
 * <p>
 * Description:
 * </p>
 *
 * @author cmcc
 * @version v1.0.0
 * @date 2019-11-07 15:21:25
 * @see com.leg.blog.plus.business
 */
public class BusinessException extends RuntimeException {

    private static final long serialVersionUID = 3034121940056795549L;

    private Integer code;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public BusinessException() {

    }

    public BusinessException(BusinessStatus status) {
        super(status.getMessage());
        this.code = status.getCode();
    }
}
