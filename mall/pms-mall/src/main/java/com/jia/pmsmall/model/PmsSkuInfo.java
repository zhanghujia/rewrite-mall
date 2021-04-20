package com.jia.pmsmall.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;


/**
 * sku信息(PmsSkuInfo)实体类
 *
 * @author makejava
 * @since 2020-10-15 14:14:52
 */
@Builder
@Data
public class PmsSkuInfo implements Serializable {

    private static final long serialVersionUID = -99046464343631235L;


    /**
     * skuId
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value = "skuId", required = true)
    private Long skuId;

    /**
     * spuId
     */
    @ApiModelProperty(value = "spuId", required = true)
    private Long spuId;

    /**
     * sku名称
     */
    @ApiModelProperty(value = "sku名称", required = true)
    private String skuName;

    /**
     * sku介绍描述
     */
    @ApiModelProperty(value = "sku介绍描述", required = true)
    private String skuDesc;

    /**
     * 所属分类id
     */
    @ApiModelProperty(value = "所属分类id", required = true)
    private Long catalogId;

    /**
     * 品牌id
     */
    @ApiModelProperty(value = "品牌id", required = true)
    private Long brandId;

    /**
     * 默认图片
     */
    @ApiModelProperty(value = "默认图片", required = true)
    private String skuDefaultImg;

    /**
     * 标题
     */
    @ApiModelProperty(value = "标题", required = true)
    private String skuTitle;

    /**
     * 副标题
     */
    @ApiModelProperty(value = "副标题", required = true)
    private String skuSubtitle;

    /**
     * 价格
     */
    @ApiModelProperty(value = "价格", required = true)
    private Double price;

    /**
     * 销量
     */
    @ApiModelProperty(value = "销量", required = true)
    private Long saleCount;
}