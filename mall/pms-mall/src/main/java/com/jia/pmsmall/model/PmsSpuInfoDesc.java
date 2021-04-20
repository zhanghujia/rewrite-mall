package com.jia.pmsmall.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;


/**
 * spu信息介绍(PmsSpuInfoDesc)实体类
 *
 * @author makejava
 * @since 2020-10-15 14:15:12
 */
@Builder
@Data
public class PmsSpuInfoDesc implements Serializable {

    private static final long serialVersionUID = 303320155646151071L;


    /**
     * 商品id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value = "商品id", required = true)
    private Long spuId;

    /**
     * 商品介绍
     */
    @ApiModelProperty(value = "商品介绍", required = true)
    private Object decript;
}