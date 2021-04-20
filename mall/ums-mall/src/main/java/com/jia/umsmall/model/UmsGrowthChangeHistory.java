package com.jia.umsmall.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;


/**
 * 成长值变化历史记录(UmsGrowthChangeHistory)实体类
 *
 * @author makejava
 * @since 2020-10-15 14:46:36
 */
@Builder
@Data
public class UmsGrowthChangeHistory implements Serializable {

    private static final long serialVersionUID = 480814926991718692L;


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
     * create_time
     */
    @ApiModelProperty(value = "create_time", required = true)
    private Date createTime;

    /**
     * 改变的值（正负计数）
     */
    @ApiModelProperty(value = "改变的值（正负计数）", required = true)
    private Integer changeCount;

    /**
     * 备注
     */
    @ApiModelProperty(value = "备注", required = true)
    private String note;

    /**
     * 积分来源[0-购物，1-管理员修改]
     */
    @ApiModelProperty(value = "积分来源[0-购物，1-管理员修改]", required = true)
    private Byte sourceType;
}