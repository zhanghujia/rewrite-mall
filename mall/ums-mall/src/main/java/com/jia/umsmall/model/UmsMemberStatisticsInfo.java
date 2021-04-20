package com.jia.umsmall.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;


/**
 * 会员统计信息(UmsMemberStatisticsInfo)实体类
 *
 * @author makejava
 * @since 2020-10-15 14:47:40
 */
@Builder
@Data
public class UmsMemberStatisticsInfo implements Serializable {

    private static final long serialVersionUID = -99874278450743067L;


    /**
     * id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value = "id", required = true)
    private Long id;

    /**
     * 会员id
     */
    @ApiModelProperty(value = "会员id", required = true)
    private Long memberId;

    /**
     * 累计消费金额
     */
    @ApiModelProperty(value = "累计消费金额", required = true)
    private Double consumeAmount;

    /**
     * 累计优惠金额
     */
    @ApiModelProperty(value = "累计优惠金额", required = true)
    private Double couponAmount;

    /**
     * 订单数量
     */
    @ApiModelProperty(value = "订单数量", required = true)
    private Integer orderCount;

    /**
     * 优惠券数量
     */
    @ApiModelProperty(value = "优惠券数量", required = true)
    private Integer couponCount;

    /**
     * 评价数
     */
    @ApiModelProperty(value = "评价数", required = true)
    private Integer commentCount;

    /**
     * 退货数量
     */
    @ApiModelProperty(value = "退货数量", required = true)
    private Integer returnOrderCount;

    /**
     * 登录次数
     */
    @ApiModelProperty(value = "登录次数", required = true)
    private Integer loginCount;

    /**
     * 关注数量
     */
    @ApiModelProperty(value = "关注数量", required = true)
    private Integer attendCount;

    /**
     * 粉丝数量
     */
    @ApiModelProperty(value = "粉丝数量", required = true)
    private Integer fansCount;

    /**
     * 收藏的商品数量
     */
    @ApiModelProperty(value = "收藏的商品数量", required = true)
    private Integer collectProductCount;

    /**
     * 收藏的专题活动数量
     */
    @ApiModelProperty(value = "收藏的专题活动数量", required = true)
    private Integer collectSubjectCount;

    /**
     * 收藏的评论数量
     */
    @ApiModelProperty(value = "收藏的评论数量", required = true)
    private Integer collectCommentCount;

    /**
     * 邀请的朋友数量
     */
    @ApiModelProperty(value = "邀请的朋友数量", required = true)
    private Integer inviteFriendCount;
}