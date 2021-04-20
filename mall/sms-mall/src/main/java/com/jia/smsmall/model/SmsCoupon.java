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
 * 优惠券信息(SmsCoupon)实体类
 *
 * @author makejava
 * @since 2020-10-15 14:21:32
 */
@Builder
@Data
public class SmsCoupon implements Serializable {

    private static final long serialVersionUID = 314944179999240993L;


    /**
     * id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value = "id", required = true)
    private Long id;

    /**
     * 优惠卷类型[0->全场赠券；1->会员赠券；2->购物赠券；3->注册赠券]
     */
    @ApiModelProperty(value = "优惠卷类型[0->全场赠券；1->会员赠券；2->购物赠券；3->注册赠券]", required = true)
    private Byte couponType;

    /**
     * 优惠券图片
     */
    @ApiModelProperty(value = "优惠券图片", required = true)
    private String couponImg;

    /**
     * 优惠卷名字
     */
    @ApiModelProperty(value = "优惠卷名字", required = true)
    private String couponName;

    /**
     * 数量
     */
    @ApiModelProperty(value = "数量", required = true)
    private Integer num;

    /**
     * 金额
     */
    @ApiModelProperty(value = "金额", required = true)
    private Double amount;

    /**
     * 每人限领张数
     */
    @ApiModelProperty(value = "每人限领张数", required = true)
    private Integer perLimit;

    /**
     * 使用门槛
     */
    @ApiModelProperty(value = "使用门槛", required = true)
    private Double minPoint;

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
     * 使用类型[0->全场通用；1->指定分类；2->指定商品]
     */
    @ApiModelProperty(value = "使用类型[0->全场通用；1->指定分类；2->指定商品]", required = true)
    private Byte useType;

    /**
     * 备注
     */
    @ApiModelProperty(value = "备注", required = true)
    private String note;

    /**
     * 发行数量
     */
    @ApiModelProperty(value = "发行数量", required = true)
    private Integer publishCount;

    /**
     * 已使用数量
     */
    @ApiModelProperty(value = "已使用数量", required = true)
    private Integer useCount;

    /**
     * 领取数量
     */
    @ApiModelProperty(value = "领取数量", required = true)
    private Integer receiveCount;

    /**
     * 可以领取的开始日期
     */
    @ApiModelProperty(value = "可以领取的开始日期", required = true)
    private Date enableStartTime;

    /**
     * 可以领取的结束日期
     */
    @ApiModelProperty(value = "可以领取的结束日期", required = true)
    private Date enableEndTime;

    /**
     * 优惠码
     */
    @ApiModelProperty(value = "优惠码", required = true)
    private String code;

    /**
     * 可以领取的会员等级[0->不限等级，其他-对应等级]
     */
    @ApiModelProperty(value = "可以领取的会员等级[0->不限等级，其他-对应等级]", required = true)
    private Byte memberLevel;

    /**
     * 发布状态[0-未发布，1-已发布]
     */
    @ApiModelProperty(value = "发布状态[0-未发布，1-已发布]", required = true)
    private Byte publish;
}