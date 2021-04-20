package com.jia.pmsmall.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;


/**
 * 品牌(PmsBrand)实体类
 *
 * @author makejava
 * @since 2020-10-15 14:14:32
 */
@Builder
@Data
public class PmsBrand implements Serializable {

    private static final long serialVersionUID = -14345859492145237L;


    /**
     * 品牌id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value = "品牌id", required = true)
    private Long brandId;

    /**
     * 品牌名
     */
    @ApiModelProperty(value = "品牌名", required = true)
    private String name;

    /**
     * 品牌logo地址
     */
    @ApiModelProperty(value = "品牌logo地址", required = true)
    private String logo;

    /**
     * 介绍
     */
    @ApiModelProperty(value = "介绍", required = true)
    private Object descript;

    /**
     * 显示状态[0-不显示；1-显示]
     */
    @ApiModelProperty(value = "显示状态[0-不显示；1-显示]", required = true)
    private Byte showStatus;

    /**
     * 检索首字母
     */
    @ApiModelProperty(value = "检索首字母", required = true)
    private String firstLetter;

    /**
     * 排序
     */
    @ApiModelProperty(value = "排序", required = true)
    private Integer sort;
}