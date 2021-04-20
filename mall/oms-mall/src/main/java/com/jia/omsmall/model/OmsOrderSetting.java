package com.jia.omsmall.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;


/**
 * 订单配置信息(OmsOrderSetting)实体类
 *
 * @author makejava
 * @since 2020-10-15 14:01:01
 */
@Builder
@Data
public class OmsOrderSetting implements Serializable {

    private static final long serialVersionUID = 411334272264126511L;


    /**
     * id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value = "id", required = true)
    private Long id;

    /**
     * 秒杀订单超时关闭时间(分)
     */
    @ApiModelProperty(value = "秒杀订单超时关闭时间(分)", required = true)
    private Integer flashOrderOvertime;

    /**
     * 正常订单超时时间(分)
     */
    @ApiModelProperty(value = "正常订单超时时间(分)", required = true)
    private Integer normalOrderOvertime;

    /**
     * 发货后自动确认收货时间（天）
     */
    @ApiModelProperty(value = "发货后自动确认收货时间（天）", required = true)
    private Integer confirmOvertime;

    /**
     * 自动完成交易时间，不能申请退货（天）
     */
    @ApiModelProperty(value = "自动完成交易时间，不能申请退货（天）", required = true)
    private Integer finishOvertime;

    /**
     * 订单完成后自动好评时间（天）
     */
    @ApiModelProperty(value = "订单完成后自动好评时间（天）", required = true)
    private Integer commentOvertime;

    /**
     * 会员等级【0-不限会员等级，全部通用；其他-对应的其他会员等级】
     */
    @ApiModelProperty(value = "会员等级【0-不限会员等级，全部通用；其他-对应的其他会员等级】", required = true)
    private Byte memberLevel;
}