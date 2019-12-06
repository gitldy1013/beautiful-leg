package com.leg.blog.plus.cloud.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

@Data
@ToString
public class UmsAdminLoginLogDTO implements Serializable {
    private static final long serialVersionUID = -6610556441914830628L;
    private Long id;
    private Long adminId;
    @JsonFormat(locale = "zh", timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;
    private String ip;
    private String address;
    private String userAgent;
}
