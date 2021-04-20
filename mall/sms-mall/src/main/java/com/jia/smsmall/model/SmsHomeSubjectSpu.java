package com.jia.smsmall.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;


/**
 * 专题商品(SmsHomeSubjectSpu)实体类
 *
 * @author makejava
 * @since 2020-10-15 14:22:19
 */
@Builder
@Data
public class SmsHomeSubjectSpu implements Serializable {

    private static final long serialVersionUID = -45387306822323814L;


    /**
     * id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value = "id", required = true)
    private Long id;

    /**
     * 专题名字
     */
    @ApiModelProperty(value = "专题名字", required = true)
    private String name;

    /**
     * 专题id
     */
    @ApiModelProperty(value = "专题id", required = true)
    private Long subjectId;

    /**
     * spu_id
     */
    @ApiModelProperty(value = "spu_id", required = true)
    private Long spuId;

    /**
     * 排序
     */
    @ApiModelProperty(value = "排序", required = true)
    private Integer sort;
}