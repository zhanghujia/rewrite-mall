package com.jia.smsmall.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;


/**
 * 商品会员价格(SmsMemberPrice)实体类
 *
 * @author makejava
 * @since 2020-10-15 14:22:29
 */
@Builder
@Data
public class SmsMemberPrice implements Serializable {

    private static final long serialVersionUID = 652015470963377163L;


    /**
     * id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value = "id", required = true)
    private Long id;

    /**
     * sku_id
     */
    @ApiModelProperty(value = "sku_id", required = true)
    private Long skuId;

    /**
     * 会员等级id
     */
    @ApiModelProperty(value = "会员等级id", required = true)
    private Long memberLevelId;

    /**
     * 会员等级名
     */
    @ApiModelProperty(value = "会员等级名", required = true)
    private String memberLevelName;

    /**
     * 会员对应价格
     */
    @ApiModelProperty(value = "会员对应价格", required = true)
    private Double memberPrice;

    /**
     * 可否叠加其他优惠[0-不可叠加优惠，1-可叠加]
     */
    @ApiModelProperty(value = "可否叠加其他优惠[0-不可叠加优惠，1-可叠加]", required = true)
    private Byte addOther;
}