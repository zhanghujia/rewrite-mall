package com.jia.wmsmall.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;


/**
 * 商品库存(WmsWareSku)实体类
 *
 * @author makejava
 * @since 2020-10-15 14:29:56
 */
@Builder
@Data
public class WmsWareSku implements Serializable {

    private static final long serialVersionUID = 410535663096189749L;


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
     * 仓库id
     */
    @ApiModelProperty(value = "仓库id", required = true)
    private Long wareId;

    /**
     * 库存数
     */
    @ApiModelProperty(value = "库存数", required = true)
    private Integer stock;

    /**
     * sku_name
     */
    @ApiModelProperty(value = "sku_name", required = true)
    private String skuName;

    /**
     * 锁定库存
     */
    @ApiModelProperty(value = "锁定库存", required = true)
    private Integer stockLocked;
}