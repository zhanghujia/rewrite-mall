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
 * 采购信息(WmsPurchase)实体类
 *
 * @author makejava
 * @since 2020-10-15 14:29:23
 */
@Builder
@Data
public class WmsPurchase implements Serializable {

    private static final long serialVersionUID = 391505428234947582L;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value = "${column.comment}", required = true)
    private Long id;


    @ApiModelProperty(value = "${column.comment}", required = true)
    private Long assigneeId;


    @ApiModelProperty(value = "${column.comment}", required = true)
    private String assigneeName;


    @ApiModelProperty(value = "${column.comment}", required = true)
    private String phone;


    @ApiModelProperty(value = "${column.comment}", required = true)
    private Integer priority;


    @ApiModelProperty(value = "${column.comment}", required = true)
    private Integer status;


    @ApiModelProperty(value = "${column.comment}", required = true)
    private Long wareId;


    @ApiModelProperty(value = "${column.comment}", required = true)
    private Double amount;


    @ApiModelProperty(value = "${column.comment}", required = true)
    private Date createTime;


    @ApiModelProperty(value = "${column.comment}", required = true)
    private Date updateTime;
}