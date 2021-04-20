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
 * 优惠券领取历史记录(SmsCouponHistory)实体类
 *
 * @author makejava
 * @since 2020-10-15 14:21:38
 */
@Builder
@Data
public class SmsCouponHistory implements Serializable {

    private static final long serialVersionUID = -47762717320591961L;


    /**
     * id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value = "id", required = true)
    private Long id;

    /**
     * 优惠券id
     */
    @ApiModelProperty(value = "优惠券id", required = true)
    private Long couponId;

    /**
     * 会员id
     */
    @ApiModelProperty(value = "会员id", required = true)
    private Long memberId;

    /**
     * 会员名字
     */
    @ApiModelProperty(value = "会员名字", required = true)
    private String memberNickName;

    /**
     * 获取方式[0->后台赠送；1->主动领取]
     */
    @ApiModelProperty(value = "获取方式[0->后台赠送；1->主动领取]", required = true)
    private Byte getType;

    /**
     * 创建时间
     */
    @ApiModelProperty(value = "创建时间", required = true)
    private Date createTime;

    /**
     * 使用状态[0->未使用；1->已使用；2->已过期]
     */
    @ApiModelProperty(value = "使用状态[0->未使用；1->已使用；2->已过期]", required = true)
    private Byte useType;

    /**
     * 使用时间
     */
    @ApiModelProperty(value = "使用时间", required = true)
    private Date useTime;

    /**
     * 订单id
     */
    @ApiModelProperty(value = "订单id", required = true)
    private Long orderId;

    /**
     * 订单号
     */
    @ApiModelProperty(value = "订单号", required = true)
    private Long orderSn;
}