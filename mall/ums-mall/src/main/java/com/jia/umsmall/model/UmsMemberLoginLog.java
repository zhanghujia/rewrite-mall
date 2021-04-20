package com.jia.umsmall.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;


/**
 * 会员登录记录(UmsMemberLoginLog)实体类
 *
 * @author makejava
 * @since 2020-10-15 14:47:18
 */
@Builder
@Data
public class UmsMemberLoginLog implements Serializable {

    private static final long serialVersionUID = 961308313918631364L;


    /**
     * id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value = "id", required = true)
    private Long id;

    /**
     * member_id
     */
    @ApiModelProperty(value = "member_id", required = true)
    private Long memberId;

    /**
     * 创建时间
     */
    @ApiModelProperty(value = "创建时间", required = true)
    private Date createTime;

    /**
     * ip
     */
    @ApiModelProperty(value = "ip", required = true)
    private String ip;

    /**
     * city
     */
    @ApiModelProperty(value = "city", required = true)
    private String city;

    /**
     * 登录类型[1-web，2-app]
     */
    @ApiModelProperty(value = "登录类型[1-web，2-app]", required = true)
    private Byte loginType;
}