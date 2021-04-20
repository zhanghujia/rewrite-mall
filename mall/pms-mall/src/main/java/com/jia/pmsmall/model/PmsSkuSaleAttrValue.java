package com.jia.pmsmall.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;


/**
 * sku销售属性&值(PmsSkuSaleAttrValue)实体类
 *
 * @author makejava
 * @since 2020-10-15 14:14:56
 */
@Builder
@Data
public class PmsSkuSaleAttrValue implements Serializable {

    private static final long serialVersionUID = 780562854754874961L;


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
     * attr_id
     */
    @ApiModelProperty(value = "attr_id", required = true)
    private Long attrId;

    /**
     * 销售属性名
     */
    @ApiModelProperty(value = "销售属性名", required = true)
    private String attrName;

    /**
     * 销售属性值
     */
    @ApiModelProperty(value = "销售属性值", required = true)
    private String attrValue;

    /**
     * 顺序
     */
    @ApiModelProperty(value = "顺序", required = true)
    private Integer attrSort;
}