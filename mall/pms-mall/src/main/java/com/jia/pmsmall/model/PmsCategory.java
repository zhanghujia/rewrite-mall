package com.jia.pmsmall.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.io.Serializable;
import java.util.List;


/**
 * 商品三级分类(PmsCategory)实体类
 *
 * @author makejava
 * @since 2020-10-15 14:14:36
 */
@Accessors(chain = true)
@Data
public class PmsCategory implements Serializable {

    private static final long serialVersionUID = -71277397503954680L;


    /**
     * 分类id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value = "分类id", required = true)
    private Long catId;

    /**
     * 分类名称
     */
    @ApiModelProperty(value = "分类名称", required = true)
    private String name;

    /**
     * 父分类id
     */
    @ApiModelProperty(value = "父分类id", required = true)
    private Long parentCid;

    /**
     * 层级
     */
    @ApiModelProperty(value = "层级", required = true)
    private Integer catLevel;

    /**
     * 是否显示[0-不显示，1显示]
     */
    @ApiModelProperty(value = "是否显示[0-不显示，1显示]", required = true)
    private Byte showStatus;

    /**
     * 排序
     */
    @ApiModelProperty(value = "排序", required = true)
    private Integer sort;

    /**
     * 图标地址
     */
    @ApiModelProperty(value = "图标地址", required = true)
    private String icon;

    /**
     * 计量单位
     */
    @ApiModelProperty(value = "计量单位", required = true)
    private String productUnit;

    /**
     * 商品数量
     */
    @ApiModelProperty(value = "商品数量", required = true)
    private Integer productCount;


    /**
     * 构造子菜单
     */
    @Transient
    private List<PmsCategory> children;


}