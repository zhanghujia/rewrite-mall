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
 * 会员(UmsMember)实体类
 *
 * @author makejava
 * @since 2020-10-15 14:46:48
 */
@Builder
@Data
public class UmsMember implements Serializable {

    private static final long serialVersionUID = 684654905666958865L;


    /**
     * id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value = "id", required = true)
    private Long id;

    /**
     * 会员等级id
     */
    @ApiModelProperty(value = "会员等级id", required = true)
    private Long levelId;

    /**
     * 用户名
     */
    @ApiModelProperty(value = "用户名", required = true)
    private String username;

    /**
     * 密码
     */
    @ApiModelProperty(value = "密码", required = true)
    private String password;

    /**
     * 昵称
     */
    @ApiModelProperty(value = "昵称", required = true)
    private String nickname;

    /**
     * 手机号码
     */
    @ApiModelProperty(value = "手机号码", required = true)
    private String mobile;

    /**
     * 邮箱
     */
    @ApiModelProperty(value = "邮箱", required = true)
    private String email;

    /**
     * 头像
     */
    @ApiModelProperty(value = "头像", required = true)
    private String header;

    /**
     * 性别
     */
    @ApiModelProperty(value = "性别", required = true)
    private Byte gender;

    /**
     * 生日
     */
    @ApiModelProperty(value = "生日", required = true)
    private Object birth;

    /**
     * 所在城市
     */
    @ApiModelProperty(value = "所在城市", required = true)
    private String city;

    /**
     * 职业
     */
    @ApiModelProperty(value = "职业", required = true)
    private String job;

    /**
     * 个性签名
     */
    @ApiModelProperty(value = "个性签名", required = true)
    private String sign;

    /**
     * 用户来源
     */
    @ApiModelProperty(value = "用户来源", required = true)
    private Byte sourceType;

    /**
     * 积分
     */
    @ApiModelProperty(value = "积分", required = true)
    private Integer integration;

    /**
     * 成长值
     */
    @ApiModelProperty(value = "成长值", required = true)
    private Integer growth;

    /**
     * 启用状态
     */
    @ApiModelProperty(value = "启用状态", required = true)
    private Byte status;

    /**
     * 注册时间
     */
    @ApiModelProperty(value = "注册时间", required = true)
    private Date createTime;
}