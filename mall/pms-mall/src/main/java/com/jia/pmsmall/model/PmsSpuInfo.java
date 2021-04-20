package com.jia.pmsmall.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;


/**
 * spu信息(PmsSpuInfo)实体类
 *
 * @author makejava
 * @since 2020-10-15 14:15:08
 */
@Builder
@Data
public class PmsSpuInfo implements Serializable {

    private static final long serialVersionUID = 608075056095641188L;


    /**
     * 商品id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value = "商品id", required = true)
    private Long id;

    /**
     * 商品名称
     */
    @ApiModelProperty(value = "商品名称", required = true)
    private String spuName;

    /**
     * 商品描述
     */
    @ApiModelProperty(value = "商品描述", required = true)
    private String spuDescription;

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


    @ApiModelProperty(value = "${column.comment}", required = true)
    private Double weight;

    /**
     * 上架状态[0 - 下架，1 - 上架]
     */
    @ApiModelProperty(value = "上架状态[0 - 下架，1 - 上架]", required = true)
    private Byte publishStatus;


    @ApiModelProperty(value = "${column.comment}", required = true)
    private Date createTime;


    @ApiModelProperty(value = "${column.comment}", required = true)
    private Date updateTime;
}