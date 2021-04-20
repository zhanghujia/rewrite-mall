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
 * 秒杀活动场次(SmsSeckillSession)实体类
 *
 * @author makejava
 * @since 2020-10-15 14:22:53
 */
@Builder
@Data
public class SmsSeckillSession implements Serializable {

    private static final long serialVersionUID = -18511019091546393L;


    /**
     * id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value = "id", required = true)
    private Long id;

    /**
     * 场次名称
     */
    @ApiModelProperty(value = "场次名称", required = true)
    private String name;

    /**
     * 每日开始时间
     */
    @ApiModelProperty(value = "每日开始时间", required = true)
    private Date startTime;

    /**
     * 每日结束时间
     */
    @ApiModelProperty(value = "每日结束时间", required = true)
    private Date endTime;

    /**
     * 启用状态
     */
    @ApiModelProperty(value = "启用状态", required = true)
    private Byte status;

    /**
     * 创建时间
     */
    @ApiModelProperty(value = "创建时间", required = true)
    private Date createTime;
}