package com.jia.pmsmall.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;


/**
 * 商品属性(PmsAttr)实体类
 *
 * @author makejava
 * @since 2020-10-15 14:14:19
 */
@Builder
@Data
public class PmsAttr implements Serializable {

    private static final long serialVersionUID = -55980736783093189L;


    /**
     * 属性id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value = "属性id", required = true)
    private Long attrId;

    /**
     * 属性名
     */
    @ApiModelProperty(value = "属性名", required = true)
    private String attrName;

    /**
     * 是否需要检索[0-不需要，1-需要]
     */
    @ApiModelProperty(value = "是否需要检索[0-不需要，1-需要]", required = true)
    private Byte searchType;

    /**
     * 属性图标
     */
    @ApiModelProperty(value = "属性图标", required = true)
    private String icon;

    /**
     * 可选值列表[用逗号分隔]
     */
    @ApiModelProperty(value = "可选值列表[用逗号分隔]", required = true)
    private String valueSelect;

    /**
     * 属性类型[0-销售属性，1-基本属性，2-既是销售属性又是基本属性]
     */
    @ApiModelProperty(value = "属性类型[0-销售属性，1-基本属性，2-既是销售属性又是基本属性]", required = true)
    private Byte attrType;

    /**
     * 启用状态[0 - 禁用，1 - 启用]
     */
    @ApiModelProperty(value = "启用状态[0 - 禁用，1 - 启用]", required = true)
    private Long enable;

    /**
     * 所属分类
     */
    @ApiModelProperty(value = "所属分类", required = true)
    private Long catelogId;

    /**
     * 快速展示【是否展示在介绍上；0-否 1-是】，在sku中仍然可以调整
     */
    @ApiModelProperty(value = "快速展示【是否展示在介绍上；0-否 1-是】，在sku中仍然可以调整", required = true)
    private Byte showDesc;
}