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
 * 积分变化历史记录(UmsIntegrationChangeHistory)实体类
 *
 * @author makejava
 * @since 2020-10-15 14:46:42
 */
@Builder
@Data
public class UmsIntegrationChangeHistory implements Serializable {

    private static final long serialVersionUID = -15644544513853455L;


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
     * 变化的值
     */
    @ApiModelProperty(value = "变化的值", required = true)
    private Integer changeCount;

    /**
     * 备注
     */
    @ApiModelProperty(value = "备注", required = true)
    private String note;

    /**
     * 来源[0->购物；1->管理员修改;2->活动]
     */
    @ApiModelProperty(value = "来源[0->购物；1->管理员修改;2->活动]", required = true)
    private Byte sourceTyoe;
}