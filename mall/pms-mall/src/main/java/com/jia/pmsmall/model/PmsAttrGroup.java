package com.jia.pmsmall.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;


/**
 * 属性分组(PmsAttrGroup)实体类
 *
 * @author makejava
 * @since 2020-10-15 14:14:28
 */
@Builder
@Data
public class PmsAttrGroup implements Serializable {

    private static final long serialVersionUID = -65859226375347738L;


    /**
     * 分组id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value = "分组id", required = true)
    private Long attrGroupId;

    /**
     * 组名
     */
    @ApiModelProperty(value = "组名", required = true)
    private String attrGroupName;

    /**
     * 排序
     */
    @ApiModelProperty(value = "排序", required = true)
    private Integer sort;

    /**
     * 描述
     */
    @ApiModelProperty(value = "描述", required = true)
    private String descript;

    /**
     * 组图标
     */
    @ApiModelProperty(value = "组图标", required = true)
    private String icon;

    /**
     * 所属分类id
     */
    @ApiModelProperty(value = "所属分类id", required = true)
    private Long catelogId;
}