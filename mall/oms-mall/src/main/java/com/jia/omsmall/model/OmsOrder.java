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
 * 订单(OmsOrder)实体类
 *
 * @author makejava
 * @since 2020-10-15 14:00:21
 */
@Builder
@Data
public class OmsOrder implements Serializable {

    private static final long serialVersionUID = 954440672932773704L;


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
     * 订单号
     */
    @ApiModelProperty(value = "订单号", required = true)
    private String orderSn;

    /**
     * 使用的优惠券
     */
    @ApiModelProperty(value = "使用的优惠券", required = true)
    private Long couponId;

    /**
     * create_time
     */
    @ApiModelProperty(value = "create_time", required = true)
    private Date createTime;

    /**
     * 用户名
     */
    @ApiModelProperty(value = "用户名", required = true)
    private String memberUsername;

    /**
     * 订单总额
     */
    @ApiModelProperty(value = "订单总额", required = true)
    private Double totalAmount;

    /**
     * 应付总额
     */
    @ApiModelProperty(value = "应付总额", required = true)
    private Double payAmount;

    /**
     * 运费金额
     */
    @ApiModelProperty(value = "运费金额", required = true)
    private Double freightAmount;

    /**
     * 促销优化金额（促销价、满减、阶梯价）
     */
    @ApiModelProperty(value = "促销优化金额（促销价、满减、阶梯价）", required = true)
    private Double promotionAmount;

    /**
     * 积分抵扣金额
     */
    @ApiModelProperty(value = "积分抵扣金额", required = true)
    private Double integrationAmount;

    /**
     * 优惠券抵扣金额
     */
    @ApiModelProperty(value = "优惠券抵扣金额", required = true)
    private Double couponAmount;

    /**
     * 后台调整订单使用的折扣金额
     */
    @ApiModelProperty(value = "后台调整订单使用的折扣金额", required = true)
    private Double discountAmount;

    /**
     * 支付方式【1->支付宝；2->微信；3->银联； 4->货到付款；】
     */
    @ApiModelProperty(value = "支付方式【1->支付宝；2->微信；3->银联； 4->货到付款；】", required = true)
    private Byte payType;

    /**
     * 订单来源[0->PC订单；1->app订单]
     */
    @ApiModelProperty(value = "订单来源[0->PC订单；1->app订单]", required = true)
    private Byte sourceType;

    /**
     * 订单状态【0->待付款；1->待发货；2->已发货；3->已完成；4->已关闭；5->无效订单】
     */
    @ApiModelProperty(value = "订单状态【0->待付款；1->待发货；2->已发货；3->已完成；4->已关闭；5->无效订单】", required = true)
    private Byte status;

    /**
     * 物流公司(配送方式)
     */
    @ApiModelProperty(value = "物流公司(配送方式)", required = true)
    private String deliveryCompany;

    /**
     * 物流单号
     */
    @ApiModelProperty(value = "物流单号", required = true)
    private String deliverySn;

    /**
     * 自动确认时间（天）
     */
    @ApiModelProperty(value = "自动确认时间（天）", required = true)
    private Integer autoConfirmDay;

    /**
     * 可以获得的积分
     */
    @ApiModelProperty(value = "可以获得的积分", required = true)
    private Integer integration;

    /**
     * 可以获得的成长值
     */
    @ApiModelProperty(value = "可以获得的成长值", required = true)
    private Integer growth;

    /**
     * 发票类型[0->不开发票；1->电子发票；2->纸质发票]
     */
    @ApiModelProperty(value = "发票类型[0->不开发票；1->电子发票；2->纸质发票]", required = true)
    private Byte billType;

    /**
     * 发票抬头
     */
    @ApiModelProperty(value = "发票抬头", required = true)
    private String billHeader;

    /**
     * 发票内容
     */
    @ApiModelProperty(value = "发票内容", required = true)
    private String billContent;

    /**
     * 收票人电话
     */
    @ApiModelProperty(value = "收票人电话", required = true)
    private String billReceiverPhone;

    /**
     * 收票人邮箱
     */
    @ApiModelProperty(value = "收票人邮箱", required = true)
    private String billReceiverEmail;

    /**
     * 收货人姓名
     */
    @ApiModelProperty(value = "收货人姓名", required = true)
    private String receiverName;

    /**
     * 收货人电话
     */
    @ApiModelProperty(value = "收货人电话", required = true)
    private String receiverPhone;

    /**
     * 收货人邮编
     */
    @ApiModelProperty(value = "收货人邮编", required = true)
    private String receiverPostCode;

    /**
     * 省份/直辖市
     */
    @ApiModelProperty(value = "省份/直辖市", required = true)
    private String receiverProvince;

    /**
     * 城市
     */
    @ApiModelProperty(value = "城市", required = true)
    private String receiverCity;

    /**
     * 区
     */
    @ApiModelProperty(value = "区", required = true)
    private String receiverRegion;

    /**
     * 详细地址
     */
    @ApiModelProperty(value = "详细地址", required = true)
    private String receiverDetailAddress;

    /**
     * 订单备注
     */
    @ApiModelProperty(value = "订单备注", required = true)
    private String note;

    /**
     * 确认收货状态[0->未确认；1->已确认]
     */
    @ApiModelProperty(value = "确认收货状态[0->未确认；1->已确认]", required = true)
    private Byte confirmStatus;

    /**
     * 删除状态【0->未删除；1->已删除】
     */
    @ApiModelProperty(value = "删除状态【0->未删除；1->已删除】", required = true)
    private Byte deleteStatus;

    /**
     * 下单时使用的积分
     */
    @ApiModelProperty(value = "下单时使用的积分", required = true)
    private Integer useIntegration;

    /**
     * 支付时间
     */
    @ApiModelProperty(value = "支付时间", required = true)
    private Date paymentTime;

    /**
     * 发货时间
     */
    @ApiModelProperty(value = "发货时间", required = true)
    private Date deliveryTime;

    /**
     * 确认收货时间
     */
    @ApiModelProperty(value = "确认收货时间", required = true)
    private Date receiveTime;

    /**
     * 评价时间
     */
    @ApiModelProperty(value = "评价时间", required = true)
    private Date commentTime;

    /**
     * 修改时间
     */
    @ApiModelProperty(value = "修改时间", required = true)
    private Date modifyTime;
}