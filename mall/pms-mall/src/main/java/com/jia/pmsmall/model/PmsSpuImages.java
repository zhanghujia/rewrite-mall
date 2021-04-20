package com.jia.pmsmall.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;


/**
 * spu图片(PmsSpuImages)实体类
 *
 * @author makejava
 * @since 2020-10-15 14:15:04
 */
@Builder
@Data
public class PmsSpuImages implements Serializable {

    private static final long serialVersionUID = 137348330028107038L;


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
    private Long spuId;

    /**
     * 图片名
     */
    @ApiModelProperty(value = "图片名", required = true)
    private String imgName;

    /**
     * 图片地址
     */
    @ApiModelProperty(value = "图片地址", required = true)
    private String imgUrl;

    /**
     * 顺序
     */
    @ApiModelProperty(value = "顺序", required = true)
    private Integer imgSort;

    /**
     * 是否默认图
     */
    @ApiModelProperty(value = "是否默认图", required = true)
    private Byte defaultImg;
}