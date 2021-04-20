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
 * 秒杀活动(SmsSeckillPromotion)实体类
 *
 * @author makejava
 * @since 2020-10-15 14:22:41
 */
@Builder
@Data
public class SmsSeckillPromotion implements Serializable {

    private static final long serialVersionUID = 677870180555549154L;


    /**
     * id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value = "id", required = true)
    private Long id;

    /**
     * 活动标题
     */
    @ApiModelProperty(value = "活动标题", required = true)
    private String title;

    /**
     * 开始日期
     */
    @ApiModelProperty(value = "开始日期", required = true)
    private Date startTime;

    /**
     * 结束日期
     */
    @ApiModelProperty(value = "结束日期", required = true)
    private Date endTime;

    /**
     * 上下线状态
     */
    @ApiModelProperty(value = "上下线状态", required = true)
    private Byte status;

    /**
     * 创建时间
     */
    @ApiModelProperty(value = "创建时间", required = true)
    private Date createTime;

    /**
     * 创建人
     */
    @ApiModelProperty(value = "创建人", required = true)
    private Long userId;
}