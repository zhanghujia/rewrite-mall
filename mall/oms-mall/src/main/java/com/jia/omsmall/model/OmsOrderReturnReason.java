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
 * 退货原因(OmsOrderReturnReason)实体类
 *
 * @author makejava
 * @since 2020-10-15 14:00:53
 */
@Builder
@Data
public class OmsOrderReturnReason implements Serializable {

    private static final long serialVersionUID = -30732232835282486L;


    /**
     * id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value = "id", required = true)
    private Long id;

    /**
     * 退货原因名
     */
    @ApiModelProperty(value = "退货原因名", required = true)
    private String name;

    /**
     * 排序
     */
    @ApiModelProperty(value = "排序", required = true)
    private Integer sort;

    /**
     * 启用状态
     */
    @ApiModelProperty(value = "启用状态", required = true)
    private Byte status;

    /**
     * create_time
     */
    @ApiModelProperty(value = "create_time", required = true)
    private Date createTime;
}