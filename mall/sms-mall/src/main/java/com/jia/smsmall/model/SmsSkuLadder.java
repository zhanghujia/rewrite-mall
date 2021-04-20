package com.jia.smsmall.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;


/**
 * 商品阶梯价格(SmsSkuLadder)实体类
 *
 * @author makejava
 * @since 2020-10-15 14:24:11
 */
@Builder
@Data
public class SmsSkuLadder implements Serializable {

    private static final long serialVersionUID = 529253114339095757L;


    /**
     * id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value = "id", required = true)
    private Long id;

    /**
     * spu_id
     */
    @ApiModelProperty(value = "spu_id", required = true)
    private Long skuId;

    /**
     * 满几件
     */
    @ApiModelProperty(value = "满几件", required = true)
    private Integer fullCount;

    /**
     * 打几折
     */
    @ApiModelProperty(value = "打几折", required = true)
    private Double discount;

    /**
     * 折后价
     */
    @ApiModelProperty(value = "折后价", required = true)
    private Double price;

    /**
     * 是否叠加其他优惠[0-不可叠加，1-可叠加]
     */
    @ApiModelProperty(value = "是否叠加其他优惠[0-不可叠加，1-可叠加]", required = true)
    private Byte addOther;
}