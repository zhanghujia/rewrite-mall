package com.jia.wmsmall.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;


/**
 * 库存工作单(WmsWareOrderTask)实体类
 *
 * @author makejava
 * @since 2020-10-15 14:29:40
 */
@Builder
@Data
public class WmsWareOrderTask implements Serializable {

    private static final long serialVersionUID = 708523367207800411L;


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
     * 收货人
     */
    @ApiModelProperty(value = "收货人", required = true)
    private String consignee;

    /**
     * 收货人电话
     */
    @ApiModelProperty(value = "收货人电话", required = true)
    private String consigneeTel;

    /**
     * 配送地址
     */
    @ApiModelProperty(value = "配送地址", required = true)
    private String deliveryAddress;

    /**
     * 订单备注
     */
    @ApiModelProperty(value = "订单备注", required = true)
    private String orderComment;

    /**
     * 付款方式【 1:在线付款 2:货到付款】
     */
    @ApiModelProperty(value = "付款方式【 1:在线付款 2:货到付款】", required = true)
    private Byte paymentWay;

    /**
     * 任务状态
     */
    @ApiModelProperty(value = "任务状态", required = true)
    private Byte taskStatus;

    /**
     * 订单描述
     */
    @ApiModelProperty(value = "订单描述", required = true)
    private String orderBody;

    /**
     * 物流单号
     */
    @ApiModelProperty(value = "物流单号", required = true)
    private String trackingNo;

    /**
     * create_time
     */
    @ApiModelProperty(value = "create_time", required = true)
    private Date createTime;

    /**
     * 仓库id
     */
    @ApiModelProperty(value = "仓库id", required = true)
    private Long wareId;

    /**
     * 工作单备注
     */
    @ApiModelProperty(value = "工作单备注", required = true)
    private String taskComment;
}