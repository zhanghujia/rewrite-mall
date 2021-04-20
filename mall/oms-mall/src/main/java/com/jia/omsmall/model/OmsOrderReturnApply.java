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
 * 订单退货申请(OmsOrderReturnApply)实体类
 *
 * @author makejava
 * @since 2020-10-15 14:00:43
 */
@Builder
@Data
public class OmsOrderReturnApply implements Serializable {

    private static final long serialVersionUID = 494484069732624983L;


    /**
     * id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value = "id", required = true)
    private Long id;

    /**
     * order_id
     */
    @ApiModelProperty(value = "order_id", required = true)
    private Long orderId;

    /**
     * 退货商品id
     */
    @ApiModelProperty(value = "退货商品id", required = true)
    private Long skuId;

    /**
     * 订单编号
     */
    @ApiModelProperty(value = "订单编号", required = true)
    private String orderSn;

    /**
     * 申请时间
     */
    @ApiModelProperty(value = "申请时间", required = true)
    private Date createTime;

    /**
     * 会员用户名
     */
    @ApiModelProperty(value = "会员用户名", required = true)
    private String memberUsername;

    /**
     * 退款金额
     */
    @ApiModelProperty(value = "退款金额", required = true)
    private Double returnAmount;

    /**
     * 退货人姓名
     */
    @ApiModelProperty(value = "退货人姓名", required = true)
    private String returnName;

    /**
     * 退货人电话
     */
    @ApiModelProperty(value = "退货人电话", required = true)
    private String returnPhone;

    /**
     * 申请状态[0->待处理；1->退货中；2->已完成；3->已拒绝]
     */
    @ApiModelProperty(value = "申请状态[0->待处理；1->退货中；2->已完成；3->已拒绝]", required = true)
    private Byte status;

    /**
     * 处理时间
     */
    @ApiModelProperty(value = "处理时间", required = true)
    private Date handleTime;

    /**
     * 商品图片
     */
    @ApiModelProperty(value = "商品图片", required = true)
    private String skuImg;

    /**
     * 商品名称
     */
    @ApiModelProperty(value = "商品名称", required = true)
    private String skuName;

    /**
     * 商品品牌
     */
    @ApiModelProperty(value = "商品品牌", required = true)
    private String skuBrand;

    /**
     * 商品销售属性(JSON)
     */
    @ApiModelProperty(value = "商品销售属性(JSON)", required = true)
    private String skuAttrsVals;

    /**
     * 退货数量
     */
    @ApiModelProperty(value = "退货数量", required = true)
    private Integer skuCount;

    /**
     * 商品单价
     */
    @ApiModelProperty(value = "商品单价", required = true)
    private Double skuPrice;

    /**
     * 商品实际支付单价
     */
    @ApiModelProperty(value = "商品实际支付单价", required = true)
    private Double skuRealPrice;

    /**
     * 原因
     */
    @ApiModelProperty(value = "原因", required = true)
    private String reason;

    /**
     * 描述
     */
    @ApiModelProperty(value = "描述", required = true)
    private String description述;

    /**
     * 凭证图片，以逗号隔开
     */
    @ApiModelProperty(value = "凭证图片，以逗号隔开", required = true)
    private String descPics;

    /**
     * 处理备注
     */
    @ApiModelProperty(value = "处理备注", required = true)
    private String handleNote;

    /**
     * 处理人员
     */
    @ApiModelProperty(value = "处理人员", required = true)
    private String handleMan;

    /**
     * 收货人
     */
    @ApiModelProperty(value = "收货人", required = true)
    private String receiveMan;

    /**
     * 收货时间
     */
    @ApiModelProperty(value = "收货时间", required = true)
    private Date receiveTime;

    /**
     * 收货备注
     */
    @ApiModelProperty(value = "收货备注", required = true)
    private String receiveNote;

    /**
     * 收货电话
     */
    @ApiModelProperty(value = "收货电话", required = true)
    private String receivePhone;

    /**
     * 公司收货地址
     */
    @ApiModelProperty(value = "公司收货地址", required = true)
    private String companyAddress;
}