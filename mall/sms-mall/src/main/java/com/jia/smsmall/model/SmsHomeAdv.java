package com.jia.smsmall.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;


/**
 * 首页轮播广告(SmsHomeAdv)实体类
 *
 * @author makejava
 * @since 2020-10-15 14:21:59
 */
@Builder
@Data
public class SmsHomeAdv implements Serializable {

    private static final long serialVersionUID = -30470225736534403L;


    /**
     * id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value = "id", required = true)
    private Long id;

    /**
     * 名字
     */
    @ApiModelProperty(value = "名字", required = true)
    private String name;

    /**
     * 图片地址
     */
    @ApiModelProperty(value = "图片地址", required = true)
    private String pic;

    /**
     * 开始时间
     */
    @ApiModelProperty(value = "开始时间", required = true)
    private Date startTime;

    /**
     * 结束时间
     */
    @ApiModelProperty(value = "结束时间", required = true)
    private Date endTime;

    /**
     * 状态
     */
    @ApiModelProperty(value = "状态", required = true)
    private Byte status;

    /**
     * 点击数
     */
    @ApiModelProperty(value = "点击数", required = true)
    private Integer clickCount;

    /**
     * 广告详情连接地址
     */
    @ApiModelProperty(value = "广告详情连接地址", required = true)
    private String url;

    /**
     * 备注
     */
    @ApiModelProperty(value = "备注", required = true)
    private String note;

    /**
     * 排序
     */
    @ApiModelProperty(value = "排序", required = true)
    private Integer sort;

    /**
     * 发布者
     */
    @ApiModelProperty(value = "发布者", required = true)
    private Long publisherId;

    /**
     * 审核者
     */
    @ApiModelProperty(value = "审核者", required = true)
    private Long authId;
}