package com.jia.wmsmall.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;


/**
 * (WmsPurchaseDetail)实体类
 *
 * @author makejava
 * @since 2020-10-15 14:29:28
 */
@Builder
@Data
public class WmsPurchaseDetail implements Serializable {

    private static final long serialVersionUID = 555808852815765225L;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value = "${column.comment}", required = true)
    private Long id;

    /**
     * 采购单id
     */
    @ApiModelProperty(value = "采购单id", required = true)
    private Long purchaseId;

    /**
     * 采购商品id
     */
    @ApiModelProperty(value = "采购商品id", required = true)
    private Long skuId;

    /**
     * 采购数量
     */
    @ApiModelProperty(value = "采购数量", required = true)
    private Integer skuNum;

    /**
     * 采购金额
     */
    @ApiModelProperty(value = "采购金额", required = true)
    private Double skuPrice;

    /**
     * 仓库id
     */
    @ApiModelProperty(value = "仓库id", required = true)
    private Long wareId;

    /**
     * 状态[0新建，1已分配，2正在采购，3已完成，4采购失败]
     */
    @ApiModelProperty(value = "状态[0新建，1已分配，2正在采购，3已完成，4采购失败]", required = true)
    private Integer status;
}