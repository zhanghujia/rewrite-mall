package com.jia.pmsmall.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;


/**
 * sku图片(PmsSkuImages)实体类
 *
 * @author makejava
 * @since 2020-10-15 14:14:48
 */
@Builder
@Data
public class PmsSkuImages implements Serializable {

    private static final long serialVersionUID = 806485783633639631L;


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
     * 图片地址
     */
    @ApiModelProperty(value = "图片地址", required = true)
    private String imgUrl;

    /**
     * 排序
     */
    @ApiModelProperty(value = "排序", required = true)
    private Integer imgSort;

    /**
     * 默认图[0 - 不是默认图，1 - 是默认图]
     */
    @ApiModelProperty(value = "默认图[0 - 不是默认图，1 - 是默认图]", required = true)
    private Integer defaultImg;
}