package com.jia.pmsmall.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;


/**
 * 属性&属性分组关联(PmsAttrAttrgroupRelation)实体类
 *
 * @author makejava
 * @since 2020-10-15 14:14:24
 */
@Builder
@Data
public class PmsAttrAttrgroupRelation implements Serializable {

    private static final long serialVersionUID = -74242009581861555L;


    /**
     * id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value = "id", required = true)
    private Long id;

    /**
     * 属性id
     */
    @ApiModelProperty(value = "属性id", required = true)
    private Long attrId;

    /**
     * 属性分组id
     */
    @ApiModelProperty(value = "属性分组id", required = true)
    private Long attrGroupId;

    /**
     * 属性组内排序
     */
    @ApiModelProperty(value = "属性组内排序", required = true)
    private Integer attrSort;
}