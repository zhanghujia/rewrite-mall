package com.jia.omsmall.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;


/**
 * 订单操作历史记录(OmsOrderOperateHistory)实体类
 *
 * @author makejava
 * @since 2020-10-15 14:00:36
 */
@Builder
@Data
public class OmsOrderOperateHistory implements Serializable {

    private static final long serialVersionUID = 499861226815316253L;


    /**
     * id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value = "id", required = true)
    private Long id;

    /**
     * 订单id
     */
    @ApiModelProperty(value = "订单id", required = true)
    private Long orderId;

    /**
     * 操作人[用户；系统；后台管理员]
     */
    @ApiModelProperty(value = "操作人[用户；系统；后台管理员]", required = true)
    private String operateMan;

    /**
     * 操作时间
     */
    @ApiModelProperty(value = "操作时间", required = true)
    private Date createTime;

    /**
     * 订单状态【0->待付款；1->待发货；2->已发货；3->已完成；4->已关闭；5->无效订单】
     */
    @ApiModelProperty(value = "订单状态【0->待付款；1->待发货；2->已发货；3->已完成；4->已关闭；5->无效订单】", required = true)
    private Byte orderStatus;

    /**
     * 备注
     */
    @ApiModelProperty(value = "备注", required = true)
    private String note;
}