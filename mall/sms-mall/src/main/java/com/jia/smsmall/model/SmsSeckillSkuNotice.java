package com.jia.smsmall.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;


/**
 * 秒杀商品通知订阅(SmsSeckillSkuNotice)实体类
 *
 * @author makejava
 * @since 2020-10-15 14:23:07
 */
@Builder
@Data
public class SmsSeckillSkuNotice implements Serializable {

    private static final long serialVersionUID = 912415252570814859L;


    /**
     * id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value = "id", required = true)
    private Long id;

    /**
     * member_id
     */
    @ApiModelProperty(value = "member_id", required = true)
    private Long memberId;

    /**
     * sku_id
     */
    @ApiModelProperty(value = "sku_id", required = true)
    private Long skuId;

    /**
     * 活动场次id
     */
    @ApiModelProperty(value = "活动场次id", required = true)
    private Long sessionId;

    /**
     * 订阅时间
     */
    @ApiModelProperty(value = "订阅时间", required = true)
    private Date subcribeTime;

    /**
     * 发送时间
     */
    @ApiModelProperty(value = "发送时间", required = true)
    private Date sendTime;

    /**
     * 通知方式[0-短信，1-邮件]
     */
    @ApiModelProperty(value = "通知方式[0-短信，1-邮件]", required = true)
    private Byte noticeType;
}