package com.jia.omsmall.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;


/**
 * 支付信息表(OmsPaymentInfo)实体类
 *
 * @author makejava
 * @since 2020-10-15 14:01:10
 */
@Builder
@Data
public class OmsPaymentInfo implements Serializable {

    private static final long serialVersionUID = 566781558376086567L;


    /**
     * id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value = "id", required = true)
    private Long id;

    /**
     * 订单号（对外业务号）
     */
    @ApiModelProperty(value = "订单号（对外业务号）", required = true)
    private String orderSn;

    /**
     * 订单id
     */
    @ApiModelProperty(value = "订单id", required = true)
    private Long orderId;

    /**
     * 支付宝交易流水号
     */
    @ApiModelProperty(value = "支付宝交易流水号", required = true)
    private String alipayTradeNo;

    /**
     * 支付总金额
     */
    @ApiModelProperty(value = "支付总金额", required = true)
    private Double totalAmount;

    /**
     * 交易内容
     */
    @ApiModelProperty(value = "交易内容", required = true)
    private String subject;

    /**
     * 支付状态
     */
    @ApiModelProperty(value = "支付状态", required = true)
    private String paymentStatus;

    /**
     * 创建时间
     */
    @ApiModelProperty(value = "创建时间", required = true)
    private Date createTime;

    /**
     * 确认时间
     */
    @ApiModelProperty(value = "确认时间", required = true)
    private Date confirmTime;

    /**
     * 回调内容
     */
    @ApiModelProperty(value = "回调内容", required = true)
    private String callbackContent;

    /**
     * 回调时间
     */
    @ApiModelProperty(value = "回调时间", required = true)
    private Date callbackTime;
}