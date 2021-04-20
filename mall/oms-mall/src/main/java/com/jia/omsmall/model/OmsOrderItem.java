package com.jia.omsmall.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;


/**
 * 订单项信息(OmsOrderItem)实体类
 *
 * @author makejava
 * @since 2020-10-15 14:00:29
 */
@Builder
@Data
public class OmsOrderItem implements Serializable {

    private static final long serialVersionUID = -75284951937026334L;


    /**
     * id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value = "id", required = true)
    private Long id;

    /**
     * order_id
     */
    @ApiModelProperty(value = "order_id", required = true)
    private Long orderId;

    /**
     * order_sn
     */
    @ApiModelProperty(value = "order_sn", required = true)
    private String orderSn;

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

    /**
     * spu_pic
     */
    @ApiModelProperty(value = "spu_pic", required = true)
    private String spuPic;

    /**
     * 品牌
     */
    @ApiModelProperty(value = "品牌", required = true)
    private String spuBrand;

    /**
     * 商品分类id
     */
    @ApiModelProperty(value = "商品分类id", required = true)
    private Long categoryId;

    /**
     * 商品sku编号
     */
    @ApiModelProperty(value = "商品sku编号", required = true)
    private Long skuId;

    /**
     * 商品sku名字
     */
    @ApiModelProperty(value = "商品sku名字", required = true)
    private String skuName;

    /**
     * 商品sku图片
     */
    @ApiModelProperty(value = "商品sku图片", required = true)
    private String skuPic;

    /**
     * 商品sku价格
     */
    @ApiModelProperty(value = "商品sku价格", required = true)
    private Double skuPrice;

    /**
     * 商品购买的数量
     */
    @ApiModelProperty(value = "商品购买的数量", required = true)
    private Integer skuQuantity;

    /**
     * 商品销售属性组合（JSON）
     */
    @ApiModelProperty(value = "商品销售属性组合（JSON）", required = true)
    private String skuAttrsVals;

    /**
     * 商品促销分解金额
     */
    @ApiModelProperty(value = "商品促销分解金额", required = true)
    private Double promotionAmount;

    /**
     * 优惠券优惠分解金额
     */
    @ApiModelProperty(value = "优惠券优惠分解金额", required = true)
    private Double couponAmount;

    /**
     * 积分优惠分解金额
     */
    @ApiModelProperty(value = "积分优惠分解金额", required = true)
    private Double integrationAmount;

    /**
     * 该商品经过优惠后的分解金额
     */
    @ApiModelProperty(value = "该商品经过优惠后的分解金额", required = true)
    private Double realAmount;

    /**
     * 赠送积分
     */
    @ApiModelProperty(value = "赠送积分", required = true)
    private Integer giftIntegration;

    /**
     * 赠送成长值
     */
    @ApiModelProperty(value = "赠送成长值", required = true)
    private Integer giftGrowth;
}