package com.jia.smsmall.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;


/**
 * 秒杀活动商品关联(SmsSeckillSkuRelation)实体类
 *
 * @author makejava
 * @since 2020-10-15 14:23:21
 */
@Builder
@Data
public class SmsSeckillSkuRelation implements Serializable {

    private static final long serialVersionUID = 153692116796368864L;


    /**
     * id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value = "id", required = true)
    private Long id;

    /**
     * 活动id
     */
    @ApiModelProperty(value = "活动id", required = true)
    private Long promotionId;

    /**
     * 活动场次id
     */
    @ApiModelProperty(value = "活动场次id", required = true)
    private Long promotionSessionId;

    /**
     * 商品id
     */
    @ApiModelProperty(value = "商品id", required = true)
    private Long skuId;

    /**
     * 秒杀价格
     */
    @ApiModelProperty(value = "秒杀价格", required = true)
    private Double seckillPrice;

    /**
     * 秒杀总量
     */
    @ApiModelProperty(value = "秒杀总量", required = true)
    private Double seckillCount;

    /**
     * 每人限购数量
     */
    @ApiModelProperty(value = "每人限购数量", required = true)
    private Double seckillLimit;

    /**
     * 排序
     */
    @ApiModelProperty(value = "排序", required = true)
    private Integer seckillSort;
}