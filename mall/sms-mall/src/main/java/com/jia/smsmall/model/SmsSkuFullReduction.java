package com.jia.smsmall.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;


/**
 * 商品满减信息(SmsSkuFullReduction)实体类
 *
 * @author makejava
 * @since 2020-10-15 14:23:54
 */
@Builder
@Data
public class SmsSkuFullReduction implements Serializable {

    private static final long serialVersionUID = -55419335974042926L;


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
    private Long skuId;

    /**
     * 满多少
     */
    @ApiModelProperty(value = "满多少", required = true)
    private Double fullPrice;

    /**
     * 减多少
     */
    @ApiModelProperty(value = "减多少", required = true)
    private Double reducePrice;

    /**
     * 是否参与其他优惠
     */
    @ApiModelProperty(value = "是否参与其他优惠", required = true)
    private Byte addOther;
}