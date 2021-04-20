package com.jia.smsmall.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;


/**
 * 优惠券与产品关联(SmsCouponSpuRelation)实体类
 *
 * @author makejava
 * @since 2020-10-15 14:21:51
 */
@Builder
@Data
public class SmsCouponSpuRelation implements Serializable {

    private static final long serialVersionUID = 318113716877776912L;


    /**
     * id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value = "id", required = true)
    private Long id;

    /**
     * 优惠券id
     */
    @ApiModelProperty(value = "优惠券id", required = true)
    private Long couponId;

    /**
     * spu_id
     */
    @ApiModelProperty(value = "spu_id", required = true)
    private Long spuId;

    /**
     * spu_name
     */
    @ApiModelProperty(value = "spu_name", required = true)
    private String spuName;
}