package com.jia.smsmall.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;


/**
 * 商品sku积分设置(SmsSkuBounds)实体类
 *
 * @author makejava
 * @since 2020-10-15 14:23:37
 */
@Builder
@Data
public class SmsSkuBounds implements Serializable {

    private static final long serialVersionUID = -17629286322720420L;


    /**
     * id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value = "id", required = true)
    private Long id;


    @ApiModelProperty(value = "${column.comment}", required = true)
    private Long skuId;

    /**
     * 成长积分
     */
    @ApiModelProperty(value = "成长积分", required = true)
    private Double growBounds;

    /**
     * 购物积分
     */
    @ApiModelProperty(value = "购物积分", required = true)
    private Double buyBounds;

    /**
     * 优惠生效情况[1111（四个状态位，从右到左）;0 - 无优惠，成长积分是否赠送;1 - 无优惠，购物积分是否赠送;2 - 有优惠，成长积分是否赠送;3 - 有优惠，购物积分是否赠送【状态位0：不赠送，1：赠送】]
     */
    @ApiModelProperty(value = "优惠生效情况[1111（四个状态位，从右到左）;0 - 无优惠，成长积分是否赠送;1 - 无优惠，购物积分是否赠送;2 - 有优惠，成长积分是否赠送;3 - 有优惠，购物积分是否赠送【状态位0：不赠送，1：赠送】]", required = true)
    private Byte work;
}