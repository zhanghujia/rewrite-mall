package com.jia.pmsmall.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;


/**
 * spu属性值(PmsProductAttrValue)实体类
 *
 * @author makejava
 * @since 2020-10-15 14:14:44
 */
@Builder
@Data
public class PmsProductAttrValue implements Serializable {

    private static final long serialVersionUID = 182757568134260104L;


    /**
     * id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value = "id", required = true)
    private Long id;

    /**
     * 商品id
     */
    @ApiModelProperty(value = "商品id", required = true)
    private Long spuId;

    /**
     * 属性id
     */
    @ApiModelProperty(value = "属性id", required = true)
    private Long attrId;

    /**
     * 属性名
     */
    @ApiModelProperty(value = "属性名", required = true)
    private String attrName;

    /**
     * 属性值
     */
    @ApiModelProperty(value = "属性值", required = true)
    private String attrValue;

    /**
     * 顺序
     */
    @ApiModelProperty(value = "顺序", required = true)
    private Integer attrSort;

    /**
     * 快速展示【是否展示在介绍上；0-否 1-是】
     */
    @ApiModelProperty(value = "快速展示【是否展示在介绍上；0-否 1-是】", required = true)
    private Byte quickShow;
}