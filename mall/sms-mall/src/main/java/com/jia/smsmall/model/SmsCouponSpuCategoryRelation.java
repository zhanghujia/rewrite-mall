package com.jia.smsmall.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;


/**
 * 优惠券分类关联(SmsCouponSpuCategoryRelation)实体类
 *
 * @author makejava
 * @since 2020-10-15 14:21:44
 */
@Builder
@Data
public class SmsCouponSpuCategoryRelation implements Serializable {

    private static final long serialVersionUID = -16661952413877195L;


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
     * 产品分类id
     */
    @ApiModelProperty(value = "产品分类id", required = true)
    private Long categoryId;

    /**
     * 产品分类名称
     */
    @ApiModelProperty(value = "产品分类名称", required = true)
    private String categoryName;
}