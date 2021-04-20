package com.jia.omsmall.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;


/**
 * 退款信息(OmsRefundInfo)实体类
 *
 * @author makejava
 * @since 2020-10-15 14:01:20
 */
@Builder
@Data
public class OmsRefundInfo implements Serializable {

    private static final long serialVersionUID = 600412746229514661L;


    /**
     * id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value = "id", required = true)
    private Long id;

    /**
     * 退款的订单
     */
    @ApiModelProperty(value = "退款的订单", required = true)
    private Long orderReturnId;

    /**
     * 退款金额
     */
    @ApiModelProperty(value = "退款金额", required = true)
    private Double refund;

    /**
     * 退款交易流水号
     */
    @ApiModelProperty(value = "退款交易流水号", required = true)
    private String refundSn;

    /**
     * 退款状态
     */
    @ApiModelProperty(value = "退款状态", required = true)
    private Byte refundStatus;

    /**
     * 退款渠道[1-支付宝，2-微信，3-银联，4-汇款]
     */
    @ApiModelProperty(value = "退款渠道[1-支付宝，2-微信，3-银联，4-汇款]", required = true)
    private Byte refundChannel;


    @ApiModelProperty(value = "${column.comment}", required = true)
    private String refundContent;
}